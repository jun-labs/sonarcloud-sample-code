package project.dailyge.app.test.user.integrationtest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import project.dailyge.app.core.user.application.UserReadService;
import project.dailyge.app.core.user.exception.UserNotFoundException;
import project.dailyge.app.test.IntegrationTestBase;

@DisplayName("[IntegrationTest] User search integration test.")
class UserSearchIntegrationTest extends IntegrationTestBase {

    @Autowired
    private UserReadService userReadService;

    @Test
    void whenUserExistsThenResultShouldBeNotNull() {
        assertNotNull(userReadService.findById(1L));
    }

    @Test
    void whenUserNotExistsThenUserNotFoundExceptionShouldBeHappen() {
        assertThatThrownBy(() -> userReadService.findById(Long.MAX_VALUE))
            .isExactlyInstanceOf(UserNotFoundException.class);
    }
}
