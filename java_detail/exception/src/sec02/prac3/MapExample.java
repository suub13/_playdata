package sec02.prac3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = map.get(key);
            if (maxScore < value){
                name = key;
                maxScore = value;
            }
            totalScore += value;
        }
        int avg = totalScore/ entrySet.size();
        System.out.println("평균점수: "+avg);
        System.out.println("최고점수: "+maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);

    }
}
