
package com.timp.test.ADM.Configuracao.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ManuaisDeComponente.ManuaisDeComponenteTodasFuncPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteTodasFunc extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteTodasFuncPO manuaisDeComponenteTodasFuncPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteTodasFuncPO = new ManuaisDeComponenteTodasFuncPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = manuaisDeComponenteTodasFuncPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void editar() {

	
		boolean sucesso = manuaisDeComponenteTodasFuncPO.editar();

		assertTrue(sucesso, Editar);
		sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void detalle() {
	
		
		ArrayList<Boolean> sucesso = manuaisDeComponenteTodasFuncPO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
	@Test(priority = 3)
	public void Visualizar() {

		
		ArrayList<Boolean> sucesso = manuaisDeComponenteTodasFuncPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
	@Test(priority = 4)
	public void filtros() {
		

		ArrayList<Boolean> sucesso = manuaisDeComponenteTodasFuncPO.detalhes();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}
		sleep(2000);
	}
	
	@Test(priority = 5)
	public void Excluir() {

		boolean sucesso = manuaisDeComponenteTodasFuncPO.exluir();
		assertTrue(sucesso, eliminar);
		sleep(2000);
		
	}
}

