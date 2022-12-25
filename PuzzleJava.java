import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    // getTenRolls
   // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
   // To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <=10; i++){
        random10.add(rand.nextInt(20)+1);
        }
        return random10;
    }
}
