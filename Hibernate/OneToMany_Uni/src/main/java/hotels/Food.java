package hotels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fname;
	private double fprice;
	private String ftype;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getFprice() {
		return fprice;
	}

	public void setFprice(double fprice) {
		this.fprice = fprice;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + ", ftype=" + ftype + "]";
	}
}
