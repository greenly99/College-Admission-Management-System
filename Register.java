import java.util.Scanner;

class Register {
    
    basic_detail rd = new basic_detail();
    void form() {
        
        Scanner perdetail = new Scanner(System.in);
        
        System.out.println("Name of Candidate:");
    
        String name = perdetail.nextLine();
        rd.setName(name);
    
        System.out.println("Enter the Father Name:");
        String fatherN = perdetail.nextLine();
        rd.setFatherN(fatherN);

        System.out.println("Enter the Mother Name:");
        String motherN = perdetail.nextLine();
        rd.setMotherN(motherN);

        System.out.println("Enter the Email ID:");
        String email = perdetail.nextLine();
        rd.setEmail(email);
        

        System.out.println("Enter the Address:");
        String address = perdetail.nextLine();
        rd.setAddress(address);

        System.out.println("Enter the Phone:");
        int phoneN = perdetail.nextInt();
        rd.setPhoneN(phoneN);
        // add condition

        
    }

    void form1(){
        Scanner input = new Scanner(System.in);

        System.out.println("Course in 12th taken:");
        String group = input.nextLine();
        rd.setGroup(group);

        System.out.println("School Name (12th):");
        String s1 = input.nextLine();
        rd.setS1(s1);

        System.out.println("School Name (10th):");
        String s2 = input.nextLine();
        rd.setS2(s2);
        
        System.out.println("Mark taken in 12th :(%) ");
        double mark = input.nextDouble();
        rd.setMark(mark);

        
        System.out.println("Mark taken in 10th: (%)");
        double mark1 = input.nextDouble();
        rd.setMark1(mark1);

    }

    void form2(){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Course choice:");
        String group1 = input.nextLine();
        rd.setGroup1(group1);
    }

    void display(){
        
        System.out.println("Name of Candidate :" +rd.getName());
        System.out.println("Enter the Phone:" +rd.getPhoneN());
        System.out.println("Enter the Email ID:" +rd.getEmail());
        System.out.println("Enter the Father Name:" +rd.getFatherN());
        System.out.println("Mother Name of Candidate : "+rd.getMotherN());
        System.out.println("Address of Candidate : " +rd.getaddress());
        System.out.println("Course in 12th taken:" +rd.getGroup());
        System.out.println("Mark taken in 12th : " +rd.getMark());
        System.out.println("Mark taken in 10th : "+rd.getMark1());
        System.out.println("School Name (12th): " +rd.getS1());
        System.out.println("School Name (10th): " +rd.getS2());
        System.out.println("Course choice 1:" +rd.getGroup1());

    }
    
}
