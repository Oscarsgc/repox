import java.util.ArrayList;

public class Venta {

	private ArrayList<Articulo> articulos;
	private ArrayList<Servicio> servicios;
	private int precioTotal;

	public Venta() {
		this.articulos = new ArrayList<Articulo>();
		this.servicios = new ArrayList<Servicio>();

	}

	public Venta(ArrayList<Articulo> articulos, ArrayList<Servicio> servicios) {
		this.articulos = articulos;
		this.servicios = servicios;
		calculateTotalPrice();
	}

	public int getTotalFromArticles() {
		int total = 0;
		if (articulos.isEmpty()) {
			total = 0;
		} else {
			for (Articulo article : articulos) {
				total = total + article.getPrice();
			}
		}
		return total;
	}

	public int getTotalFromServices() {
		int total = 0;
		if (servicios.isEmpty()) {
			total = 0;
		} else {
			for (Servicio service : servicios) {
				total = total + service.getPrice();
			}
		}
		return total;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public void calculateTotalPrice() {
		this.precioTotal = getTotalFromArticles() + getTotalFromServices();
	}

}
