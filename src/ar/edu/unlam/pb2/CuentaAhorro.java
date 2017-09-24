package ar.edu.unlam.pb2;

public class CuentaAhorro extends CuentaSueldo{

	private Double montoExtra = 6.0;
	private Integer cantDeExtacciones = 0;
	
	public Integer getCantDeExtacciones() {
		return cantDeExtacciones;
	}

	public void setCantDeExtacciones() {
		this.cantDeExtacciones++;
	}
	
	public void extraerSaldoCuenta (Double monto) {
		
		if (this.saldo >= monto){
			if(getCantDeExtacciones() >= 5)
				this.setSaldo(this.getSaldo() - (monto + this.montoExtra));
			
			else {
				extraerSaldoCuenta(monto);
				this.setCantDeExtacciones();
			}
		}
		else
			System.out.println("El monto de Extraccion es mayor al que usted posee en su cuenta");
	
		}
	public void depositarSaldoCuenta (Double monto) {
		this.saldo = this.saldo + monto;
	}
}

