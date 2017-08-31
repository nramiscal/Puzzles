import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Puzzles {
  // Print the sum of all numbers in the array. Also have the function
  // return an array that only includes numbers that are greater than
  // 10 (e.g. when you pass the array above, it should return an array
  // with the values of 13,25,32)
  public ArrayList<Integer> puzzle1(int[] array) {
    int sum = 0;
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int element: array){
      sum += element;
      if (element > 10){
        y.add(element);
      }
    }
    System.out.println(sum);
    return y;

  }

  // Shuffle the array and print the name of each person. Have the
  // method also return an array with names that are longer than 5
  // characters.
  public ArrayList<String> puzzle2(String[] array) {
    System.out.println(Arrays.toString(array));
    List<String> list = Arrays.asList(array);
    Collections.shuffle(list);
    list.toArray(array);
    System.out.println(Arrays.toString(array));

    ArrayList<String> y = new ArrayList<String>();
    for (String element: array){
      if (element.length() > 5){
        y.add(element);
      }
    }
    return y;
  }

  // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
  public void puzzle3(String[] array) {
    System.out.println(Arrays.toString(array));
    List<String> list = Arrays.asList(array);
    Collections.shuffle(list);
    list.toArray(array);
    System.out.println(Arrays.toString(array));
    System.out.println(array[25]);
    System.out.println(array[0]);
    if (array[0] == "a" || array[0] == "e" || array[0] == "i" || array[0] == "o" || array[0] == "u"){
      System.out.println(array[0] + " is a vowel.");
    }
  }

  // Generate and return an array with 10 random numbers between 55-100.
  public int[] puzzle4() {
    int array[] = new int[10];
    for (int i = 0; i < 10; i++){
      double num = 46*Math.random() + 55;
      int x = (int)num;
      array[i] = x;
    }
    // System.out.println(Arrays.toString(array));
    return array;
  }

  // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
  public void puzzle5() {
    int[] array = this.puzzle4();
    System.out.println(Arrays.toString(array));
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

  }

  // Create a random string that is 5 characters long.
  public String puzzle6() {
    String myString = "";
    String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    for (int i = 0; i < 5; i++){
      double num = 26*Math.random();
      int x = (int)num;
      myString += letters[x];
    }
    return myString;
  }

  // Generate an array with 10 random strings that are each 5 characters long.
  public String[] puzzle7() {
    String[] array = new String[10];
    for (int i = 0; i < 10; i++){
      array[i] = this.puzzle6();
    }
    System.out.println(Arrays.toString(array));
    return array;
  }

}
