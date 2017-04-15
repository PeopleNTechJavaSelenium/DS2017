package ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PIIT_NYA on 4/15/2017.
 */
public class UseHashMapList {

    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>(10);
        cityOfUSA.add("NY");
        cityOfUSA.add("CA");
        cityOfUSA.add("FL");
        List<String> cityOfCanada = new ArrayList<String>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Alberta");
        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Oxford");
        cityOfUK.add("Liverpool");
        Map<String, List<String>> cityList = new LinkedHashMap<String,List<String>>();
        cityList.put("USA", cityOfUSA);
        cityList.put("UK", cityOfUK);
        cityList.put("Canada", cityOfCanada);
        for(Map.Entry<String,List<String>> map:cityList.entrySet()) {
            List<String> cityName = map.getValue();
            System.out.print(map.getKey());
            for(String city:cityName){
                System.out.print(" " + city);
            }
            System.out.println();
        }
    }
}
