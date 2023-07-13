class Girias2{
	
	
 static double priceOfElectronicDevices[] = {50000.0 , 40000.0 ,75000.0 , 80000.0 , 15000.0 , 60000.0 , 45000.0 , 55000.0 };


public static  void main(String arg[]){
 String electronicDevices[] = {"refeigerator", "washing machine", "television", "LED", "grinder", "Ac", "ironbox", "microwave"};

System.out.println("Main Started");
for(int index = 0 ; index < electronicDevices.length-1 ; index++){
System.out.println(electronicDevices[index]);
}

System.out.println("List of electronic Device are");
for(String electronicDevice : electronicDevices){
System.out.println(electronicDevice);
}

for(double priceOfElectronicDevice : priceOfElectronicDevices){
System.out.println( priceOfElectronicDevice );
}

System.out.println("Main ended");
}

}