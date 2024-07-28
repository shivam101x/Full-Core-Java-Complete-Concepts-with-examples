public class NumPrint {

    static void num(int no){
       if(no<=10)
       {
         System.out.print(no);
        num(no+1);
         System.out.print(no);
       }
       else{
        System.out.print(" Stop ");
       }
    }
    public static void main(String[] args) {
       
            num(1);
       
    }
}
