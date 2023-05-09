package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtribuicaodeRegraPO;
import com.sap.timp.pageObjectModel.BRB.EnviarParaCorrecaoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EnviarParaCorrecao extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EnviarParaCorrecaoPO enviarParaCorreçãoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		enviarParaCorreçãoPO = new EnviarParaCorrecaoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = enviarParaCorreçãoPO.editar();
		assertTrue(sucesso, Editar);

	}

}
