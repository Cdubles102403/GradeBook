
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
 * 2. XXTry Catch block
 * 3. XXletter grade 
 * 4. XXchange grades function
 * 5. mass grade input
 * 
 */


public class GradeBook {
   static double earned;
    static double total;
    static double finalGrade;
    static char LetterGrade;
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
            try{
             System.out.println("what is the points earned on your assignment?");
            earned = scanner.nextDouble();
            System.out.println("what was the total amount of points on the assognment?");
            total = scanner.nextDouble();   
            }
 
            catch( Exception e){
                System.out.println("you must input numbers");
                break;
            }
            double grade = grade(earned ,total);
            GradeAry.add(grade);
            double FinalGrade = TotalGrade();
            String letter = FindLetter(grade);
            System.out.println("your letter grade is " + letter);
            System.out.println("your total percent is " + FinalGrade);
            System.out.println("your grade on the last assignment is" + grade);
        }
        //if statment for looking at all grades
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
    
    public static String FindLetter(double finalgrade ){
        String letter;
        if(finalgrade >= .94){
            letter = "A";
        }
       else if(finalgrade > .80 && finalgrade < .93 ){
            letter = "B";
        }
        
       else if (finalgrade > .73 && finalgrade < .80){
           letter = "C";
       }
       else if (finalgrade > .60 && finalgrade <.80){
           letter = "D";
       }
       else {
           letter ="F";
       }
        return letter;
    }
}
