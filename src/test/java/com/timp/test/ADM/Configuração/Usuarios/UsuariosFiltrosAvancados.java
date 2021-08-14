package com.timp.test.ADM.Configuração.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios.UsuariosFiltrosAvacadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuariosFiltrosAvancados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	UsuariosFiltrosAvacadosPO usuariosFiltrosAvacadosPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuariosFiltrosAvacadosPO = new UsuariosFiltrosAvacadosPO();
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
	public void AcessarADM() {

		acessarADMPO.acessarADM();
		
	}
	@Test(priority = 2)
	public void filtros() {

		// codigoTipoCreditoFiltrosAvançadosPO.filtros();

		ArrayList<Boolean> sucesso = usuariosFiltrosAvacadosPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}
}
