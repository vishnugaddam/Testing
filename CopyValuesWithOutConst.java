package methods;

public class CopyValuesWithOutConst {
	
	int id;
	String name;
	
	CopyValuesWithOutConst(int i, String n){
		id=i;
		name=n;
		
	}
	
	CopyValuesWithOutConst(){
		
	}
	void display(){
	System.out.println(id+ " " +name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyValuesWithOutConst c1=new CopyValuesWithOutConst(1073,"vishnu");
		CopyValuesWithOutConst c2=new CopyValuesWithOutConst();
		c2.id=c1.id;
		c2.name=c1.name;
		
		c1.display();
		c2.display();
	}

}
