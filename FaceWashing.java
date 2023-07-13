class FaceWashing{

 static String skinType;
 static String productBenefits;
 static String materialTypeFree = "Gluten Free";
 static String specialIngredients = "Almond Oil";
 static int packOf = 1;
 
 public static void main(String facewash[]){

  System.out.println("meaasage"+ skinType );
  System .out.println("meaasage"+ productBenefits );
  System.out.println("meaasage"+ materialTypeFree);
  System.out.println("meaasage"+ specialIngredients );
  System.out.println("meaasage" + packOf);
  
 
 //using the variable in the later stages of the program
 //local 
  skinType = "ALL";
 productBenefits = "Brightening";
 materialTypeFree = "Gluten Free";
 specialIngredients = "Almond Oil";
 int packOf = 2;
 
  System.out.println("meaasage"+ skinType );
  System.out.println("meaasage"+ productBenefits );
  System.out.println("meaasage"+ materialTypeFree);
  System.out.println("meaasage"+ specialIngredients );
  System.out.println("meaasage" + packOf);


}
}
