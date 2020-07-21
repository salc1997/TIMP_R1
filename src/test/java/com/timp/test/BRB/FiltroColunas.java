package com.timp.test.BRB;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRD.FiltroColunasPO;

public class FiltroColunas extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FiltroColunasPO filtroColunasPO;


    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		filtroColunasPO = new FiltroColunasPO();
		
    }
    
    @AfterClass
	public void afterClass(){
		driver.close();
	}
    
    @Test(priority = 0)
	public void login() {

		loginTC.login();

	}
	
	
	@Test(priority= 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();
			
	}
	
	@Test(priority= 2)
	public void filtroConFerramenta1() {
	
		boolean sucesso = false;
		sucesso = filtroColunasPO.filtroFerramenta();
		
		assertTrue(sucesso, aplicaçãoFiltros);
		
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		sucesso2 = filtroColunasPO.aplicar();
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), filtros);
		}
		
		
	}
	
	@Test(priority = 3)
	public void filtroConFerramenta2() {
		
		boolean sucesso = false;
		sucesso = filtroColunasPO.filtroFerramenta2();
		
		assertTrue(sucesso, filtros);
		
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		sucesso2 = filtroColunasPO.aplicar2();
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), filtros);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
