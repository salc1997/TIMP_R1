package com.timp.test.MDR.TabelasApoioESocial.Tabela15;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AgenteCausadorDeSGDPExcluir extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AgenteCausadorDeSGDPExcluirPO agenteCausadorDeSGDPExcluirPO;
 
	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		agenteCausadorDeSGDPExcluirPO = new AgenteCausadorDeSGDPExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void excluirr() {

		boolean sucesso = agenteCausadorDeSGDPExcluirPO.excluir();

		assertTrue(sucesso, Editar);

	}


}
