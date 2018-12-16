package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class demonstrating the use of a collection to sort products.
 **************************************************************************************************/

public class CollectionDriver {

  /**
   * main class for driver.
   * @param args an array of string arguments.
   */
  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
    products.add(new AudioPlayer("Audio Player 2", "Specification"));
    products.add(new AudioPlayer("Audio Player 1", "Specification"));
    products.add(new MoviePlayer("Movie Player 2", new Screen("Resolution", 0, 0),
        MonitorType.LCD));
    products.add(new MoviePlayer("Movie Player 2", new Screen("Resolution", 0, 0),
        MonitorType.LCD));

    Collections.sort(products, (p1, p2) -> {
      return p1.getName().compareTo(p2.getName());
    });

    print(products);
  }

  /**
   * prints each object in the collection.
   * @param c the collection to be iterated.
   */
  public static void print(Collection c) {
    for (Object o : c) {
      System.out.println(o);
    }
  }
}
