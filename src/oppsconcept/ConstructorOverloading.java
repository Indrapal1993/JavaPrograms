package oppsconcept;

public class ConstructorOverloading {

	int id;
	String name;
	String company;
	
	public ConstructorOverloading(int i,String n) {
	 id=i;
	 name=n;
	}
	

	public ConstructorOverloading(int i,String n,String c) {
	 id=i;
	 name=n;
	 company=c;
	}
	
	void display(){
		System.out.println(id+" "+name+" "+company);
	}
	
	
	public static void main(String[] args){

		ConstructorOverloading co1 = new ConstructorOverloading(10, "Rahul");
		ConstructorOverloading co2=new ConstructorOverloading(20, "IP", "Ranosys");
		co1.display();
		co2.display();
	}
}
