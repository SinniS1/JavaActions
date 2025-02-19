package hotel_expedia.actions.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class Room {
	//@JsonProperty("id")
	public String id;
	//@JsonProperty("room_name")
	public String room_name;
	public ArrayList<Rate> rate = new ArrayList();
}
