import static org.junit.Assert.*;

import org.junit.Test;

public class TestVenta {

	@Test
	public void testAddArticleToSale() {
		Venta venta = new Venta();
		Articulo articulo = new Articulo(10, "RAM");
		venta.getArticulos().add(articulo);
		assertEquals(1, venta.getArticulos().size());
	}

	@Test
	public void testAddServiceToSale() {
		Venta venta = new Venta();
		Servicio service = new Servicio("Limpieza de Equipo", 2, 20);
		venta.getServicios().add(service);
		assertEquals(1, venta.getServicios().size());
	}

	@Test
	public void testgetTotalFromArticlesShouldBeCeroIfNoArticles() {
		Venta sale = new Venta();
		assertEquals(0, sale.getTotalFromArticles());
	}

	@Test
	public void testgetTotalFromServicesShouldBeCeroIfNoArticles() {
		Venta sale = new Venta();
		assertEquals(0, sale.getTotalFromServices());
	}

	@Test
	public void testTotalPriceShouldBeCeroIfNoArticlesAndNoServices() {
		Venta sale = new Venta();
		assertEquals(0, sale.getPrecioTotal());
	}

	@Test
	public void testObtainCorrectPriceFromSale() {
		Venta sale = new Venta();
		Articulo articulo = new Articulo(10, "RAM");
		Servicio service = new Servicio("Limpieza de Equipo", 2, 20);
		sale.getServicios().add(service);
		sale.getArticulos().add(articulo);
		sale.calculateTotalPrice();
		assertEquals(50, sale.getPrecioTotal());
	}
}
