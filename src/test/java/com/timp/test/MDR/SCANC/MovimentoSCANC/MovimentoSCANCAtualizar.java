package com.timp.test.MDR.SCANC.MovimentoSCANC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCAtualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class MovimentoSCANCAtualizar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MovimentoSCANCAtualizarPO movimentoSCANCAtualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		movimentoSCANCAtualizarPO = new MovimentoSCANCAtualizarPO();
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
	public void atualizar() {

		ArrayList<Boolean> sucesso = movimentoSCANCAtualizarPO.atualizar();

		assertTrue(sucesso.get(0), Atualizar);
		System.out.println(sucesso.get(0));
		assertTrue(sucesso.get(1), Atualizar);
		System.out.println(sucesso.get(1));

	}

}
