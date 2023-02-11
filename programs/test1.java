class Box
{
	double  width , heigth , depth;
	Box(double w , double h , double d)
	{
		width = w;
		heigth = h;
		depth = d;
	}
	Box()
	{
		width = heigth = depth = 0;
	}
	Box(double len)
	{
		width = heigth = depth = len;
	}
	double volume()
	{
		return width * heigth * depth;
	}
	double volume(String str)
	{
		System.out.println("The object is : "+str);
		return width*heigth*depth;
	}
	double volume(double w , double h  ,double d)
	{
		return w * h * d;
	}
}
public class test1 
{
	public static void main(String[] args)
	{
		Box mybox = new Box(10,20,30);
		Box mybox1 = new Box();
		Box mycube = new Box(9);
		
		double vol;
		
		vol = mybox.volume();
		System.out.println("The volume of box is : "+vol);
		vol = mybox1.volume();
		System.out.println("The volume of box is : "+vol);
		vol = mycube.volume("cube");
		System.out.println("The volume of cube is : "+vol);
		vol  = mybox1.volume(2,4,6);
		System.out.println("The volume of box is : "+vol);
	}

}
