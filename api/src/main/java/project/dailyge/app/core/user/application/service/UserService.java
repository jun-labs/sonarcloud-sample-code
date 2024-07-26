package project.dailyge.app.core.user.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.dailyge.app.core.user.application.UserReadService;
import project.dailyge.app.core.user.application.UserWriteService;
import project.dailyge.app.core.user.exception.UserNotFoundException;
import project.dailyge.entity.user.User;
import project.dailyge.entity.user.UserEntityReadRepository;

@Service
@RequiredArgsConstructor
public class UserService implements UserReadService, UserWriteService {

    private final UserEntityReadRepository userReadRepository;

    @Override
    public User findById(final Long userId) {
        return userReadRepository.findById(userId)
            .orElseThrow(() -> new UserNotFoundException("사용자를 찾을 수 없습니다."));
    }

    @Override
    public Long save(final String name) {
        final User newUser = new User(null, name);
        userReadRepository.save(newUser);
        return newUser.getId();
    }
}
