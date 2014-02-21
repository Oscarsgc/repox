public class Servicio {

	private String name;
	private int timeTo;
	private int price;
	private int pricePerHour;

	public Servicio() {

	}

	public Servicio(String name, int timeTo, int pricePerHour) {
		this.name = name;
		this.pricePerHour = pricePerHour;
		this.timeTo = timeTo;
		calculatePrice();
	}

	public int getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(int timeTo) {
		this.timeTo = timeTo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;

	}

	public int getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(int pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;
	}

	public void calculatePrice() {
		this.price = (this.timeTo * this.pricePerHour);
	}

}
