import java.util.HashMap;
import java.util.Map;

public class ExMap{

    public static void main(String[] args) {
        
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
         Map<Integer,Integer> mp2=new HashMap<Integer,Integer>();
        mp2.put(5, 300);

        mp.put(null, null);
        mp.put(1, 100);
        mp.put(2, 100);
        mp.put(3, 100);
        mp.put(4, 200);
        mp.put(1, 500);
        mp.putAll(mp2);
        // mp.remove(1);
        // mp.remove(2,100);

        // System.out.println(mp.keySet());
        // System.out.println(mp.hashCode());
        mp.replace(null, 1);
        mp.replace(2, 200);
        mp.replace(3, 300);
        mp.compute(1, (key,val)-> val=val+1000);
        System.out.println(mp);
    }
}