package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        return collection1.stream().collect(Collectors.groupingBy(item -> item.substring(0, 1), Collectors.reducing(0, PracticeC::getValue, Integer::sum)));
    }

    private static Integer getValue(String e) {
        StringBuffer stringBuffer = new StringBuffer(e);
        if(e.length() == 1) {
            return 1;
        } else if(stringBuffer.charAt(1) != '['){
            return Integer.valueOf(e.substring(2));
        }else{
            return  Integer.valueOf(e.substring(2, e.length()-1));
        }
    }
}
