class SuperMarket2{

static String vegatables[] = {"Photo", "Carrot", "Beans", "Bringal", "Onion"};
static String biscuits[] = {"Oreo", "happy happy", "mariegold", "marilight", "jim-jum", "50-50", "burbon", "darkfantecy", "goodday", "hide and seek"};
static String perfumes[] = {"z-perfume",  "sandlawood perfume", "fogg", "lotus perfume", "watergirl", "denver", "engage", "wattagirl", "gues", "gucci"};
static String groceries[] = {"bread", "vegetable", "butter", "oil", "soaps", "shampoo", "fruits", "dryfruits", "rice", "daal"};

public static void main(String supermarket[]){

//foreach
for(String vegetable : vegatables){
System.out.println(vegetable);
}

for(String biscuit : biscuits){
System.out.println(biscuit);
}

for(String perfume : perfumes){
System.out.println(perfume);
}

for(String grocery : groceries){
System.out.println(grocery);
}
}
}
