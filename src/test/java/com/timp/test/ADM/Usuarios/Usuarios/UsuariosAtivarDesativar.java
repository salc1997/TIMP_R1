package com.timp.test.ADM.Usuarios.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosAtivarDesativarPO;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuariosAtivarDesativar extends TestBase {
	LoginTC  loginTC;
	AcessarADMPO  acessarADMPO;
	UsuariosAtivarDesativarPO usuáriosAtivarDesativarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuáriosAtivarDesativarPO = new UsuariosAtivarDesativarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
	@Test
	public void ver() {
		loginTC.login();
		acessarADMPO.acessarADM();
		ArrayList<Boolean>  sucesso = usuáriosAtivarDesativarPO.ativar();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}
		sleep(2000);
	}

}
