package com.codepills.learning.java.HashMap;
import java.util.HashMap;

public class HashMapGet {

  public static void main(String[] args) {
     // Create a HashMap
     HashMap<Integer, String> myHMap = new HashMap<Integer, String>();
     // Common practice is to set new object myHMap to Map interface variable. 
     // For this case we will use HashMap.
     
     // Add elements to HashMap
     myHMap.put(1, "AA");
     myHMap.put(2, "BB");
     myHMap.put(3, "CC");
     myHMap.put(4, "DD");
     myHMap.put(5, "AA");
 
     // Getting values from HashMap
     String var1 = myHMap.get(5);
     System.out.println("The Value mapped to Key 4 is:"+ var1);
 
     /* Here Key "5" is not mapped to any value so this 
      * operation returns null.
      */
     String var2 = myHMap.get(5);
     System.out.println("The Value mapped to Key 5 is:"+ var2);
     
     myHMap.containsKey(8);
     
     // HashMap – Get value from key example
     
     // can you please tell me how to get all entries from HashMap or Map object.
     
  }
}