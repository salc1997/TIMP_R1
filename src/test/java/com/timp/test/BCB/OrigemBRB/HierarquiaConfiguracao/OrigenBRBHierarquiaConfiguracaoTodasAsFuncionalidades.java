package com.timp.test.BCB.OrigemBRB.HierarquiaConfiguracao;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.OrigemBFB.HierarquiaConfiguracao.OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.OrigemBRB.HierarquiaConfiguracao.OrigenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class OrigenBRBHierarquiaConfiguracaoTodasAsFuncionalidades extends TestBase{
	//TSTNG-1238
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	OrigenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO = new OrigenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}

/*	@Test(priority = 2)
	public void criarConfiguracaoExecucoes() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierarquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 3)
	public void criarConfiguracionConfiguracao() {
		sleep(2000);
		boolean sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracionConfiguracao();
		assertTrue(sucesso, Criar);	
	}
	
	@Test(priority = 4)	
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracao();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}*/
	
	@Test(priority = 4)	
	public void Ingresar() {
		origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.ingresarDeUnSolo();
	}


	/*@Test(priority = 5)	
	public void bRBcomFiltroBCBcomFiltro() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.BRBcomFiltroBCBcomFiltro();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
		
	@Test(priority = 6)	
	public void subNivel2() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subPeriodoAcumulado();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}	*/
	
	@Test(priority = 7)	
	public void subNivel3() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subPeriodoAnterior();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 8)	
	public void subNivel4() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.filtroData();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}

	@Test(priority = 9)	
	public void subNivel5() {
		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.campoDeLinha();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 10)	
	public void subNivel6() {

		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.ordenarCrescente();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}
	
	@Test(priority = 11)	
	public void subNivel7() {

		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.ordenarDecrescente();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}
	@Test(priority = 12)	
	public void subNivel8() {

		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.agrupamentoSemFiltro();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}
	@Test(priority = 13)	
	public void subNivel9() {

		ArrayList<Boolean> sucesso = origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subAgrupamentoSemFiltro();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}
	/*
	@Test(priority = 14)
	public void executar() {
		origenBRBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.executar();
	}
	
	/*
	@Test(priority = 15)	
	public void abrirSubnivel2() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 16)	
	public void abrirSubnivel3() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubNivel3();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 17)	
	public void abrirSubnivel4() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubNivel4();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 18)	
	public void abrirSubnivel5() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	/*@Test(priority = 19)
	public void excluirConfiguracoes() {
		
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirConfiguracoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 20)
	public void excluirHierarquia() {
		
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirHierarquia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}*/


}
