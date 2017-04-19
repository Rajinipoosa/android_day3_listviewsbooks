package example.codeclan.com.books.book;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopBooks {
    private ArrayList<Books> list;

    public TopBooks(){
        list = new ArrayList<Books>();
        list.add(new Books(1, "Harry Potter and the Sorcerer's Stone","J.K Rowling"));
        list.add(new Books(2,"The Hobbit","J.R.R. Tolkein"));
        list.add(new Books(3,"The Catcher in the Rye","J.D. Salinger"));
        list.add(new Books(4,"Pride and Prejudice","Jane Austen"));
        list.add(new Books(5,"To Kill a Mockingbird","Harper Lee"));

    }

    public ArrayList<Books> getList(){
        return new ArrayList<Books>(list);
    }

}
