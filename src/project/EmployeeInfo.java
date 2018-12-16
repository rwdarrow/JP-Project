package project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 12/4/18
 * Description: Generates an employee code given the employee's name.
 **************************************************************************************************/

public class EmployeeInfo {
  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p; //incorrect CheckStyle error
  private Scanner in;

  /**
   * Default constructor.
   */
  public EmployeeInfo() {
    in = new Scanner(System.in); //FindBugs apparently does not like Scanners.
    p = Pattern.compile("^[A-Z][a-z]{3}\\d{2}$");
    setName();
    setDeptId();
    in.close();
  }

  /**
   * gets the employee name.
   * @return name the employee name.
   */
  public StringBuilder getName() {
    return name;
  }

  /**
   * gets the employee code.
   * @return code the employee code.
   */
  public String getCode() {
    return code;
  }

  /**
   * gets the employee department ID from the user.
   * @return deptId the employee department ID.
   */
  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    return in.nextLine();
  }

  /**
   * reverses the employee ID string.
   * @param id the employee ID.
   * @return String the reversed ID string.
   */
  public String reverseString(String id) {
    if (id.isEmpty()) {
      return id;
    }
    return reverseString(id.substring(1)) + id.charAt(0);
  }

  /**
   * gets the employee ID.
   * @return deptId the employee ID.
   */
  private String getId() {
    return deptId;
  }

  /**
   * sets the employee name to the user-supplied name if it is valid and
   * creates the employee code.
   */
  private void setName() {
    name = new StringBuilder(inputName());
    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      code = "guest";
    }
  }

  /**
   * sets the department id to the user-entered value if it is valid.
   */
  private void setDeptId() {
    String inputDeptId = getDeptId();
    if (validId(inputDeptId)) {
      reverseString(inputDeptId); //FindBugs says this return has no effect. Apparently does not know what recursion is
      deptId = inputDeptId;
    } else {
      deptId = "None1";
    }
  }

  /**
   * creates an employee code based on the employee name.
   * @param name the employee name.
   */
  private void createEmployeeCode(StringBuilder name) {
    code = name.substring(0,1).concat(name.toString().split(" ")[1]);
  }

  /**
   * gets the employee name from the user.
   * @return String the employee name.
   */
  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    return in.nextLine();
  }

  /**
   * checks the name to make sure it has a space.
   * @param name the employee name.
   * @return boolean validity of the name.
   */
  private boolean checkName(StringBuilder name) {
    return (name.toString().contains(" "));
  }

  /**
   * Determines if the user-entered id is valid.
   * @param id the user-entered id.
   * @return boolean validity of the id.
   */
  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    return (matcher.matches());
  }

  @Override
  public String toString() {
    return "Employee Code : " + code + "\n"
         + "Department Number : " + deptId;
  }
}
