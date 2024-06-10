import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExArray{

    public static void main(String[] args) {
         String[] books1 = new String[10];
         
        books1[0] = "Learn Java for Dummies,John Smith";
        books1[1] = "Learn JavaScript in 10 Minutes,Jack Arnold";
        books1[2] = "Learn IOS,Edgar Alan Poe";
        books1[3] = "Learn SQL,James Rodriguez";
        books1[4] = "Learning .Net is not boring,Hungry Jack";
        books1[5] = "Shine while learing Ruby,Britney Spears";
        books1[6] = "Move like a snake with Phython";
        books1[7] = "Learn PHP and work in alpesh Gates";
        books1[8] = "Learn C only if you are smart, Goofy";
        books1[9] = "Learn C++ in a year++, Atreyu";

        String[] books = new String[10];
         
        books[0] = "Learn Java for Dummies,John Smith";
        books[1] = "Learn JavaScript in 10 Minutes,Jack Arnold";
        books[2] = "Learn IOS,Edgar Alan Poe";
        books[3] = "Learn SQL,James Rodriguez";
        books[4] = "Learning .Net is not boring,Hungry Jack";
        books[5] = "Shine while learing Ruby,Britney Spears";
        books[6] = "Move like a snake with Phython";
        books[7] = "Learn PHP and work in Facebook,Bill Gates";
        books[8] = "Learn C only if you are smart, Goofy";
        books[9] = "Learn C++ in a year++, Atreyu";

        ArrayList<String> bk=new ArrayList<String>();

        for (String string : books1) {
             bk.add(string);
        }
      
        for (String string : books) {
             bk.add(string);
        }
        Collections.sort(bk);

         Pattern pattern;
         Matcher matcher=null;
        for (String string : bk) {
            System.out.println(string);

            pattern=Pattern.compile("Facebook,Bill");
            matcher=pattern.matcher(string);
        
            while (matcher.find()) {
            System.out.println("I found the text "+matcher.group());    
        }
        }
    }
}