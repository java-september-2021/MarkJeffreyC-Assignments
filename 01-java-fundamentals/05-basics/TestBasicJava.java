import java.util.Arrays;
import java.util.ArrayList;

public class TestBasicJava {
    public static void main(String[] args){
        BasicJava basic = new BasicJava();

        // Print 1-255
        basic.count();

        // Print odd numbers between 1-255
        basic.oddCount();

        // Print sum to 255
        System.out.println(basic.sum());

        // Iterating through an array
        int[] intNumbers = {1,3,5,7,9,13};
        basic.printAr(intNumbers);
        // basic.printAr({1,3,5,7,9,13});????

        // Find Max in Array
        int[] intNumbers2 = {-3,-5,-7};
        System.out.println(basic.findMax(intNumbers2));

        // Print array of Odd numbers from 1-255
        System.out.println(basic.oddArray());

        // NINJA BONUSUS

        // Get Average
        int[] intArray = {2,10,3};
        System.out.println(basic.getAverage(intArray));

        // Greater than Y
        int[] greaterThanY = {1,3,5,7};
        System.out.println(basic.greaterThanNum(greaterThanY,3));

        // Square the values
        int[] squareArray = {1,5,10,-2};
        int[] displayArray = basic.squareValues(squareArray);
        for (int i = 0; i < displayArray.length; i++){
            System.out.println(displayArray[i]);
        }

        // Eliminate Negative Numbers
        int[] negativeNumbers = {1,5,10,-2};
        int[] negativeDisplay = basic.negativeNums(negativeNumbers);
        for (int i = 0; i < negativeDisplay.length; i++){
            System.out.println(negativeDisplay[i]);
        }

        // Max, Min, and Average
        int[] randomNumbers = {1,5,10,7,-2};
        float[] minMaxAvgDisplay = basic.minMaxAvg(randomNumbers);
        for (int i = 0; i < minMaxAvgDisplay.length; i++){
            System.out.println(minMaxAvgDisplay[i]);
        }

        // Shifting the Values in the Array
        int[] shiftDisplay = basic.shiftValues(randomNumbers);
        for (int i = 0; i < shiftDisplay.length; i++){
            System.out.println(shiftDisplay[i]);
        }
    }
}