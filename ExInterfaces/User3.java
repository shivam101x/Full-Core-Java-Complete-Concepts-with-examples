package ExInterfaces;

public class User3 extends User2{
	
	@Override
	public void withdraw() {
		System.out.println("User3 Withdraw Amount..");
	}

	@Override
	public void account() {
		System.out.println("Account Balance..");
	}
	public static void main(String[] args) {
		
		User3 ob=new User3();
		ob.account();
		ob.withdraw();
		ob.deposit();
		ob.loan();

	}

	

}
