package com.sap.timp.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBaseParalelo2 extends TestBaseSteven{
	
	//TC2
	protected String tc2 = "http://as1-100-01-tc2:8000/timp/login/#/login";
	//TD1
	protected String td1 = "http://as1-100-01-td1:8000/timp/login/#/login";
	
	protected String tq1 = "http://as1-100-01-tq1:8000/timp/login/#/login";

	protected String tp1 = "http://as1-100-01-tp1:8000/timp/login/#/login";

	public WebDriver initializationL() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(td1);
		
		return driver;

	}
	
	public void sleep(int miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	//BRB
		public String elementosDiferentes = "Os elementos n�o s�o iguais";
		public String comentariosInativos = "Os coment�rios n�o foram ativados";
		public String correc�oInativa = "A corre��o n�o foi ativada";
		public String semAcesso = "N�o foi possivel aceder ao aplicativo";
		public String semCampoOutput = "O campo output n�o foi adicionado";
		public String comentarioN�oValido = "Os coment�rios n�o foram os ingresados";
		public String crescenteEDecrescente = "Os resultados n�o est�o em uma ordem v�lida";
		public String copiaNaoCriada = "A c�pia n�o foi criada com sucesso";
		public String editado = "O relat�rio n�o foi modificado com sucesso";
		public String eliminar = "O elemento n�o foi deletado";
		public String deletarColuna = "A coluna n�o foi deletada";
		public String exporta��o = "A exporta��o n�o foi realizada com sucesso";
		public String filtros = "Os resultados do filtro n�o s�o iguais";
		public String aplica��oFiltros = "Os filtros n�o foram aplicados com sucesso";
		public String formata��o = "A formata��o n�o foi aplicada";
		public String excluirVariante = "A variante n�o foi excluida";
		public String salvarVariante = "A variante n�o foi salvada com sucesso";
		public String formula = "Os valores n�o s�o iguais";
		public String gruposAvan = "Os resultados n�o s�o iguais";
		public String gruposAvanDif = "Os resultados n�o s�o diferentes";
		public String gruposAvanDel = "Os grupos n�o foram deletados";
		public String ListaSuspensa = "Os coment�rios n�o foram inseridos";
		public String novoRelatorio = "O novo relat�rio n�o foi criado";
		public String colunas = "As colunas n�o foram inseridas";
		public String paginaSeguiente = "N�o se conseguiu avan�ar para a p�gina seguiente";
		public String paginaAnterior = "N�o se conseguiu avan�ar para a p�gina anterior";
		public String paginaFinal = "N�o se conseguiu avan�ar para a �ltima p�gina";
		public String paginaInicial = "N�o se conseguiu avan�ar para a p�gina inicial";
		public String paginaInserida = "N�o foi possiv�l ava�ar para a p�gina inserida";
		public String visualiza�ar = "O modo visualiza��o n�o est� ativado";
		public String compartilharE = "N�o foi possiv�l compartilhar o relat�rio desde o editor";
		public String descompartilharE = "N�o foi possiv�l descompartilhar o relat�rio desde o editor";
		public String compartilharB = "N�o foi possiv�l compartilhar o relat�rio desde a biblioteca";
		public String descompartilharB = "N�o foi possiv�l compartilhar o relat�rio desde a biblioteca";
		public String renomear = "A coluna n�o foi renomeada com sucesso";
		public String reordenar = "A coluna n�o foi reordenada com sucesso";
		
		//MDR
		public String Editar = "O valor do campo n�o foi editado";
		public String EmpresaVisualizar = "N�o foi possiv�l visalizar o registro";
		public String Filtros = "Os resultados n�o s�o acorde aos filtros";
		public String Criar = "O registro n�o foi criado com sucesso";
		public String Eliminado = "O registro n�o foi eliminado com sucesso";
		
	
}
