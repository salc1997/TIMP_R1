package com.timp.test.BRE.RegrasDeNegocio.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.RegrasDeNegocioLixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeNegocioLixeiraEmMassaMaisExcluirEmMassa extends TestBaseEliel{
 
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeNegocioLixeiraEmMassaMaisExcluirEmMassaPO regrasDeNegocioLixeiraEmMassaMaisExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeNegocioLixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeNegocioLixeiraEmMassaMaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	
	@Test()
	public void criar() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeNegocioLixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
