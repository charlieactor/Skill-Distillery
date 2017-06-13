import java.util.Scanner;

public class GradeIf {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int grade;

    System.out.print("Please enter the student's case (0-100): ");
    grade = keyboard.nextInt();

    switch (grade) {
      case 90: case 91: case 92: case 93: case 94: case 95: case 96:
      case 97: case 98: case 99: case 100:
        System.out.println(grade + " = A");
        break;
      case 80: case 81: case 82: case 83: case 84: case 85: case 86:
      case 87: case 88: case 89:
        System.out.println(grade + " = B");
        break;
      case 70: case 71: case 72: case 73: case 74: case 75: case 76:
      case 77: case 78: case 79:
        System.out.println(grade + " = C");
        break;
      case 60: case 61: case 62: case 63: case 64: case 65: case 66:
      case 67: case 68: case 69:
        System.out.println(grade + " = D");
        break;
      default:
        System.out.println(grade + " = F");
    }
    // if (case >= 90) {
    //   System.out.println(case + " = A");
    // }
    // else if (case >= 80) {
    //   System.out.println(case + " = B");
    // }
    // else if (case >= 70) {
    //   System.out.println(case + " = C");
    // }
    // else if (case >= 60) {
    //   System.out.println(case + " = D");
    // }
    // else {
    //   System.out.println(case + " = F");
    // }
  }
}
