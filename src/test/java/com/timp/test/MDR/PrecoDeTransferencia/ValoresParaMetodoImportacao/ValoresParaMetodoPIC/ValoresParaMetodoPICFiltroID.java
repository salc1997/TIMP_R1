package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodoImportacao.ValoresParaMetodoPIC;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLFiltroIDPO;

public class  ValoresParaMetodoPICFiltroID extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoPICFiltroIDPO valoresParaMetodoPICFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoPICFiltroIDPO = new ValoresParaMetodoPICFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		// driver.close();
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
	public void filtro() {

		ArrayList<Boolean> sucesso = valoresParaMetodoPICFiltroIDPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

	}
}
