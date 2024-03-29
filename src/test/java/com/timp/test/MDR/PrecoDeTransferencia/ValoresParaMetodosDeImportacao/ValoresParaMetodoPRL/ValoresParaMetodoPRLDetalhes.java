package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLDetalhesPO;

public class ValoresParaMetodoPRLDetalhes extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoPRLDetalhesPO valoresParaMetodoPRLDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoPRLDetalhesPO = new ValoresParaMetodoPRLDetalhesPO();
	}
	
	 @AfterClass public void afterClass(){ driver.close(); }

	@Test()
	public void Detalhes() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = valoresParaMetodoPRLDetalhesPO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), Detalhes);
			
		}
	}		
	
	
}
