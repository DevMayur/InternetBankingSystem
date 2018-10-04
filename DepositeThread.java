

public class DepositeThread implements Runnable{
		private Account account;
		private double amount;
		
		public DepositeThread(Account account, double amount)
		{
			this.account = account;
			this.amount = amount;
		}
		public void run(){
			account.deposit(amount);
		}
}


