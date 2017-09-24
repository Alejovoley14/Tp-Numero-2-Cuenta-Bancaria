package ar.edu.unlam.pb2;

public class CuentaCorriente  extends CuentaSueldo{
	
	private  Double sobregiro = 500.0;
	private  Double comision = 0.05;
	
	private Double montoBanco = null;
	
	public void extraerSaldoCuenta (Double monto) {
		
		if (this.getSaldo() > monto)
			this.setSaldo(this.getSaldo() - monto);
		
		else if (this.getSaldo() < monto)
			montoBanco = (monto - this.getSaldo());	
		
		if (montoBanco > sobregiro) 
			this.setSaldo(montoBanco * comision);
		
		else
			this.setSaldo(montoBanco);
	}
	
	public void depositarSaldoCuenta (Double monto) {
		this.saldo = this.saldo + monto;
	}
}


