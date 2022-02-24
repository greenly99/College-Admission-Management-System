import java.util.Scanner;

public class Reg_Check {

    void display() {
    Scanner rcheck = new Scanner(System.in);
    System.out.println("Please enter your 12th score ");
    double fscore = rcheck.nextDouble();
    System.out.println("Please enter your 10th score ");
    double score = rcheck.nextDouble();
    if(fscore >= 80.0 && score >= 60.0)
        System.out.println("You are accepted!");
        
    else 
        System.out.println("You are not accepted");
} 

}

  
