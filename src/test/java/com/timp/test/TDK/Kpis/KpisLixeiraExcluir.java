package com.timp.test.TDK.Kpis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisLixeiraExcluirPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisLixeiraPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisLixeiraExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLixeiraExcluirPO kpisLixeiraExcluirPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLixeiraExcluirPO = new KpisLixeiraExcluirPO();
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
	public void lixeira() {
		boolean sucesso = kpisLixeiraExcluirPO.lixeira();
		assertTrue(sucesso,Eliminado);
		
		
		
	}

}
