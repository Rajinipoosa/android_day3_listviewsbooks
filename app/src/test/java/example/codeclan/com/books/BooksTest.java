package example.codeclan.com.books;


import org.junit.Before;
import org.junit.Test;


import example.codeclan.com.books.book.Books;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 19/04/2017.
 */

public class BooksTest {
    Books books;

    @Before
    public void before() {
        books = new Books(2, "The Hobbit", "J.R.R. Tolkein");
    }

    @Test
    public void getRankingTest(){
        assertEquals((Integer)2, books.getRanking());

    }
    @Test
    public void getTitleTest(){
        assertEquals("The Hobbit",books.getTitle());



    }
    @Test
    public void getAuthorTest(){
        assertEquals("J.R.R. Tolkein",books.getAuthor());



    }
}

