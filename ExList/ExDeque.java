import java.util.ArrayDeque;
import java.util.Deque;

enum Pizza{
    panpizza,
    stuffedpizza,
    regularpizza;
}
public class ExDeque{

public static void main(String[] args) {
    Deque<String> arrd=new ArrayDeque<String>();
    // arrd.add(1);
    // arrd.add(2);
    for (Pizza p : Pizza.values()) {
        arrd.offer(String.valueOf(p));
    }
    // arrd.offerFirst(null);
    System.out.println(arrd);
    System.out.println(arrd.peek());
    // arrd.poll();
    System.out.println(arrd);
}
}