import java.util.*;

public class MapInJava {


    public static void main(String[] args) {
        //Map  key value pairs , every pair is a entry
        // unique keys

        //faster search/update/delete on basis of key


        // Hashmap  - null key value allowed (no order)
        //LinkedHashmap - null key value allowed (insertion order is maintained)
        //Treemap - no null key allowed (ascending order) , value can be null


        HashMap<String ,Integer> hashMap=new HashMap<>();
        hashMap.put("Rohit",9115534);
        hashMap.put("Ayushi",7825782);
        hashMap.put("Rajat",2138375);
        hashMap.put(null,324);
        hashMap.put("Newton",null);

        System.out.println(hashMap.get("Ayushi"));

        for(Map.Entry i:hashMap.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }

        System.out.println("----------------");
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();


        linkedHashMap.put("Rohit",9115534);
        linkedHashMap.put("Ayushi",7825782);
        linkedHashMap.put("Rajat",2138375);
        linkedHashMap.put(null,324);
        linkedHashMap.put("Newton",null);

        System.out.println(linkedHashMap.get("Ayushi"));

        for(Map.Entry i:linkedHashMap.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }

        System.out.println("----------------");




        TreeMap<String,Integer> treeMap=new TreeMap<>();


        treeMap.put("Rohit",9115534);
        treeMap.put("Ayushi",7825782);
        treeMap.put("Rajat",2138375);
        //treeMap.put(null,324);
        treeMap.put("Newton",null);

        System.out.println(treeMap.get("Ayushi"));

        for(Map.Entry i:treeMap.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}