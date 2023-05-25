package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.EnviarParaCorrecaoPO;

public class EnviarParaCorrecao extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EnviarParaCorrecaoPO enviarParaCorre��oPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		enviarParaCorre��oPO = new EnviarParaCorrecaoPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = enviarParaCorre��oPO.editar();
		assertTrue(sucesso, Editar);

	}

}
