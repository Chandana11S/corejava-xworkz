class ToysTester {
    public static void main(String[] args) {
        Toys toy = new Toys();
        toy.name = " Classic Creative Bricks";
        toy.brand = "LEGO";
        toy.type = "Building Blocks";
        toy.price = 300.99;
        toy.recommendedAge = 5;
        toy.material = "Plastic";
        toy.color = "Multi-color";
        toy.isBatteryOperated = false;
        toy.isEducational = true;
        toy.isInteractive = false;
        toy.play();
        System.out.println(toy.name + "  " + toy.brand);

        Toys toy1 = new Toys();
        toy1.name = "Write and Learn Creative Center";
        toy1.brand = "VTech";
        toy1.type = "Learning Toy";
        toy1.price = 200.99;
        toy1.recommendedAge = 3;
        toy1.material = "Plastic";
        toy1.color = "Blue";
        toy1.isBatteryOperated = true;
        toy1.isEducational = true;
        toy1.isInteractive = true;
        toy1.play();
        System.out.println(toy1.name + "  " + toy1.brand + " " + toy1.name + "  " + toy1.brand);
    }
}