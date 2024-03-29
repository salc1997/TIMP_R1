package com.timp.test.ATR.Estruturas.Estruturas;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstructurasDetallesPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarPO;



import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EstruturasDetalles extends TestBase {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstructurasDetallesPO estruturasDetallesPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  estruturasDetallesPO = new  EstructurasDetallesPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  //driver.close();
	  }
	  
	 	
	 	@Test()
	 	public void visualizar() {
	 		
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 	ArrayList<Boolean> sucesso = estruturasDetallesPO.Detalles();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
			}	
	 		sleep(3000);
	 }
}
