package com.timp.test.BRE.RegrasDeNegocio.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.C�lculodeTributosValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao.RegradeNeg�cioEdi��oValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeNeg�cioEdi��oValoresCalculados extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegradeNeg�cioEdi��oValoresCalculadosPO regradeNeg�cioEdi��oValoresCalculadosPO;
	
@BeforeClass
public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regradeNeg�cioEdi��oValoresCalculadosPO = new RegradeNeg�cioEdi��oValoresCalculadosPO();
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

		boolean sucesso = regradeNeg�cioEdi��oValoresCalculadosPO.editar();
		assertTrue(sucesso, Editar);


	}


}
