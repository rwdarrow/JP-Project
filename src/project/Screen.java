package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Class implementing ScreenSpec interface describing a screen object
 **************************************************************************************************/

public class Screen implements ScreenSpec {
  String resolution;
  int refreshRate;
  int responseTime;

  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  /**
   * @return the screen resolution
   */
  public String getResolution() {
    return resolution;
  }

  /**
   * @return the refresh rate
   */
  public int getRefreshRate() {
    return refreshRate;
  }

  /**
   * @return the response time
   */
  public int getResponseTime() {
    return responseTime;
  }

  /**
   * returns formatted string of Screen attributes
   * @return the screen member fields
   */
  public String toString() {
    return ("Resolution : " + resolution +
            "\nRefresh Rate : " + refreshRate +
            "\nResponse Time : " + responseTime);
  }
}
