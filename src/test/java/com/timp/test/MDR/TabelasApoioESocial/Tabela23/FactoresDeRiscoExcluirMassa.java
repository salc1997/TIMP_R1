package com.timp.test.MDR.TabelasApoioESocial.Tabela23;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FactoresDeRiscoExcluirMassa extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FactoresDeRiscoExcluirMassaPO factoresDeRiscoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		factoresDeRiscoExcluirMassaPO = new FactoresDeRiscoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
<<<<<<< HEAD
	public void ExcluirMassa() {
		
=======
	public void criar() {
>>>>>>> refs/remotes/origin/master

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = factoresDeRiscoExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
<<<<<<< HEAD
		
=======

		boolean sucesso2 = factoresDeRiscoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
>>>>>>> refs/remotes/origin/master
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = factoresDeRiscoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master

}
