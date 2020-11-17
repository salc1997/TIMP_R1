package com.timp.test.MDR.CadastroCondiçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondiçao.CadastroCondiçaoDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class cadastrocondicaoDetalle extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CadastroCondiçaoDetallePO cadastroCondiçaoDetallePO;
  
  @BeforeClass
  public void beforeClass() {
	driver = initializationM();
	loginTC = new LoginTC();
	accesarMDRPO = new AcessarMDRPO();
	cadastroCondiçaoDetallePO = new CadastroCondiçaoDetallePO();
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
		
		
		ArrayList<Boolean> sucesso = cadastroCondiçaoDetallePO.Detalle();
		
		for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
