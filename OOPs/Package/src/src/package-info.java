package src;

class Balance{
	String name;
	double bal;
	Balance(String n,double b){
		name=n;
		bal=b;
	}
	void show(){
		if(bal<0)
			System.out.println("----->");
		System.out.println(name+": $"+bal);
	}
}

class Account{
	public static void main(String...S){
		Balance current[]=new Balance[3];
		
		current[0]=new Balance("SD",156.23);
		current[1]=new Balance("PD",124.56);
		current[2]=new Balance("PA",142.86);
		
		for(int i=0;i<3;i++)
			current[i].show();
	}
}