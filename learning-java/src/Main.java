import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int employeeAge = 34;
        double employeeID = 3.34;
        boolean isActive = true;
        String employeeFirstName = "Thomas";
        String employeeLastName = "Matlock";
        char employeeFirstInitial = employeeFirstName.charAt(0);
        char employeeLastInitial = employeeLastName.charAt(0);

        System.out.println(employeeFirstName + " " + employeeLastName + " is Active? " + isActive);
        Scanner input = new Scanner(System.in);
        employeeID = input.nextDouble();


        System.out.println(employeeAge);
        System.out.println(employeeID);
        System.out.println(employeeFirstInitial);
        System.out.println(employeeLastInitial);
        System.out.println(isActive);
        System.out.println(employeeFirstName);
        System.out.println(employeeLastName);
    }
}