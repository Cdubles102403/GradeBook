
package gradebook;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author CSchafer
 */
/**
 * ToDo
 * 1. add GPA calculator
 * 2. Try Catch blocks any where there are inputs
 * 3. letter grade 
 * 4. change grades function
 * 5. mass grade input
 * 
 */


public class GradeBook {
   static double earned;
    static double total;
    static double finalGrade;
    static ArrayList<Double> GradeAry = new ArrayList<Double>();

    public static void main(String[] args) {
        
        System.out.println("hello welcome to your grade book!");
        Scanner scanner = new Scanner(System.in);
        //main loop
        while (true){
        System.out.println("what would you like to do? enter \n 1. enter a new grade \n 2. see all grade");
        int action = scanner.nextInt();
        // if statment for entering new grade
        if(action == 1){
            System.out.println("what is the points earned on your assignment?");
            earned = scanner.nextDouble();
            System.out.println("what was the total amount of points on the assognment?");
            total = scanner.nextDouble();
            double grade = grade(earned ,total);
            
            GradeAry.add(grade);
            double FinalGrade = TotalGrade();
            System.out.println("your total percent is " + FinalGrade);
            System.out.println(grade);
        }
        //if statment for looking at new grades
        else if(action == 2){
         System.out.println(GradeAry);
        }
     }
        
        
    }
    //figures out percentage
    public static double grade(double earned, double total){
         double percentage = earned/total;
         return percentage;
        }
    
    
    //finds total grade by itterating through grade array
    public static double TotalGrade(){
        double totaled = 0;
        for(int i =0; i< GradeAry.size(); i++){
          totaled = totaled + GradeAry.get(i) ;
        }
        totaled = totaled / GradeAry.size();
        return totaled;
    }
}
