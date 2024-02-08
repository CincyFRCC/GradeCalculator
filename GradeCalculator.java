import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your Grade:");
        double grade = in.nextDouble();
        System.out.println("Your grade is :"+calculategrade(grade));
    }
    public  static String calculategrade(double grade)
    {
        if (grade>=92){
            return "A";
        }
        else if (grade>89){
            return "A-";
        }
        else if (grade>87){
            return "B+";
        }
        else if (grade>82){
            return "B";
        }
        else if (grade>79){
            return "B-";
        }
        else if (grade>77){
            return "C+";
        }
        else if (grade>72){
            return "C";
        }
        else if (grade>69){
            return "C-";
        }
        else if (grade>67){
            return "D+";
        }
        else if (grade>60){
            return "D";
        }
        else if (grade>=0){
            return "F";
        }
        return "Please enter a valid grade!";
    }
}
