package com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class GrupoAtividadeExcluir extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	GrupoAtividadeExcluirPO grupoAtividadeExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		grupoAtividadeExcluirPO = new GrupoAtividadeExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		
		loginTC.login();

		accesarMDR.acessarMDR();
		
		boolean sucesso = grupoAtividadeExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
	
}
