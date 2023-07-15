class SatelliteTester {

    public static void main(String[] args) {
        Satellite satellite1 = new Satellite();
        satellite1.name = "Sat1";
        satellite1.type = "Communication";
        satellite1.operator = "Operator1";
        satellite1.launchDate = "2023-07-15";
        satellite1.orbitalPeriod = 90.5;
        satellite1.isCommunications = true;
        satellite1.isWeather = false;
        satellite1.isObservation = true;
        satellite1.purpose = "Data Transmission";
        satellite1.weight = 1000;
        satellite1.country = "Country1";
satellite1.transmitSignal();
System.out.println(satellite1.name + "" + satellite1.launchDate);

Satellite satellite2 = new Satellite();
        satellite2.name = "Sat2";
        satellite2.type = "Observation";
        satellite2.operator = "Operator2";
        satellite2.launchDate = "2022-12-01";
        satellite2.orbitalPeriod = 45.7;
        satellite2.isCommunications = false;
        satellite2.isWeather = true;
        satellite2.isObservation = true;
        satellite2.purpose = "Environmental Monitoring";
        satellite2.weight = 1500;
        satellite2.country = "Country2";
satellite2.transmitSignal();
System.out.println(satellite2.name + "" + satellite2.launchDate);
}
}