package com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.*;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosFiltroIdPO;

public class S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroID extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroIdPO ssAcidenteDeTrabalhoFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ssAcidenteDeTrabalhoFiltroIdPO = new S2210ComunicaçãoDeAcidenteDeTrabalhoFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtro() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = ssAcidenteDeTrabalhoFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);
	}
}
