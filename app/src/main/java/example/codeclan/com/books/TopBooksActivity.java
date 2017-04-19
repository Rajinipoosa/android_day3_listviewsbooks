package example.codeclan.com.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import example.codeclan.com.books.book.Books;
import example.codeclan.com.books.book.TopBooks;

public class TopBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_list);
        TopBooks topBooks = new TopBooks();
        ArrayList<Books> list = topBooks.getList();

        TopBooksAdapter booksAdapter = new TopBooksAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(booksAdapter);
    }
    public void getBooks(View listItem){
        Books books = (Books) listItem.getTag();

        Log.d("Books title: ", books.getTitle());
    }
}
