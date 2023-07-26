class PassportApplication{
	
private String applicantName;
private String nationality;
private int dateOfBirth;
private String placeOfBirth ;
private String gender ;
private String address ;
private String occupation;
private String email ;
private long phoneNumber ;
private String photo ;

public void setApplicantName(String applicantName){
this.applicantName = applicantName;
}
public String getApplicantName(){
	return applicantName;
}
public void setNationality( String nationality){
this.nationality = nationality;
}
public String getNationality(){
	return nationality;
}
public void setDateOfBirth(int dateOfBirth){
this.dateOfBirth = dateOfBirth;
}
public int getDateOfBirth(){
	return dateOfBirth;
}
public void setPlaceOfBirth(String placeOfBirth){
this.placeOfBirth = placeOfBirth;
}
public String getPlaceOfBirth(){
	return placeOfBirth;
}
public void setGender(String gender){
this.gender = gender;
}
public String getGender(){
	return gender;
}
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
	return address;
}
public void setOccupation(String occupation){
this.occupation = occupation;
}
public String getOccupation(){
	return occupation;
}
public void setEmail(String email){
this.email = email;
}
public String getEmail(){
	return email;
}
public void setPhoneNumber(long phoneNumber){
this.phoneNumber = phoneNumber;
}
public long getPhoneNumber(){
	return phoneNumber;
}
public void setPhoto(String photo){
this.photo = photo;
}
public String getPhoto(){
	return photo;
}
}