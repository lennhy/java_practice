import java.awt.*;
public class Main {
// Make an instance of a car
    public static void main(String[] args) {

        Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);

        Car sallyCar = new Car(13.5, "1BF52E", Color.BLACK, false);

        System.out.println("My Car's license Plate: "+ myCar.licensePlate);
        System.out.println("My Car's license Plate: "+ sallyCar.licensePlate);

        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor);
    }
}
