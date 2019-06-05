
class Child {
	int x,y;
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}

}
public class Parent extends Child
{
	void get(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String...s)
	{
	Parent c=new Parent();
	c.get(100,200);
	c.show();
	
}
	
}