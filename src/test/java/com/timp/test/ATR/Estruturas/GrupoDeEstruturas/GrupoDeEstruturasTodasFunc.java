package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasDetalhesPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasEditarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasExcluirPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasFiltroPorIDPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasVerPO;


public class GrupoDeEstruturasTodasFunc extends TestBase{
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasCriarPO grupoDeEstruturasCriarPO;
	GrupoDeEstruturasEditarPO grupoDeEstruturasEditarPO;
	GrupoDeEstruturasDetalhesPO grupoDeEstruturasDetalhesPO;
	GrupoDeEstruturasVerPO grupoDeEstruturasVerPO;
	GrupoDeEstruturasFiltroPorIDPO grupoDeEstruturasFiltroPorIDPO;
	GrupoDeEstruturasExcluirPO grupoDeEstruturasExcluirPO;
	GrupoDeEstruturasExcluirEmMassaPO grupoDeEstruturasExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasCriarPO = new GrupoDeEstruturasCriarPO();
		grupoDeEstruturasEditarPO  = new GrupoDeEstruturasEditarPO();
		grupoDeEstruturasDetalhesPO = new  GrupoDeEstruturasDetalhesPO();
		grupoDeEstruturasVerPO = new  GrupoDeEstruturasVerPO();
		grupoDeEstruturasFiltroPorIDPO = new  GrupoDeEstruturasFiltroPorIDPO();
		grupoDeEstruturasExcluirPO = new  GrupoDeEstruturasExcluirPO();
		grupoDeEstruturasExcluirEmMassaPO = new GrupoDeEstruturasExcluirEmMassaPO();
	}


	@AfterClass
	public void afterClass() {
	  driver.close();
	}


	@Test(priority = 0)
	public void criar() {

		loginTC.login();

		acessarATRPO.acessarATR();

		boolean sucesso = grupoDeEstruturasCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(3000);

	}
	@Test(priority = 1)
	public void Editar() {

		ArrayList<Boolean> sucesso = grupoDeEstruturasEditarPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);

		}
		sleep(2000);

	}
	
	@Test(priority = 2)
	  public void detalhes() {

		  ArrayList<Boolean> sucesso = grupoDeEstruturasDetalhesPO.detalhes();
		  for (int i = 0; i < sucesso.size(); i++) {
			  assertTrue(sucesso.get(i), Detalhes);

		  }

		  sleep(6000);
	  }
	
	@Test(priority = 3)
	public void filtro() {


		ArrayList<Boolean> sucesso = grupoDeEstruturasFiltroPorIDPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

		sleep(2000);

	}
	
	@Test(priority = 4)
	public void visualizar() {

		ArrayList<Boolean> sucesso = grupoDeEstruturasVerPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);

		}

		sleep(2000);
	}
	
	
	@Test(priority = 5)
	public void excluir() {


		boolean sucesso = grupoDeEstruturasExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

		sleep(2000);
	}
	
	@Test(priority = 6)
	public void criarMassa() {
		
		boolean sucesso = grupoDeEstruturasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
	
	@Test(dependsOnMethods = "criarMassa" )
	public void excluirMassa() {
		
		
		sleep(1000);
		boolean sucesso2 = grupoDeEstruturasExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);

	}
}
