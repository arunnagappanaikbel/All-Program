package Library;

import java.util.ArrayList;
import java.util.List;

class BookRunner {
    int id;
    String name,author,publisher;
    int quantity;
    public BookRunner(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}
public class ArrayListExample {
    public static void main(String[] args) {
        //Creating list of Books
        ArrayList<BookRunner> list=new ArrayList<>();
        //Creating Books
        BookRunner b1=new BookRunner(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookRunner b2=new BookRunner(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookRunner b3=new BookRunner(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(BookRunner b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
