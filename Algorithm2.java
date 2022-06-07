import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;


public class Algorithm2 {
    public static void main(String[] args) throws IOException {
        //greetings message
        System.out.println("Please, input the name: ");
        //reading the next input
        BufferedReader readTheName = new BufferedReader(new InputStreamReader(System.in));
        String name = readTheName.readLine();
        //assigning the next string to the variable answer and comparison
        String answer = Objects.equals(name, "Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
        System.out.println(answer);
    }
}