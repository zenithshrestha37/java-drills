import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String firstName = "Avar";
	    String lastName = "Kriss";
	    int birthYear = 1992;
	    String homeWorld = "Coruscant";
	    double height =  172; // in cm
	    double weight = 160; // in lbs
	    double purse = 150.0;

	    // Mathematical Operations

        purse -= 24.3;
        purse -= 45;
        purse *= 2;
	    purse = 0.9 * purse; // purse -= purse * .1

        // Conditional Love

	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color of the handle");
        String  lightsaberHandleColor = scanner.nextLine();

        System.out.println("Enter the color of the blade");
        String  lightsaberBladeColor = scanner.nextLine();

        if (lightsaberBladeColor.equalsIgnoreCase ("purple") && lightsaberHandleColor.equalsIgnoreCase("black")){
            System.out.println("This one's mine");
        } else {
            System.out.println("Pass");
        }
        System.out.println(" Enter the spaceship name");
        String spaceship = scanner.nextLine();

        if (spaceship.equalsIgnoreCase("Mellenium Falcon")){
            System.out.println("let's go");
        } else {
            System.out.println("I better hide somewhere");
        }


        System.out.println("Enter the credit for items");
        Double credit = scanner.nextDouble();

        System.out.println("is it recommended");
        boolean  recommended = scanner.nextBoolean();

        if (credit < 5 && recommended ) {
            System.out.println("I will try it");
        }

        System.out.println("Enter the credit for drink");
        Double drinkCredit = scanner.nextDouble();

        System.out.println("enter the size");
        double  size = scanner.nextDouble();

        if (drinkCredit < 1 && size > 24) {
            System.out.println("I will order it");
        }

    }
}




