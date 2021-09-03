import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class BasicJava {
    public void count(){
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void oddCount(){
        for (int i = 1; i < 256; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public int sum(){
        int sum = 0;
        for (int i = 1; i < 256; i++){
            sum = sum + i;
        }
        return sum;
    }

    public void printAr(int[] intArr){
        for (int number : intArr){
            System.out.println(number);
        }
    }

    public int findMax(int[] intArr){
        int maxValue = intArr[0];
        for (int i = 0; i < intArr.length; i++){
            try {
                if (intArr[i] > maxValue){
                    maxValue = intArr[i];
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return maxValue;
    }

    public ArrayList<Integer> oddArray(){
        ArrayList<Integer> oddArr = new ArrayList<Integer>();
        for (Integer i = 1; i < 256; i++){
            if (i % 2 != 0){
                oddArr.add(i);
            }
        }
        return (oddArr);
    }

    public int getAverage(int[] intArr){
        int sum = 0;
        int avg = 0;
        int count = 0;
        for (int i = 0; i < intArr.length; i++){
            try{
                sum = sum + intArr[i];
                count = i + 1;
            } catch (Exception e){
                System.out.println(e);
            }
        }
        avg = sum / count;
        return avg;
    }

    public int greaterThanNum(int[] intArr, int num){
        int numCount = 0;
        for (int i = 0; i < intArr.length; i++){
            if (intArr[i] > num){
                numCount++;
            }
        }
        return numCount;
    }

    public int[] squareValues(int[] intArr){
        for (int i = 0; i < intArr.length; i++){
            intArr[i] = intArr[i] * intArr[i];
        }
        return intArr;
    }

    public int[] negativeNums(int[] intArr){
        for (int i = 0; i < intArr.length; i++){
            if (intArr[i] < 0){
                intArr[i] = 0;
            }
        }
        return intArr;
    }

    public float[] minMaxAvg(int[] intArr){
        int minimum = intArr[0];
        int maximum = intArr[0];
        int sum = 0;
        int count = 0;
        float[] miniMaxiAvg = new float[3];
        for (int i = 0; i < intArr.length; i++){
            if (intArr[i] > maximum){
                maximum = intArr[i];
            }
            if (intArr[i] < minimum){
                minimum = intArr[i];
            }
            sum = sum + intArr[i];
            count++;
        }
        miniMaxiAvg[0] = maximum;
        miniMaxiAvg[1] = minimum;
        miniMaxiAvg[2] = (float)sum / count;
        return miniMaxiAvg;
    }

    public int[] shiftValues(int[] intArr){
        for (int i = 0; i < intArr.length; i++){
            if (intArr.length == (i+1)){
                intArr[i] = 0;
            } else {
                intArr[i] = intArr[i+1];
            }
        }
        return intArr;
    }
}