class SuperMarket3{

static String vegatables[] = {"Photo", "Carrot", "Beans", "Bringal", "Onion"};
static String biscuits[] = {"Oreo", "happy happy", "mariegold", "marilight", "jim-jum", "50-50", "burbon", "darkfantecy", "goodday", "hide and seek"};
static String perfumes[] = {"z-perfume",  "sandlawood perfume", "fogg", "lotus perfume", "watergirl", "denver", "engage", "wattagirl", "gues", "gucci"};
static String groceries[] = {"bread", "vegetable", "butter", "oil", "soaps", "shampoo", "fruits", "dryfruits", "rice", "daal"};

public static void main(String market[]){
	
	System.out.println("Main Started");
    System.out.println("=======");
    System.out.println("list of  vegatables are");
	getVegatables();
	getBiscuits();
	getPerfumes();
	getGroceries();
	System.out.println("Main ended");
}
	
//for
public static void getVegatables(){
	System.out.println("Inside getVegatables");
	for(String vegatable : vegatables){
		System.out.println(vegatable);
	}
}	

	
	
	public static void getBiscuits(){
	System.out.println("Inside getBiscuits");
	for(String biscuit : biscuits){
		System.out.println(biscuit);
	}
}	
	
	
    

    public static void getPerfumes(){
	System.out.println("Inside getPerfumes");
	for(String perfume : perfumes){
		System.out.println(perfume);
	}
}	
	
	
    
	
	public static void getGroceries(){
	System.out.println("Inside getGroceries");
	for(String grocery : groceries){
		System.out.println(grocery);
	}
}	
	
	

}
