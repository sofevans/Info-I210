import java.util.Random;
import java.util.Arrays;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch watch1 = new StopWatch();
        System.out.println("Start Time: " + watch1.start());
        Random rd = new Random();
        int[] numArr = new int[100000];
        int j = 0;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = rd.nextInt();
        }
        Arrays.sort(numArr);
        System.out.println("End Time: " + watch1.stop());
        System.out.println("Elapsed Time: " + watch1.getElapsedTime());
    }
        
            
                
        }
class StopWatch {
    long startTime = 1;
    long endTime = 1;
    
    long start(){
        startTime = System.currentTimeMillis();
        return startTime;
    }
    long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }
    long getElapsedTime() {
        return endTime - startTime;
    }
    void setStartTime(long newStartTime) {
        newStartTime = startTime;
    }
}

