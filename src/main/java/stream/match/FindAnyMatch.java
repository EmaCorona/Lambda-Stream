package stream.match;

import stream.dto.User;

import java.util.List;

public class FindAnyMatch {
    private boolean findAnyMatch(List<User> users) {
        return users.stream().anyMatch(usr -> usr.getUsername().equals("EmaCorona"));
    }
}
