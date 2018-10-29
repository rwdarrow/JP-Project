package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class demonstrating the use of a collection to sort products
 **************************************************************************************************/

public class CollectionDriver {
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

  public static void print(Collection c) {
    for (Object o : c) {
      System.out.println(o);
    }
  }
}
