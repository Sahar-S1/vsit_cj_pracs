package edu.vsit.cj.pracs.prac5;

/**
 *
 * Lab 5
 * 
 * Abstract Shape class that creates a list of 3D shaped objects
 * and compares them by their properties such as Surface Area and Volume.
 * 
 * It Implements the Comparable interface
 */
public abstract class Shape implements Comparable<Shape> {

  /**
   * The total number of shapes generated using the Shape Class
   */
  private static int numShapes = 0;

  /**
   * The Id of 3D object generated
   */
  private int id;

  /**
   * Constructor for the Shape Class
   * The numShapes variable is incremented each time a new 3d shape object created
   * 
   */
  public Shape() {
    // TODO: Implement constructor of the Shape class
  }

  /**
   * Return the number of shapes that have been allocated
   * 
   * @return numShapes The total number of shapes created so far
   */
  public int getNumShapes() {
    // TODO: Implement the getNumShapes method
  }

  /**
   * getId method
   * 
   * @return id The ID of generated 3D object
   */
  public int getId() {
    // TODO: Implement the getId method
  }

  /**
   * getVolume Abstract method
   * 
   * @return volume of the object
   */
  public abstract double getVolume();

  /**
   * getSurfaceArea Abstract method
   * 
   * @return surface area of the object
   */
  public abstract double getSurfaceArea();

  /**
   * getShapeType Abstract method
   * 
   * @return String for the object called.
   */
  public abstract String getShapeType();

  /**
   * compareTo method
   * this method compares the current object with passed object.
   * If Surface area of current object less than surface area of passed object
   * return -1.
   * If Surface area of current object greater than surface area of passed object
   * return 1.
   * 
   * If Surface area of current object equals surface area of passed object then
   * the volume of the object compared.
   * If volume of current object less than volume of passed object return -1.
   * If volume of current object greater than volume of passed object return 1.
   * If volume of current object equals volume of passed object return 0.
   * 
   * @param s Object of type Shape, to be compared with *this* Shape object
   * @return -1 if *this* comes before s, 0 if they are equal or 1 otherwise
   */
  public int compareTo(Shape s) {
    // TODO: Implement the compareTo method for returning the Shape objects in
    // ascending order of their SurfaceAreas
  }

  /**
   * toString method
   * 
   * @return All information about the 3D Shape object in the single line of the
   *         format:
   *         "Cuboid:\tID = 7\tSurface Area = 94.00\tVolume = 60.00"
   */
  public String toString() {
    // TODO: Implement the ToString method for displaying the Info of 3D Shape
    // objects
  }
}
