package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestParaCuentaAhorro {

	@Test 
	public void TestCuentaAhorroExtraer() {
		CuentaAhorro CuentaAhorro = new CuentaAhorro();
		
		CuentaAhorro .setSaldo(2000.0);
		CuentaAhorro .extraerSaldoCuenta(100.0);
		CuentaAhorro .extraerSaldoCuenta(100.0);
		CuentaAhorro .extraerSaldoCuenta(100.0);
		CuentaAhorro .extraerSaldoCuenta(100.0);
		CuentaAhorro .extraerSaldoCuenta(100.0);
		
		//luego de la quinta extraccion se adicionan 6 pesos
		CuentaAhorro .extraerSaldoCuenta(100.0);
		assertEquals(1394.0,CuentaAhorro.getSaldo(), 0.01);
	}
	
	@Test 
	public void TestcuentaAhorroDepositar() {
		CuentaAhorro CuentaAhorro = new CuentaAhorro();
		
		CuentaAhorro .setSaldo(2000.0);
		CuentaAhorro .depositarSaldo(100.0);
		assertEquals(2100.0,CuentaAhorro.getSaldo(), 0.01);
	}
}

