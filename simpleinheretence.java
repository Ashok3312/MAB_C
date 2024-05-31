package BOI.COM;
class Account
{
	String name="RAKESH";
	int Account_number=12345;
	int balance=10000;
	public void display()
	{
		System.out.println("\nEmpName:" +name+ "\nEmp account number:" +Account_number+"\n Available_balance");
	}
}
class FDAccount extends Account
{
	//Account a=new Account();
	int loan_amount=1000;
	public void displayloan() {
		int available_balance=balance-loan_amount;
		System.out.println("My loan amount is"+available_balance);
	}
}
public class simpleinheretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FDAccount emp1=new FDAccount();
		emp1.display();
		emp1.displayloan();

	}

}