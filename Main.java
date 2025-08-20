import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
import java.util.Scanner;

public class Main implements Directions
{
    public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter your user name");

  String userName = myObj.nextLine();  // Read user input of a String
  System.out.println("Hello " + userName + "! It is good to meet you!");  // Returns user output user input
   
  Scanner in = new Scanner(System.in); // Read the user input of an int
  System.out.println("How many beepers do you want on each side of the diamond?");
  int side = in.nextInt(); //Stores the number of beepers on each side of the diamond
   
    Robot fred = new Robot(5, 1, North, 10);
    World.setSize(side*2, side*2);
    World.setVisible(true);
    World.setDelay(10);
      leaveFive(fred);
      fred.turnLeft();
      fred.turnLeft();
      leaveAnotherFive(fred);
  
    Robot jimmy = new Robot(5, 1, North, 10);
    leaveAnotherFive(jimmy);
    leaveAnotherFive(jimmy);
    

  }

    //write a method that will turn right
public static void turnRight(Robot r) //create a new method using a Robot parameter. r is a temp placeholder.
    {
      r.turnLeft();
      r.turnLeft();
      r.turnLeft();
    }
    //write a method that will go 5 steps and leave beepers each time.
public static void leaveFive(Robot r) //create a method bringing in a Robot parameter. r is a temp placeholder.
    {
     r.putBeeper();
     turnRight(r);
     r.move();
     turnRight(r);
     r.move();
     r.putBeeper();
     r.turnLeft();
     r.move();
     turnRight(r);
     r.move();
     r.putBeeper();
     r.turnLeft();
     r.move();
     turnRight(r);
     r.move();
     r.putBeeper();
     r.turnLeft();
     r.move();
     turnRight(r);
     r.move();
     r.putBeeper();
    }

    public static void leaveAnotherFive(Robot r){
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
    }
}