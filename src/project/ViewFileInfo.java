package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 12/4/18
 * Description: A driver class to test functionality of the ProcessFiles class.
 **************************************************************************************************/

public class ViewFileInfo {

  /**
   * main class for driver.
   *
   * @param args an array of string arguments
   */
  public static void main(String[] args) {
    ProcessFiles processFiles = new ProcessFiles();
    EmployeeInfo emp = new EmployeeInfo();

    AudioPlayer ap = new AudioPlayer("ap", "specification");
    MoviePlayer mp = new MoviePlayer("mp", new Screen("1080p", 60, 60),
        MonitorType.LCD);

    ArrayList<Product> productArray = new ArrayList<>();
    productArray.add(ap);
    productArray.add(mp);

    try {
      processFiles.writeFile(emp);
      processFiles.writeFile(productArray);
      //FindBugs apparently does not like BufferedWriters.
      BufferedReader bufferedReader = new BufferedReader(
          new FileReader("C:/LineTests(p)/TestResults.txt(p2)")); //FindBugs doesn't like the hardcoded path. Ignored.
      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
