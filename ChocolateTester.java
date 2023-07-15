class ChocolateTester {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.name = "Milk Chocolate";
        chocolate.brand = "Cadbury";
        chocolate.flavor = "Milk";
        chocolate.weight = 50.0;
        chocolate.price = 199.99;
        chocolate.country = "United Kingdom";
        chocolate.ingredients = "Sugar, cocoa butter, milk powder";
        chocolate.calories = 250;
        chocolate.isDarkChocolate = false;
        chocolate.isSugarFree = false;
        chocolate.eat();
        System.out.println(chocolate.name + "  " + chocolate.brand + " " + chocolate.country + " " + chocolate.isSugarFree);

        Chocolate chocolate1 = new Chocolate();
        chocolate1.name = "Dark Chocolate";
        chocolate1.brand = "Lindt";
        chocolate1.flavor = "Dark";
        chocolate1.weight = 100.0;
        chocolate1.price = 299.99;
        chocolate1.country = "Switzerland";
        chocolate1.ingredients = "Cocoa mass, sugar, cocoa butter";
        chocolate1.calories = 150;
        chocolate1.isDarkChocolate = true;
        chocolate1.isSugarFree = false;
        chocolate1.eat();
        System.out.println(chocolate1.name + " " + chocolate1.calories);
    }
}