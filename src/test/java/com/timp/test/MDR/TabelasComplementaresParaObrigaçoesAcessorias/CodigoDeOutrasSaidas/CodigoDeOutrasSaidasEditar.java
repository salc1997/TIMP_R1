package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasEditarPO;

public class CodigoDeOutrasSaidasEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeOutrasSaidasEditarPO codigoDeOutrasSaidasEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeOutrasSaidasEditarPO = new CodigoDeOutrasSaidasEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeOutrasSaidasEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
