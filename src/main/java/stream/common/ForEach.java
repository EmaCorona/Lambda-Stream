package stream.common;

import stream.dto.User;

import java.util.List;

public class ForEach {
    private void forEach(List<User> users) {
        users.forEach(usr -> usr.setActive(true));
    }
}
