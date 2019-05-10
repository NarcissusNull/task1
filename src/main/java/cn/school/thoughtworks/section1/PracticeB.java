package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        return collection1.stream().filter(item -> collection2.stream().anyMatch(item1 -> item1.stream().anyMatch(item2 -> item.equals(item2)))).collect(Collectors.toList());
    }
}
