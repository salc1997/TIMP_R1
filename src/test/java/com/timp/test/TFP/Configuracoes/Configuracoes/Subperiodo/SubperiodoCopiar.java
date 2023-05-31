package com.timp.test.TFP.Configuracoes.Configuracoes.Subperiodo;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Subperíodo.SubperiodoCopiarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SubperiodoCopiar extends TestBase {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubperiodoCopiarPO subperíodoCopiarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subperíodoCopiarPO = new SubperiodoCopiarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Copiar() {

		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = subperíodoCopiarPO.copiar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}

	}
}
