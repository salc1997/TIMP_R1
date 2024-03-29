package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AssociaçãoCodigoAjusteVisualizar extends TestBase{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  AssociaçãoCodigoAjusteVisualizarPO associaçãoCodigoAjusteVisualizarPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initialization();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  associaçãoCodigoAjusteVisualizarPO = new AssociaçãoCodigoAjusteVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  		
	  @Test() 
	  public void visualizarAssociaçãoCodigoAjuste() { 	
		  
		  loginTC.login();  
		  
		  accesarMDRPO.acessarMDR();
		  
		  ArrayList<Boolean> sucesso = associaçãoCodigoAjusteVisualizarPO.visualizarAssociaçãoCodigoAjuste();

		  for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		  }
		  
		  sleep(2000);
	  }		 
}
