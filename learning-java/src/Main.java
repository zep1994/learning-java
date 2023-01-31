public class Main {

    public static double salaryCalculator(int employeeHours, double employeeWage) {
        double weeklySalary = employeeHours * employeeWage;
        return weeklySalary * 52;
    }
    public static void main(String[] args) {

        double salary = salaryCalculator(40, 7.25);
        System.out.println(salary);

//        int employeeAge = 34;
//        double employeeID = 3.34;
//        boolean isActive = true;
//        String employeeFirstName = "Thomas";
//        String employeeLastName = "Matlock";
//        char employeeFirstInitial = employeeFirstName.charAt(0);
//        char employeeLastInitial = employeeLastName.charAt(0);
//
//        System.out.println(employeeFirstName + " " + employeeLastName + " is Active? " + isActive);
//        Scanner input = new Scanner(System.in);
//        employeeID = input.nextDouble();
//        if (employeeID > 5) {
//            System.out.println("Please Try Again");
//        } else if (employeeID < 5){
//            employeeID = input.nextDouble();
//        } else {
//            System.out.println("I do not understand");
//        }
//
//        while (isActive) {
//            System.out.println("Is Active");
//            String userInput = input.next();
//
//            if(userInput.equals("no")) {
//                isActive = false;
//            }
//        }
//
//        System.out.println(employeeAge);
//        System.out.println(employeeID);
//        System.out.println(employeeFirstInitial);
//        System.out.println(employeeLastInitial);
//        System.out.println(isActive);
//        System.out.println(employeeFirstName);
//        System.out.println(employeeLastName);
    }
}