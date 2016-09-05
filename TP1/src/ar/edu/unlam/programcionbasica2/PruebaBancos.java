package ar.edu.unlam.programcionbasica2;

public class PruebaBancos {

		private Integer Saldo;
		private Integer Ingreso;
		private Integer Extraccion;
		
		public PruebaBancos()
		{
			Saldo=0;
		}
		public PruebaBancos(Integer Saldo)
		{
			this.Saldo=Saldo;
		}
		public Integer GetSaldo ()
		{
			return this.Saldo;
		}
		public void SetSaldo (Integer Saldo)
		{
			this.Ingreso=Saldo;
			this.Saldo=this.Saldo+Ingreso;
		}
		public void SetExtraccion (Integer Extraccion)
		{
			this.Extraccion=Extraccion;
			this.Saldo=this.Saldo-this.Extraccion;
		}
}
