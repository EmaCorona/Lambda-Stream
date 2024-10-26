package stream.dto;

import lombok.*;

@Data
public class User {
    private String name;
    private String surname;
    private String username;
    private Integer age;
    private Boolean active;

    public User(User usr) {
        this.name = usr.name;
        this.surname = usr.surname;
        this.username = usr.username;
        this.age = usr.age;
        this.active = usr.active;
    }
}
