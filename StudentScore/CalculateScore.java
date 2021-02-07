package StudentScore;
import java.util.ArrayList;
public class CalculateScore{
    private float max, min, mean;
    private double SD;
    public CalculateScore(ArrayList score){ 
        float iTemp = 0.0f;
        float imax = 0.0f;
        float imin = 0.0f;
        float isum = 0.0f;
        
        for (int i =0; i < score.size(); i++){
            String tmp = score.get(i).toString();
            iTemp = Float.parseFloat(tmp);
            isum = isum + iTemp;
            if (i == 0){
                imax = iTemp;
                imin = iTemp;
            }else if (iTemp > imax){
                imax = iTemp;
            }else if (iTemp < imin){
                imin = iTemp;
            }
        }
        max = imax;
        min = imin;
        mean = isum/score.size();
        isum = 0.0f;
        for (int i =0; i < score.size(); i++){
            String tmp = score.get(i).toString();
            iTemp = Float.parseFloat(tmp);
            isum += Math.pow(iTemp - mean, 2);
        }
        float imean = isum/(score.size()-1);
        SD = Math.sqrt(imean);
    }
    public float getMax(){
        return max;
    }
    public float getMin(){
        return min;
    }
    public float getMean(){
        return mean;
    }
    public double getSD(){
        return SD;
    }
    

    // public float getMax(float[] arr){
    //     Arrays.sort(arr);
    //     float max = arr[arr.length-1];
    //     return max;
    // }
    // public float getMin(float[] arr){
    //     Arrays.sort(arr);
    //     float min = arr[0];
    //     return min;
    // }
    // public float getMean(float[] arr){
    //     float sum = 0.0f, mean;
    //     for (int i = 0; i < arr.length; i++){
    //         System.out.println("sum :" + sum + " arr :" + arr[i]);
    //         sum = sum + arr[i];
            
    //     }
    //     mean = sum/arr.length;
    //     return mean;
    // }
    // public float getSD(float[] arr){
    //     return 0.0f;
    // }
    
    
}
