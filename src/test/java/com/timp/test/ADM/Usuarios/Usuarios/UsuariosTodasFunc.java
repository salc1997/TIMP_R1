package com.timp.test.ADM.Usuarios.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosAtivarDesativarPO;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosDetalhesPO;
import com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios.UsuariosTodasFuncPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuariosTodasFunc extends TestBaseSteven {
	LoginTC  loginTC;
	AcessarADMPO  acessarADMPO;
	UsuariosTodasFuncPO usuariosTodasFuncPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuariosTodasFuncPO = new UsuariosTodasFuncPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
	@Test(priority = 0)
	public void activar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		Boolean sucesso = usuariosTodasFuncPO.ativar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}
	
	@Test(priority = 1)
	public void ver() {

		ArrayList<Boolean> sucesso = usuariosTodasFuncPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(2000);
	}
	
	@Test(priority = 2)
	public void Editar() {

		boolean sucesso = usuariosTodasFuncPO.editar();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}
	
	@Test(priority = 3)
	public void filtros() {

		ArrayList<Boolean> sucesso = usuariosTodasFuncPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}
		sleep(2000);
	}
	

}
