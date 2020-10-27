package com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2210ComunicaçãoDeAcidenteDeTrabalhoEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	S2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO s2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		s2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO = new S2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void editar() {
		boolean sucesso = s2210ComunicaçãoDeAcidenteDeTrabalhoEditarPO.editar();
		assertTrue(sucesso, Criar);
	}
}
