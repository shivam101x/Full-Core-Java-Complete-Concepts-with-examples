import java.util.ArrayDeque;
import java.util.Queue;

public class PizzaExample {
    enum pizzatype{
            panpizza,
            stuffedpizza,
            regularpizza;
        
    }
    int orderno,rate,quantity,amount;
    String cname;
    pizzatype ptype;
    public PizzaExample(int orderno, int rate, int quantity, int amount, String cname, pizzatype ptype) {
        this.orderno = orderno;
        this.rate = rate;
        this.quantity = quantity;
        this.amount = amount;
        this.cname = cname;
        this.ptype = ptype;
    }

    public static void main(String[] args) {
        pizzatype py=pizzatype.panpizza;
        PizzaExample p1=new PizzaExample(1, 220, 2, 440, "ABc", py);

        Queue<PizzaExample> pizaa=new ArrayDeque<PizzaExample>();
        pizaa.add(p1);

        for (PizzaExample p : pizaa) {
            System.out.println(p.orderno+" "+p.cname+" "+p.ptype+" "+p.rate+" "+p.quantity+" "+p.amount);
        }
    }
    

}
