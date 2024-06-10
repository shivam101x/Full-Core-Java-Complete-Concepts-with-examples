
class Student<Stud>{
    Stud st;

    public Student(Stud st) {
        this.st = st;
    }

    public Stud getObject(){
        return st;
    }
}

public class ExampleGenaric {

    public static void main(String[] args) {
        
        Student<Integer> ist=new Student<Integer>(101);
        System.out.println("Roll No"+ist.getObject());

        Student<String> sst=new Student<String>("Abc");
        System.out.println("Name:"+sst.getObject());

    }
}
