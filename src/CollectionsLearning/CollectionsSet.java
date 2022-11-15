import java.util.*;

public class CollectionsSet {

    //Collection

    // Set ->

    // unordered set of elements
    // duplicates are not allowed
    // null

    Set<Integer> set=new HashSet<>();
    //Collection using Hashtable for storage
    // Hashing is used to store the elements
    // unique elemetns - no duplicates

    // Rohit->1 Abhishek->1 Raunak->1

    Set<Integer> set1=new LinkedHashSet<>();
    Set<Integer> set2=new TreeSet<>();


    //Collection->Set->SortedSet->NavigableSet->TreeSet


    //HashSet
    //LinkedHashSet
    // LinkedList implementation of Set
    // extending hashset, but implemeting set
    // allow nulls
    // maintain insetion order
    // unique elements

    //SortedSet
    // TreeSet
    // keep the data sorted in the set ascending
    // Using tree for storage of elements
    // unique elements
    // accesing the elements is faster
    // no nulls

    public static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Rohit");
        hashSet.add("Newton");
        hashSet.add("School");
        hashSet.add("Newton");
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("Ee"));

        Iterator<String> itr=hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("---------------");
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add("Rohit");
        linkedHashSet.add("Newton");
        linkedHashSet.add("School");
        linkedHashSet.add("Newton");
        linkedHashSet.add(null);
        linkedHashSet.add(null);


        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.contains("Ee"));

        Iterator<String> itr1=linkedHashSet.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("---------------");

        Scanner sc=new Scanner(System.in);

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Rohit");
        treeSet.add("Newton");
        treeSet.add("School");
        //
        Iterator<String> itr2=treeSet.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        treeSet.add(sc.next());
        System.out.println("*****");

        itr2=treeSet.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        //treeSet.add(null);
        //treeSet.add(null);

        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());
        System.out.println(treeSet.contains("Ee"));





    }





}