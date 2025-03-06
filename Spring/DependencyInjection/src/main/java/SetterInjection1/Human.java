package SetterInjection1;

import java.util.List;
import java.util.Set;

public class Human {

	private int id;
	private String name;
	private int age;
	private String height;
	private String weight;
	private List<String> friends;
	private Set<String> lang;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<String> getLang() {
		return lang;
	}

	public void setLang(Set<String> lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", friends=" + friends + ", lang=" + lang + "]";
	}

}
