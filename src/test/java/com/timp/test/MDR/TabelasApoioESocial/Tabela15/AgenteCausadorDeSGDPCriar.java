package com.timp.test.MDR.TabelasApoioESocial.Tabela15;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AgenteCausadorDeSGDPCriar extends TestBaseCristhian{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AgenteCausadorDeSGDPCriarPO agenteCausadorDeSGDPCriarPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		agenteCausadorDeSGDPCriarPO = new AgenteCausadorDeSGDPCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  
  }

 
	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = agenteCausadorDeSGDPCriarPO.criar();

		assertTrue(sucesso, Criar);

	}
}
