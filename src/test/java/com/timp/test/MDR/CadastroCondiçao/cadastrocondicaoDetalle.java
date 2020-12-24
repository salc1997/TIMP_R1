package com.timp.test.MDR.CadastroCondi�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondi�ao.CadastroCondi�aoDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class cadastrocondicaoDetalle extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CadastroCondi�aoDetallePO cadastroCondi�aoDetallePO;
  
  @BeforeClass
  public void beforeClass() {
	driver = initializationM();
	loginTC = new LoginTC();
	accesarMDRPO = new AcessarMDRPO();
	cadastroCondi�aoDetallePO = new CadastroCondi�aoDetallePO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2 )
	public void detalle() {
		
		
		ArrayList<Boolean> sucesso = cadastroCondi�aoDetallePO.Detalle();
		
		for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
