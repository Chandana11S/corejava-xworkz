class ACTester{

	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connected = AC.onOrOff();
		System.out.println("Is AC connected" + connected);
		AC.increaseTemperature();
		AC.increaseTemperature();
		AC.increaseTemperature();
		AC.increaseTemperature();
		AC.increaseTemperature();
		AC.increaseTemperature();
		
		AC.decreaseTemperature();
		AC.decreaseTemperature();
		AC.decreaseTemperature();
		AC.decreaseTemperature();
		boolean connected1 = AC.onOrOff();
		System.out.println("Is AC connected" + connected1);
		
		
		
		
		System.out.println("Main ended");
	
	}



}