/*
 Use the Scanner class to read the following string into variables.
 Input String: "P Sherman 42 Wallaby Way Sydney"
 Variables: firstInitial,lastName, houseNumber,streetName,streetType,city
 */
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter First Initial, Last Name, House Number, Street Name, Street Type, City");
        // String input
        String firstInitial = myObj.nextLine();
        String lastName = myObj.nextLine();
        String houseNumber = myObj.nextLine();
        String streetName = myObj.nextLine();
        String streetType = myObj.nextLine();
        String city = myObj.nextLine();

        // Output input by user
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
