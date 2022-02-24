public class Fee_stru {
    int foodcal = 10000;
    int bookcal = 15000;
    int foodcal1 = 20000;
    int fee = 40000; // diff course
    
    int totaldo;
    int totalh;
    

    public void dayoffcal(){
        
        int busfee = 29000;
        totaldo = busfee + foodcal + bookcal + fee;
        System.out.println("day: "+totaldo);

    }
    public void hostelcal(){
        int hostelfee = 50000;
        totalh = hostelfee + foodcal1 +bookcal + fee;
        System.out.println("hostel:" +totalh);

    }
    
}
