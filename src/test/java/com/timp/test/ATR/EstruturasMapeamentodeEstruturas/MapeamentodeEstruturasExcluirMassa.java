package com.timp.test.ATR.EstruturasMapeamentodeEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.EstruturasMapeamentodeEstruturas.MapeamentodeEstruturasExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class MapeamentodeEstruturasExcluirMassa extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentodeEstruturasExcluirMassaPO mapeamentodeEstruturasExcluirMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		  driver = initializationC();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentodeEstruturasExcluirMassaPO = new MapeamentodeEstruturasExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		 // driver.close();
	}
	
	@Test(priority = 0)
	public void ingresar() {
		  loginTC.login();
	}
	
	@Test(priority = 1)
	public void mdrEntrar() {
		boolean sucesso = acessarATRPO.acessarATR();
	
	}
	
	@Test(priority = 2)
	public void excluirMasaMotivosDesligamento() {
		
		
		ArrayList<Boolean> sucesso = mapeamentodeEstruturasExcluirMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
		boolean sucesso2 = mapeamentodeEstruturasExcluirMassaPO.excluirMasaMotivosDesligamento();
		assertTrue(sucesso2, Eliminado);
		
	}

}
