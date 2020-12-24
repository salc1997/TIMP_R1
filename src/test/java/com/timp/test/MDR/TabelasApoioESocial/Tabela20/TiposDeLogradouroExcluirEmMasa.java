package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroExcluirEmMasa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TiposDeLogradouroExcluirEmMasaPO tiposDeLogradouroExcluirEmMasaPO;
	
	@BeforeClass
	public void beforeClass() {
		  driver = initialization();
		  loginTC = new LoginTC();
		  accesarMDR = new AcessarMDRPO();
		  tiposDeLogradouroExcluirEmMasaPO = new TiposDeLogradouroExcluirEmMasaPO();
	}

	@AfterClass
	public void afterClass() {
		  driver.close();
	}
	
	@Test(priority = 0)
	public void login() {
		  loginTC.login();
	}
	
	@Test(priority = 1)
	public void acessarMDR() {
		 accesarMDR.acessarMDR();
	
	}
	
	@Test(priority = 2)
	public void excluir() {
		
		
		boolean sucesso = tiposDeLogradouroExcluirEmMasaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tiposDeLogradouroExcluirEmMasaPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);
		
	}

}
