package com.timp.test.MDR.TabelasApoioESocial.Tabela01;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela01.CategoriaDeTrabalhadorDetalhesPO;

public class CategoriaDeTrabalhadoresDetalhes extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CategoriaDeTrabalhadorDetalhesPO categoriaDeTrabalhadorDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		categoriaDeTrabalhadorDetalhesPO = new CategoriaDeTrabalhadorDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhe() {
		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = categoriaDeTrabalhadorDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
