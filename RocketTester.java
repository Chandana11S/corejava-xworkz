class RocketTester {

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        rocket1.name = "Rocket1";
        rocket1.manufacturer = "MFR";
        rocket1.country = "Germany";
        rocket1.height = 50.5;
        rocket1.diameter = 10.2;
        rocket1.payloadCapacity = 5000.0;
        rocket1.isReusable = true;
        rocket1.stages = 2;
        rocket1.propulsionSystem = "Propulsion1";
        rocket1.launchDate = "2023-07-15";
rocket1.launch();
System.out.println(rocket1.name + " " + rocket1.manufacturer);

Rocket rocket2 = new Rocket();
        rocket2.name = "Rocket2";
        rocket2.manufacturer = "LCD";
        rocket2.country = "India";
        rocket2.height = 60.3;
        rocket2.diameter = 12.5;
        rocket2.payloadCapacity = 8000.0;
        rocket2.isReusable = false;
        rocket2.stages = 3;
        rocket2.propulsionSystem = "Propulsion2";
        rocket2.launchDate = "2022-12-01";
		rocket1.launch();
System.out.println(rocket2.name + " " + rocket2.manufacturer);

}
}
