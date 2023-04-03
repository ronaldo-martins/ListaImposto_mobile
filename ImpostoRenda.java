package listaImposto;

public abstract class ImpostoRenda {
	protected int ano;
	protected double valorPagar;
	protected double rendaBruta;
	
	public ImpostoRenda(double rendaBruta_, int ano_) {
		this.rendaBruta = rendaBruta_;
		this.ano = ano_;
	
	}
	
	public abstract double calculo();

	public boolean processamento(int anoBase) {
		if( (anoBase == this.ano) && (this.rendaBruta > 12000) ) {
			this.valorPagar = this.calculo();
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	
	

}
