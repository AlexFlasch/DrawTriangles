import org.lwjgl.*;

public class TrianglePopulator
{
	private float red, green, blue, alpha;
	
	public TrianglePopulator()
	{
		red = 0.5f;
		green = 0.5f;
		blue = 0.5f;
		alpha = 1.0f;
	}

	public float getRed()
	{
		return red;
	}
	
	public void setRed(float pRed)
	{
		red = pRed;
	}

	public float getGreen()
	{
		return green;
	}
	
	public void setGreen(float pGreen)
	{
		green = pGreen;
	}

	public float getBlue()
	{
		return blue;
	}
	
	public void setBlue(float pBlue)
	{
		blue = pBlue;
	}

	public float getAlpha()
	{
		return alpha;
	}
	
	public void setAlpha(float pAlpha)
	{
		alpha = pAlpha;
	}
	
	public void drawTriangles(double hRange, double bRange)
	{
		
	}
}
