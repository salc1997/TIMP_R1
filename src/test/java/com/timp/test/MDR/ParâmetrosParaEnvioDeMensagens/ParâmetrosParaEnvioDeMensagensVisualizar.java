package com.timp.test.MDR.ParāmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParāmetrosParaEnvioDeMensagens.ParāmetrosParaEnvioDeMensagensVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParāmetrosParaEnvioDeMensagensVisualizar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParāmetrosParaEnvioDeMensagensVisualizarPO parāmetrosParaEnvioDeMensagensVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parāmetrosParaEnvioDeMensagensVisualizarPO = new ParāmetrosParaEnvioDeMensagensVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void visualizar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = parāmetrosParaEnvioDeMensagensVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}
}
