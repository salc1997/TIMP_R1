package com.timp.test.TFP.Configuracoes.Bloqueios.SubPeriodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Bloqueios.SubPeriodo.BloqueioSubPer�odoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class BloqueioSubPeriodoCriar extends TestBase {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	BloqueioSubPer�odoCriarPO bloqueioSubPer�odoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		bloqueioSubPer�odoCriarPO = new BloqueioSubPer�odoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = bloqueioSubPer�odoCriarPO.criar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(3000);
	}

}
