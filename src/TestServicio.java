import static org.junit.Assert.*;

import org.junit.Test;

public class TestServicio {

	@Test
	public void testCalcularPrecioPorServicio() {
		Servicio servicio = new Servicio();
		servicio.setName("Limpieza de Equipo");
		servicio.setTimeTo(2);
		servicio.setPricePerHour(10);
		servicio.calculatePrice();
		assertEquals(20, servicio.getPrice());
	}

	@Test
	public void obtainDataFromService() {
		Servicio service = new Servicio("Servicio Tecnico", 4, 20);
		assertEquals("Servicio Tecnico", service.getName());
		assertEquals(4, service.getTimeTo());
		assertEquals(20, service.getPricePerHour());
		assertEquals(80, service.getPrice());
	}

}
