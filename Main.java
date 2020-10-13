import java.util.Scanner;
/**
 *Example program for methods
 * @author Zachary Balean
 */
public class Main {

  //create a method to say hello
  public static void sayHello(){
    //prints hello world to the screen
    System.out.println("Hello World!");
  }

  //prints hello to a person
  public static void sayHello(String name){
    System.out.println("Hello " + name);
  }

  //prints hello world a number of times
  public static void sayHello(int numberOfTimes){
    for(int i = 0; i < numberOfTimes; i++){
      System.out.println("Hello World!");
    }
  }




  //A method to calculate the area of a rectangle give the width and the length
  public static double areaOfRectangle(double width, double length){
    double area = width * length;
    return area;
  }




  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //without a scanner
    double answer = areaOfRectangle(2.0, 5.0);
    System.out.println(answer);

    //using the method with a scanner
    System.out.println("Please enter a width");
    double width = input.nextDouble();
    System.out.println("Please enter a length");
    double length = input.nextDouble();
    double area = areaOfRectangle(width, length);
    System.out.println(area);

    //print hellow world
    sayHello();
  }
}
