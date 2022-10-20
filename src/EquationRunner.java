
import java.text.NumberFormat;
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please insert a coordinate: ");
        String coordOne = userInput.nextLine().replaceAll("\\s", "");
        System.out.println("Please insert a second coordinate: ");
        String coordTwo = userInput.nextLine().replaceAll("\\s", "");
        LinearEquation linearEquation = new LinearEquation(
                Integer.parseInt(coordOne.substring(1, coordOne.indexOf(","))),
                Integer.parseInt(coordOne.substring(coordOne.indexOf(",") + 1, coordOne.indexOf(")"))),
                Integer.parseInt(coordTwo.substring(1, coordTwo.indexOf(","))),
                Integer.parseInt(coordTwo.substring(coordTwo.indexOf(",") + 1, coordTwo.indexOf(")"))));
        System.out.println(linearEquation);
        System.out.println("Please insert a new x value: ");
        double coordThreeX = userInput.nextDouble();
        System.out.println("The coordinate with this x-value is: " + "(" + coordThreeX + ", " + linearEquation.findY(coordThreeX) + ")");
    }
}
