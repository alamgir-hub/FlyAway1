
public class EncapBank {

	public String bankName;
	private int accountNo;
	private String accountName;
	private float accBalance;
	private int phoneNo;
	
	//setter and getter for Account Number
	public int getAccountNo() {
		return this.accountNo;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	//setter and getter for Account Name
	public String getAccountNmae() {
		return this.accountName;
	}
	public void setAccountName(String name)
	{
		this.accountName= name;
	}
	//setter and getter for AccountBalance
	public float getAccBalance() {
		return this.accBalance;
	}
	public void setAccBalance(float balance) {
		this.accBalance=balance;
		
	}
	//setter and getter for phoneno
	public int getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(int phNo)
	{
		this.phoneNo = phNo;
	}
}
