package exercicios_propostos.s12_enums.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Post post1, post2;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        post1 = new Post(sdf.parse("21/06/2028 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12,
                new Comment("have a nice trip"),
                new Comment("Wow that's awesome!"));

        post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5,
                new Comment("Good night"),
                new Comment("May the force with you"));

        System.out.println(post1);
        System.out.println(post2);
    }
}
