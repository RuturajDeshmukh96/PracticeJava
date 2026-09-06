 //package oops;


 import java.util.*;
public abstract class Media {

    private String title;
    private int duration;

 public Media (String title, int duration) {
     this.duration = duration;
     this.title = title;
 }

    public String getTitle()
    { return this.title; }

    public void Gettitle(String title) {
        return;
    }

    public void settitle(int duration) {

        System.out.println(14);
    }

    public void Getduration (int duration) {
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

        @Override
        public void play() {
            // Output uses the getters from the parent class
            System.out.println("Now watching: " + getTitle() + " directed by " + " (Length: " + Getduration () + " mins)");
        }
    }

        class song extends Media {
            private String artist;

            public song(String artist, String title, String duration) {
                super(title, duration);
                System.out.println("now listing " + title + "--" + duration);
            }

            @Override
            public void play () {
                    System.out.println("done");



            }

        }
    }

    class StreamingApp {
        public static void main(String[] args) {


            List<Media> playlist = new ArrayList<>();
            Media m1 = new Movie("Inception", "Christo", 45);
            Media m2 = new Song("Bohemian Rhapsody", 6, "Queen");

            playlist.add(m1);
            playlist.add(m2);
        }

}