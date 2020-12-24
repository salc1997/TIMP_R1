package com.timp.test.MDR.TabelasApoioESocial.Tabela14;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SequenciaAcesso.SequenciaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela13.ParteDoCorpoAtingidaEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AgenteCausadorDeAcidenteExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AgenteCausadorDeAcidenteExcluirPO agenteCausadorDeAcidenteExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		agenteCausadorDeAcidenteExcluirPO = new AgenteCausadorDeAcidenteExcluirPO();
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
	public void excluir() {

		boolean sucesso = agenteCausadorDeAcidenteExcluirPO.excluir();

		assertTrue(sucesso, Editar);

	}

}
