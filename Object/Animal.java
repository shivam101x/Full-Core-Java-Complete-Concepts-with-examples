package Object;

public class Animal {
	
		String color;
		String name;
		
		public void eat(String name) {
			System.out.println(name+" Eating");
		}
		public void sleep(String name) {
			System.out.println(name+" Sleeping..");
		}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		Animal cat=new Animal();
		cat.color="white";
		cat.name="kityy";
		System.out.println(cat.name+" is "+cat.color);
		cat.eat(cat.name);
		cat.sleep(cat.name);
		
		Animal dog=new Animal();
		dog.color="black";
		dog.name="tommy";
		System.out.println(dog.name+" is "+dog.color);
		dog.eat(dog.name);
		dog.sleep(dog.name);
		
//		Animal an=(Animal)Class.forName("Animal").newInstance();
		
		Animal dog1=(Animal)dog.clone();
		
	}

}
