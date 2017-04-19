package example.codeclan.com.books;

import org.junit.Test;

import example.codeclan.com.books.book.TopBooks;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class TopBookTest {
    @Test
    public void getListTest(){
        TopBooks topBooks =  new TopBooks();
        assertEquals(20, topBooks.getList().size());
    }



}
