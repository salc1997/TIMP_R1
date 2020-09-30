package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIDetalhesPO;

public class CodigoDeAjusteDaApura�aoDoIPIDetalhes extends TestBaseEliel {
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApura�aoDoIPIDetalhesPO codigoDeAjusteDaApura�aoDoIPIDetalhesPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApura�aoDoIPIDetalhesPO = new CodigoDeAjusteDaApura�aoDoIPIDetalhesPO();
	}
	
	@AfterClass public void afterClass(){ driver.close(); }

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

		ArrayList<Boolean> sucesso = codigoDeAjusteDaApura�aoDoIPIDetalhesPO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), Detalhes);
			
		}
	}		
	
	
	
	
	
}
