package project.dailyge.app.core.user.persistence;

import org.springframework.stereotype.Repository;
import project.dailyge.entity.user.User;
import project.dailyge.entity.user.UserEntityReadRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository implements UserEntityReadRepository {

    private final Map<Long, User> map = new HashMap<>();

    public UserRepository() {
        map.put(1L, new User(1L, "User-01"));
        map.put(2L, new User(1L, "User-02"));
    }

    @Override
    public Optional<User> findById(final Long userId) {
        return Optional.ofNullable(
            map.get(userId)
        );
    }
}
