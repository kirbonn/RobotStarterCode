import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
import java.util.Scanner;

public class Main implements Directions {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your username");

        String username = myObj.nextLine();  // Read user input of a String
        System.out.println("Hello " + username + "!");  // Returns user output user input

        Scanner in = new Scanner(System.in); // Read the user input of an int
        System.out.println("How many beepers do you want on each side of the diamond?");
        int side = in.nextInt(); //Stores the number of beepers on each side of the diamond
        int Size = side * 2 + 2;
        World.setSize(Size, Size);
        World.setVisible(true);
        World.setDelay(10);

        //STARTING POSITION
        int yaxis = 1;
        int xaxis = Size / 2;

        Robot fred = new Robot(yaxis, xaxis, North, side * 4);

        THEdiamond(fred, side);
    }

    //write a method that will turn right
    public static void turnRight(Robot r) //create a new method using a Robot parameter. r is a temp placeholder.
    {
        r.turnLeft();
        r.turnLeft();
        r.turnLeft();
    }
    // //write a method that will go 5 steps and leave beepers each time.
    // public static void leaveFive(Robot r) //create a method bringing in a Robot parameter. r is a temp placeholder.
    // {
    //     r.putBeeper();
    //     turnRight(r);
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    // }

    // public static void leaveAnotherFive(Robot r){
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    //     r.turnLeft();
    //     r.move();
    //     turnRight(r);
    //     r.move();
    //     r.putBeeper();
    // }

    public static void THEdiamond(Robot r, int side) {
        for (int i=0; i<4; i++) {
            for (int q=0; q<side-1; q++) {
                r.putBeeper();
                r.turnLeft();
                r.move();
                turnRight(r);
                r.move();
            }
            turnRight(r); // next side turn
        }
    }
}