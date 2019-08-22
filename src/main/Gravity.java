/*
 * @author Naveen gupta
 * @version 1.0
 * */
package main;

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double g = 9.8;
		double time = scanner.nextDouble();
        double speed = (g * time);
        double distance = (g * time * time) / 2;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the release is " + distance);
        scanner.close();



    }
}

