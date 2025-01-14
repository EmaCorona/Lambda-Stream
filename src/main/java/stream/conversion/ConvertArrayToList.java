package stream.conversion;

import stream.dto.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {
    private void convertArrayToList(User[] array) {
        List<User> users = Arrays.stream(array).collect(Collectors.toList());
    }

    private void convertArrayToList(int[] array) {
        List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());
    }
}
