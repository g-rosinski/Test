package ar.edu.unlam.programcionbasica2;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")



public class PruebaBancosTest {
	@Test
	public void saldinicial ()
	{
		PruebaBancos Banco = new PruebaBancos();
		Integer ValorEsperado = 0;
		
		Integer ValorObtenido=Banco.GetSaldo();
		
		Assert.assertEquals(ValorEsperado, ValorObtenido);
	}
	
	@Test
	public void depositarPlata ()
	{
		PruebaBancos Banco = new PruebaBancos();
		Integer ValorEsperado = 5;
		Integer Deposito = 5;
		Banco.SetSaldo(Deposito);
		Integer Resultado = Banco.GetSaldo();
		
		Assert.assertEquals(ValorEsperado, Resultado);
	}
	
	@Test
	public void RetirarPlata ()
	{
		PruebaBancos Banco = new PruebaBancos();
		Integer ValorEsperado = 2;
		Integer Deposito = 5;
		Banco.SetSaldo(Deposito);
		Integer Extraccion = 3;
		Banco.SetExtraccion(Extraccion);
		Integer Resultado = Banco.GetSaldo();
		
		Assert.assertEquals(ValorEsperado, Resultado);
	}
}
