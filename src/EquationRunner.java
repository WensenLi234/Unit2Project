
import java.text.NumberFormat;
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please insert a coordinate: ");
        String coordOne = userInput.nextLine().replaceAll("\\s", "");
        System.out.println("Please insert a second coordinate: ");
        String coordTwo = userInput.nextLine().replaceAll("\\s", "");
        System.out.println(coordOne.substring(1, 2) + ", " + coordOne.substring(3, 4));
        LinearEquation linearEquation = new LinearEquation(
                Double.parseDouble(coordOne.substring(1, 2)),
                Double.parseDouble(coordOne.substring(3, 4)),
                Double.parseDouble(coordTwo.substring(1, 2)),
                Double.parseDouble(coordTwo.substring(3, 4)));
        System.out.println(linearEquation);
        System.out.println("Please insert a new x value: ");
        double coordThreeX = userInput.nextDouble();
        System.out.println("The coordinate with this x-value is: " + "(" + coordThreeX + ", " + linearEquation.findY(coordThreeX) + ")");
    }
}
