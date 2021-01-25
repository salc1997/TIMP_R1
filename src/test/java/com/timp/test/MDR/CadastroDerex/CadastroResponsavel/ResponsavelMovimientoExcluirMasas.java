package com.timp.test.MDR.CadastroDerex.CadastroResponsavel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimientoExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ResponsavelMovimientoExcluirMasas extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ResponsavelMovimientoExcluirMasasPO responsavelMovimientoExcluirMasasPO;

  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		responsavelMovimientoExcluirMasasPO = new ResponsavelMovimientoExcluirMasasPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {
		
		
		boolean sucesso =responsavelMovimientoExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);
		

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = responsavelMovimientoExcluirMasasPO.ResponsavelMovimientoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}


}
