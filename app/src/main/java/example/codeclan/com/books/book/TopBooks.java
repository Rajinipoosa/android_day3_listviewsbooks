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
        list.add(new Books(6,"1984","George Orwell"));
        list.add(new Books(7,"The Da Vinci Code","Dan Brown"));
        list.add(new Books(8,"The Great Gatsby","Scott Fitzgerald"));
        list.add(new Books(9,"The Lord of Rings","J.R.R. Tolkein"));
        list.add(new Books(10,"The Odyssey","Homer"));
        list.add(new Books(11,"Catching Fire","Suzanne collins"));
        list.add(new Books(12,"Breaking Dawn","Stephenie Meyer"));
        list.add(new Books(13,"The Book Thief","Markus Zusak"));
        list.add(new Books(14,"Mockingjay","Suzanne collins"));
        list.add(new Books(15,"Of Mice and Men","John Stinbeck"));
        list.add(new Books(16,"Great Expectation","Charles dickens"));
        list.add(new Books(17,"Emma","John Austen"));
        list.add(new Books(18,"The Giver","Lois Lowry"));
        list.add(new Books(19,"The Road","Cormac McCarthy"));
        list.add(new Books(20,"Lolita","Vladimir Nabokov"));

    }

    public ArrayList<Books> getList(){
        return new ArrayList<Books>(list);
    }

}
