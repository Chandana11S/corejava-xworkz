class UmbrellaTester{

public static void main(String[] args){

Umbrella umbrella = new Umbrella();
        umbrella.color = "Blue";
        umbrella.size = 50;
        umbrella.isAutomatic = true;
        umbrella.isCompact = false;
        umbrella.isWindproof = true;
        umbrella.isWaterproof = true;
        umbrella.brand = "Totes";
        umbrella.material = "Nylon";
        umbrella.price = 499.99;
        umbrella.handleType = "c-shaped";
umbrella.open();
System.out.println(umbrella.color + "" + umbrella.isAutomatic);

Umbrella umbrella1 = new Umbrella();
        umbrella1.color = "Red";
        umbrella1.size = 42;
        umbrella1.isAutomatic = true;
        umbrella1.isCompact = false;
        umbrella1.isWindproof = true;
        umbrella1.isWaterproof = true;
        umbrella1.brand = "Totes";
        umbrella1.material = "Nylon";
        umbrella1.price = 299.99;
        umbrella.handleType = "u-shaped";
umbrella1.open();
System.out.println(umbrella1.color + "" + umbrella1.isAutomatic);


}



}