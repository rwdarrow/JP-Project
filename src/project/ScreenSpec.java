package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Interface which declares methods used by classes that implement it
 **************************************************************************************************/

public interface ScreenSpec {
  String getResolution();

  int getRefreshRate();

  int getResponseTime();
}
