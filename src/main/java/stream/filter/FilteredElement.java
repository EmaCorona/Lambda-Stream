package stream.filter;

import stream.dto.User;

import java.util.List;

public class FilteredElement {
    private void getFilteredElement(List<User> users) {
        User user = (User) users.stream().filter(usr -> usr.getUsername().equals("EmaCorona"));
    }
}