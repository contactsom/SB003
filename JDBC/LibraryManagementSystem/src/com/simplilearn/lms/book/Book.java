package com.simplilearn.lms.book;

/*POJO- Plain Java Object Class*/
public class Book {

	int bid;
    String bname ;
    String bauthor;
    String bpublication;
    int bprice;
    String bisbn;
    
    public Book() {
    	
	} 
    
	public Book(int bid, String bname, String bauthor, String bpublication, int bprice, String bisbn) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.bpublication = bpublication;
		this.bprice = bprice;
		this.bisbn = bisbn;
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

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getBpublication() {
		return bpublication;
	}

	public void setBpublication(String bpublication) {
		this.bpublication = bpublication;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bpublication=" + bpublication
				+ ", bprice=" + bprice + ", bisbn=" + bisbn + "]";
	} 
    
}
