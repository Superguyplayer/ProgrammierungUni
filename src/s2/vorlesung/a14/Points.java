package s2.vorlesung.a14;

public class Points
{

	// 3 klassenvariablen
	//4
	static private int numberOfPoints;
	static private float sp_x, sp_y;
	//2 Objektvariablen
	private float x, y;
	
	static private void in (float x, float y)
	{
		sp_x = (sp_x * numberOfPoints + x) / (numberOfPoints + 1);
		sp_y = (sp_y * numberOfPoints + y) / (numberOfPoints + 1);
		numberOfPoints++;
	}
	
	static private void out (float x, float y)
	{
		if (numberOfPoints == 1)
		{
			sp_x = 0;
			sp_y = 0;
		}
		else
		{
			sp_x = (sp_x * numberOfPoints - x) / (numberOfPoints - 1);
			sp_y = (sp_y * numberOfPoints - y) / (numberOfPoints - 1);
		}
		numberOfPoints--;
	}


	//zweimal
		public static void move (Points p, float dx, float dy)
	{
		pln("Move point      from x: " + p.x   + ", y: " + p.y);
		pln("                by  dx: " + dx    + ",dy: " +  dy);
		out(p.x, p.y);
		p.x += dx;
		p.y += dy;
		in(p.x, p.y);
		pln("                to   x: " + p.x   + ", y: " +  p.y);
		pln("Center of gravity is x: " + sp_x  + ", y: " +  sp_y);
		pln();
	}
	
	// 2 Konstruktoren

	Points(float newX, float newY)
	{
		in (newX, newY);
		x = newX;
		y = newY;
		pln("Created new point with x: " + x + ", y: " + y);
		pln("New count of points     : " + numberOfPoints);
		pln("Center of gravity is x: " + sp_x  + ", y: " +  sp_y);
		pln();	
	}
	
	Points()
	{
		this(0.0f, 0.0f);
	}
	
	
	public void move (float dx, float dy)
	{
		pln("Move point      from x: " + x   + ", y: " + y);
		pln("                by  dx: " + dx    + ",dy: " +  dy);
		out (x,y);
		x += dx;
		y += dy;
		in (x,y);
		pln("                to   x: " +   x   + ", y: " +    y);
		pln("Center of gravity is x: " + sp_x  + ", y: " +  sp_y);
		pln();
	}
	
	static void pln(Object obj) { System.out.println(obj); }
	static void pln() { System.out.println(); }
	
}
