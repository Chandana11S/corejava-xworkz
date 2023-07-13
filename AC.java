class AC{

      static String name = "LG";
      static  int minTemperature ;                  
      static  int currentTemperature = 190;
      static  int maxTemperature = 280;
      static boolean isConnected;

    public static boolean onOrOff(){
    System.out.println("Invoking onOrOff");
    System.out.println("Parameter" + 0);
	
//false == false
        if(isConnected == false){
	    isConnected = true;
	    System.out.println("AC is Trun Onn...ENJOY");
        }
		
//true == true
        else if(isConnected == true) {
	    isConnected = false;
	    System.out.println("AC is Trun OFF...");
        }
		
        return isConnected;
        }
		
//increase volume
    public static void increaseTemperature(){
       System.out.println("Invoking IncreaseTemperature()");
        System.out.println("List of Parameters");
		
	    if(isConnected == true)	
        if(currentTemperature < maxTemperature){
	    currentTemperature = currentTemperature + 1;
	    System.out.println("The current temperature is " + currentTemperature);

        }
       else {
	   System.out.println("maxTemperature is  reached...");
       }	
       else {
	   System.out.println("connect the AC first....");
       }
	   System.out.println("End of increaseTemperature()");

    }

    public static void decreaseTemperature(){
		System.out.println("Invoking decreaseTemperature()");
        System.out.println("List of Parameters");
		
       if(isConnected == true)	
       if(currentTemperature > minTemperature){
	   currentTemperature = currentTemperature - 1;
	   System.out.println("The current temperature is " + currentTemperature);
       }
       else {
	   System.out.println("minTemperature is  reached...");
       }
       else {
	   System.out.println("connect the AC first....");
       }
       System.out.println("End of decreaseTemperature()");
    }
	
	
   }
	
	

