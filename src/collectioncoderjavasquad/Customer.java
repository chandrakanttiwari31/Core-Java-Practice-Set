package collectioncoderjavasquad;



public class Customer  implements Comparable{

	
	private int cid;
	private String  cname;
	private int a_age;
	private int c_cont;
	
	
	
	public Customer(int cid, String cname, int a_age, int c_cont) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.a_age = a_age;
		this.c_cont = c_cont;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getA_age() {
		return a_age;
	}
	public void setA_age(int a_age) {
		this.a_age = a_age;
	}
	public int getC_cont() {
		return c_cont;
	}
	public void setC_cont(int c_cont) {
		this.c_cont = c_cont;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", a_age=" + a_age + ", c_cont=" + c_cont + "]";
	}
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getCid()-o.getCid();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}

