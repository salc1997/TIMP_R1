package com.timp.test.MDR.TabelasApoioESocial.Tabela08;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaCriarPO;

public class ClassificacaoTributariaCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificacaoTributariaCriarPO classificacaoTributariaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificacaoTributariaCriarPO = new ClassificacaoTributariaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = classificacaoTributariaCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
