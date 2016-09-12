package unlam.programacionbasica2.trabajopractico1;

public class Circulos {

	private Double perimetro;
	private Double radio;
	private Double pi;
	
	public Circulos()
	{
		this.perimetro=0.00;
		this.radio=0.00;
		this.pi=3.14;
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	public void CalcularPerimetro()
	{
		this.perimetro=this.pi*this.radio*2;
	}
	public Double VerPerimetro()
	{
		return this.perimetro;
	}
}
