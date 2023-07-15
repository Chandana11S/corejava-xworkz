class SuitcaseTester{

public static void main(String[] args){

    Suitcase suitcase = new Suitcase();
    suitcase.brand = "Samsonite";
    suitcase.color = "Black";
    suitcase.capacity = 25;
    suitcase.weight = 3.5;
    suitcase.material = "Polycarbonate";
    suitcase.handleType = "Telescopic";
    suitcase.hasWheels = true;
    suitcase.isExpandable = false;
    suitcase.lockType = "TSA Combination Lock";
    suitcase.specialFeatures = "Water-resistant";
   suitcase.toStore();
System.out.println(suitcase.brand + "" + suitcase.handleType);

Suitcase suitcase1 = new Suitcase();
    suitcase1.brand = "fastrack";
    suitcase1.color = "Red";
    suitcase1.capacity = 30;
    suitcase1.weight = 3.5;
    suitcase1.material = "Polycarbonate";
    suitcase1.handleType = "Telescopic";
    suitcase1.hasWheels = true;
    suitcase1.isExpandable = false;
    suitcase1.lockType = "TSA Combination Lock";
    suitcase1.specialFeatures = "Water-resistant";
   suitcase1.toStore();
System.out.println(suitcase1.brand + "" + suitcase1.handleType);   
   
	}
	
	}