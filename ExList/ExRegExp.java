import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegExp {
    
    public static void main(String[] args) {
        
       while (true) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter  RegExp Text..");
        String txt1=sc.nextLine();
        System.out.println("Enter Text..");
        String txt2=sc.nextLine();
        Pattern pattern=Pattern.compile(txt1);

        Matcher matcher=pattern.matcher(txt2);

        boolean found=false;

        while (matcher.find()) {
            System.out.println("I found the text "+matcher.group()+" starting at index "+    
                 matcher.start()+" and ending at index "+matcher.end());    
        }

        if (!found) {
            System.out.println("Not found");
        }


       }
    }
}
