package ar.edu.unlam.pb2;

public class CuentaSueldo {	
		
		protected Double saldo;
		
		public void setSaldo(Double monto) {
			this.saldo = monto;
		}
		
		public Double getSaldo() {
			return this.saldo;
		}
		
		public void extraerSaldo(Double monto) {
			if (this.saldo >= monto)
				this.saldo = this.saldo - monto;
			else
				System.out.println("El monto de Extraccion es mayor al que usted posee en su cuenta");
		}
		
		public void depositarSaldo(Double monto) {
				this.saldo = this.saldo + monto;
			}
}