package com.timp.test.DFG.Leiautes.Execucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao.LeiautesExecucacoFuncionalidades4Pt4PO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao.LeiautesExecucacoFuncionalidades4Pt5PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LeiautesExecucacoFuncionalidades4Pt5 extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucacoFuncionalidades4Pt5PO leiautesExecucacoFuncionalidades4Pt5PO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucacoFuncionalidades4Pt5PO = new LeiautesExecucacoFuncionalidades4Pt5PO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();
	}
	
	@Test(priority = 2)
	public void sequenciaDeItemPorDocumento() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt5PO.sequenciaDeItemPorDocumento();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
		boolean sucesso2 =leiautesExecucacoFuncionalidades4Pt5PO.criar();
		
		boolean sucesso3 =leiautesExecucacoFuncionalidades4Pt5PO.Executar();
	}

}
