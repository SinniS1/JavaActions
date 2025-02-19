package hotel_expedia.actions.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
	@JsonProperty("Hotels")
	public ArrayList<Hotel> hotels = new ArrayList();
}
