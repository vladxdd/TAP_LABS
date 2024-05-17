public class Boat extends Vehicle {
  private int maxSpeed;

  public Boat(String brand, int maxSpeed) {
    super(brand);
    this.maxSpeed = maxSpeed;
  }

  public Boat(String brand, int maxSpeed, String engineType) {
    super(brand);
    this.engine = new Engine(engineType);  // Supraîncărcarea constructorului cu tipul motorului
    this.maxSpeed = maxSpeed;
  }

  @Override
  public void describe() {
    super.describe();
    System.out.println("Boat's max speed: " + maxSpeed);
  }
}
