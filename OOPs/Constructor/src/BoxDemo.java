class Box{
	double width;
	double height;
	double depth;
	
	double volume(){
		return width*height*depth;
	}
	
	Box()
	{
		System.out.println("Constructing Box.........");
		width=15;
		height=10;
		depth=20;
	}
}
class BoxDemo {

	public static void main(String[] args) {
		
		Box mybox1=new Box();
		Box mybox2=new Box();
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Volume of Box1 is: "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume of Box2 is: "+vol);
		
	}

}
