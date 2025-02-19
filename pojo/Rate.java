package hotel_expedia.actions.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Rate {
	@JsonProperty("id")
	public String id;
	@JsonProperty("status")
	public String status;
	@JsonProperty("available_rooms")
	public Integer available_rooms;
	public Boolean refundable;
	public Boolean member_deal_available;
	public String merchant_of_record;
	public Boolean sale_scenario_package;
	public Boolean sale_scenario_member;
	public Boolean sale_scenario_corporate;
	public Boolean sale_scenario_distribution;
	public ArrayList<Amenity> amentities = new ArrayList();
	public ArrayList<Link> links = new ArrayList();
	public ArrayList<BedGroup> bedgroups = new ArrayList();
	public ArrayList<CancelPenalty> cancelpenalties = new ArrayList();
	public ArrayList<OccupancyPricing> occupancypricings = new ArrayList();
}
