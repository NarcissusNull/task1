package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        return collection1.stream().collect(Collectors.groupingBy(item -> item, Collectors.reducing(0, e -> 1, Integer::sum)));
    }
}
