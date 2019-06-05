class Box1{
	double width;
	double height;
	double depth;
	
	void volume(){
		System.out.println("Volume is : ");
		System.out.println(width*height*depth);
	}
}
class BoxDemo {

	public static void main(String[] args) {
		
		Box1 mybox1=new Box1();
		Box1 mybox2=new Box1();
		
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=15;
		
		mybox2.width=3;
		mybox2.height=6;
		mybox2.depth=9;
		
		mybox1.volume();
		mybox2.volume();
		
	}

}
