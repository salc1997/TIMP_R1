package com.timp.test.TBD.ArmazenagemDeArquivos.ArmazenarArquivo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.ArmazenarArquivo.ArmazenarArquivoFiltroPorIDPO;

public class ArmazenarArquivoFiltroPorID extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	ArmazenarArquivoFiltroPorIDPO armazenarArquivoFiltroPorIDPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarTBDPO = new AcessarTBDPO();
		  armazenarArquivoFiltroPorIDPO = new  ArmazenarArquivoFiltroPorIDPO();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  
	  @Test(priority = 0)
	 	public void login() {
	 		loginTC.login();

	 	}

	 	@Test(priority = 1)
	 	public void TBDEntrar() {
	 		 acessarTBDPO.acessarTBD();
	 		
	 	}
	 	
	 	@Test(priority = 1)
	 	public void filtro() {
	 		
	 		boolean sucesso = armazenarArquivoFiltroPorIDPO.filtro();
			assertTrue(sucesso, Filtros);
		
	 		
	 	}

}
