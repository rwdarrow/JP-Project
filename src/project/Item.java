package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Interface which declares fields and methods used by company items.
 **************************************************************************************************/

import java.util.Date;

public interface Item {
  String manufacturer = "OracleProduction";

  void setProductionNumber(int productionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
