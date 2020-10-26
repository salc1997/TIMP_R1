package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoVisualizarPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class DescriçãoDeNatDeLesãoVisualizar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	DescriçãoDeNatDeLesãoVisualizarPO descriçãoDeNatDeLesãoVisualizarPO;

	public DescriçãoDeNatDeLesãoVisualizar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		descriçãoDeNatDeLesãoVisualizarPO = new DescriçãoDeNatDeLesãoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		acesarMDRPO.acessarMDR();
	}

	@Test(priority = 3)
	public void visualizar() {
		descriçãoDeNatDeLesãoVisualizarPO.visualizar();
	}
}
