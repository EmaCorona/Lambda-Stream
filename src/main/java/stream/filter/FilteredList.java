package stream.filter;

import stream.dto.User;

import java.util.List;

public class FilteredList {
    private void createFilteredUserList(List<User> users) {
        List<User> activeUsers = users.stream().filter(User::getActive).toList();
    }

    private void createFilteredList(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
    }
}