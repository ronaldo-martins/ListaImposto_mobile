package listaImposto;

public class ImpostoSimplificado extends ImpostoRenda {
	
	public ImpostoSimplificado(double rendaBruta_,int ano_){
		super(rendaBruta_, ano_);
		
		}
	
		public double calculo(){
		 return rendaBruta * 0.15;
		 }

}

