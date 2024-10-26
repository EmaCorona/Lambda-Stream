package stream.distinct;

import stream.dto.User;

import java.util.List;

public class RemoveDuplicate {
    private void removeDuplicate(List<User> users) {
        List<User> distinctUsers = users.stream().distinct().toList();
    }
}