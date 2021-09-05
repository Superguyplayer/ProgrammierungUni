package s2.vorlesung.a14;

class PointsTst
{

	public static void main(String[] pimpelhuber)
	{
		Points p1 = new Points(1.0f, 4.0f);
		Points p2 = new Points(2,3);
		Points p3 = new Points(3,2);
		Points p4 = new Points(4,1);
		
		Points.move(p1,  3.0f,  -3.0f);
		Points.move(p4, -3, 3);
		
	}

}
