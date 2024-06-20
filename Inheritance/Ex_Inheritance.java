package Inheritance;



class Ex_Inheritance {
	public static void main(String[] args) {
		Cat ct=new Cat();
		System.out.println(ct.color);
		System.out.println(ct.type);
		ct.eat();
		ct.sound();
		ct.sleep();
		
		BabyCat1 c1=new BabyCat1();
		System.out.println(c1.color);
		System.out.println(c1.type);
		c1.eat();
		c1.sound();
		c1.sleep();
		
		
		Dog dg=new Dog();
		System.out.println(dg.color);
		System.out.println(dg.type);
		dg.eat();
		dg.sound();
		dg.sleep();
		
	}
}


