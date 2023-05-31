package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoTodasFuncPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoTodasFunc extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoTodasFuncPO configuracaodeTributoXTributoGrupoTodasFuncPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configuracaodeTributoXTributoGrupoTodasFuncPO = new ConfiguracaodeTributoXTributoGrupoTodasFuncPO();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
	
	@Test(priority=0)
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaodeTributoXTributoGrupoTodasFuncPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

		
	}
	
	@Test(priority = 1)
	public void Editar() {

		boolean sucesso = configuracaodeTributoXTributoGrupoTodasFuncPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);

		
	}
	
	@Test(priority = 2)
	public void visualizar() {
	
		ArrayList<Boolean> sucesso = configuracaodeTributoXTributoGrupoTodasFuncPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		
		sleep(2000);
	} 
	
	@Test(priority = 3)
	public void filtros() {
	
		boolean sucesso = configuracaodeTributoXTributoGrupoTodasFuncPO.filtro();

		assertTrue(sucesso, Eliminado);
		
		sleep(2000);

		
	}
	@Test(priority = 4)
	public void Excluir() {
	
		boolean sucesso = configuracaodeTributoXTributoGrupoTodasFuncPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}

}
