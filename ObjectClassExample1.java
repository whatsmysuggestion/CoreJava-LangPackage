
public class ObjectClassExample1 {
	
	int no;
	String name;
	
 public void setName(String name) {
	this.name = name;
}

 public void setNo(int no) {
	this.no = no;
}
  
public String toString() {
	  
	return "Name Is:-"+this.name+" No:-"+this.no;
}

	public static void main(String[] args) throws Exception {
		 
		ObjectClassExample1 oe=new ObjectClassExample1();
		oe.setName("test");
		oe.setNo(10);
		
		System.out.println(oe);		
		
		
	}

}
