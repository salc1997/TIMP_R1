package com.timp.test.MDR.DeterminacaoAutomaticaDeGuias;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DeterminacaoAutomaticaDeGuiasDetalhe extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoAutomaticaDeGuiasDetalhesPO  determinacaoAutomaticaDeGuiasDetalhePO;
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	 determinacaoAutomaticaDeGuiasDetalhePO = new DeterminacaoAutomaticaDeGuiasDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test
  public void Detalhe() {
	  loginTC.login();
	  acessarMDRPO.acessarMDR();
	 
	 
	  ArrayList<Boolean> sucesso =  determinacaoAutomaticaDeGuiasDetalhePO.Detalhe();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(3000);
  }

}
