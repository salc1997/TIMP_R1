package com.timp.test.MDR.TabelasApoioESocial.Tabela19;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivosdeDesligamentoExcluirMasa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	MotivosdeDesligamentoExcluirMasaPO motivosDesligamentoExcluirPO;
	
	@BeforeClass
	public void beforeClass() {
		  driver = initializationKen();
		  loginTC = new LoginTC();
		  accesarMDR = new AcessarMDRPO();
		  motivosDesligamentoExcluirPO = new MotivosdeDesligamentoExcluirMasaPO();
	}

	@AfterClass
	public void afterClass() {
		  driver.close();
	}
	
	@Test(priority = 0)
	public void ingresar() {
		  loginTC.login();
	}
	
	@Test(priority = 1)
	public void mdrEntrar() {
		 accesarMDR.acessarMDR();
	
	}
	
	@Test(priority = 2)
	public void excluirMasaMotivosDesligamento() {
		
		
		boolean sucesso = motivosDesligamentoExcluirPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = motivosDesligamentoExcluirPO.excluirMasaMotivosDesligamento();
		assertTrue(sucesso2, Eliminado);
		
	}

}