import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class PuzzleJava{
    public ArrayList<Integer> getTenRolls(){
        Random rand = new Random();
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            int randomValue = rand.nextInt(21);
            tenRolls.add(randomValue);
        }
        return tenRolls;
    }

    public char getRandomLetter(){
        Random rLetter = new Random();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char characters = 'A'; characters <= 'Z'; ++characters){
            alphabet.add(characters);
        }
        int randomLetter = rLetter.nextInt(26);
        return alphabet.get(randomLetter);
    }

    public String generatePassword(){
        Random rPassword = new Random();
        String genPassword = "";
        for (int i = 0; i < 8; i++){
            String addChar = String.valueOf(getRandomLetter());
            genPassword = genPassword + addChar;
        }
        return genPassword;
    }

    public ArrayList<String> genNewPasswordSet(int number){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < number; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    public ArrayList<Character> shuffleArray(ArrayList<Character> arrList){
        Random rSwap = new Random();
        int randomSwap = arrList.size() + 1;
        for (int i = 0; i < arrList.size(); i++){
            int randomInt = rSwap.nextInt(randomSwap);
            Collections.swap(arrList, i, randomInt);
        }
        return arrList;
    }

}