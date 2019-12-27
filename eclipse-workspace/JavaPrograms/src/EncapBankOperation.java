
public class EncapBankOperation {

	// here all bank functionalities
	
	public EncapBank addInterest(EncapBank acc)
	{
		float balance = acc.getAccBalance();
		double interest = (balance * 2 * 8.5)/ 100;
		balance = (float)(balance+interest);
		acc.setAccBalance(balance);
		return acc;
	}
}
