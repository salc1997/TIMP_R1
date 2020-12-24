package com.sap.timp.pageObjectModel.DFG.Leiautes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class LeiautesExecuçãoFuncionalidadesPO extends TestBaseCristhian{
	
	

	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-gooddoc padding-right \"]")
	public WebElement sped;
	
	@FindBy(xpath = "//span[text()=\"E-SOCIAL\"]")
	public WebElement ESocial;
	
	@FindBy(xpath = "//span[text()=\"Eventos\"]")
	public WebElement Evento;
	
	@FindBy(xpath = "//span[text()=\"S1200 Remuneração do Trabalhador Vinculado ao Regime Geral de Prev. Social\"]")
	public WebElement S1200;
	
	@FindBy(xpath = "//span[text()=\"Excluir Dados do Evento\"]")
	public WebElement ExcluirDadosEvento;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[5]/ul/li[2]/div/span[2]")
	public WebElement blocosApuracao;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement R1070;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Insert\"]")
	public WebElement R1070Insert;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"libraryview\"]/div/div[2]/div/div[1]")
	public WebElement antes;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//textarea[@id=\"textarea-id\"]")
	public WebElement descripcion;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar o Tipo de Leiaute\"]")
	public WebElement leiauteInput;
	
	@FindBy(xpath = "//li[text()=\"ALTER E-SOCIAL S1200\"]")
	public WebElement leiauteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Grupo do Estrutura\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcGrupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de arquivo\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//*[@id=\"18\"]/div[1]/label/span")
	public WebElement opcEstrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Versão do Leiaute\"]")
	public WebElement versacao;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
	public WebElement filialOpc;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresaV;
	
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div[1]")
	public WebElement nomeI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement descricaoI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div[1]")
	public WebElement tipoI;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Estado\"]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement estadoOpc;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Time-and-Date icon-calendar\"]")
	public WebElement calendar;
	
	@FindBy(xpath = "//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]")
	public WebElement atrasCalendar;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement calendar2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement calendarEnero;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement calendar1M;
	
	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/label/span")
	public WebElement movimiento;
	
	@FindBy(xpath = "//*[@id=\"settings-execute\"]/button/span[2]")
	public WebElement executa;
	
	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement AEstrutura;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement AN3;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Arquivo\"]")
	public WebElement AN3nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Regras\"]")
	public WebElement AN3regras;
	
	@FindBy(xpath = "//div[@id=\"2364\"]/div/label/span")
	public WebElement AN3regrasOpc;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[text()=\"DFG\"]")
	public WebElement dfg;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]")
	public WebElement mostrar;
	
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-layout padding-right \"]")
	public WebElement leiautess;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[3]/div[1]")
	public WebElement arquivosRaiz;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div[3]/span")
	public WebElement arquivosO;
	
	@FindBy(xpath = "//*[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[4]/div[2]/label/span")
	public WebElement flagEnviar;
	
	@FindBy(xpath = "//span[text()=\"Enviar selecionado\"]")
	public WebElement enviarSeleccionado;
	
	@FindBy(xpath = "//span[text()=\"Enviar pendências\"]")
	public WebElement enviarPendencias;
	

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	public LeiautesExecuçãoFuncionalidadesPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(3000);
		leiautess.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		arquivosRaiz.click();
		sleep(3000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		System.out.println(rows);
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id antes da criação do registro (Raiz): " + ultimoIdAC);

		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado QA Cristhian");
		sleep(1000);
		
		descripcion.sendKeys("Descipcion Teste Automatizado QA");
		sleep(2000);
		
		leiauteInput.click();
		sleep(2000);
		leiauteOpc.click();
		sleep(2000);
		
		grupo.click();
		sleep(2000);
		opcGrupo.click();
		sleep(1000);
		
		estrutura.click();
		sleep(2000);
		opcEstrutura.click();
		sleep(2000);
		opcEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versacao.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		antes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id após da criação do registro: " + ultimoIdDC);
		idInserir2(ultimoIdDC);

		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
		
		System.out.println(idObter2());
		System.out.println(idObter3());
		
		
		
	
		System.out.println(sucesso);
		
		driver.navigate().refresh();
		return sucesso;
	}
	
	

}
