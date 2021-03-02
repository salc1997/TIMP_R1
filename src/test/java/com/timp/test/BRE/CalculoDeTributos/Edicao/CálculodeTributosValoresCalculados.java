package com.timp.test.BRE.CalculoDeTributos.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.C�lculodeTributosValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2ValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class C�lculodeTributosValoresCalculados extends TestBaseCristhian {
	  
	
		LoginTC loginTC;
		AcessarBREPO acessarBREPO;
		C�lculodeTributosValoresCalculadosPO c�lculodeTributosValoresCalculadosPO;
		
	@BeforeClass
	public void beforeClass() {

			driver = initializationC();
			loginTC = new LoginTC();
			acessarBREPO = new AcessarBREPO();
			c�lculodeTributosValoresCalculadosPO = new C�lculodeTributosValoresCalculadosPO();
	}


	@AfterClass
	public void afterClass() {
		  //driver.close();
	}

	@Test(priority = 0)
		public void login() {
			loginTC.login();

		}

		@Test(priority = 1)
		public void acessarBRE() {

			acessarBREPO.acessarBRE();

		}
		@Test(priority = 2)
		public void editar() {

			boolean sucesso = c�lculodeTributosValoresCalculadosPO.editar();
			assertTrue(sucesso, Editar);


		}


}
