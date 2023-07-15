class SnacksTester{

public static void main(String[] args) {
    Snacks snack1 = new Snacks();
    snack1.name = "Potato Chips";
    snack1.brand = "Lays";
    snack1.flavor = "Classic";
    snack1.type = "Crisps";
    snack1.ingredients = "Potatoes, vegetable oil, salt";
    snack1.price = 8.99;
    snack1.quantity = 50;
    snack1.isVegetarian = true;
    snack1.isGlutenFree = true;
    snack1.isSpicy = false;
snack1.enjoy();
System.out.println(snack1.name + "" + snack1.isSpicy);


Snacks snack2 = new Snacks();
    snack2.name = "Kurkure";
    snack2.brand = "Bingo";
    snack2.flavor = "Classic";
    snack2.type = "Crisps";
    snack2.ingredients = "Potatoes, vegetable oil, salt";
    snack2.price = 9.99;
    snack2.quantity = 50;
    snack2.isVegetarian = true;
    snack2.isGlutenFree = true;
    snack2.isSpicy = false;
snack1.enjoy();
System.out.println(snack2.name + "" + snack2.isSpicy);
}
}