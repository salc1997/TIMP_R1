package com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.*;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrabalhoFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho.S2210Comunica��oDeAcidenteDeTrabalhoFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosFiltroIdPO;

public class S1060AmbientesDeTrabalhoFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1060AmbientesDeTrabalhoFiltroIdPO s1060AmbientesDeTrabalhoFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1060AmbientesDeTrabalhoFiltroIdPO = new S1060AmbientesDeTrabalhoFiltroIdPO();
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

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void filtro() {

		boolean sucesso = s1060AmbientesDeTrabalhoFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);
	}
}