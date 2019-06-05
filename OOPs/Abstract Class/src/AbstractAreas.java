abstract class Figure{
	double dim1,dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Inside area for rectangle...");
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Inside area for triangle...");
		return 0.5*dim1*dim2;
	}
}
class AbstractAreas {

	public static void main(String[] args) {
		
		//Figure f=new Figure(10,20);			//Illegal since abstract
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(4,6);
		Figure figref;						//OK,no object is created
		figref=r;
		System.out.println("Area : "+figref.area());
		
		figref=t;
		System.out.println("Area : "+figref.area());
		
	}

}
