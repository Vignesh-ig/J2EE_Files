package wwe;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WWE {
	
	@Id
	private int prank;
	private String name;
	private int age;
	
	public int getPrank() {
		return prank;
	}
	public void setPrank(int p_rank) {
		this.prank = p_rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Rank = " + prank + ", Player Name = " + name + ", Player's Age = " + age ;
	}
	
	
}
