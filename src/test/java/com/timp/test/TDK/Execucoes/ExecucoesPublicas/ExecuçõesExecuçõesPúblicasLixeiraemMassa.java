package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesLixeiraPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecuçõesExecuçõesPúblicasLixeiraemMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ExecuçõesExecuçõesPúblicasLixeiraemMassa extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecuçõesExecuçõesPúblicasLixeiraemMassaPO execuçõesExecuçõesPúblicasLixeiraemMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execuçõesExecuçõesPúblicasLixeiraemMassaPO = new ExecuçõesExecuçõesPúblicasLixeiraemMassaPO();
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
		boolean sucesso = execuçõesExecuçõesPúblicasLixeiraemMassaPO.criar();
		assertTrue(sucesso,Criar);
		
	}
	
	@Test(priority = 3)
	public void lixeira() {
		boolean sucesso = execuçõesExecuçõesPúblicasLixeiraemMassaPO.lixeira();
		assertTrue(sucesso,"Não foi possível ir para Lixeira");
		
	}
	
	@Test(priority = 4)
	public void lixeiraDefinitiva() {
		boolean sucesso = execuçõesExecuçõesPúblicasLixeiraemMassaPO.lixeiraDefinitiva();
		assertTrue(sucesso,"Não foi possível ir para Lixeira");
		
	}
	
	@Test(priority = 5)
	public void lixeiraExecucao() {
		boolean sucesso = execuçõesExecuçõesPúblicasLixeiraemMassaPO.lixeiraExecucao();
		assertTrue(sucesso,"Não foi possível ir para Lixeira");
		
	}
	

}
