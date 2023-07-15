class BookTester{

public static void main(String[] args){
     Book book = new Book();
     book.name = "Prakruthi";
     book.author = "James";
     book.price = "500";
     book.type = "Stories";
     book.toRead();
     System.out.println(book.name + " " + book.author);

     Book book1 = new Book();
     book1.name = "Nandu";
     book1.author = "Robust";
     book1.price = "100";
     book1.type = "MoralStories";
     book.toRead();
System.out.println(book1.name + " " + book1.author);


}


}