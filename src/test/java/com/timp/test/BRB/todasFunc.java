package com.timp.test.BRB;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.text.html.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.NovoRelatorioPO;
import com.sap.timp.pageObjectModel.BRB.TodasFuncPO;

public class todasFunc extends TestBaseSteven {

	LoginTC loginTc;
	AcessarBrbPO accesarBrbPO;
	TodasFuncPO todasFuncPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTc = new LoginTC();
		accesarBrbPO = new AcessarBrbPO();
		todasFuncPO = new TodasFuncPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority=0)
	public void novoRelatorio() {
		
		loginTc.login();
		
		accesarBrbPO.acessar();
		sleep(4000);

		boolean sucesso = todasFuncPO.criar();
		sleep(4000);
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
	@Test(priority = 1)
	public void adicionarColunas() {
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = todasFuncPO.colunas();
		System.out.println(sucesso + "Colunas");
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The Colunms weren't added");
		}
		sleep(2000);
	}
	
	/*@Test(priority = 2)
	public void publicoYPRivado() {
	


		boolean publicoEditor = todasFuncPO.publicoEditor();
		System.out.println(publicoEditor);
		assertTrue(publicoEditor, compartilharE);

		boolean privadoEditor = todasFuncPO.privadoEditor();
		System.out.println(privadoEditor);
		assertTrue(privadoEditor, descompartilharE);

		boolean publicoBiblioteca = todasFuncPO.publicoBiblioteca();
		System.out.println(publicoBiblioteca);
		assertTrue(publicoBiblioteca, compartilharB);

		boolean privadoBiblioteca = todasFuncPO.privadoBiblioteca();
		System.out.println(privadoBiblioteca);
		assertTrue(privadoBiblioteca, descompartilharB);

	}
	@Test(priority = 3)
	public void excluirColunaDragNDrop() {
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = todasFuncPO.DragNDrop();
		System.out.println(sucesso + "Drag N Drop");
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), deletarColuna);
		}

	}
	
	@Test(priority = 4)
	public void excluirColunaOpcao() {		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();		
		sucesso = todasFuncPO.ExcluirColuna();
		System.out.println(sucesso + "Coluna");		
		for (int i = 0; i < sucesso.size(); i++) {			
		assertTrue(sucesso.get(i), "The element wasn't removed");		
		}

	}*/
	
	@Test(priority = 5)
	public void editar() {
		

		boolean sucesso = false;
		sucesso = todasFuncPO.editar();
		System.out.println(sucesso);
		assertTrue(sucesso, editado);

	}
}
