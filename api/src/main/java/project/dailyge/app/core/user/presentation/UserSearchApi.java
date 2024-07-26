package project.dailyge.app.core.user.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dailyge.app.core.user.application.UserReadService;
import project.dailyge.app.core.user.presentation.response.UserInfoResponse;
import project.dailyge.entity.user.User;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserSearchApi {

    private final UserReadService userReadService;

    @GetMapping(path = {"/{userId}"})
    public ResponseEntity<UserInfoResponse> findById(@PathVariable final Long userId) {
        final User findUser = userReadService.findById(userId);
        return ResponseEntity.ok(new UserInfoResponse(findUser));
    }
}
