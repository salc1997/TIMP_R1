package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquiaEditarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaEditar extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaEditarPO parametrosGeraisHierarquiaEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	loginTC = new LoginTC();
	acessarBCBPO = new AcessarBCBPO();
	parametrosGeraisHierarquiaEditarPO = new ParametrosGeraisHierarquiaEditarPO();
  }

  @AfterClass
  public void afterClass() {
  }

  @Test(priority = 0)
  public void login() {
	loginTC.login();
  }
	
	
  @Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}
  
  @Test(priority = 2)
  public void editar() {

	boolean sucesso = parametrosGeraisHierarquiaEditarPO.editar();

	assertTrue(sucesso, Editar);

  }

}
