package com.timp.test.BRE.RegrasDeMensagens.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.ParametrosGerais.RegrasDeMensagensLixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeMensagensLixeiraEmMassaMaisExcluirEmMassa extends TestBaseEliel{
 
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeMensagensLixeiraEmMassaMaisExcluirEmMassaPO regrasDeMensagensLixeiraEmMassaMaisExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeMensagensLixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeMensagensLixeiraEmMassaMaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarBRE() {
		acessarBREPO.acessarBRE();
	}
	
	@Test(priority = 2)
	public void criar() {
		ArrayList<Boolean> sucesso = regrasDeMensagensLixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
