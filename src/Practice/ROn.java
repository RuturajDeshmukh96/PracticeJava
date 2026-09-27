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
            // 1. Copy the team name from the oldTeam
                   this .teamName = oldTeam.teamName;
            // 2. Hardcode the new score to 0
                        this . score = 100;
        }
        public void show (){
            System.out.println(teamName+ score);
        }
        public static void main (String [] arg ){
             ROn r1 = new ROn("babu bhai", 90);
            r1.show();
        }
    }




