package hotel_expedia.actions.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class Hotel {
	@JsonProperty("PropertyId")
	public String propertyId;
	@JsonProperty("PropertyName")
	public String propertyName;
	@JsonProperty("ApiCityId")
	public String apiCityId;
	public Chain chain;
	public String rating;
	public Category category;
	public Address address;
	@JsonProperty("Email")
	public String email;
	public String fax;
	public String phone;
	public Coordinates coordinates;
	public Checkin checkin;
	public Checkout checkout;
	public Date updatedDate;
	public HotelDescription hotelDescription;
	public ArrayList<Amenity> amenities = new ArrayList();
	public ArrayList<Image> images = new ArrayList();
	public Policies policies;
	public Fees fees;
	public ArrayList<Attribute> attributes = new ArrayList();
}
