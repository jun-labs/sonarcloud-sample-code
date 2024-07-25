package project.dailyge.app.core.user.application;

import project.dailyge.entity.user.User;

public interface UserReadService {
    User findById(Long userId);
}
