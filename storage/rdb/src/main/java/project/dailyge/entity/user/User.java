package project.dailyge.entity.user;

import lombok.Getter;

@Getter
public class User {

    private final Long id;
    private final String name;

    public User(
        final Long id,
        final String name
    ) {
        this.id = id;
        this.name = name;
    }
}
