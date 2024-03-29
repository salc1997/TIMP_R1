package com.timp.test.MDR.TabelasApoioESocial.Tabela26;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SequenciaAcesso.SequenciaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class MotivosCesBeneficiosCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivosCesBeneficiosCriarPO motivosCesBeneficiosCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		motivosCesBeneficiosCriarPO = new MotivosCesBeneficiosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = motivosCesBeneficiosCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
