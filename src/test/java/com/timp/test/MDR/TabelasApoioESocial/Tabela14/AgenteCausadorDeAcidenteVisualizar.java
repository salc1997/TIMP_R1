package com.timp.test.MDR.TabelasApoioESocial.Tabela14;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SequenciaAcesso.SequenciaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AgenteCausadorDeAcidenteVisualizar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AgenteCausadorDeAcidenteVisualizarPO agenteCausadorDeAcidenteVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		agenteCausadorDeAcidenteVisualizarPO = new AgenteCausadorDeAcidenteVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = agenteCausadorDeAcidenteVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}

	}

}
