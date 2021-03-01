package com.timp.test.BRE.CalculoDeTributos.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.CálculodeTributosValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2ValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CálculodeTributosValoresCalculados extends TestBaseCristhian {
	  
	
		LoginTC loginTC;
		AcessarBREPO acessarBREPO;
		CálculodeTributosValoresCalculadosPO cálculodeTributosValoresCalculadosPO;
		
	@BeforeClass
	public void beforeClass() {

			driver = initializationC();
			loginTC = new LoginTC();
			acessarBREPO = new AcessarBREPO();
			cálculodeTributosValoresCalculadosPO = new CálculodeTributosValoresCalculadosPO();
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

			boolean sucesso = cálculodeTributosValoresCalculadosPO.editar();
			assertTrue(sucesso, Editar);


		}


}
