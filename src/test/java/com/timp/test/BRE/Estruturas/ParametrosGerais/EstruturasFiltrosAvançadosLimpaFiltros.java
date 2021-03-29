package com.timp.test.BRE.Estruturas.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.CalculoDeTributosFiltrosAbansadosPO;
import com.sap.timp.pageObjectModel.BRE.Estruturas.ParametrosGerais.EstruturasFiltrosAvan�adosLimpaFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EstruturasFiltrosAvan�adosLimpaFiltros extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	EstruturasFiltrosAvan�adosLimpaFiltrosPO  estruturasFiltrosAvan�adosLimpaFiltrosPO;
	
	
  @BeforeClass
  public void beforeClass() {
	  	driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		estruturasFiltrosAvan�adosLimpaFiltrosPO  = new EstruturasFiltrosAvan�adosLimpaFiltrosPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
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
	public void Filtro() {
		
		ArrayList<Boolean> estructura = estruturasFiltrosAvan�adosLimpaFiltrosPO.Estructura();
		
		for (int i = 0; i < estructura.size(); i++) {
			assertTrue(estructura.get(i), Filtros);
		}
		

	}

}
