package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasEditarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasTodosFuncPO;


public class GrupoDeEstruturasTodasFunc extends TestBaseSteven{
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasTodosFuncPO grupoDeEstruturasTodosFuncPO;
	GrupoDeEstruturasCriarPO grupoDeEstruturasCriarPO;
	GrupoDeEstruturasEditarPO grupoDeEstruturasEditarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasTodosFuncPO = new  GrupoDeEstruturasTodosFuncPO();
		grupoDeEstruturasCriarPO = new GrupoDeEstruturasCriarPO();
		grupoDeEstruturasEditarPO  = new GrupoDeEstruturasEditarPO();
		
	}


	@AfterClass
	public void afterClass() {
	  driver.close();
	}


	@Test(priority = 0)
	public void criar() {

		loginTC.login();

		acessarATRPO.acessarATR();

		boolean sucesso = grupoDeEstruturasTodosFuncPO .criar();
		assertTrue(sucesso, Criar);
		
		sleep(3000);

	}
	@Test(priority = 1)
	public void Editar() {

		ArrayList<Boolean> sucesso = grupoDeEstruturasTodosFuncPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);

		}
		sleep(2000);

	}
	
	@Test(priority = 2)
	  public void detalhes() {

		  ArrayList<Boolean> sucesso = grupoDeEstruturasTodosFuncPO.detalhes();
		  for (int i = 0; i < sucesso.size(); i++) {
			  assertTrue(sucesso.get(i), Detalhes);

		  }

		  sleep(2000);
	  }
	@Test(priority = 3)
	public void visualizar() {

		ArrayList<Boolean> sucesso = grupoDeEstruturasTodosFuncPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);

		}

		sleep(2000);
	}
	
	@Test(priority = 4)
	public void filtro() {


		ArrayList<Boolean> sucesso = grupoDeEstruturasTodosFuncPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

		sleep(2000);

	}
	
	@Test(priority = 5)
	public void excluir() {


		boolean sucesso = grupoDeEstruturasTodosFuncPO.excluir();
		assertTrue(sucesso, Eliminado);

		sleep(2000);
	}
	
	@Test(priority = 6)
	public void criarMassa() {
		
		boolean sucesso = grupoDeEstruturasTodosFuncPO.criarMassa();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
	
	@Test(dependsOnMethods = "criarMassa" )
	public void excluirMassa() {
		
		
		sleep(1000);
		boolean sucesso2 = grupoDeEstruturasTodosFuncPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);

	}
}
