package com.timp.test.BRE.RegrasDeAuditoriaN3;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.RegrasdeAuditoriaN3ValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2ValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN3ValoresCalculados extends TestBaseCristhian{
	 
	
		LoginTC loginTC;
		AcessarBREPO acessarBREPO;
		RegrasdeAuditoriaN3ValoresCalculadosPO regrasdeAuditoriaN3ValoresCalculadosPO;
		
	@BeforeClass
	public void beforeClass() {

			driver = initializationC();
			loginTC = new LoginTC();
			acessarBREPO = new AcessarBREPO();
			regrasdeAuditoriaN3ValoresCalculadosPO = new RegrasdeAuditoriaN3ValoresCalculadosPO();
	}


	@AfterClass
	public void afterClass() {
		  
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

			boolean sucesso = regrasdeAuditoriaN3ValoresCalculadosPO.editar();
			assertTrue(sucesso, Editar);


		}


}
