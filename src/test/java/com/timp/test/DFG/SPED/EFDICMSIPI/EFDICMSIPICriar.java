package com.timp.test.DFG.SPED.EFDICMSIPI;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO;
import com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI.EFDICMSIPICriarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriarPO;
import com.timp.test.DFG.AcessarDFG;


public class EFDICMSIPICriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	EFDICMSIPICriarPO eFDICMSIPIpCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		eFDICMSIPIpCriarPO = new EFDICMSIPICriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = eFDICMSIPIpCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		boolean sucesso2 = eFDICMSIPIpCriarPO.BRE();
		assertTrue(sucesso2, Criar);
		
		eFDICMSIPIpCriarPO.DFG();
		
		
		

	}
	
	@Test(priority = 3)
	public void editar() {
		
		//boolean sucesso = eFDICMSIPIpCriarPO.editarDFG();
		
		//assertTrue(sucesso, Editar);
		

	}
	
	@Test(priority = 4)
	public void informacoes() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 5)
	public void blocoApuracao() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.blocoApuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	
}
