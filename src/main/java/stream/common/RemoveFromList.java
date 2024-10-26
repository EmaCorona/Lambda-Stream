package stream.common;

import stream.dto.User;

import java.util.List;

public class RemoveFromList {
    private void removeFromList(List<User> users) {
        users.removeIf(usr -> usr.getUsername().equals("EmaCorona"));
    }
}
