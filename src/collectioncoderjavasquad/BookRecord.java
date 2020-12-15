package collectioncoderjavasquad;

public class BookRecord {

	
	private int  bid;
	private String bname;
	
	
	
	
	public BookRecord(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname=bname;
		
		
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "BookRecord [bid=" + bid + ", bname=" + bname + "]";
	}
	
	
	
	
	
	
}
