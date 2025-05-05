
package javafinal2;
import java.util.Scanner;

public class JavaFinal2 {
    
    public static void main(String[] args) {
        FileCreator file = new FileCreator("EmployeeInfo.csv");
        System.out.print("Enter the number of emplpyees: ");
        Scanner input = new Scanner(System.in);
        int numberOfEmployees = input.nextInt(); // or Integer.parseInt(input.nextLine())
        input.nextLine();
        file.HeaderWriter();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter the name for employee " + (i + 1) + ": ");
            String name = input.nextLine();

            System.out.print("Enter the age for employee " + (i + 1) + ": ");
            int age = input.nextInt(); // or Integer.parseInt(input.nextLine())
            input.nextLine();
                    
            System.out.print("Enter the city for employee " + (i + 1) + ": ");
            String city = input.nextLine();

            file.LineWriter(name, age, city);
        }
        file.CloseFile();
        input.close();
    }
    
}
