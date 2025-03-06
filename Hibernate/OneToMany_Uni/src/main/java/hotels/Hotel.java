package hotels;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	private String hname;
	private String hloc;
	
	@OneToMany
	private List<Food> foods;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHloc() {
		return hloc;
	}

	public void setHloc(String hloc) {
		this.hloc = hloc;
	}
	
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", hname=" + hname + ", hloc=" + hloc + "]";
	}
}
