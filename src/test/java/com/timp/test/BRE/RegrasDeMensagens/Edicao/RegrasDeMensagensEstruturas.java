package com.timp.test.BRE.RegrasDeMensagens.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensEstruturasPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.ParametrosGerais.RegrasDeMensagensEditarPO;

public class RegrasDeMensagensEstruturas extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeMensagensEstruturasPO regrasDeMensagensEstruturasPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeMensagensEstruturasPO = new RegrasDeMensagensEstruturasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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
	public void editar() {
		ArrayList<Boolean> sucesso = regrasDeMensagensEstruturasPO.estrutura();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		
	}
 
 
}
