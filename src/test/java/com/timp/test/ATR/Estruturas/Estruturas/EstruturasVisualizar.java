package com.timp.test.ATR.Estruturas.Estruturas;

<<<<<<< HEAD
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarPO;

public class EstruturasVisualizar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstruturasVisualizarPO estruturasVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		estruturasVisualizarPO = new  EstruturasVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}


	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ATREntrar() {
		acessarATRPO.acessarATR();
	}

	@Test(priority = 1)
	public void visualizar() {
		boolean sucesso = estruturasVisualizarPO.visualizar();
		assertTrue(sucesso, visualizaçar);
	}
=======
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EstruturasVisualizar extends TestBaseCristhian {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstruturasVisualizarPO estruturasVisualizarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationC();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  estruturasVisualizarPO = new  EstruturasVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  
	  @Test(priority = 0)
	 	public void login() {
	 		loginTC.login();

	 	}

	 	@Test(priority = 1)
	 	public void ATREntrar() {
	 		 acessarATRPO.acessarATR();
	 		
	 	}
	 	
	 	@Test(priority = 1)
	 	public void visualizar() {
	 		
	 		ArrayList<Boolean> sucesso = estruturasVisualizarPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizaçar);
				
			}
			
		
	 		
	 	}
>>>>>>> refs/heads/Cristhian
}
