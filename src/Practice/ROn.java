package Practice;

public class ROn {

        String teamName;
        int score;

        // Standard Constructor (Builds the original team)
        public ROn(String name, int score) {
            this.teamName = name;
            this.score = score;
        }

        // COPY CONSTRUCTOR (Your turn to write this!)
        public ROn(ROn oldTeam) {

                   this .teamName = oldTeam.teamName;

                        this . score = 100;
        }
        public void show (){
            System.out.println(teamName+ score);
        }
        public static void main (String [] arg ){
             ROn r1 = new ROn("babu bhai", 90);
            System.out.println("original");
            r1.show();

            ROn r2 = new ROn(r1);
            System.out.println("clone");
        r2.show();
        }
    }




