package prob05;

public class Account {
	private String accountNo;
	private int balance;	//0~
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}
	
	public void save(int input) {
		this.balance += input;
		System.out.println(this.accountNo + "계좌에 " + input + "만원이 입금되었습니다.");
	}
	
	public void deposit(int output) {
		if(output > this.balance) {
			System.out.println("잔고가 부족합니다...");
		}else {
			this.balance -= output;
			System.out.println(this.accountNo + "계좌에 " + output + "만원이 출급되었습니다.");
		}
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
