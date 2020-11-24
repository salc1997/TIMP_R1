package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaCategoriaDeIRFExcluirEmMasa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ParametrosParaCategoriaDeIRFExcluirEmMasaPO parametrosParaCategoriaDeIRFExcluirEmMasaPO;
	
	@BeforeClass
	public void beforeClass() {
		  driver = initialization();
		  loginTC = new LoginTC();
		  accesarMDR = new AcessarMDRPO();
		  parametrosParaCategoriaDeIRFExcluirEmMasaPO = new ParametrosParaCategoriaDeIRFExcluirEmMasaPO();
	}

	@AfterClass
	public void afterClass() {
		  driver.close();
	}
	
	@Test(priority = 0)
	public void login() {
		  loginTC.login();
	}
	
	@Test(priority = 1)
	public void acessarMDR() {
		 accesarMDR.acessarMDR();
	
	}
	
	@Test(priority = 2)
	public void excluir() {
		
		
		boolean sucesso = parametrosParaCategoriaDeIRFExcluirEmMasaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = parametrosParaCategoriaDeIRFExcluirEmMasaPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);
		
	}

}
