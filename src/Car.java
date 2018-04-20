import java.awt.*;
// Make the blue print of a car
public class Car {
  double averageMilesPerGallon;
  String licensePlate;
  Color paintColor;
  boolean areTailightsWorking;


  public Car(double inputAverageMPG, String inputLiscencePlate, Color inputpaintColor, boolean inputAreTaillightsWorking) {
    this.averageMilesPerGallon = inputAverageMPG;
    this.licensePlate = inputLiscencePlate;
    this.paintColor = inputpaintColor;
    this.areTailightsWorking = inputAreTaillightsWorking;
  }

  public void changePaintColor(Color newPaintColor) {
    this.paintColor = newPaintColor;
  }
}
