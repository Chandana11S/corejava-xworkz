class HelmetTester{
	
public static void main(String[] args){
        Helmet helmet = new Helmet();
        helmet.brand = "Honda";
        helmet.model = "456";
        helmet.helmetType = "Full-face";
        helmet.size = "Medium";
        helmet.isFullFace = true;
        helmet.isDOTApproved = true;
        helmet.isBluetoothEnabled = false;
        helmet.visorType = "Clear";
        helmet.weight = 1500;
        helmet.warranty = "2 years";
		helmet.protectHead();
		System.out.println(helmet.brand  + "" + helmet.helmetType);
		
		
		Helmet helmet1 = new Helmet();
        helmet1.brand = "Sooby";
        helmet1.model = "456";
        helmet1.helmetType = "Full-face";
        helmet1.size = "Medium";
        helmet1.isFullFace = true;
        helmet1.isDOTApproved = true;
        helmet1.isBluetoothEnabled = false;
        helmet1.visorType = "Clear";
        helmet1.weight = 1500;
        helmet1.warranty = "2 years";
		helmet1.protectHead();
		System.out.println(helmet1.brand  + "" + helmet1.helmetType);
		
		
		
    }
}