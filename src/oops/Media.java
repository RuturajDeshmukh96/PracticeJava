 //package oops;

 import javax.management.timer.TimerMBean;

 import java.util.*;
public abstract class Media {
    private String title;
    private int duration;

    public void settitle(String title) {
        System.out.println("Dhoom");
    }

    public void Gettitle(String title) {
        return;
    }

    public void settitle(int duration) {

        System.out.println(14);
    }

    public void Gettitle(int duration) {
        return;
    }

    public abstract void play();

}
    class Movie extends Media {
        private String direct;

        public Movie(String direct, String title, int duration) {
            super(title, duration);
            System.out.println("now Watchining " + title + "--" + duration);
        }

        Override {
            public void play () {
                System.out.println("done");
            }

        }


        class song extends Media {
            private String artist;

            public song(String artist, String title, String duration) {
                super(title, duration);
                System.out.println("now listing " + title + "--" + duration);
            }

            Override {
                public void play () {
                    System.out.println("done");
                }


            }

        }
    }

    class StreamingApp extends Movie {
        public static void main(String[] args) {


            List<Media> playlist = new ArrayList<>();
            Movie m = new Movie("john");
            Movie m1 = new Song("sanamre");
        }

}