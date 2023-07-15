class BarTester{

public static void main(String[] args) {
    Bar bar = new Bar();
    bar.name = "Lounge";
    bar.location = "Downtown";
    bar.type = "Cocktail Bar";
    bar.ambiance = "Sophisticated";
    bar.musicGenre = "Jazz";
    bar.averageDrinkPrice = 200.50;
    bar.seatingCapacity = 50;
    bar.hasOutdoorSeating = true;
    bar.hasDanceFloor = false;
    bar.isSmokingAllowed = false;
bar.socialize();
System.out.println(bar.name + " " + bar.averageDrinkPrice);

Bar bar1 = new Bar();
    bar1.name = "Lounge";
    bar1.location = "Blacktown";
    bar1.type = "Cocktail";
    bar1.ambiance = "Sophisticated";
    bar1.musicGenre = "Jazz";
    bar1.averageDrinkPrice = 50.50;
    bar1.seatingCapacity = 50;
    bar1.hasOutdoorSeating = true;
    bar1.hasDanceFloor = false;
    bar1.isSmokingAllowed = false;
bar1.socialize();
System.out.println(bar1.name + " " + bar1.averageDrinkPrice);

}
}