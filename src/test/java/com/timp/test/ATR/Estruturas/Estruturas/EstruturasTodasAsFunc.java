package com.timp.test.ATR.Estruturas.Estruturas;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstructurasTodasAsFuncPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EstruturasTodasAsFunc extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstructurasTodasAsFuncPO estructurasTodasAsFuncPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  estructurasTodasAsFuncPO = new  EstructurasTodasAsFuncPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  //driver.close();
	  }
	  
	 	
	 @Test(priority = 0)
	 	public void Detalles() {
	 		
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 	ArrayList<Boolean> sucesso = estructurasTodasAsFuncPO.Detalles();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
			}	
	 		sleep(3000);
	 }
	 @Test()
		public void visualizarFiltros() {
				
			boolean sucesso = estructurasTodasAsFuncPO.Filtros();
			assertTrue(sucesso, visualizar);
			
			sleep(3000);
		}
	 	
	 @Test(priority = 1)
	 	public void visualizar() {
			
	 		ArrayList<Boolean> sucesso = estructurasTodasAsFuncPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
	}
	 	
	}
}
