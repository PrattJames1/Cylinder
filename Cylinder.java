/*************************************************************

When finished entering/compiling/running the following: 
email to our TA Subject: CS111a yourName #6 

Write a program that generates a random integer radius (r)
and height (h) for a cylinder in the range 1 to 20, inclusive,
and then computes the volume and surface area of the cylinder.

*************************************************************/

import java.util.Random;
import java.text.DecimalFormat;

public class Cylinder
{
	// Generates a random integer between 1-20 inclusive
	// for radius and height.

	public static void main(String[] args)
	{
		Random generator = new Random();
		int radius, height;
		double volume, surfaceArea;

		DecimalFormat fmt = new DecimalFormat("0.###");

		radius = generator.nextInt(20) + 1;
		height = generator.nextInt(20) + 1;
		volume = Math.PI * ((double)radius * radius) * (double)height;
		surfaceArea = 2 * (Math.PI * (double)radius * (double)height);

		System.out.println("Radius: " + radius);
		System.out.println("Height: " + height);
		System.out.println("Volume: " + fmt.format(volume));
		System.out.println("Surface Area: " + fmt.format(surfaceArea));
	}
}