package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 12/4/18
 * Description: Creates a file directory and writes employee info and product arrays to files.
 **************************************************************************************************/

public class ProcessFiles {
  private Path p; //incorrect CheckStyle error
  private Path p2;
  private Path p3;

  /**
   * Default constructor, calls createDirectory().
   */
  public ProcessFiles() {
    createDirectory();
  }

  /**
   * creates a directory and file if it does not exist.
   */
  private void createDirectory() {
    String dir = "C:/LineTests(p)";
    String fileName = "TestResults.txt(p2)";

    new File(dir).mkdirs(); //FindBugs doesn't like the hardcoded path. Ignored.
    File f = new File(dir, fileName);

    if (!f.exists()) {
      try {
        f.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    //FindBugs says that these are never read. I assume they need to be assigned anyway for the project requirements.
    p = Paths.get(dir);
    p2 = Paths.get(fileName);
    p3 = Paths.get(dir, fileName);
  }

  /**
   * writes employee info to a file.
   * @param emp the employee info as a string.
   * @throws IOException a file io exception
   */
  public void writeFile(EmployeeInfo emp) throws IOException {
    //FindBugs apparently does not like BufferedWriters.
    BufferedWriter writer = new BufferedWriter(new FileWriter(p3.toString(), true));
    writer.write(emp.toString());
    writer.close();
  }

  /**
   * writes the array of products to a file as a string.
   * @param products the array list of products as a string.
   * @throws IOException a file io exception
   */
  public void writeFile(ArrayList<Product> products) throws IOException {
    //FindBugs apparently does not like BufferedWriters.
    BufferedWriter writer = new BufferedWriter(new FileWriter(p3.toString(), true));
    writer.write(products.toString());
    writer.close();
  }
}
