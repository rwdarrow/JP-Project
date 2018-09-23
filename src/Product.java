import java.util.Date;

public abstract class Product implements Item{
    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;
    Integer currentProductionNumber;

    public Product(String productName) {
        name = productName;
        serialNumber = currentProductionNumber;
        currentProductionNumber++;
        manufacturedOn = new Date();
    }

    public void setProductionNumber(int productionNumber) {
        currentProductionNumber = productionNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return ("Manufacturer  : "   + manufacturer   +
                "\nSerial Number : " + serialNumber   +
                "\nDate          : " + manufacturedOn +
                "\nName          : " + name);
    }
}
