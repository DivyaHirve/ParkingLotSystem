public class Car extends Vehicle {
    public Car(String number, String ownerName) {
        super(number, ownerName);
        super.parkingPrice = 20;
    }
}
