import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower noBooksBorrower;
    private Borrower oneBookBorrowed;
    private Library emptyLibrary;
    private Library smallLibrary;
    private Library tinyLibrary;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        noBooksBorrower = new Borrower();
        oneBookBorrowed = new Borrower();
        emptyLibrary = new Library(50);
        smallLibrary = new Library(5);
        tinyLibrary = new Library(1);
        book1 = new Book();
        book2 = new Book();
    }

    @Test
    public void hasEmptyCollection() {
        assertEquals(0, noBooksBorrower.bookCount());
    }

    @Test
    public void canAddBook() {
        smallLibrary.addBook(book1);
        oneBookBorrowed.borrowBook(smallLibrary);
        assertEquals(0, smallLibrary.getBookCount());
        assertEquals(1,oneBookBorrowed.bookCount());
    }
}
