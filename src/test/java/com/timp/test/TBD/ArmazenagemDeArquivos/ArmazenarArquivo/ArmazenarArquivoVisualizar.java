package com.timp.test.TBD.ArmazenagemDeArquivos.ArmazenarArquivo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.ArmazenarArquivo.ArmazenarArquivoVisualizarPO;

public class ArmazenarArquivoVisualizar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	ArmazenarArquivoVisualizarPO armazenarArquivoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		armazenarArquivoVisualizarPO = new ArmazenarArquivoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void TBDEntrar() {
		acessarTBDPO.acessarTBD();

	}

	@Test(priority = 1)
	public void visualizar() {

		ArrayList<Boolean> sucesso = armazenarArquivoVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}

}