package com.timp.test.MDR.ParāmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParāmetrosParaEnvioDeMensagens.ParāmetrosParaEnvioDeMensagensDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParāmetrosParaEnvioDeMensagensDetalhes extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParāmetrosParaEnvioDeMensagensDetalhesPO parāmetrosParaEnvioDeMensagensDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parāmetrosParaEnvioDeMensagensDetalhesPO = new ParāmetrosParaEnvioDeMensagensDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void detalhes() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = parāmetrosParaEnvioDeMensagensDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
