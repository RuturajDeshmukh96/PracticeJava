package Practice;

import jdk.swing.interop.SwingInterOpUtils;

public class TruthLenseAnalyzer {

    static double alertThreshold = 90.0 ;
    static String leadAnalyst = "Ruturaj";
    String videoId;
    double fakeProbability;
    TruthLenseAnalyzer ( String videoId ,  double fakeProbability ){
    }
    public void checkStatus () {
        if (fakeProbability < alertThreshold){
            System.out.println("ALERT: Deepfake detected in " + videoId + " - Notify " + leadAnalyst);
        }else {
            System.out.println("Checking the video Deeeply ");
        }

    }

    public static  void main (String[] args){
        TruthLenseAnalyzer t1 = new TruthLenseAnalyzer("001",90.0);
        t1.checkStatus();

    }
}
