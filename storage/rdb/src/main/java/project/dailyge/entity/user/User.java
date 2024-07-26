package project.dailyge.entity.user;

import lombok.Getter;

@Getter
public class User {

    private Long id;
    private final String name;

    public User(
        final Long id,
        final String name
    ) {
        this.id = id;
        this.name = name;
    }

    public void insert(Long id) {
        this.id = id;
    }
}
