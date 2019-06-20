package Library;

public class BookMain {
    public static void main(String[] args) {
      Book science=new Book();
      Book maths=new Book();
      //science.setcopies(100);
      //science.getCopies();
      //science.setDetails(25, " scienceBok1","arun");
      maths.setDetails(20,"maths1","guru");
      maths.getDetails();
      maths.Breturn(40);
      maths.getDetails();
      //BookService mathss=new BookService();
      //mathss.bookReturn(123);
        maths.addBook(20);
        maths.getDetails();


    }

}



