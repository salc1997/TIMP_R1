package com.timp.test.BRE.RegrasDeMensagens.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.ParametrosGerais.RegraDeMensagensCriaComCopiaPO;

public class RegrasDeMensagensCriarComCopia extends TestBase{
 
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegraDeMensagensCriaComCopiaPO regraDeMensagensCriaComCopiaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regraDeMensagensCriaComCopiaPO = new RegraDeMensagensCriaComCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	
	@Test()
	public void criarComCopia() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		
		ArrayList<Boolean> sucesso = regraDeMensagensCriaComCopiaPO.criarComCopia();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
