package com.timp.test.ATR.Estruturas.RelacionamentoEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RelacionamentoEstruturasExcluirEmMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasExcluirEmMassaPO relacionamentoEstruturasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		relacionamentoEstruturasExcluirEmMassaPO = new RelacionamentoEstruturasExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void ATREntrar() {
		acessarATRPO.acessarATR();
	}

	@Test(priority = 3)
	public void criarRelacionamento() {
		boolean sucesso = relacionamentoEstruturasExcluirEmMassaPO.criar();
		assertTrue(sucesso,Criar);
	}

	@Test(priority = 4)
	public void excluirMassa() {
		boolean sucesso = relacionamentoEstruturasExcluirEmMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
