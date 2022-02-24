import java.util.Scanner;

public class Admission{
    public static void main(String[] args) {

        

        Scanner input = new Scanner(System.in);

        basic_detail rd = new basic_detail();
        
        System.out.println("----------------------------------- \n");
        System.out.println("\t WELCOME TO AKSHAYA COLLEGE \n");
        System.out.println("----------------------------------- \n");
        System.out.println("----------------------------------- \n");
       
        System.out.println("Personal details \n");  
        System.out.println("----------------------------------- \n"); 
        Register reg = new Register();
        reg.form();
        
        System.out.println("----------------------------------- \n");
        System.out.println("School details \n");
        System.out.println("----------------------------------- \n");
        reg.form1();    

        System.out.println("----------------------------------- \n");
        System.out.println("Course details \n");
        System.out.println("----------------------------------- \n");
        System.out.println("Course Name \n 1.CSE \n 2.ECE \n 3.EEE \n 4.IT");
        reg.form2();

        System.out.println("----------------------------------- \n");
        System.out.println("Check the details \n");
        System.out.println("----------------------------------- \n");
        reg.display();

        System.out.println("If you wanna edit form typing 'pd' word for Personal details \n");
        System.out.println("If you wanna edit form typing 'sd' word for School details \n");
        System.out.println("If you wanna edit form typing 'cd' word for Course details \n");
        System.out.println("Or typing 'Continue' to fill other details \n");
        System.out.println("Enter the option:" );
        String ch = input.nextLine();
        switch(ch) {
            case "pd":
            System.out.println("----------------------------------- \n");
            System.out.println("Personal details \n");
            reg.form();
            
            System.out.println("----------------------------------- \n");
            System.out.println("Check the details \n");
            reg.display();
            break;

            case "sd":
            System.out.println("----------------------------------- \n");
            System.out.println("School details \n");
            reg.form1(); 

            System.out.println("----------------------------------- \n");
            System.out.println("Check the details \n");  
            reg.display();
            break;

            case "cd" :
            System.out.println("----------------------------------- \n");
            System.out.println("Course details \n");
            reg.form2();
            reg.display();
    
            System.out.println("----------------------------------- \n");
            System.out.println("Check the details \n");
            reg.display();
            break;
        
            default:
            System.out.println("\n");
            System.out.println("Continue to fill other details");
                break;
        }
        System.out.println("----------------------------------- \n");
        System.out.println("Next Fee details\n");
        System.out.println("----------------------------------- \n");
        
        Travel t = new Travel();
        System.out.println("1.Bus \n 2.Hostel \n 3.Ower Travel");
        System.out.println("\n");
        System.out.println("Select Mode : ");
        String mode = input.nextLine();
        switch(mode){
            case "Bus" :
            t.dayoff();
            break;

            case "Hostel" :
            t.hostel();
            break;

            default:
            System.out.println("Owner Travel");
            break;

        }

        System.out.println("----------------------------------- \n");
        System.out.println("Finally View");
        System.out.println("----------------------------------- \n");
    System.out.println("Thank You");
    
}

}