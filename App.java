import java.util.Scanner;

public class App {
    
    static final Scanner inputScanner = new Scanner(System.in);
    private static Calculator calculator = new Calculator();

    public static void main(String[] args){
        boolean keepGoing = true;
        double result = 0.0;

        String input = getString("enter your equation:  ");

        while(keepGoing == true){

            String[] stringArray = input.split(" ");
            
            for (int i = 0; i < stringArray.length; i++){
                if (stringArray[i].equals("r")){
                    stringArray[i] = String.format("%f", result);
                }
            }
            double num1 = Double.parseDouble(stringArray[0]);
            String operation = stringArray[1];
            double num2 = Double.parseDouble(stringArray[2]);

            // O P E R A T E   S W I T C H   S T A T E M E N T 
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    System.out.println("        = " + result);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    System.out.println("        = " + result);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    System.out.println("       = " + result);
                    break;
                case "/":
                    if(num2 == 0){
                        System.out.println("! DONT DO THAT !");
                        break;
                    }
                    result = calculator.divide(num1, num2);
                    System.out.println("        = " + result);
                    break;
                default:
                    System.out.println("DEFAULT");
            }
            System.out.println("       __________");

            System.out.println("");

            
            // C O N T I N U E   O P T I O N 
            input = getString("enter a new equation (use result with 'r') or enter 'quit'").toLowerCase();

            if (input.equals("quit")){
                System.out.println("       goodbye!");
                System.out.println("       __________");

                keepGoing = false;
            } 
            else {
                num1 = result;
            }
        }
    }

    //   M E T H O D S
    private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }
}



            // ORIGINAL VERSION CONTAINED IN WHILE LOOP
            // double num1 = getDouble("enter a number: ");
            // String operation = getString("enter operation: | add | subtract | multiply | divide | ");
            // operation = operation.toLowerCase();
            // double num2 = getDouble("enter another number: ");


            //  O P E R A T E   I F   E L S E  
            // if (operation.equals("add")){
            //     System.out.println(calculator.add(num1, num2));
            // }
            // else if (operation.equals("subtract")) {
            //     System.out.println(calculator.subtract(num1, num2));              
            // }
            // else if (operation.equals("multiply")) {
            //     System.out.println(calculator.multiply(num1, num2));              
            // }
            // else if (operation.equals("divide")) {
            //     if (num2 == 0){
            //         System.out.println("cannot divide by 0.. nice try!");
            //     } else {
            //         System.out.println(calculator.divide(num1, num2));
            //     }
            // }
            // else {
            //     System.out.println("invalid input");
            // }