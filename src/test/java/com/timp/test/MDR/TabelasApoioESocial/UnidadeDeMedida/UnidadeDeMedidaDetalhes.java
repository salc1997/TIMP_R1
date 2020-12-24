package com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UnidadeDeMedidaDetalhes extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	UnidadeDeMedidaDetalhesPO unidadeDeMedidaDetalhesPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  unidadeDeMedidaDetalhesPO = new UnidadeDeMedidaDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test(priority = 0)
  public void login() {
	  loginTC.login();
  }
  
  @Test(priority = 1)
  public void acessarMDR() {
	 accesarMDR.acessarMDR();

  }
  
  @Test(priority = 2)
  public void detalhes() {
	  ArrayList<Boolean> sucesso = unidadeDeMedidaDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
  }
}
