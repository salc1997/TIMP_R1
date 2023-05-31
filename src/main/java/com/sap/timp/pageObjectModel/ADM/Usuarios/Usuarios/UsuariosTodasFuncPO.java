package com.sap.timp.pageObjectModel.ADM.Usuarios.Usuarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class UsuariosTodasFuncPO extends TestBase {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[4]")
	public WebElement usuarios;
	
	@FindBy(xpath = "//span[text()=\"Usuários\"]")
	public WebElement subUsuarios;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributo X Tributo Grupo\"]")
	public WebElement ConfiguraçãodeTributosXTributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Cargo do Usuário\"]")
	public WebElement cargo;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[2]/span/span")
	public WebElement next;
	
	@FindBy(xpath = "//*[@id=\"search-input\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]/span[2]")
	public WebElement limparFiltros;
	
	
	// filtros
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Criação\"]")
	public WebElement usuarioCriacao;
	
	@FindBy(xpath = "//div[@id=\"option-4\"]/div[1]/label/span")
	public WebElement opcUsuarioCriacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Modificação\"]")
	public WebElement usuarioModificacao;
	
	@FindBy(xpath = "//*[@id=\"option-5\"]/div[1]/label/span")
	public WebElement opcUsuarioModificacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]/div[1]/label/span")
	public WebElement opcStatus;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	private ArrayList<Boolean> sucesso;
	

	
	public UsuariosTodasFuncPO() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean ativar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		next.click();
		sleep(3000);
		
		usuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		subUsuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		pesquisar.sendKeys(Keys. ENTER);
		sleep(6000);

		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]/span[2]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao2 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]/span[2]"));
		
		menu.click();
		sleep(4000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);

		Boolean sucesso = true;
		
	
		return sucesso;
	}
	
	public ArrayList<Boolean> Visualizar() {

		limparFiltros.click();
		sleep(3000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		next.click();
		sleep(3000);
		
		usuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		subUsuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		pesquisar.sendKeys(Keys. ENTER);
		sleep(6000);
		
			
		String nombre = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[3]/div")).getText();
		String usuarioHana = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[4]/div")).getText();
		String dataCreacion = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[7]/div")).getText();
		
		System.out.println("---------------Informação no Biblioteca-----------------");
		System.out.println(nombre);
		System.out.println(usuarioHana);
		System.out.println(dataCreacion);

		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[1]/span[2]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String usuarioHanaV = driver.findElement(By.xpath("//*[@id=\"detail-description\"]/div[2]/div")).getText();
		
		
		System.out.println("---------------Informação na Detalhe-----------------");
		System.out.println(usuarioHanaV);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//sucesso.add(nombre.equals(nombreV));
		sucesso.add(usuarioHana.equals(usuarioHanaV));
		fechar.click();
		sleep(3000);
		
		return sucesso;
	}
	
	public boolean editar() {

		limparFiltros.click();
		sleep(3000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		next.click();
		sleep(3000);
		
		usuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		subUsuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		pesquisar.sendKeys(Keys. ENTER);
		sleep(7000);
		
	
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]/span[2]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String valorDescricao = "TESTER";
	
		
		cargo.clear();
		cargo.sendKeys(valorDescricao);
		sleep(1000);
		System.out.println(cargo);
		
		
		btnGravar.click();
		sleep(12000);
		int botaoNao = rows("//button[text()=\"Sim\"]");
		
		if (botaoNao > 0) {
			btnSim.click();
		}
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(19000);
		
		
		String valorDescricaoEditar = textContent(cargo);
		System.out.println(cargo);

		boolean sucesso = false;
		sucesso= valorDescricao.contains(valorDescricaoEditar);
		System.out.println(sucesso);
		btnBiblioteca.click();
		sleep(3000);
		return sucesso;
	}
	
	public ArrayList<Boolean> filtros() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		next.click();
		sleep(3000);
		
		usuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		subUsuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioCriacao.click();
		sleep(2000);	
		opcUsuarioCriacao.click();
		sleep(2000);
		usuarioCriacao.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		usuarioModificacao.click();
		sleep(2000);	
		opcUsuarioModificacao.click();
		sleep(2000);
		usuarioModificacao.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);	
		opcStatus.click();
		sleep(2000);
		status.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String icms = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			icms = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[3]/div")).getText();
			sucesso.add(data.get(0).equals(icms));
		}
		
		return sucesso;
	}	
	
	
		
}
