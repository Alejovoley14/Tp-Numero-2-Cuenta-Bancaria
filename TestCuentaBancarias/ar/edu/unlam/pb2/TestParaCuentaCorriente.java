package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestParaCuentaCorriente {

	@Test 
	public void TestCuentaCorrienteExtraer() {
		CuentaCorriente CuentaCorriente = new CuentaCorriente();
		CuentaCorriente.setSaldo(4000.0);
		CuentaCorriente.extraerSaldoCuenta(4600.0);
		assertEquals(30.0, CuentaCorriente.getSaldo(), 0.01);
	}

	@Test 
	public void TestCuentaCorrienteDepositar() {
		CuentaCorriente CuentaCorriente = new CuentaCorriente();
		CuentaCorriente.setSaldo(4000.0);
		CuentaCorriente.depositarSaldoCuenta(200.0);
		assertEquals(4200.0,CuentaCorriente.getSaldo(),0.01);
		}
}
