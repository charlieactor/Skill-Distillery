public class ArrayStudentScores {
  public static void main(String [] args){
    float scores [] = {93f, 85f, 63.2f, 72.34f};
    double average;

    average = (scores[0] + scores[1] + scores[2] + scores[3]) / 4;

    System.out.print("Student 1 score: " + scores[0] + "\nStudent 2 score: ");
    System.out.print(scores[1] + "\nStudent 3 score: " + scores[2]);
    System.out.println("\nStudent 4 score: " + scores[3]);
    System.out.println("Average score = " + average);

  }
}
