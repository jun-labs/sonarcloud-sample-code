package project.dailyge.app.core.user.persistence;

import org.springframework.stereotype.Repository;
import project.dailyge.entity.user.User;
import project.dailyge.entity.user.UserEntityReadRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository implements UserEntityReadRepository {

    private final AtomicLong idGenerator = new AtomicLong(0);
    private final Map<Long, User> map = new HashMap<>();

    @Override
    public Optional<User> findById(final Long userId) {
        return Optional.ofNullable(
            map.get(userId)
        );
    }

    @Override
    public void save(final User user) {
        final Long newId = idGenerator.incrementAndGet();
        user.insert(newId);
        map.put(newId, user);
    }
}
