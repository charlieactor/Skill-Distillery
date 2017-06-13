import java.util.Scanner;

public class EmployeeMenu {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String employeeList [] = {"Larry Smith", "Moses Malone", "Charlie Actor",
                              "Grandma Jones", "Grandpa Jones", "Bryan LaFeve",
                             "Conan O'Brian", "Jay Leno", "Jimmy Fallon", "Ferguson",
                              null, null, null};

    int choice;
    int i;
    do {
    System.out.println("Select an option: ");
    System.out.println("1) List Employees");
    System.out.println("2) Hire Employee");
    System.out.println("3) Fire Employee");
    System.out.println("4) Quit");

    choice = keyboard.nextInt();

    if(choice == 1) {
      for (i = 0; i < employeeList.length; i++ ) {
        System.out.println((i+1) + employeeList[i]);
      }
    }
    else if(choice == 2) {
      int q;
      for(q = 0; q < employeeList.length; q++){
        if (employeeList[q] == null) {
          String newEmployee;
          System.out.print("Please enter a new employee: ");
          keyboard.nextLine();
          newEmployee = keyboard.nextLine();
          employeeList[q] = newEmployee;
          break;
        }
      }
    }
    else if(choice == 3) {
      int fire;
      System.out.println("Select the employee's number you'd like to fire: ");
      fire = keyboard.nextInt();
      employeeList[(fire-1)] = null;
      System.out.println(employeeList[fire]);
    }
  }  while (choice != 4);
      System.out.println("You have succesfully quit the program!");
  }
}
