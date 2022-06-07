import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Korobov_Java_Algorithm1 {
    public static void main(String[] args) throws IOException {
        //greetings message
        System.out.println("Please, input the number: ");
        //reading the next input
        BufferedReader readTheNumber = new BufferedReader(new InputStreamReader(System.in));
        //assigning the next int to the variable number
        int number = Integer.parseInt(readTheNumber.readLine());
        //checking is it bigger than 7
        if (number > 7) {
            System.out.println("Привет!");
        }
    }
}
