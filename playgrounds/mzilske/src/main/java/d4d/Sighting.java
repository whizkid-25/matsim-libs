package d4d;

import java.util.Comparator;
import java.util.Date;

import org.matsim.api.core.v01.Id;
import org.matsim.core.api.experimental.events.Event;

public class Sighting extends Event {

	public Id getAgentId() {
		return agentId;
	}

	public static class StartTimeComparator implements Comparator<Sighting> {
		
		@Override
		public int compare(Sighting o1, Sighting o2) {
			return Double.compare(o1.getDateTime(), o2.getDateTime());
		}
		
	}

	private long dateTime;
	private String cellTowerId;
	private Id agentId;

	public long getDateTime() {
		return dateTime * 1000;
	}

	public Sighting(Id agentId, long timeInSeconds, String cellTowerId) {
		super(timeInSeconds);
		this.agentId = agentId;
		this.dateTime = timeInSeconds;
		this.cellTowerId = cellTowerId;
	}

	public String getCellTowerId() {
		return cellTowerId;
	}

	@Override
	public String toString() {
		return new Date(dateTime * 1000) + " - Person: "+agentId + "  at zone: " + cellTowerId;
	}

	@Override
	public String getEventType() {
		return "cdr";
	}
	
	

}
