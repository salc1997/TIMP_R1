package com.timp.test.ADM.Usuarios.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosEditarPO;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.Usu�riosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuariosVisualizar extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Usu�riosVisualizarPO usu�riosVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usu�riosVisualizarPO = new Usu�riosVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	@Test
	public void ver() {
		
		loginTC.login();
		
		acessarADMPO.acessarADM();

		ArrayList<Boolean> sucesso = usu�riosVisualizarPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}


}