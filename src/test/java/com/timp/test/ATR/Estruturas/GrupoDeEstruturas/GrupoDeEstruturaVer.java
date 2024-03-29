package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasVerPO;

public class GrupoDeEstruturaVer extends TestBase{

	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasVerPO grupoDeEstruturasVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasVerPO = new  GrupoDeEstruturasVerPO();
	}


	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void visualizar() {

		loginTC.login();

		acessarATRPO.acessarATR();

		ArrayList<Boolean> sucesso = grupoDeEstruturasVerPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);

		}

		sleep(2000);

	}
}
