import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Vehicle {
  private String brand;
  public Engine engine;  // Demonstrând compoziția

  public Vehicle(String brand) {
    this.brand = brand;
    this.engine = new Engine("Standard");  // Toate vehiculele au un motor standard
  }

  public String getBrand() {
    return brand;
  }

  public void saveVehicle(String info) {
    System.out.println(this);
    String folderPath = "./vehicles_info";

    File folder = new File(folderPath);
    if (!folder.exists()) {
      folder.mkdirs();
    }

    String filePath = folderPath + "/vehicle_info.txt";

    try (FileWriter writer = new FileWriter(filePath, true)) {
      writer.write(info + "\n");
      System.out.println("Vehicle info saved successfully.");
    } catch (IOException e) {
      System.out.println("An error occurred while saving vehicle info: " + e.getMessage());
    }  }

  public void describe() {
    System.out.println("Vehicle Brand: " + brand + ", Engine Type: " + engine.getType());
  }

  class Engine {
    private String type;

    public Engine(String type) {
      this.type = type;
    }

    public String getType() {
      return type;
    }
  }
}
