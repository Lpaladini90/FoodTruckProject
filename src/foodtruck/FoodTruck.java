package foodtruck;

public class FoodTruck {

	//static is changeable. it exists outside of an instance
	
	//create new data types
	private static int nextTruckId = 0;
	private int  idNumber;
	private String name="";
	private double rating= 0.0;
	private String type = "";
	private double avgRating= 0.0;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(Double avgRating){
		this.avgRating = avgRating;
	}
	
	public FoodTruck(String name,double rating, String type) {
		this.name = name;
		this.idNumber =nextTruckId;
		this.rating = rating;
		this.type = type; 
		nextTruckId++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
		
	}
	
	
	public String toString() {
		String output = "Truck ID: " +  idNumber + "\nName: " + name + "\nType: " + type + "\nRating: " + rating;
	return output;
	
	}

	public void displayTruckInfo() {
		String truckInfo = this.toString();
		System.out.println(truckInfo);

	}
	
	
	
	
}
