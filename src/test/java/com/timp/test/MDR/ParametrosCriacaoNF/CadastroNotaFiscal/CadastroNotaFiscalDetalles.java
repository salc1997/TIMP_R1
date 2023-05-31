package com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalDetallesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CadastroNotaFiscalDetalles  extends TestBase{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO; 
	CadastroNotaFiscalDetallesPO cadastroNotaFiscalDetallesPO;
 
  @BeforeClass
  public void beforeClass() {
	 driver = initialization();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	cadastroNotaFiscalDetallesPO = new CadastroNotaFiscalDetallesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void Detalles() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = cadastroNotaFiscalDetallesPO.Detalles();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}
}
