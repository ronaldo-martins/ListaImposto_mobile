package listaImposto;

public class ImpostoCompleto extends ImpostoRenda {

	private double gastoEducacao, gastoSaude;
	
	public ImpostoCompleto(double rendaBruta_, int ano_, double gastoEducacao_, double gastoSaude_) {
		super(rendaBruta_, ano_);
		this.gastoEducacao = gastoEducacao_;
		this.gastoSaude = gastoSaude_;
			
		
	}
	
	public ImpostoCompleto(double rendaBruta_, int ano_) {
		this(rendaBruta_ , ano_, (rendaBruta_ * 0.10), (rendaBruta_ * 0.10) );
		
	}

	public double getGastoEducacao() {
		return gastoEducacao;
	}

	public void setGastoEducacao(double gastoEducacao) {
		this.gastoEducacao = gastoEducacao;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	public double calculo() {
		double pagar = 0;
		
		if(rendaBruta >= 100000) {
			pagar = (rendaBruta * 0.27);
		}
		
		if(rendaBruta < 50000) {
			pagar = (rendaBruta * 0.22);
			
		}
		if(rendaBruta >= 50000 && rendaBruta < 100000) {
			pagar = (rendaBruta * 0.12);
				
		}
		return pagar - this.gastoEducacao - this.gastoSaude;
		
	}
		
	

	/*@Override
	public double calculo() {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	

}
