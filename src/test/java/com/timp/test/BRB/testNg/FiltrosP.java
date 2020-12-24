package com.timp.test.BRB.testNg;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.prueba.*;
import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FiltrosP extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FiltrosAvanazadosPO filtrosAvanazadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		filtrosAvanazadosPO = new FiltrosAvanazadosPO();

	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test
	public void filtrosAvanzados() {

		ArrayList<String> datos = new ArrayList<String>();

		datos = (ArrayList<String>) filtrosAvanazadosPO.filtro();

		for (int i = 0; i < datos.size(); i++) {

			assertEquals(datos.get(i), "Relatório Dinâmico");
		}

	}

}
