class BankTester{
public static void main(String args[]){
Bank bob = new Bank();
bob.setBankId(1);
bob.setBankName("Bank of Baroda");
bob.setBranch("Siddharthanagar");
bob.setBranchCode(001122);
bob.setAddress("234,main road");
bob.setHelplineNO(12345L);
bob.setBranchManagerName("Harsha");
bob.setifscCode("BARBO");
bob.setNoOfLockers(22);
bob.setTimings(10.00-5.00);
bob.setNoOfEmployees(36);
bob.setWebsiteDetails("www.//htpps:Barbo");
System.out.println(bob.getBankId() + " " + bob.getBankName() + " " + bob.getBranch() + " " + bob.getBranchCode() + " " + bob.getAddress() + " " + bob.getHelplineNO() + " " + bob.getBranchManagerName() + " " + bob.getifscCode() + " " + bob.getNoOfLockers() + " " + bob.getNoOfEmployees() + " " + bob.getTimings() + " " + bob.getWebsiteDetails());
}



}
