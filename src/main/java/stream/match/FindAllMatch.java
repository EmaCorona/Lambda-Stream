package stream.match;

import stream.dto.User;

import java.util.List;

public class FindAllMatch {
    private boolean findAllMatch(List<User> users) {
        return users.stream().allMatch(User::getActive);
    }
}
