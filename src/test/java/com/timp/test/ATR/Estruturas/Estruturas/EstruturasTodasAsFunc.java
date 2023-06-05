package com.timp.test.ATR.Estruturas.Estruturas;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstructurasDetallesPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarFiltrosPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EstruturasTodasAsFunc extends TestBase {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstructurasDetallesPO estructurasDetallesPO;
	EstruturasVisualizarFiltrosPO estruturasVisualizarFiltrosPO;
	EstruturasVisualizarPO estruturasVisualizarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  estructurasDetallesPO = new  EstructurasDetallesPO();
		  estruturasVisualizarFiltrosPO = new  EstruturasVisualizarFiltrosPO();
		  estruturasVisualizarPO = new EstruturasVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 	
	 @Test(priority = 0)
	 	public void Detalles() {
	 		
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 	ArrayList<Boolean> sucesso = estructurasDetallesPO.Detalles();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
			}	
	 		sleep(3000);
	 }
	 @Test(priority = 1)
		public void visualizarFiltros() {
				
			boolean sucesso = estruturasVisualizarFiltrosPO.visualizar();
			assertTrue(sucesso, visualizar);
			
			sleep(3000);
		}
	 	
	 @Test(priority = 2)
	 	public void visualizar() {
			
	 		ArrayList<Boolean> sucesso = estruturasVisualizarPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				}
	}
}
