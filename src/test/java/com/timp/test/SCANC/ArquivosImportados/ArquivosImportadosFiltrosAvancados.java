package com.timp.test.SCANC.ArquivosImportados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.ArquivosImportados.ArquivosImportadosFiltrosAvancadosPO;

public class ArquivosImportadosFiltrosAvancados extends TestBase {
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	ArquivosImportadosFiltrosAvancadosPO arquivosImportadosFiltrosAvancadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		arquivosImportadosFiltrosAvancadosPO = new ArquivosImportadosFiltrosAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void filtrosAvancados() {
		loginTC.login();
		acessarSCANCPO.acessarSCANC();
		ArrayList<Boolean> sucesso = arquivosImportadosFiltrosAvancadosPO.filtrosAvanzados();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}

	
}
