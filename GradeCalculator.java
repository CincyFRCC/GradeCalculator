import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your Grade:");
        //reading the grade value
        double grade = in.nextDouble();
        //Output the grade
        System.out.println("Your grade is :"+calculategrade(grade));
    }
    public  static String calculategrade(double grade)
    {
        //if statement for input 92 or greater returns result as A
        if (grade>=92){
            return "A";
        }
        else if (grade>89){
            //if statement for input greater than 89 returns result as A-
            return "A-";
        }
        else if (grade>87){
            //if statement for input greater than 87 and returns result as B+
            return "B+";
        }
        else if (grade>82){
            //if statement for input greater than 82 and returns result as B
            return "B";
        }
        else if (grade>79){
            //if statement for input greater than 79 and returns result as B-
            return "B-";
        }
        else if (grade>77){
            //if statement for input greater than 77 and returns result as C+
            return "C+";
        }
        else if (grade>72){
            //if statement for input greater than 72 and returns result as C
            return "C";
        }
        else if (grade>69){
            //if statement for input greater than 69 and returns result as C-
            return "C-";
        }
        else if (grade>67){
            //if statement for input greater than 67 and returns result as D+
            return "D+";
        }
        else if (grade>60){
            //if statement for input greater than 60 and returns result as D
            return "D";
        }
        else if (grade>=0){
            //if statement for input greater equal to or greater than 0 and returns result as F
            return "F";
        }
        return "Please enter a valid grade!";
    }
}
