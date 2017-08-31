import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestPuzzles {
  public static void main(String[] args){

    Puzzles puzzles = new Puzzles();

    int[] myArray = {3,5,1,2,7,9,8,13,25,32};
    ArrayList<Integer> x = puzzles.puzzle1(myArray);
    System.out.println(x);

    String[] myArray2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList<String> y = puzzles.puzzle2(myArray2);
    System.out.println(y);

    String[] myArray3 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    puzzles.puzzle3(myArray3);

    puzzles.puzzle4();

    puzzles.puzzle5();

    puzzles.puzzle6();

    puzzles.puzzle7();


  }
}
