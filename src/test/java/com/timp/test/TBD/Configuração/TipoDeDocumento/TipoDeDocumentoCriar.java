package com.timp.test.TBD.Configuração.TipoDeDocumento;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.TipoDeDocumento.TipoDeDocumentoCriarPO;

public class TipoDeDocumentoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	TipoDeDocumentoCriarPO tipoDeDocumentoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		tipoDeDocumentoCriarPO = new TipoDeDocumentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void TBDEntrar() {
		acessarTBDPO.acessarTBD();

	}

	@Test(priority = 1)
	public void criar() {

		boolean sucesso = tipoDeDocumentoCriarPO.criar();
		assertTrue(sucesso, Criar);

	}

}
