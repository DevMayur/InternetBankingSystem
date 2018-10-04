

public class InternetBankingSystem{
	public static void main(String args[])
	{
		Account accountObject = new Account(100);
		new Thread(new DepositeThread(accountObject,30)).start();
		new Thread(new DepositeThread(accountObject,20)).start();
		new Thread(new DepositeThread(accountObject,10)).start();
		new Thread(new WithdrawThread(accountObject,30)).start();
	}
}
