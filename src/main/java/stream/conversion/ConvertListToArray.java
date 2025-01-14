package stream.conversion;

import stream.dto.User;

import java.util.List;

public class ConvertListToArray {
    private void convertListToArray(List<User> list) {
        User[] users = list.stream().map(User::new).toArray(User[]::new);
    }

    private void convertWrapperListToArray(List<Integer> list) {
        int[] numbers = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
