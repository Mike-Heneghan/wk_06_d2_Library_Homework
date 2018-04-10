import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library emptyLibrary;
    private Library smallLibrary;
    private Library tinyLibrary;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        emptyLibrary = new Library(50);
        smallLibrary = new Library(5);
        tinyLibrary = new Library(1);
        book1 = new Book();
        book2 = new Book();
    }

    @Test
    public void hasEmptyCatalogue(){
        assertEquals(0,emptyLibrary.getBookCount());
    }

    @Test
    public void canAddBook(){
        smallLibrary.addBook(book1);
        assertEquals(1, smallLibrary.getBookCount());
    }

    @Test
    public void wontaddBook(){
        tinyLibrary.addBook(book1);
        tinyLibrary.addBook(book2);
        assertEquals(1, tinyLibrary.getBookCount());
    }

}


