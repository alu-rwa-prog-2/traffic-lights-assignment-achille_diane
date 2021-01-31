import java.util.*;
public class Question2 {
    public static void main(String[] args) {
    // Creating three hasmaps
    HashMap<Integer, String> hash_map1 = new HashMap<Integer, String> ();
    HashMap<Integer, String> hash_map2 = new HashMap<Integer, String> ();
    HashMap<Integer, String> hash_map3 = new HashMap<Integer, String> ();
    // Populate the Hashmaps
    hash_map1.put(1, " Maths");
    hash_map1.put(2, " Chimistry");
    hash_map1.put(3, "Physic");
    System.out.println("\nAttributes in the First: " + hash_map1);
    hash_map2.put(4, "History");
    hash_map2.put(5, "computer science");
    hash_map2.put(6, "sport");
    System.out.println("\nAttributes in the second: " + hash_map2);
    hash_map3.put(7, "English");
    hash_map3.put(8, "geography ");
    hash_map3.put(9, " Biology");
    System.out.println("\nAttributes in third: " + hash_map3);
    // Let's put hash_map1 et hash_map2 in hash_map3
    hash_map3.putAll(hash_map1);
    hash_map3.putAll(hash_map2);
    System.out.println("\nNow Let's see all values in the Third map: " + hash_map3);
    }
        

}