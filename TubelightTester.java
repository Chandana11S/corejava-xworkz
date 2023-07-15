class TubelightTester{

public static void main(String[] args) {
        Tubelight tubelight = new Tubelight();
        tubelight.brand = "Bright";
        tubelight.model = "Latest";
        tubelight.bulbType = "LED";
        tubelight.wattage = 10;
        tubelight.isSmart = true;
        tubelight.isEnergyEfficient = true;
        tubelight.colorTemperature = 5000;
        tubelight.hasDimming = false;
        tubelight.warranty = "1 year";
        tubelight.turnOn();
       	   tubelight.turnOff();
System.out.println( tubelight.brand + "" + tubelight.warranty );
		  
Tubelight tubelight1 = new Tubelight();
        tubelight1.brand = "Bright";
        tubelight1.model = "Latest";
        tubelight1.bulbType = "LED";
        tubelight1.wattage = 10;
        tubelight1.isSmart = true;
        tubelight1.isEnergyEfficient = true;
        tubelight1.colorTemperature = 5000;
        tubelight1.hasDimming = false;
        tubelight1.warranty = "1 year";
        tubelight1.turnOn();
       	   tubelight1.turnOff();
System.out.println( tubelight1.brand + "" + tubelight1.warranty );
		  

}
}