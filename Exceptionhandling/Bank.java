import java.util.*;
class InvalidAmountException extends Exception{
	InvalidAmountException(String message){
		super(message);
	}
}

class InsufficientAmount extends Exception{
	InsufficientAmount(String message){
		super(message);
	}
}
class Bank{
	static Scanner sc=new Scanner(System.in);
	int oldpin=1234;
	double balance=10000;
	void deposit(double amt){
		try{
			if(amt>0){
				balance=balance+amt; 							
				System.out.println("Total balance: "+balance);
			}
			else throw new InvalidAmountException("amount should be positive");
		}
		catch(Exception e){
			System.out.println("deposit Exception handled");
			System.out.println(e.getMessage());
		}	
	}

	void withdraw(double amt){
		try{
			if(amt<=balance) balance=balance-amt;
			else throw new InsufficientAmount("amount should be less than balance");
		}
		catch(Exception e){
			System.out.println("withdraw exception handled");
			System.out.println(e.getMessage());
		}
	}

	void balanceEnq(){
		System.out.println("Do you want to know balance amount(enter yes to display balance)");
		String s=sc.next();
		String y="yes";
		if(s.equals(y)) System.out.println("your balance amount is: "+balance);
		else System.out.println("Thank you for your transactions");
	}

	void pinGenerate(){
		System.out.println("enter old pin: ");
		int newpin=sc.nextInt();
		if(newpin==oldpin){
			System.out.print("Enter new pin: ");
			newpin=sc.nextInt();
			oldpin=newpin;
			System.out.println("your pin is successfully updated :) ");
		}
		else System.out.println("your pin number should match with old pin ..!!");
	}
	
	public static void main(String[] args){
		
		Bank b=new Bank();
		System.out.print("enter amount to deposit: ");
		b.deposit(sc.nextDouble());

		System.out.print("Enter amount to withdraw: ");
		b.withdraw(sc.nextDouble());

		b.balanceEnq();

		b.pinGenerate();
	}

}