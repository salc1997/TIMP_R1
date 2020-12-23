package com.timp.test.DFG.SPED.ESOCIAL.Eventos.S1210PagamentosDeRendimentosDoTrabalho;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESOCIAL.Eventos.S1210PagamentosDeRendimentosDoTrabalho.FuncionalidadesPO;

public class Funcionalidades extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	FuncionalidadesPO funcionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		funcionalidadesPO = new FuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void dfgEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criarNovoEvento() {
		boolean sucesso = funcionalidadesPO.criarNovoEvento();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void informacao() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 4)
	public void editar() {
		boolean sucesso = funcionalidadesPO.editar();
		assertTrue(sucesso, Editar);
	}
	
	@Test(priority = 5)
	public void visualizar() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 6)
	public void execucao() {
		funcionalidadesPO.execucao();
	}
	
	@Test(priority = 7)
	public void gravar() {
		boolean sucesso = funcionalidadesPO.gravar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 8)
	public void atualizarEstructuras() {
		boolean sucesso = funcionalidadesPO.atualizarEstructuras();
		assertTrue(sucesso, Editar);
	}
	
	@Test(priority = 9)
	public void visualizarCriarAN3() {
		boolean sucesso = funcionalidadesPO.visualizarCriarAN3();
		assertTrue(sucesso, visualizaçar);
	}
	
	@Test(priority = 10)
	public void visualizarActualizacoes() {
		boolean sucesso = funcionalidadesPO.visualizarActualizacoes();
		assertTrue(sucesso, visualizaçar);
	}
	
	@Test(priority = 11)
	public void gravarAN3() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.gravarAN3();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 12)
	public void informacao2() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.informacao2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 13)
	public void enviarSeleccionado() {
		boolean sucesso = funcionalidadesPO.enviarSeleccionado();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 14)
	public void enviarPendencias() {
		boolean sucesso = funcionalidadesPO.enviarPendencias();
		assertTrue(sucesso, Criar);
	}
}
