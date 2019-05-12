package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = collectionA.stream().collect(Collectors.groupingBy(item -> item, Collectors.reducing(0, e -> 1, Integer::sum)));
        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(result, object);
    }
}
