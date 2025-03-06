package ConstructorInjection1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bus {
	private int bid;
	private String btype;
	
	private Passenger p;
	private List<String> btime;
	private Set<String> stops;
	private Map<String, String> stop;
	
	public Bus(int bid, String btype, Passenger p, List<String> btime, Set<String> stops, Map<String, String> stop) {
		super();
		this.bid = bid;
		this.btype = btype;
		this.p = p;
		this.btime = btime;
		this.stops = stops;
		this.stop = stop;
	}

	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", btype=" + btype + ", p=" + p + ", btime=" + btime + ", stops=" + stops + ", stop="
				+ stop + "]";
	}	
}
