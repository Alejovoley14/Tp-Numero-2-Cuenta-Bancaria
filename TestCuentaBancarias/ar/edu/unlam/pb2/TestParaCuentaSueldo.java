package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestParaCuentaSueldo {

	@Test 
	public void TestCuentaSueldoExtraer() {
		CuentaSueldo CuentaSueldo = new CuentaSueldo();
		
		CuentaSueldo.setSaldo(2000.0);
		CuentaSueldo.extraerSaldoCuenta(500.0);
		assertEquals(1500.0,CuentaSueldo.getSaldo(), 0.01);
	}
	
	@Test 
	public void TestCuentaSueldoDepositar() {
		CuentaSueldo CuentaSueldo = new CuentaSueldo();
		
		CuentaSueldo.setSaldo(2000.0);
		CuentaSueldo.depositarSaldoCuenta(500.0);
		assertEquals(2500.0,CuentaSueldo.getSaldo(), 0.01);
	}
}
