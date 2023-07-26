class PassportApplicationTester{
public static void main(String RGS[]){

PassportApplication self = new PassportApplication();

self.setApplicantName("Pragnya");
self.setNationality("Indian");
self.setDateOfBirth(11/05/2002);
self.setPlaceOfBirth("Mysore"); 
self.setGender("female");
self.setAddress("#34,main road");
self.setOccupation ("Student");
self.setEmail("pragnyasuresh@gmail.com"); 
self.setPhoneNumber(12345L);
self.setPhoto("colorPhoto");

System.out.println(self.getApplicantName() + " " + self.getNationality() + " " + self.getDateOfBirth() + " " + self.getPlaceOfBirth() + " " + self.getGender() + " " + self.getAddress() + " " + self.getOccupation()
+ " " + self.getEmail() + " " + self.getPhoneNumber() + " " + self.getPhoto());
}
}