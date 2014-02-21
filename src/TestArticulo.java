import static org.junit.Assert.*;

import org.junit.Test;

public class TestArticulo {

	@Test
	public void obtainDataFromArticle() {
		Articulo articulo = new Articulo(10, "PC");
		assertEquals("PC", articulo.getName());
		assertEquals(10, articulo.getPrice());
	}

}
