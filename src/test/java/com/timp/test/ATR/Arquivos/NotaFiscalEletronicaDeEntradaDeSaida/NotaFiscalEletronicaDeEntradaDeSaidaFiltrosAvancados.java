package com.timp.test.ATR.Arquivos.NotaFiscalEletronicaDeEntradaDeSaida;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Arquivos.NotaFiscalEletronicaDeEntradaDeSaida.NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO;

public class NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvancados extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO notaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  notaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO = new  NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO();
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
	 	public void filtro() {
	 		
	 		ArrayList<Boolean> sucesso = notaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO.filtro();
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Filtros);
			}
	 		
		
	 		
	 	}
   
	
}