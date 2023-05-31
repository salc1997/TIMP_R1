package com.timp.test.ADM.Configuração.Usuarios;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosEditarPO;

public class UsuariosEditar extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	UsuariosEditarPO usuariosEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuariosEditarPO = new UsuariosEditarPO();
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
	public void Editar() {

		
		boolean sucesso = usuariosEditarPO.editar();
		assertTrue(sucesso, Editar);

		
	}
}
