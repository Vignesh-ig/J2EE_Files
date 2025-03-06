package SetterInjection2;

import java.util.Map;

public class IPL {
	private String tname;
	private String color;
	private String captain;
	private Map<Integer, String> players;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public Map<Integer, String> getPlayers() {
		return players;
	}

	public void setPlayers(Map<Integer, String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "IPL [tname=" + tname + ", color=" + color + ", captain=" + captain + ", players=" + players + "]";
	}

}
