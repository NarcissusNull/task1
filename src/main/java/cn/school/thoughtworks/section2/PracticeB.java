package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        return collection1.stream().collect(Collectors.groupingBy(item -> item.substring(0, 1), Collectors.reducing(0, PracticeB::getValue, Integer::sum)));
    }

    private static Integer getValue(String e){
        return e.length() == 1 ? 1 : Integer.valueOf(e.substring(2));
    }
}
