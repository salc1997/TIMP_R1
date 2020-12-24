package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura.RegradeReaberturaDetallesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegraDeReaberturaDetalle extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RegradeReaberturaDetallesPO regradeReaberturaDetallesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		regradeReaberturaDetallesPO = new RegradeReaberturaDetallesPO();

	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2 )
	public void detalle() {
		
		ArrayList<Boolean> sucesso = regradeReaberturaDetallesPO.Detalle();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
