
public class Goods {
	
	String id;
	int number=10;
	int price;
	
	public void inputPrice(int p) {
		price=p;
	}
	
	public int n() {
		return number;
	}
	
	public void info() {
		System.out.println(id+"/"+number+"/"+price);
	}
	
//	upgrade
	
	public void input(String i, int n,int p ) {
		id=i;
		number=n;
		price=p;
	}
	
	

}
