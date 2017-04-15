package ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by PIIT_NYA on 4/15/2017.
 */
public class UseHashMap {

    public static void main(String[] args) {
        Map<String, String> cityList = new LinkedHashMap<String,String>();
        cityList.put("USA", "NY");
        cityList.put("UK", "London");
        cityList.put("Canada", "Toronto");

        for(Map.Entry<String,String> map:cityList.entrySet()) {
            System.out.println(map.getKey()+ " " + map.getValue());
        }
    }
}
