import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //prompt user for test score
    System.out.print("Test score: ");
    int testScore=input.nextInt();

    char grade;

    //original submission was missing 'else' in the tree

    if (testScore >= 90) {
        grade = 'A';
    }else if (testScore >= 80) {
        grade = 'B';
    }else if (testScore >= 70) {
        grade = 'C';
    }else if (testScore >= 60) {
        grade = 'D';
    }else {
        grade = 'F';
    }
        System.out.println("Grade = " + grade);
    }

}

