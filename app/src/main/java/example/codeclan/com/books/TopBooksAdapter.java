package example.codeclan.com.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import example.codeclan.com.books.book.Books;

/**
 * Created by user on 19/04/2017.
 */

public class TopBooksAdapter extends ArrayAdapter<Books> {
    public TopBooksAdapter(Context context,ArrayList<Books> books){
        super(context,0,books);
    }
    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
       if(listItemView == null) {
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.books_item, parent, false);
       }
        Books currentBook = getItem(position);
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBook.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentBook.getTitle());

        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentBook.getAuthor());

        listItemView.setTag(currentBook);

        return listItemView;
       }
    }

