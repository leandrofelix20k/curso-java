package exercicios_propostos.s12_enums.ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private Date momment;
    private String title;
    private String content;
    private Integer likes;

    private Comment[] comments = new Comment[2];

    public Post() {
    }

    public Post(Date momment, String title, String content, Integer likes, Comment c1, Comment c2) {
        this.momment = momment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments[0] = c1;
        this.comments[1] = c2;
    }

    public Date getMomment() {
        return momment;
    }

    public void setMomment(Date momment) {
        this.momment = momment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return title + "\n" +
                likes + " Likes - " + sdf.format(momment) + "\n" +
                content + "\n" +
                "Comments:" + "\n" +
                comments[0] + "\n" +
                comments[1] + "\n";
    }
}
