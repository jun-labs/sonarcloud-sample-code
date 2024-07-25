package project.dailyge.entity.user;

import java.util.Optional;

public interface UserEntityReadRepository {
    Optional<User> findById(Long userId);
}
