class ShipTester {

public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.name = "Ship1";
        ship1.type = "Cargo";
        ship1.owner = "Owner1";
        ship1.length = 100;
        ship1.width = 20;
        ship1.capacity = 5000;
        ship1.country = "Country1";
        ship1.isCargoShip = true;
        ship1.isPassengerShip = false;
        ship1.isMilitaryShip = false;
ship1.sail();
System.out.println(ship1.name + "" + ship1.owner);
		
		Ship ship2 = new Ship();
        ship2.name = "Ship2";
        ship2.type = "Passenger";
        ship2.owner = "Owner2";
        ship2.length = 80;
        ship2.width = 15;
        ship2.capacity = 2000;
        ship2.country = "Country2";
        ship2.isCargoShip = false;
        ship2.isPassengerShip = true;
        ship2.isMilitaryShip = false;
ship2.sail();
System.out.println(ship2.name + "" + ship2.owner);
	}
}	