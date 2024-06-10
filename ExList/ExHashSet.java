import java.util.HashSet;

public class ExHashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(4);

        for (Integer in : hs) {
            System.out.println(in);
        }
    }
}
