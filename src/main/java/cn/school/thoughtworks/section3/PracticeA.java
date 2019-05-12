package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        collectionA.entrySet().stream().forEach(e -> e.setValue(e.getValue() - (int) object.get("value").stream().filter(k -> e.getKey().equals(k)).count()));
        return collectionA;
    }

}
