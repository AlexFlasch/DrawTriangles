import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import java.util.Scanner;


public class Main
{
	static TrianglePopulator pop = new TrianglePopulator();
	
	double base = 0, height = 0;
	
	public void start()
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		}
		catch(LWJGLException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 600, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		while(!Display.isCloseRequested())
		{	
			//Clear screen and depth buffer
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			//set the color of triangle (RGBA)
			GL11.glColor3f(pop.getRed(), pop.getGreen(), pop.getBlue());
			
			//draw triangles
			pop.drawTriangles(height, base);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a value for red between 0.00 and 1.00: ");
		pop.setRed(in.nextFloat());
		
		System.out.print("PLease input a value for green between 0.00 and 1.00: ");
		pop.setGreen(in.nextFloat());
		
		System.out.print("Please input a value for blue between 0.00 and 1.00: ");
		pop.setBlue(in.nextFloat());
		
		System.out.print("Please choose a value for the height: ");
		double height = in.nextDouble();
		
		System.out.print("Please choose a vlaue for the base: ");
		double base = in.nextDouble();
		
		pop.drawTriangles(height, base);		
	}
}
