package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesLixeiraPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.Execu��esExecu��esP�blicasLixeiraemMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Execu��esExecu��esP�blicasLixeiraemMassa extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	Execu��esExecu��esP�blicasLixeiraemMassaPO execu��esExecu��esP�blicasLixeiraemMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execu��esExecu��esP�blicasLixeiraemMassaPO = new Execu��esExecu��esP�blicasLixeiraemMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarTDK() {
		acessarTDKPO.acessarTDK();
	}
	
	@Test(priority = 2)
	public void criar() {
		boolean sucesso = execu��esExecu��esP�blicasLixeiraemMassaPO.criar();
		assertTrue(sucesso,Criar);
		
	}
	
	@Test(priority = 3)
	public void lixeira() {
		boolean sucesso = execu��esExecu��esP�blicasLixeiraemMassaPO.lixeira();
		assertTrue(sucesso,"N�o foi poss�vel ir para Lixeira");
		
	}
	
	@Test(priority = 4)
	public void lixeiraDefinitiva() {
		boolean sucesso = execu��esExecu��esP�blicasLixeiraemMassaPO.lixeiraDefinitiva();
		assertTrue(sucesso,"N�o foi poss�vel ir para Lixeira");
		
	}
	
	@Test(priority = 5)
	public void lixeiraExecucao() {
		boolean sucesso = execu��esExecu��esP�blicasLixeiraemMassaPO.lixeiraExecucao();
		assertTrue(sucesso,"N�o foi poss�vel ir para Lixeira");
		
	}
	

}
