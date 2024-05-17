public class Car extends Vehicle {
  private int wheelDimension;

  public Car(String brand, int wheelDimension) {
    super(brand);
    this.wheelDimension = wheelDimension;
  }

  public Car(String brand, int wheelDimension, String engineType) {
    super(brand);
    this.engine = new Engine(engineType);  // Supraîncărcarea constructorului cu tipul motorului
    this.wheelDimension = wheelDimension;
  }

  @Override
  public void describe() {
    super.describe();
    System.out.println("Car's wheel dimension: " + wheelDimension);
  }
}
