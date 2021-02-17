package com.timp.test.MDR.TabelasApoioESocial.Tabela26;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivosCesBeneficiosExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivosCesBeneficiosExcluirMassaPO motivosCesBeneficiosExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		motivosCesBeneficiosExcluirMassaPO = new MotivosCesBeneficiosExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test(priority = 1)
	public void criar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		boolean sucesso = motivosCesBeneficiosExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 2)
	public void excluirMassa() {
		boolean sucesso = motivosCesBeneficiosExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
