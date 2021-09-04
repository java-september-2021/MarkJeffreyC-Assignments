import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class TestPuzzleJava {
    public static void main(String[] args){
        PuzzleJava puzzleJava = new PuzzleJava();

        // getTenRolls
        System.out.println(puzzleJava.getTenRolls());

        // getRandomLetter
        System.out.println(puzzleJava.getRandomLetter());

        // generatePassword
        System.out.println(puzzleJava.generatePassword());

        // genNewPasswordSet
        System.out.println(puzzleJava.genNewPasswordSet(5));
        System.out.println(puzzleJava.genNewPasswordSet(10));

        // SENSEI BONUS:
        // shuffleArray option 1
        ArrayList<Character> freshArray = new ArrayList<Character>();
        Random rArray = new Random();
        int rInteger = rArray.nextInt(21);
        for (int i = 0; i < rInteger; i++){
            freshArray.add(puzzleJava.getRandomLetter());
        }
        System.out.println("Origina Array : " + freshArray);
        System.out.println("Shuffled Array: " + puzzleJava.shuffleArray(freshArray));

        // shuffleArray option 2
        ArrayList<Character> freshArray2 = new ArrayList<Character>();
        int rInteger2 = rArray.nextInt(21);
        for (int i = 0; i < rInteger2; i++){
            freshArray2.add(puzzleJava.getRandomLetter());
        }
        System.out.println("Origina Array : " + freshArray2);
        Collections.shuffle(freshArray2);
        System.out.println("Shuffled Array: " + freshArray2);
    }
}