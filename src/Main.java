
public class Main {


    public static void main(String[] args) {
        
        Car myCar = new Car();
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        
        Car companyCar = new Car (150, 30, 2000, false, "EFG-456", 'B', 3500, 60000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
      
    }
    
}
