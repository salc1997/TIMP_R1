package com.timp.test.MDR.ThinCapitalization.Subcapitalizacao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Subcapitalizacao.SubcapitalizacaoExcluirEmMassaPO;

public class SubcapitalizacaoExcluirEmMassa extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SubcapitalizacaoExcluirEmMassaPO subcapitalizacaoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		subcapitalizacaoExcluirEmMassaPO = new SubcapitalizacaoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	public void criar() {		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = subcapitalizacaoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {		
		boolean sucesso2 = subcapitalizacaoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
