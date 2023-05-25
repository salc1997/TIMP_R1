package com.timp.test.BRE.RegrasdeAuditoriaN1;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.RegrasDeAuditoriaN1TodasFuncPO;


public class RegrasDeAuditoriaN1TodasFunc extends TestBaseSteven {
	 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN1TodasFuncPO regrasDeAuditoriaN1TodasFuncPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN1TodasFuncPO = new RegrasDeAuditoriaN1TodasFuncPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1TodasFuncPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
		sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void criarCopia() {
	
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1TodasFuncPO.criarComCopia();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
		sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void Editar() {
	
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1TodasFuncPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		
		sleep(2000);
		
	}
 
	@Test(priority = 3)
	public void detalhes() {
		
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1TodasFuncPO.detalhes();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
		sleep(2000);
		
	}
	
	@Test(priority = 4)
	public void visualizar() {
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1TodasFuncPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		
		sleep(2000);
		
	}
	
	@Test(priority = 5)
	public void Estructura() {

		boolean sucesso = regrasDeAuditoriaN1TodasFuncPO.estructura();
		assertTrue(sucesso, Editar);
		sleep(2000);
		sleep(1000);

	}
}
