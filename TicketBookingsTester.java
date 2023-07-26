class TicketBookingsTester{
public static void main(String main[]){
TicketBookings ticket = new TicketBookings();
ticket.setBookId(1);
ticket.setNoOfSeats(89);
ticket.setSource("Mysore");
ticket.setDestination("Pandichari");
ticket.setDate(11/6/23);
ticket.setTimings(20.00);
ticket.setPrice(2500);
ticket.setClasss("AC");
ticket.setBookingType("online");
ticket.setTransportName("Train");

System.out.println(ticket.getBookId()+ " " +ticket.getNoOfSeats()+ " " +ticket.getSource()+ " " +ticket.getDestination()+ " " +
ticket.getDate()+ " " +ticket.getTimings()+ " " +ticket.getPrice()+ " " +ticket.getClasss()+ " " +ticket.getBookingType()+ " " +
ticket.getTransportName());

}



}