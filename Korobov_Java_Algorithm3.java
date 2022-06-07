import java.io.IOException;


public class Korobov_Java_Algorithm3 {
    public static void main(String[] args) throws IOException {
        //creating of the example array
        int[] array = new int[6];
        //loop for a fulfilling the array by number [0, 1, 2, 3, 4, 5]
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        //creating the next exemplar of the calculatingTheArray class
        calculatingTheArray newArray = new calculatingTheArray();
        /*using the calculatingTheArray class method, and sending as an argument our created array
        * here you can put any array
        */
        newArray.arrayLine(array);
    }
}

/**
 * creating the class witch have all the logic of the algorithm
 */
class calculatingTheArray {
    //create the method which receive the array as an argument
    public void arrayLine(int[] array) {
        //loop, which check every element is it divide by 3
        for (int j : array) {
            if (j % 3 == 0) {
                //if yes - write it to the terminal
                System.out.println("Array elements what can be divided by 3: " + j);
            }
        }
    }
}
