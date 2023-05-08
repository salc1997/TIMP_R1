package com.timp.test.BRE.Estruturas.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.Estruturas.ParametrosGerais.EstruturasCriarMaisEditarMaisVisualizarPO;
import com.sap.timp.pageObjectModel.BRE.Estruturas.ParametrosGerais.EstruturasTodasFuncPO;

public class EstruturasTodasFunc extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	EstruturasTodasFuncPO estruturasTodasFuncPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		estruturasTodasFuncPO = new EstruturasTodasFuncPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority =0)
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = estruturasTodasFuncPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}		
		
		sleep(1000);
	}
	

	
	@Test(priority = 1)
	public void excluir() {
		
		ArrayList<Boolean> sucesso = estruturasTodasFuncPO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}		
		
		sleep(1000);
	}
	
	@Test(priority = 2)
	public void Filtro() {
		
		
		ArrayList<Boolean> estructura = estruturasTodasFuncPO.Estructura();
		
		for (int i = 0; i < estructura.size(); i++) {
			assertTrue(estructura.get(i), Filtros);
		}
		sleep(1000);

	}
}
