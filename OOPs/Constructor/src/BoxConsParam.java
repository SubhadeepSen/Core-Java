class Box1{
	double width;
	double height;
	double depth;
	
	double volume(){
		return width*height*depth;
	}
	
	Box1(double w,double h,double d)
	{
		System.out.println("Constructing Box.........");
		width=w;
		height=h;
		depth=d;
	}
}
class BoxConsParam {

	public static void main(String[] args) {
		
		Box1 mybox1=new Box1(10,15,20);
		Box1 mybox2=new Box1(4,5,9);
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Volume of Box1 is: "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume of Box2 is: "+vol);
		
	}

}
