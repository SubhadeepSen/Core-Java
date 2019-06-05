class Box{
	double width;
	double height;
	double depth;
	
Box(){
		
	}
	
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	
	void volume(){
		System.out.println("Volume is: "+width*height*depth);
	}
}

class MatchBox extends Box{
	
	double weight;
	
	MatchBox(){
		
	}
	
	MatchBox(double w,double h,double d,double m){
		
		super(w,h,d);
		
		weight=m;
	}
}
class SuperCons {

	public static void main(String[] args) {
		MatchBox mb=new MatchBox(10,20,30,40);
		
		mb.volume();
		
		System.out.println("Width of MatchBox is: "+mb.width);
		System.out.println("Height of MatchBox is: "+mb.height);
		System.out.println("Depth of MatchBox is: "+mb.depth);
		System.out.println("Weight of MatchBox is: "+mb.weight);
		
	}

}
