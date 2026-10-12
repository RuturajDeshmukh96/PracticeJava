package Practice;

public class TruthLenseAnalyzer {

    static double alertThreshold = 19.0 ;
    static String leadAnalyst = "Ruturaj";
    String videoId;
    double fakeProbability;
    TruthLenseAnalyzer ( String videoId , double fakeProbability ){
        this.videoId = videoId;
       // this. alertThreshold =  alertThreshold ;
        this. fakeProbability =  fakeProbability;
    }
    public void checkStatus () {
        if (fakeProbability > alertThreshold){
            System.out.println("  ALERT: Deepfake detected in " + videoId + " - Notify " + leadAnalyst);
        }else {
            System.out.println("C hecking the video Deeeply");
        }
    }
    public static  void main (String[] args){
        TruthLenseAnalyzer t1 = new TruthLenseAnalyzer("001",90.0);
        t1.checkStatus();
        TruthLenseAnalyzer t2 = new TruthLenseAnalyzer("002",95.0);
        t2. checkStatus();

        double[] dailyScores = {45.5, 88.0, 92.5, 30.0, 19.1, 75.0};
        double maxScore = dailyScores [0];

        for (int i = 1 ; i < dailyScores.length;i++) {
            if (dailyScores[i]> maxScore){
                maxScore =  dailyScores [i];
            }
        }
        System.out.println("The highest fake probability score today was: " + maxScore);
    }
}
