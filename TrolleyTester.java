class TrolleyTester {
    public static void main(String[] args) {
        Trolley trolley = new Trolley();
        trolley.brand = "Sky";
        trolley.capacity = 50;
        trolley.color = "Red";
        trolley.hasWheels = true;
        trolley.isFoldable = true;
        trolley.isExpandable = false;
        trolley.weight = 10.5;
        trolley.material = "Steel";
        trolley.hasHandle = true;
        trolley.handleType = "Telescopic";
trolley.loadItems();
System.out.println(trolley.brand + "" +trolley.isExpandable) ;

Trolley trolley1 = new Trolley();
        trolley1.brand = "Fastrack";
        trolley1.capacity = 50;
        trolley1.color = "Red";
        trolley1.hasWheels = true;
        trolley1.isFoldable = true;
        trolley1.isExpandable = false;
        trolley1.weight = 10.5;
        trolley1.material = "Steel";
        trolley1.hasHandle = true;
        trolley1.handleType = "Telescopic";
trolley1.loadItems();
System.out.println(trolley1.brand + "" +trolley1.isExpandable) ;
	}
}