import java.util.LinkedHashSet;

public class Book {
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        
         LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
         LinkedHashSet<Book> hs1=new LinkedHashSet<Book>(); 
        Book hb1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book hb2=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book hb3=new Book(103,"Operating System","Galvin","Wiley",6);  
    hs1.add(hb1);  
    hs1.add(hb2);
    hs1.add(hb3);
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
   

    hs.add(b1);  
    hs.add(b1);
    hs.add(b3);
    hs.addAll(hs1);
    //Traversing hash table  
    for(Book b:hs){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }
}

}
