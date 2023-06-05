
package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoExcluirPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoFiltrosAvancadosPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoVisualizarPO;

public class ConfiguracaoDeTipoTributotodasFunc extends TestBase {
	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTipoTributoCriarPO configuracaoDeTipoTributoCriarPO;
	ConfiguracaoDeTipoTributoEditarPO configuracaoDeTipoTributoEditarPO;
	ConfiguracaoDeTipoTributoFiltrosAvancadosPO configuracaoDeTipoTributoFiltrosAvancadosPO;
	ConfiguracaoDeTipoTributoExcluirPO configuracaoDeTipoTributoExcluirPO;
	ConfiguracaoDeTipoTributoVisualizarPO configuracaoDeTipoTributoVisualizarPO ;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTipoTributoCriarPO = new ConfiguracaoDeTipoTributoCriarPO();
	  configuracaoDeTipoTributoEditarPO = new ConfiguracaoDeTipoTributoEditarPO();
	  configuracaoDeTipoTributoFiltrosAvancadosPO = new ConfiguracaoDeTipoTributoFiltrosAvancadosPO();
	  configuracaoDeTipoTributoExcluirPO = new ConfiguracaoDeTipoTributoExcluirPO();
	  configuracaoDeTipoTributoVisualizarPO = new ConfiguracaoDeTipoTributoVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }

  
	
	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTipoTributoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}
	
	@Test(priority = 1)
	public void editar() {

		boolean sucesso = configuracaoDeTipoTributoEditarPO.editar();

		assertTrue(sucesso, Editar);	
		sleep(2000);

	}
	@Test(priority = 2)
	public void filtro() {
		

		ArrayList<Boolean> sucesso = configuracaoDeTipoTributoFiltrosAvancadosPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		sleep(2000);

	}	
	@Test(priority = 3)
	public void Visualizar() {
		ArrayList<Boolean> sucesso = configuracaoDeTipoTributoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}		
		sleep(2000);

	}	
	
	@Test(priority = 4)
	public void excluir() {
		
		boolean sucesso = configuracaoDeTipoTributoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}
 
}

