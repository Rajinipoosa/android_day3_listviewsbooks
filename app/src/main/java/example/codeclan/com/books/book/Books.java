package example.codeclan.com.books.book;

/**
 * Created by user on 19/04/2017.
 */

public class Books {
    private int ranking;
    private String title;
    private String author;

    public Books(Integer ranking, String title, String author){
        this.ranking = ranking;
        this.title = title;
        this.author = author;

    }
    public Integer getRanking(){
        return ranking;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

}
