package stream.common;

import java.util.List;

public class ReplaceAll {
    private void replaceAll(List<String> list) {
        list.replaceAll(string -> string.toUpperCase());
    }
}
