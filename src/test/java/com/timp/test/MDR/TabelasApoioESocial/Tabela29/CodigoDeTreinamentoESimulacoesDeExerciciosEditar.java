package com.timp.test.MDR.TabelasApoioESocial.Tabela29;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosEditarPO;

public class CodigoDeTreinamentoESimulacoesDeExerciciosEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeTreinamentoESimulacoesDeExerciciosEditarPO codigoDeTreinamentoESimulacoesDeExerciciosEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeTreinamentoESimulacoesDeExerciciosEditarPO = new CodigoDeTreinamentoESimulacoesDeExerciciosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigoDeTreinamentoESimulacoesDeExerciciosEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
