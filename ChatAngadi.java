class ChatAngadi{

public static void main(String chat[]){
String chatNames[] = {"Pani Puri", "Samosa Masala", "Bhel Puri"};
//invoke logic(methods)
//argument
getChatNames(chatNames);  //invoking method
}

public static void getChatNames(String chatNames[]){  //declaration of a  method//signature incude declaration
	System.out.println("Inside getChatNames");
	for(String chatName : chatNames){          //{}indide curly basis is called body of the method
	System.out.println(chatName);	
	}
}







}