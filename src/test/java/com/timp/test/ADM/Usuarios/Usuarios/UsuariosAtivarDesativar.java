package com.timp.test.ADM.Usuarios.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosAtivarDesativarPO;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuariosAtivarDesativar extends TestBaseSteven {
	LoginTC  loginTC;
	AcessarADMPO  acessarADMPO;
	UsuariosAtivarDesativarPO usu�riosAtivarDesativarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usu�riosAtivarDesativarPO = new UsuariosAtivarDesativarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
	@Test
	public void ver() {
		loginTC.login();
		acessarADMPO.acessarADM();
		Boolean sucesso = usu�riosAtivarDesativarPO.ativar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}

}
