package project.test.user;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import project.dailyge.entity.user.User;

@DisplayName("[UnitTest] 사용자 단위 테스트")
class UserUnitTest {

    @Test
    void whenCreateUserThenObjShouldBeNotNull() {
        assertNotNull(new User(1L, "Hello"));
    }
}
