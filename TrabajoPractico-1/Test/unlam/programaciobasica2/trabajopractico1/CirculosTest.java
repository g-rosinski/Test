package unlam.programaciobasica2.trabajopractico1;

import org.junit.Assert;
import org.junit.Test;

import unlam.programacionbasica2.trabajopractico1.Circulos;

public class CirculosTest {

	@Test
	//Circulo con radio 2
	public void PruebaDeCreacionDeCirculoConRadio2 ()
	{
		Circulos circ1 = new Circulos();
		
		Double ValorEsperado=12.56;
		Double ValorActual;
		circ1.setRadio(2.00);
		circ1.CalcularPerimetro();
		ValorActual=circ1.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	@Test
	//Circulo con radio 3.7
	public void PruebaDeCreacionDeCirculoConRadio3 ()
	{
		Circulos circ1 = new Circulos();
		
		Double ValorEsperado=23.23;
		Double ValorActual;
		circ1.setRadio(3.70);
		circ1.CalcularPerimetro();
		ValorActual=circ1.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	@Test
	//Circulo con radio 5
	public void PruebaDeCreacionDeCirculoConRadio5 ()
	{
		Circulos circ1 = new Circulos();
		
		Double ValorEsperado=31.40;
		Double ValorActual;
		circ1.setRadio(5.00);
		circ1.CalcularPerimetro();
		ValorActual=circ1.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	@Test
	//Circulo con radio 10.90
	public void PruebaDeCreacionDeCirculoConRadio10 ()
	{
		Circulos circ1 = new Circulos();
		
		Double ValorEsperado=68.45;
		Double ValorActual;
		circ1.setRadio(10.90);
		circ1.CalcularPerimetro();
		ValorActual=circ1.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	//Circulo con radio 9.8
	@Test
	public void PruebaDeCreacionDeCirculoConRadio9 ()
	{
		Circulos circ1 = new Circulos();
		
		Double ValorEsperado=615.73;
		Double ValorActual;
		circ1.setRadio(9.80);
		circ1.CalcularPerimetro();
		ValorActual=circ1.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	//Circulo con radio 16.6
	@Test
	public void PruebaDeCreacionDeCirculoConRadio16 ()
	{
		Circulos circ1 = new Circulos();
		
		Double ValorEsperado=865.67;
		Double ValorActual;
		circ1.setRadio(16.60);
		circ1.CalcularPerimetro();
		ValorActual=circ1.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
}
