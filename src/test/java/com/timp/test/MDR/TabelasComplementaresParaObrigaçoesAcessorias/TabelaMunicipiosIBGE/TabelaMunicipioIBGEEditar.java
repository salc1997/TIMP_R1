package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradouroCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGECriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE.TabelaMunicipioIBGEEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosCriarPO;

public class TabelaMunicipioIBGEEditar extends TestBaseSteven {
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaMunicipioIBGEEditarPO tabelaMunicipioIBGEEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaMunicipioIBGEEditarPO = new TabelaMunicipioIBGEEditarPO();
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
	public void editar() {

		
		boolean sucesso = tabelaMunicipioIBGEEditarPO.editar();
		assertTrue(sucesso, Editar);
		
	}			
		
	
	
}
