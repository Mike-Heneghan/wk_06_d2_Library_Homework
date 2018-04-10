import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalogue;
    private int capacity;

    public Library(int capacity){
        this.catalogue = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.catalogue.size();
    }

    public void addBook(Book book) {
        if (catalogue.size() < capacity){
        catalogue.add(book);}
    }



}
