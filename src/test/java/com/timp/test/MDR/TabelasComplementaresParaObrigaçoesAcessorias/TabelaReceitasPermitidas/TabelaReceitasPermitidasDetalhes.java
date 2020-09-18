package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas.TabelaCodigoReceitasDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasDetalhesPO;

public class TabelaReceitasPermitidasDetalhes extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasPermitidasDetalhesPO tabelaReceitasPermitidasDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasPermitidasDetalhesPO = new TabelaReceitasPermitidasDetalhesPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void Detalhes() {

		ArrayList<Boolean> sucesso = tabelaReceitasPermitidasDetalhesPO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), Detalhes);
			
		}
	}		
	
 
}
