class PersonTester{

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 30;
        person1.gender = "Male";
        person1.occupation = "Engineer";
        person1.address = "123 Main Street opposite  surya ibakery, City";
        person1.phoneNumber = "123-4567-890";
        person1.email = "john.doe@example.com";
        person1.nationality = "American";
        person1.height = 175.0;
        person1.weight = 70.0;
person1.introduce();
System.out.println(person1.name + "" +  person1.phoneNumber);

Person person2 = new Person();
        person2.name =  "Smithiya";
        person2.age = 25;
        person2.gender = "Female";
        person2.occupation = "Teacher";
        person2.address = "456 Park Avenue 1st main road, Town";
        person2.phoneNumber = "987-654-3210";
        person2.email = "jane.smith@example.com";
        person2.nationality = "British";
        person2.height = 160.0;
        person2.weight = 55.0;
person2.introduce();
System.out.println(person2.name + "" +  person2.phoneNumber);

}
}
