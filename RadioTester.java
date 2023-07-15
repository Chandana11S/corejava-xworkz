class RadioTester{

public static void main(String[] args){
      Radio radio = new Radio();
      radio.name = "Prakruthi";
      radio.color = "James";
      radio.price = "500";
      radio.model = "Stories";
      radio.toRead();
System.out.println(radio.name + " " + radio.author);

      Radio radio1 = new Radio();
      radio1.name = "Nandu";
      radio1.author = "Robust";
      radio1.price = "100";
      radio1.type = "MoralStories";
      radio.toListen();
System.out.println(radio1.name + " " + radio1.author);


}


}