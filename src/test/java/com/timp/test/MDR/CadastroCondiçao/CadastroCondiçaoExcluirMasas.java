package com.timp.test.MDR.CadastroCondišao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondišao.CadastroCondišaoExcluirenMasasPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorrešao.HierarquiaDeCenariosDeCorrešaoExcluirMasasPO;

public class CadastroCondišaoExcluirMasas extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondišaoExcluirenMasasPO cadastroCondišaoExcluirenMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroCondišaoExcluirenMasasPO = new CadastroCondišaoExcluirenMasasPO();
	}

	@AfterClass
	public void afterClass() {

		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroCondišaoExcluirenMasasPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = cadastroCondišaoExcluirenMasasPO.HierarquiaDeCenariosDeCorrešaoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}
	
}
