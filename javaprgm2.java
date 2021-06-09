class Rectangle
{
	float length,breadth;
	
	void setData(float x,float y)
	{
		length=x;
		breadth=y;
	}
	
	float getArea()
	{
		return length * breadth;
	}
}
	
	
class javaprgm2
	{
		public static void main(String args[])
		{
			Rectangle R1=new Rectangle();
			Rectangle R2=new Rectangle();
			Rectangle R3=new Rectangle();
		    R1.setData(12.4f,13f);
			R2.setData(10.5f,9f);
			R3.setData(13f,14f);
			float area1 = R1.getArea();
			float area2 = R2.getArea();
			float area3 = R3.getArea();
			System.out.println("area of rectangle1="+area1);
			System.out.println("area of rectangle2="+area2);
			System.out.println("area of rectangle3="+area3);
			
		}
	}
