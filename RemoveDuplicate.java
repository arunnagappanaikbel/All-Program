import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Map<Integer,BookB> hh=new HashMap<>();
        BookB one=new BookB(111,"java","coding","arun");

        BookB two = new BookB(12365, "Python", "Computer", "Mohan");
        BookB three=new BookB(111,"java","coding","arun");
        hh.put(1,one);
        hh.put(2,two);
        hh.put(3,three);
        System.out.println("Removing Duplicate in HashMap  ");

        //Removing duplicate in HashMap
        /*Collection<BookB> list = hh.values();
        for(Iterator<BookB> itr = list.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(list, itr.next())>1)
            {
                itr.remove();
            }
            for (Map.Entry<Integer, BookB> entry:hh.entrySet()){

                BookB b = entry.getValue();

                System.out.println(b.author+" "+b.name+" "+b.category+" "+ b.id);
        }


        } */
        System.out.println("Removing Duplicate in Hashset using hashCode and equals ");

        HashSet<BookB> set = new HashSet();

        set.add(one);

        set.add(two);

        set.add(three);


        for(BookB b:set ) {

            System.out.println(b.author+" "+b.name);

        }


    }
}




class BookB{
    int id;
    String name;
    String category;
    String author;
    BookB(int id, String name, String category, String author){
        this.id=id;
        this.name=name;
        this.category=category;
        this.author=author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookB bookB = (BookB) o;
        return id == bookB.id &&
                Objects.equals(name, bookB.name) &&
                Objects.equals(category, bookB.category) &&
                Objects.equals(author, bookB.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, author);
    }
}