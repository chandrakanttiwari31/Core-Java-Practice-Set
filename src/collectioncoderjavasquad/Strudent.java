package collectioncoderjavasquad;

public class Strudent {

	private int rollno;
    private String name;
    
    
    
	public Strudent(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Strudent [rollno=" + rollno + ", name=" + name + "]";
	}
    
}
