package Library;

public class Book {
    private int noOfCopies;
    String name;
    String author;

    void setcopies(int noOfCopies)
    {
        this.noOfCopies=noOfCopies;

    }
    void getCopies(){
        System.out.println("no.of copies are"+ noOfCopies);
    }
    void setDetails(int noOfCopies,String name, String author){
        this.noOfCopies=noOfCopies;
        this.name=name;
        this.author=author;
    }
    void getDetails(){
        System.out.println("details of this book is" + noOfCopies +" " +name+" "+ author);
    }
    void Breturn(int howMany){
        noOfCopies=(noOfCopies-howMany);
        System.out.println(noOfCopies +" "+"books is returned");}

    void addBook(int noOfBooksAdd){
        this.noOfCopies=noOfCopies+noOfBooksAdd;
        System.out.println(noOfBooksAdd + " "+ "books are added");
    }

}
