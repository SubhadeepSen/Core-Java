class Box{
	double width;
	double height;
	double depth;
	
	double volume(){
		return width*height*depth;
	}
	
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	
	Box(double len)
	{
		width=len;
		height=len;
		depth=len;
	}
}
class OverloadCons {

	public static void main(String[] args) {
		
		Box mybox1=new Box(10,15,30);
		Box mybox2=new Box();
		Box mycube=new Box(8);
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Volume of Box1 is: "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume of Box2 is: "+vol);
		
		vol=mycube.volume();
		System.out.println("Volume of Cube is: "+vol);
		
	}

}
