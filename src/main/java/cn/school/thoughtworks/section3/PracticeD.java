package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = collectionA.stream().collect(Collectors.groupingBy(item -> item.substring(0, 1), Collectors.reducing(0, PracticeD::getValue, Integer::sum)));
        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(result, object);
    }

    private static Integer getValue(String e){
        return e.length() == 1 ? 1 : Integer.valueOf(e.substring(2));
    }
}
