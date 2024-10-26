package stream.common;

import stream.dto.User;

import java.util.List;

public class CountElements {
    private void countElements(List<User> users) {
        Long numberOfUsers = users.stream().count();
    }
}
