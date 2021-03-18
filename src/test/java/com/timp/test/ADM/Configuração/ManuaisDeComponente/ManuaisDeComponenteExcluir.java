package com.timp.test.ADM.Configura��o.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ManuaisDeComponente.ManuaisDeComponenteCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ManuaisDeComponente.ManuaisDeComponenteExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteExcluirPO manuaisDeComponenteExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteExcluirPO = new ManuaisDeComponenteExcluirPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void AcessarADM() {

		acessarADMPO.acessarADM();
		
	}
	
	@Test(priority = 2)
	public void Excluir() {

		
		boolean sucesso = manuaisDeComponenteExcluirPO.exluir();
		assertTrue(sucesso, eliminar);

		
	}
}
