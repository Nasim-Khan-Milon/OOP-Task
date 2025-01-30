public class Car{
    
    String owner;
    String brand;
    String serialNum;
    int fuel;

    Car(String owner, String brand, String serialNum, int fuel){
        this.owner=owner;
        this.brand=brand;
        this.serialNum=serialNum;
        this.fuel=fuel;
    }

    void start() {
        System.out.println(brand+" Car can start.");
    }

    void stop(){
        System.out.println(brand+" Car can stop.");
    }

    void fuelCheck(){
        System.out.println("The car has "+fuel+" litters fuel.");
    }



    public static void main(String[] args) {
        Car c1 = new Car("Nasim", "Bugatti", "abc123", 15);

        c1.start();
        c1.stop();
        c1.fuelCheck();
    }
}