import java.util.*;

class SimpleEntryTest {
    

    public static void main(String args[]) {
        
        // in c++ map<pair<string, string>, pair<int, int>>
        HashMap<AbstractMap.SimpleEntry<String, String>,
                AbstractMap.SimpleEntry<Integer, Integer>>
            map = new HashMap<>();


        AbstractMap.SimpleEntry<String, String> acsb1 =
            new AbstractMap.SimpleEntry<>("ac", "sb");
        AbstractMap.SimpleEntry<String, String> acrodo1 =
            new AbstractMap.SimpleEntry<>("ac", "rodo");
        AbstractMap.SimpleEntry<String, String> acsb2 =
            new AbstractMap.SimpleEntry<>("ac", "sb");

        System.out.println(acsb1.equals(acrodo1));
        System.out.println(acsb1.equals(acsb2));

        AbstractMap.SimpleEntry<Integer, Integer> qt1 =
            new AbstractMap.SimpleEntry<>(2, 3);
        AbstractMap.SimpleEntry<Integer, Integer> qt2 =
            new AbstractMap.SimpleEntry<>(2, 5);

        map.put(acsb1, qt1);
        map.put(acsb2, qt2);

        System.out.println(map.size());

        for (AbstractMap.SimpleEntry se : map.values())
            System.out.println(se.getKey() + " -> " + se.getValue());
    }
}
