package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oVisualizarPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class Descri��oDeNatDeLes�oVisualizar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Descri��oDeNatDeLes�oVisualizarPO descri��oDeNatDeLes�oVisualizarPO;

	public Descri��oDeNatDeLes�oVisualizar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		descri��oDeNatDeLes�oVisualizarPO = new Descri��oDeNatDeLes�oVisualizarPO();
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
		descri��oDeNatDeLes�oVisualizarPO.visualizar();
	}
}
