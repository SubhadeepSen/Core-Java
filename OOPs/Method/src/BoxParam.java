class Box2{
	double width;
	double height;
	double depth;
	
	double volume(){
		return width*height*depth;
	}
	
	void SetDim(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
}
class BoxParam {

	public static void main(String[] args) {
		
		Box2 mybox1=new Box2();
		Box2 mybox2=new Box2();
		double vol;
		
		mybox1.SetDim(10,20,15);
		mybox2.SetDim(3,6,9);
		
		vol=mybox1.volume();
		System.out.println("Volume of Box1 is: "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume of Box2 is: "+vol);
		
	}

}
