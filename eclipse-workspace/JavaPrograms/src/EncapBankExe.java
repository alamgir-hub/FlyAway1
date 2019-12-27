
public class EncapBankExe {

	public static void main(String[] args) {
		
		EncapBank encap = new EncapBank();
		
		EncapBankOperation encapopr = new EncapBankOperation();
		
		encap.setAccountNo(1001);
		encap.setAccountName("Alam");
		encap.setPhoneNo(9999999);
		encap.setAccBalance(557655.55f);
		
		
		
		encap.bankName = "ICICI";// bank name is declared public
		
		System.out.println("Welcome to " +encap.bankName + " Bank");
		System.out.println("Account number is " + encap.getAccountNo());
		System.out.println("Account Name is " +encap.getAccountNmae());
		System.out.println("Account Balance is " +encap.getAccBalance());
		System.out.println("Phoone number is " +encap.getPhoneNo());
		
		//Bank Functionality
		//passing user in bank opr
		EncapBank res = encapopr.addInterest(encap);
		System.out.println(" Balance after interest" + res.getAccBalance());

	}

}
