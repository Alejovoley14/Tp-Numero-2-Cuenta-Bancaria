package ar.edu.unlam.pb2;

public class CuentaSueldo {	
		
		protected Double saldo;
		
		public void setSaldo(Double monto) {
			this.saldo = monto;
		}
		
		public Double getSaldo() {
			return this.saldo;
		}
		
		public void extraerSaldoCuenta (Double monto) {
			if (this.saldo >= monto)
				this.saldo = this.saldo - monto;
			else
				System.out.println("El monto de Extraccion es mayor al que usted posee en su cuenta");
		}
		
		public void depositarSaldoCuenta (Double monto) {
				this.saldo = this.saldo + monto;
			}
}