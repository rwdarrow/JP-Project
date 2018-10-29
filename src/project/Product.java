package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Class implementing project.Item interface describing a product.
 **************************************************************************************************/

import java.util.Comparator;
import java.util.Date;

public abstract class Product implements Item, Comparator<Product> {
  int serialNumber;
  Date manufacturedOn;
  String name;
  String manufacturer = Item.manufacturer;
  static int currentProductionNumber = 1; // set first number in production to 1

  /**
   * Constructor for the project.Product class.
   *
   * @param productName the name of the product
   */
  public Product(String productName) {
    name = productName;
    serialNumber = currentProductionNumber;

    // incorrectly identified as bug, needs to be static to allow incrementation
    currentProductionNumber++;

    manufacturedOn = new Date(); // set the date manufactured to the current date
  }

  /**
   * Compares two products by name
   *
   * @param p1 name of the first product
   * @param p2 name of the second product
   */
  public int compare(Product p1, Product p2) {
    return p1.getName().compareTo(p2.getName());
  }

  /**
   * Sets production number.
   *
   * @param productionNumber the number of the product in production
   */
  public void setProductionNumber(int productionNumber) {
    // incorrectly identified as bug, in this case altering static field is ok because
    // alterations to one production number will change all subsequent production numbers
    currentProductionNumber = productionNumber;
  }

  /**
   * Sets product name.
   *
   * @param name the name of the product
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns product name.
   *
   * @return name the name of the product
   */
  public String getName() {
    return name;
  }

  /**
   * Returns date of manufacture.
   *
   * @return manufacturedOn the date of manufacture
   */
  public Date getManufactureDate() {
    // incorrectly identified as bug, implementing correctly to return Date not project.Product
    return manufacturedOn;
  }

  /**
   * Returns the product serial number.
   *
   * @return serialNumber the serial number of the product
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * Returns a formatted string with specific information about the product
   * including manufacturer, serial number, manufacture date, and name.
   *
   * @return String formatted string displaying product details
   */
  public String toString() {
    return ("Manufacturer : " + manufacturer
        + "\nSerial Number : " + serialNumber
        + "\nDate : " + manufacturedOn
        + "\nName : " + name);
  }
}
