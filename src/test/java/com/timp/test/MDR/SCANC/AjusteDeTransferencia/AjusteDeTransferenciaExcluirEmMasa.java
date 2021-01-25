package com.timp.test.MDR.SCANC.AjusteDeTransferencia;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.AjustesDeTransferencia.AjustesDeTransferenciaExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.AjustesDosAnexos.AjustesDosAnexosExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidoraExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjusteDeTransferenciaExcluirEmMasa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	AjustesDeTransferenciaExcluirEmMassaPO ajustesDeTransferenciaExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		  driver = initialization();
		  loginTC = new LoginTC();
		  accesarMDR = new AcessarMDRPO();
		  ajustesDeTransferenciaExcluirEmMassaPO = new AjustesDeTransferenciaExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//  driver.close();
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
		
		
		boolean sucesso = ajustesDeTransferenciaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = ajustesDeTransferenciaExcluirEmMassaPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);
		
	}

}
