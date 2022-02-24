
class Other_details{

    public void dayoff() {
        System.out.println("Course Fee = 40,000");
        System.out.println("Food Fee = 10,000");
        System.out.println("Book Fee = 15,000");
        System.out.println("Bus Fee = 29,000 ");

        Fee_stru f = new Fee_stru();
        f.dayoffcal();
    }
}

public class Travel extends Other_details {
    public void hostel(){
        System.out.println("Course Fee = 40,000");
        System.out.println("Book Fee = 15,000");
        System.out.println("Food Fee for hostel = 20,000");
        System.out.println("Hostel Fee = 50,000");

        Fee_stru f = new Fee_stru();
        f.hostelcal();
    }
    
}
