package com.timp.test.MDR.TEST;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TESTE.PruebaTodosPO;

public class PruebaTodos extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	PruebaTodosPO pruebaTodosPO;

	@BeforeClass
	public void beforeClass() {

		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		pruebaTodosPO = new PruebaTodosPO();
	}

	@Test(priority = 1)
	public void visualizar() {
		driver = initialization();
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = pruebaTodosPO.editar();

		assertTrue(sucesso, Editar);

	}

	@Test(priority = 0)
	public void criar() {
		driver = initialization();
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = pruebaTodosPO.criarAntecipacao();

		assertTrue(sucesso, Criar);

	}

}
