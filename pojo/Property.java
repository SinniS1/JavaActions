package hotel_expedia.actions.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class Property {
	@JsonProperty("property_id")
	public String property_id;
	@JsonProperty("score")
	public String score;
	public ArrayList<Room> rooms = new ArrayList();
	public ArrayList<Link> links = new ArrayList();
}
