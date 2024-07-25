package project.dailyge.app.core.user.presentation.response;

import lombok.Getter;
import project.dailyge.entity.user.User;

@Getter
public class UserInfoResponse {

    private String name;

    private UserInfoResponse() {
    }

    public UserInfoResponse(final User user) {
        this.name = user.getName();
    }
}
