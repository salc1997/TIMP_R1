package com.timp.test.MDR.TaxasDeActualizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizarExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AliquotaDeTaxaDeActualizacaoExcluir extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AliquotaDeTaxaDeActualizarExcluirPO aliquotaDeTaxaDeActualizarExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		aliquotaDeTaxaDeActualizarExcluirPO = new AliquotaDeTaxaDeActualizarExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		
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
	public void excluirr() {

		boolean sucesso = aliquotaDeTaxaDeActualizarExcluirPO.excluir();

		assertTrue(sucesso, Editar);

	}


}