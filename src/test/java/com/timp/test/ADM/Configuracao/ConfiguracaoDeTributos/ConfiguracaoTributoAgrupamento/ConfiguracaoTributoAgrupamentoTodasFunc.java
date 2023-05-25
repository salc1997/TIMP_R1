package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoTodasFuncPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentoTodasFunc extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentoTodasFuncPO configuracaoTributoAgrupamentoTodasFuncPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoTributoAgrupamentoTodasFuncPO = new ConfiguracaoTributoAgrupamentoTodasFuncPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test(priority = 0)
	public void criar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoTributoAgrupamentoTodasFuncPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
	@Test(priority = 1)
	public void Editar() {

		boolean sucesso = configuracaoTributoAgrupamentoTodasFuncPO.editar();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}
	
	@Test(priority = 2)
	public void visualizar() {

		
		ArrayList<Boolean> sucesso = configuracaoTributoAgrupamentoTodasFuncPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		
		sleep(2000);
	}
	
	@Test(priority = 3)
	public void filtros() {


		boolean sucesso = configuracaoTributoAgrupamentoTodasFuncPO.filtro();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

	@Test(priority = 4)
	public void Excluir() {

		boolean sucesso = configuracaoTributoAgrupamentoTodasFuncPO.excluir();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}
}
