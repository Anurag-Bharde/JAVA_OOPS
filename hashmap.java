import java.lang.*;
import java.util.*;
import java.awt.*;

class hashmap{
    public static void main(String[] args) {
        HashMap<Integer,Character> hmap=new HashMap<>();
         hmap.put(4,'a');
         hmap.put(5,'w');
         hmap.put(6,'r');
         hmap.put(7,'t');
         hmap.forEach((k,v) -> System.out.println((k+10)+" : "+v));
    }
}