public class Articulo {

	private int price;
	private String name;

	public Articulo() {

	}

	public Articulo(int p, String n) {
		this.name = n;
		this.price = p;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
