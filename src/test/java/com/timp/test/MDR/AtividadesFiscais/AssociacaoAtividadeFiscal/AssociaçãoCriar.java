package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriarPO;

public class AssociaçãoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	AssociaçãoCriarPO associaçãoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		associaçãoCriarPO = new AssociaçãoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criarAssociação() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = associaçãoCriarPO.criarAssociação();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
}
