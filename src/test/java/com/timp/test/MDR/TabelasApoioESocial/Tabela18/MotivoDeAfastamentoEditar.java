package com.timp.test.MDR.TabelasApoioESocial.Tabela18;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoEditarPO;

import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.AfterClass;

public class MotivoDeAfastamentoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivoDeAfastamentoEditarPO motivoDeAfastamentoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		motivoDeAfastamentoEditarPO = new MotivoDeAfastamentoEditarPO();
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
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void editar() {

		boolean sucesso = motivoDeAfastamentoEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
