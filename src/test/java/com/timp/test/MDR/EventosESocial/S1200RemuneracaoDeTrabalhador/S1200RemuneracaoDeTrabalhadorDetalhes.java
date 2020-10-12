package com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorDetalhesPO;

public class S1200RemuneracaoDeTrabalhadorDetalhes extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1200RemuneracaoDeTrabalhadorDetalhesPO s1200RemuneracaoDeTrabalhadorDetalhesPO;

	@BeforeClass
	public void beforeClass() {
 
		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1200RemuneracaoDeTrabalhadorDetalhesPO = new S1200RemuneracaoDeTrabalhadorDetalhesPO();
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
	public void detalhes() {

		ArrayList<Boolean> sucesso = s1200RemuneracaoDeTrabalhadorDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}
	}

}
