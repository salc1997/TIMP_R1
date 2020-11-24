package com.timp.test.MDR.CadastroCondiçao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondiçao.CadastroCondiçaoExcluirenMasasPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasasPO;

public class CadastroCondiçaoExcluirMasas extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondiçaoExcluirenMasasPO cadastroCondiçaoExcluirenMasasPO;
	
	@BeforeClass
	  public void beforeClass() {
		  	driver = initializationM();
			loginTC = new LoginTC();
			acessarMDRPO = new AcessarMDRPO();
			 cadastroCondiçaoExcluirenMasasPO = new CadastroCondiçaoExcluirenMasasPO();
	  }
	 @AfterClass
	  public void afterClass() {
	  }
	  
	  @Test(priority = 0)
		public void login() {
			loginTC.login();

		}

		@Test(priority = 1)
		public void acessarMDR() {

			acessarMDRPO.acessarMDR();

		}

		@Test(priority = 2)
		public void criar() {
			
			
			boolean sucesso =  cadastroCondiçaoExcluirenMasasPO.criar();
			assertTrue(sucesso, Criar);
			
			boolean sucesso2 = cadastroCondiçaoExcluirenMasasPO.HierarquiaDeCenariosDeCorreçaoExcluirMasas();
			assertTrue(sucesso2, Eliminado);
		}
}
