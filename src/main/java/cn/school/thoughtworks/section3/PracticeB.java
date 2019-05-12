package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        collectionA.entrySet().forEach(e -> {
            int count = e.getValue() + (int) object.get("value").stream().filter(k -> e.getKey().equals(k)).count();
            if(count != e.getValue()){
                e.setValue(count - (count - 1) / 3 - 1);
            }
        });
        return collectionA;
    }
}
