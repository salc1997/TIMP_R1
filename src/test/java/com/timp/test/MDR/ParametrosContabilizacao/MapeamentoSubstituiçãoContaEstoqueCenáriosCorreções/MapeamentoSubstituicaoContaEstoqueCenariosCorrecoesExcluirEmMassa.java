package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassa extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test(priority = 1)
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
	
}
