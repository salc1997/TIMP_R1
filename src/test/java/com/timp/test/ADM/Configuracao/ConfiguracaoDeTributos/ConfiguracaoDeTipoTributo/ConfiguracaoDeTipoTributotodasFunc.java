
package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoTodasFuncPO;

public class ConfiguracaoDeTipoTributotodasFunc extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTipoTributoTodasFuncPO configuracaoDeTipoTributoTodasFuncPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTipoTributoTodasFuncPO = new ConfiguracaoDeTipoTributoTodasFuncPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  
	
	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTipoTributoTodasFuncPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}
	
	@Test(priority = 1)
	public void editar() {

		boolean sucesso = configuracaoDeTipoTributoTodasFuncPO.editar();

		assertTrue(sucesso, Editar);	
		sleep(2000);

	}
	@Test(priority = 2)
	public void filtro() {
		

		ArrayList<Boolean> sucesso = configuracaoDeTipoTributoTodasFuncPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		sleep(2000);

	}	
	@Test(priority = 3)
	public void Visualizar() {
		ArrayList<Boolean> sucesso = configuracaoDeTipoTributoTodasFuncPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}		
		sleep(2000);

	}	
	
	@Test(priority = 4)
	public void excluir() {
		
		boolean sucesso = configuracaoDeTipoTributoTodasFuncPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}
 
}

