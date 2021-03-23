package com.timp.test.ADM.Configura��o.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Usuarios.UsuariosEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Usuarios.Usu�riosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Usu�riosVisualizar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Usu�riosVisualizarPO usu�riosVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usu�riosVisualizarPO = new Usu�riosVisualizarPO();
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
	public void ver() {
		ArrayList<Boolean> sucesso = usu�riosVisualizarPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
	}


}
