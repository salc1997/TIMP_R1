package com.timp.test.TBD.ArmazenagemDeArquivos.ArmazenarArquivo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.ArmazenarArquivo.ArmazenarArquivoFiltroPorIDPO;

public class ArmazenarArquivoFiltroPorID extends TestBase {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	ArmazenarArquivoFiltroPorIDPO armazenarArquivoFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		armazenarArquivoFiltroPorIDPO = new ArmazenarArquivoFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtro() {
		
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = armazenarArquivoFiltroPorIDPO.filtro();
		assertTrue(sucesso, Filtros);
		sleep(3000);
	}

}
