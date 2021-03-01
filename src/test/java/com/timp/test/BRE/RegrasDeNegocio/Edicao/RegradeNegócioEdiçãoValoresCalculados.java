package com.timp.test.BRE.RegrasDeNegocio.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.CálculodeTributosValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao.RegradeNegócioEdiçãoValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeNegócioEdiçãoValoresCalculados extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegradeNegócioEdiçãoValoresCalculadosPO regradeNegócioEdiçãoValoresCalculadosPO;
	
@BeforeClass
public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regradeNegócioEdiçãoValoresCalculadosPO = new RegradeNegócioEdiçãoValoresCalculadosPO();
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

		boolean sucesso = regradeNegócioEdiçãoValoresCalculadosPO.editar();
		assertTrue(sucesso, Editar);


	}


}
