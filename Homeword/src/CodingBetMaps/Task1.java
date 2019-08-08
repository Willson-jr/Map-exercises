package CodingBetMaps;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("a","candy");
        map.put("b","candy");
        map.put("c","candy");

        mapBully(map);
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b",map.get("a"));
            map.put("a","");


        }
        return map;
    }
}
