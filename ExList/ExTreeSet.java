import java.util.TreeSet;

public class ExTreeSet {
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        for (String tr : al) {
            // System.out.println(tr);
        }
        // System.out.println(al.first());
        // System.out.println(al.last());
        System.out.println(al.pollLast());
    }
}
