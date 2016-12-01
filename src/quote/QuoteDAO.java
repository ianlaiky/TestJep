package quote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuoteDAO {
    private static List<Quote> quotes;
    private static Random random = new Random();

    public QuoteDAO() {
        if (quotes == null) {
            quotes = new ArrayList<Quote>();
            quotes.add(new Quote("Donald Trump", "Sometimes by losing a battle you find a new way to win the war."));
            quotes.add(new Quote("Donald Trump", "You have to think anyway, so why not think big?"));
            quotes.add(new Quote("Donald Trump", "Without passion you don't have energy, without energy you have nothing."));
            quotes.add(new Quote("Confucius", "It does not matter how slowly you go as long as you do not stop"));
            quotes.add(new Quote("Confucius", "Life is really simple, but we insist on making it complicated"));
            quotes.add(new Quote("Confucius", "Wherever you go, go with all your heart."));
            quotes.add(new Quote("Confucius", "Silence is a true friend who never betrays."));
            quotes.add(new Quote("Aristotle", "Quality is not an act, it is a habit."));
            quotes.add(new Quote("Aristotle", "The roots of education are bitter, but the fruit is sweet."));
            quotes.add(new Quote("Albert Einstein", "The true sign of intelligence is not knowledge but imagination."));
        }
    }

    public Quote getRandomQuote() {
        System.out.println("Quote size : " + quotes.size());
        return quotes.get(random.nextInt(quotes.size()));
    }

    public List<Quote> getQuotes(String author) {
        List<Quote> list = new ArrayList<Quote>();
        for (int i = 0; i < quotes.size(); i++) {
            Quote q = quotes.get(i);
            if (!q.getAuthor().equals(author)) {
                list.add(q);
                System.out.println("pri" + q.getAuthor());
            }
        }
        return list;
    }

    public void addQuote(Quote q) {
        quotes.add(q);
    }


    public Quote getQuote(int age) {

        if (age < 12) {
            System.out.println("LESS");

            List<Quote> q = getQuotes("Donald Trump");


            for (int i = 0; i < q.size(); i++) {

                System.out.println(q.get(i).getAuthor());

            }


            return q.get(random.nextInt(q.size()));

        } else {
            System.out.println("MORE");
            for (int i = 0; i < quotes.size(); i++) {
                System.out.println(quotes.get(i).getAuthor());

            }
            return quotes.get(random.nextInt(quotes.size()));
        }


    }

//    public List<Quote> getAll() {
//        System.out.println("reren");
//        ArrayList<String> s = new ArrayList<String>();
//        for (int i = 0; i < quotes.size(); i++) {
//            Quote q = quotes.get(i);
//            s.add(q.getQuote());
//
//
//        }
//
//        java.util.Collections.sort(s);
//
//        List<Quote> list = new ArrayList<Quote>();
//
//        for (int o = 0; o < quotes.size(); o++) {
//
//            for (int p = 0; p < s.size(); p++) {
//                String temp = quotes.get(p).getQuote();
//                if (temp.equals(s)) {
//                    list.add(quotes.get(p));
//                    System.out.println("Secc");
//                }
//            }
//
//
//        }
//        return list;
//
//    }


}