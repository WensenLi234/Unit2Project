
import java.text.NumberFormat;
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println("Please insert a coordinate: ");
        String coordOne = new String(userInput.nextLine());
        System.out.println("Please insert a second coordinate: ");
        String coordTwo = new String(userInput.nextLine());
        LinearEquation linearEquation = new LinearEquation(
                numberFormat.parse(),
                numberFormat.parse(),
                numberFormat.parse();
    }
}
