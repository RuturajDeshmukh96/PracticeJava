package SONGS;

public class SingerApp {

    public static void sing(String lyrics, int pauseTime) throws InterruptedException {
        System.out.println("🎵 " + lyrics);
        Thread.sleep(pauseTime);
    }

    public static void main(String[] raje) throws InterruptedException {

        System.out.println("--- Darkhaast Song Starting... ---\n");
        Thread.sleep(1000);

        sing("Ke darkhaast hai yeh", 1500);
        sing("Jo aayi raat hai yeh", 1500);
        sing("Tu meri bahon mein duniya bhula de...", 3000);

        System.out.println();
        Thread.sleep(1200);

        sing("Jo ab lamhaat hai yeh", 1500);
        sing("Bade hi khaas hai yeh", 1500);
        sing("Tu meri bahon mein duniya bhula de...", 3000);

        System.out.println();
        Thread.sleep(1200);

        sing("unn....aa..unn.....un", 2200);
        sing("unnn..aaa..unn.un.unn..un..a.un..", 3500);
    }
}