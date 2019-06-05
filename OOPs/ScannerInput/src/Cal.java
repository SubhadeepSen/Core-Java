package calculator;

import java.util.Scanner;

class Mul{
	double x,y;
	Mul(double a,double b){
		x=a;
		y=b;
	}
	void show(){
		double z=x*y;
		System.out.println("Multiplication Of "+x+" and "+y+" is : "+z);
	}
}

class Div{
	double x,y;
	Div(double a,double b){
		x=a;
		y=b;
	}
	void show(){
		double z=x/y;
		System.out.println("Division Of "+x+" and "+y+" is : "+z);
	}
}

class Add{
	double x,y;
	Add(double a,double b){
		x=a;
		y=b;
	}
	void show(){
		double z=x+y;
		System.out.println("Addition Of "+x+" and "+y+" is : "+z);
	}
}

class Sub{
	double x,y;
	Sub(double a,double b){
		x=a;
		y=b;
	}
	void show(){
		double z=x-y;
		System.out.println("Subtraction Of "+x+" and "+y+" is : "+z);
	}
}

class Cal{
	public static void main(String...S){
		
		int p,q,ch;
		
		do{

			System.out.println("1.Addition\n2.Subtractio\n3.Multiplication\n4.Division\n5.Exit\n");
		System.out.println("Enter your choice: ");
		Scanner in=new Scanner(System.in);
		ch=in.nextInt();

		switch(ch){
		case 1:
			System.out.println("Enter two numbers:");
			p=in.nextInt();
			q=in.nextInt();
			Add a=new Add(p,q);
			a.show();
			break;
		case 2:
			System.out.println("Enter two numbers:");
			p=in.nextInt();
			q=in.nextInt();
			Sub b=new Sub(p,q);
			b.show();
			break;
		case 3:
			System.out.println("Enter two numbers:");
			p=in.nextInt();
			q=in.nextInt();
			Mul m=new Mul(p,q);
			m.show();
			break;
		case 4:
			System.out.println("Enter two numbers:");
			p=in.nextInt();
			q=in.nextInt();
			Div d=new Div(p,q);
			d.show();
			break;
		case 5:
		break;
		}
			
		}while(ch<6&&ch>0);
	}
}