package com.timp.test.ATR.Arquivos.CarregamentoDeArquivos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Arquivos.CarregamentoDeArquivos.CarregamentoDeArquivosFiltroPorIDPO;

public class CarregamentoDeArquivosFiltroPorID extends TestBaseEliel{
	 
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	CarregamentoDeArquivosFiltroPorIDPO carregamentoDeArquivosFiltroPorIDPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  carregamentoDeArquivosFiltroPorIDPO = new  CarregamentoDeArquivosFiltroPorIDPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  
		driver.close();
	  }
	  

	 	@Test()
	 	public void filtro() {
	 		
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 		ArrayList<Boolean> sucesso = carregamentoDeArquivosFiltroPorIDPO.filtro();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Filtros);
			}
			
		
	 		
	 	}
	
 
}
