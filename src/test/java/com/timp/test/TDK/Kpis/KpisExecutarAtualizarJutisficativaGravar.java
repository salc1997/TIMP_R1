package com.timp.test.TDK.Kpis;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisExecutarAtualizarJutisficativaGravarPO;

public class KpisExecutarAtualizarJutisficativaGravar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisExecutarAtualizarJutisficativaGravarPO kpisExecutarAtualizarJutisficativaGravarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisExecutarAtualizarJutisficativaGravarPO = new KpisExecutarAtualizarJutisficativaGravarPO();
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
	public void executar() {
		ArrayList<Boolean> sucesso = kpisExecutarAtualizarJutisficativaGravarPO.executar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),"Cart�o n�o foi adicionado");
		}
		
		
	}
	
}