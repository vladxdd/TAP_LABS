import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Creator extends JFrame {
  private JComboBox<String> vehicleType;
  private JTextField brandField;
  private JTextField specField;
  private JTextField engineField;
  private JButton saveButton;
  private JLabel brandLabel;
  private JLabel specLabel;
  private JLabel engineLabel;

  public Creator() {
    super("Vehicle Selector");
    setLayout(new FlowLayout());

    String[] vehicleOptions = {"Car", "Boat"};
    vehicleType = new JComboBox<>(vehicleOptions);
    add(vehicleType);

    brandLabel = new JLabel("Brand:");
    add(brandLabel);
    brandField = new JTextField(10);
    add(brandField);

    specLabel = new JLabel("Spec:");
    add(specLabel);
    specField = new JTextField(10);
    add(specField);

    engineLabel = new JLabel("Engine Type:");
    add(engineLabel);
    engineField = new JTextField(10);
    add(engineField);

    saveButton = new JButton("Save Vehicle");
    saveButton.addActionListener(e -> saveVehicle());
    add(saveButton);

    // Listener to update the spec label based on the vehicle type
    vehicleType.addActionListener(e -> updateSpecLabel());

    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    // Initialize the spec label text
    updateSpecLabel();
  }

  private void updateSpecLabel() {
    if ("Car".equals(vehicleType.getSelectedItem())) {
      specLabel.setText("Wheel Dimension:");
    } else if ("Boat".equals(vehicleType.getSelectedItem())) {
      specLabel.setText("Max Speed:");
    }
  }

  private void saveVehicle() {
    String type = (String) vehicleType.getSelectedItem();
    String brand = brandField.getText();
    int spec = Integer.parseInt(specField.getText());
    String engineType = engineField.getText();
    Vehicle vehicle = type.equals("Car") ? new Car(brand, spec, engineType) : new Boat(brand, spec, engineType);
    vehicle.describe();
    vehicle.saveVehicle(brand);
  }

  public static void main(String[] args) {
    new Creator();
  }
}
