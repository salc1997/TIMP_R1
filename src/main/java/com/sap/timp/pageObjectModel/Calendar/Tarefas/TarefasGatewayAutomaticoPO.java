package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TarefasGatewayAutomaticoPO  extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Processo de neg�cio\"]")
	public WebElement procesoNegocio;

	@FindBy(xpath = "//span[text()=\"Processos de Negocio\"]")
	public WebElement procesos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	//NUEVO PROCESO DE NEGOCIO
	@FindBy(xpath = "//span[text()=\"Novo Processo\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"processName-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[contains(@class,\"rdProcessPeriodicity\")]/label/span")
	public WebElement tipoProceso;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//div[text()=\"Ponto de In�cio\"]")
	public WebElement inicio;
	@FindBy(xpath = "//li[contains(@class,\"end-point\")]")
	public WebElement fin;
	@FindBy(xpath = "//div[text()=\"Opera��o\"]")
	public WebElement operacao;
	
	@FindBy(xpath = "//div[text()=\"Nova Opera��o\"][2]")
	public WebElement NovoOperacao;
	@FindBy(xpath = "//li[contains(@class,\"activity\")]")
	public WebElement actividad;
	@FindBy(xpath = "//div[text()=\"Nova Atividade\"][2]")
	public WebElement NovoActividad;
	@FindBy(xpath = "//div[text()=\"Autom�tico\"]")
	public WebElement automatico;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[10]/*/*")
	public WebElement editarAutomatico;
	
	@FindBy(xpath = "//div[@id=\"createGatewayDialog\"]/div/div[1]/div[1]/div[2]/div/div/input")
	public WebElement nomeAutomatico;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*/*/*/div[2]")
	public WebElement nomeTarefa1;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[9]")
	public WebElement puntoAutomatico;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[1]/*/*[5]")
	public WebElement puntoInicio;
	
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[5]")
	public WebElement puntoAutomatico2;
	
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[3]/*/*[3]")
	public WebElement puntoFin;
	
	
	//*********Gravar forma****************
		@FindBy(xpath = "//span[text()=\"Gravar\"]")
		public WebElement gravar;
		
		@FindBy(xpath = "//button[text()=\"N�o\"]")
		public WebElement nao;
		
		@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
		public WebElement biblioteca;

	//*********Ativador de Procesos**********
		@FindBy(xpath = "//li[1]/div/span[text()=\"Ativador de Processos\"]")
		public WebElement ativadorProcesos;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
		public WebElement primeira;
		
		//NUEVO ATIVADOR DE PROCESO
		@FindBy(xpath = "//span[text()=\"Nova Configura��o de Processo\"]")
		public WebElement novoActivador;
			
		@FindBy(xpath = "//div[contains(@id,\"activator-search\")]/div/div/input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		
		@FindBy(xpath = "//button[text()=\"Pr�ximo\"]")
		public WebElement proximo;
		
		@FindBy(xpath = "//input[@placeholder=\"Clique para selecionar Dias\"]")
		public WebElement diasSelect; 
		@FindBy(xpath = "//li[text()=\"Dias Corridos\"]")
		public WebElement opcdiasSelect; 
		
		@FindBy(xpath = "//button[@id=\"selectPeriodicity\"]")
		public WebElement periodicidad; 
		
		@FindBy(xpath = "//tr[@class=\"days-tr\"][2]/td[2]/div/div/div/input")
		public WebElement diasInicio; 
		
		@FindBy(xpath = "//input[@placeholder=\"Clique para selecionar Periodicidade\"]")
		public WebElement iniciarCuando; 
		@FindBy(xpath = "//li[text()=\"100 - Aberto\"]")
		public WebElement opcIniciarCuando; 
		
		
		@FindBy(xpath = "//input[@placeholder=\"Filtrar por ID\"]")
		public WebElement filtrarId;
		
		
		@FindBy(xpath = "//button[text()=\"Confirmar\"]")
		public WebElement confirmar;
		
		@FindBy(xpath = "//div[@id=\"user-process-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar2;
		
		@FindBy(xpath = "//div[@id=\"user-operation-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisarOperacao;
		
		@FindBy(xpath = "//div[@id=\"user-activity-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisarActividade;
		
		@FindBy(xpath = "//*[@id=\"user-process-list\"]/div[70]/div[2]/div[1]")
		public WebElement usuario;
		
		//despues de aplicar
		@FindBy(xpath = "//div[@id=\"user-process-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
		public WebElement usuarioProceso;
		
		@FindBy(xpath = "//span[text()=\"Ativar\"]")
		public WebElement ativar;
		
		
		//para utilizar despues de pesquisar
		@FindBy(xpath = "//div[@id=\"user-operation-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
		public WebElement usuarioOperacao;
		
		@FindBy(xpath = "//div[@id=\"user-activity-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
		public WebElement usuarioActividade;
		
		@FindBy(xpath = "//*[@id=\"home-icon\"]")
		public WebElement menu;
		
		//************** IR TFP ****************
	
		
		@FindBy(xpath = "//span[@class=\"title-boxes \" and text()=\"Per�odos\"]")
		public WebElement periodos;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-period\"]")
		public WebElement periodosMenu;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisarTFP;
		
		@FindBy(xpath = "//button[text()=\"Fechar\"]")
		public WebElement fecharSub;
		
		//*******************Calendar************
		
		@FindBy(xpath = "//span[contains(@class,\"closeButton\")]")
		public WebElement fecharPanel;
		
		@FindBy(xpath = "//span[text()=\"Abrir Calend�rio\"]")
		public WebElement abrirCalendario;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisarBPMA;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement sim;
		
		
		
		
	
	public TarefasGatewayAutomaticoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarProceso() {
	String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		//NO ESTA TERMINADO, FAVOR DE NO EJECUTAR
		
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Ultimo Id Creado "+id); 
		sleep(2000);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL VASQUEZ");
		sleep(2000);
		
		String txtnombre = nome.getText();
		System.out.println(txtnombre);
		sleep(4000);
		
		tipoProceso.click();
		sleep(2000);
		
		criar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(operacao, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		//OPERACAO
		dobleClickElement(NovoOperacao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(actividad, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		
		//ACTIVIDAD
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(inicio, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(automatico, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		editarAutomatico.click();
		sleep(2000);
		
		nomeAutomatico.sendKeys("Gateway autom�tico");
		sleep(2000);
		
		String txtnomeAutomatico = nomeAutomatico.getText();
		System.out.println(txtnomeAutomatico);
		sleep(4000);
		
		aplicar.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoInicio, puntoAutomatico);
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoAutomatico2, puntoFin);
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("ID CREADO PROCESO NEGOCIO: "+idB);
		
		idInserir("idProcesoNegocio",idB);
		
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado � realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso.add(true); 
		}else { 
			sucesso.add(false); 
		}
		
		String nomeProceso = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[6]/div")).getText();
		
		System.out.println("Nombre de Proceso: "+nomeProceso); 
		sleep(2000);
		
		sucesso.add(nomeProceso.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL"));
		
		System.out.println(sucesso); 
		
		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//********Obtener 1 de la primera Linea
		String idAtivadorProcesos = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println(idAtivadorProcesos); 
		
		
		sleep(2000);
		
		novoActivador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idB);
		WebElement idPesquisado = driver.findElement(By.xpath("//div[contains(@data-id,"+idB+")]/div[contains(@class,\"checkbox\")]/label/span"));
		
		idPesquisado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		proximo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(diasSelect);
		sleep(3000);
		
		
		diasSelect.click();
		sleep(2000);
		opcdiasSelect.click();
		sleep(2000);
		
		diasInicio.sendKeys(diaActual());
		sleep(2000);
		
		iniciarCuando.click();
		sleep(2000);
		opcIniciarCuando.click();
		sleep(2000);
		
		periodicidad.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idFiltro = "";
		if(tp1 == true) {
			idFiltro = "131";
			filtrarId.sendKeys("131");
			sleep(2000);
			filtrarId.sendKeys(Keys.ENTER);
			sleep(3000);
		}else if(tq1 == true) {
			idFiltro  = "702";
			filtrarId.sendKeys("702");
			sleep(2000);
			filtrarId.sendKeys(Keys.ENTER);
			sleep(3000);
		}else {
			idFiltro = "74";
			filtrarId.sendKeys("74");
			sleep(2000);
			filtrarId.sendKeys(Keys.ENTER);
			sleep(3000);
		}
		
		sleep(2000);
		WebElement resultFiltrado = driver.findElement(By.xpath("//div[@data-id="+idFiltro+"]/div[contains(@class,\"checkbox\")]/label/span"));
		sleep(2000);
		resultFiltrado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		confirmar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		proximo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		aplicar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(usuarioProceso);
		sleep(4000);

		pesquisar2.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
			
			//*********** ----------halar USUARIO---------- ***********
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioProceso, driver.findElement(By.xpath("//span[text()=\"Usu�rio de reabertura\"]")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioProceso, driver.findElement(By.xpath("//span[text()=\"Usu�rio de aprova��o\"]")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioProceso, driver.findElement(By.xpath("//div[@id=\"user-process-droppable\"]/div/div/div/div/div")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
			//***************************
			dobleClickElement(NovoOperacao);
			sleep(4000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			pesquisarOperacao.sendKeys("TESTEAUTOMATIZADO");
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioOperacao, driver.findElement(By.xpath("//div[@id=\"user-operation-droppable\"]/div/div/div/div/div")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			//*********************
			dobleClickElement(NovoActividad);
			sleep(4000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(5000);
			
			pesquisarActividade.sendKeys("TESTEAUTOMATIZADO");
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioActividade, driver.findElement(By.xpath("//div[@id=\"user-activity-droppable\"]/div/div/div/div/div")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			ativar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			waitExpectElement(ativadorProcesos);
			sleep(6000);
			
			ativadorProcesos.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			primeira.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			String idAtivadorProcesosNuevo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
			System.out.println( idAtivadorProcesosNuevo); 
			
			double idDD = Integer.valueOf(idAtivadorProcesos); 
			double idBDD = Integer.valueOf(idAtivadorProcesosNuevo);
			  
			//compara pra ver se o novo id criado � realmente o ultimo
			  
			if (idBDD > idDD) { 
				sucesso.add(true); 
			}else { 
				sucesso.add(false); 
			}

			String nomeAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[6]/div")).getText();
			String procesoNegocioAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[8]/div")).getText();
			String periodoAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[9]/div")).getText();

			System.out.println("Nombre Ativador: "+nomeAtivadorProcesos2); 
			System.out.println("Proceso Negocio: "+procesoNegocioAtivadorProcesos2); 
			System.out.println("Periodo: "+periodoAtivadorProcesos2);
			sleep(2000);
			
			
			sucesso.add(nomeAtivadorProcesos2.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL "));
			sucesso.add(procesoNegocioAtivadorProcesos2.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL"));
			sucesso.add(periodoAtivadorProcesos2.contains("Per�odo Fiscal"));
		
			sleep(2000);
			menu.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			System.out.println(sucesso);
			return sucesso;	
	}
	
	public ArrayList<Boolean> irTFP() {
		
		System.out.println("---------- TFP ---------");
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		periodosMenu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idFiltroTFP = "";
		if(tp1 == true) {
			idFiltroTFP = "22661";
			pesquisarTFP.sendKeys("22661");
			sleep(2000);
			pesquisarTFP.sendKeys(Keys.ENTER);
			sleep(2000);
		}else if(tq1 == true) {
			idFiltroTFP  = "144617";
			pesquisarTFP.sendKeys("144617");
			sleep(2000);
			pesquisarTFP.sendKeys(Keys.ENTER);
			sleep(2000);
		}else {
			idFiltroTFP = "22076";
			pesquisarTFP.sendKeys("22076");
			sleep(2000);
			pesquisarTFP.sendKeys(Keys.ENTER);
			sleep(2000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf = driver.findElement(By.xpath("//div[@data-id="+idFiltroTFP+"]/div[1]/div"));
		WebElement subperiodoFiscais = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltroTFP + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subper�odos Fiscais\"]"));

		menuFiltradoTpf.click();
		sleep(2000);
		subperiodoFiscais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idFiltroTFPSubperiodoFiscais = "";
		if(tp1 == true) {
			idFiltroTFPSubperiodoFiscais = "11913";
			sleep(2000);
		}else if(tq1 == true) {
			idFiltroTFPSubperiodoFiscais  = "5092";
			sleep(2000);
		}else {
			idFiltroTFPSubperiodoFiscais = "392";
			sleep(2000);
		}
		
		sleep(2000);
		WebElement menuFiltradoTpf2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento1 = driver.findElement(
				By.xpath("//div[contains(@data-id,\"" + idFiltroTFPSubperiodoFiscais + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pr�-Fechamento\"]"));
		
		sleep(2000);
		menuFiltradoTpf2.click();
		sleep(2000);
		preFechamento1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensagem = driver.findElements(By.xpath("//span[contains(text(),\"O status foi alterado com sucesso\")]")).size();
		System.out.println(mensagem);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensagem > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		sleep(2000);
		WebElement menuFiltradoTpf3 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento2 = driver.findElement(
				By.xpath("//div[contains(@data-id,\""+idFiltroTFPSubperiodoFiscais+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
		
		
		sleep(2000);
		menuFiltradoTpf3.click();
		sleep(2000);
		preFechamento2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mensagem = driver.findElements(By.xpath("//span[contains(text(),\"O status foi alterado com sucesso\")]")).size();
		System.out.println(mensagem);
		
		
		sucesso = new ArrayList<Boolean>();
		
		if (mensagem > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		fecharSub.click();
		
		sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		return sucesso;		
		
	}
	
	
	public  ArrayList<Boolean> irCalendario() {
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		System.out.println("----------CALENDARIO ---------");
		sleep(2000);
		fecharPanel.click();
		sleep(2000);
		
		abrirCalendario.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"day\"][1]");
		sleep(2000);
		
		String diaTarefa = diaActual();
		
		System.out.println("Dia creada Tarefa: "+diaTarefa);
		WebElement diaTarefaCalendario = driver.findElement(
				By.xpath("//div[@class=\"dates-wrapper\"]/div[@date=\""+diaTarefa+"\"][1]"));
		

		diaTarefaCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		pesquisarBPMA.click();
		sleep(2000);
		
		pesquisarBPMA.sendKeys("Gateway autom�tico");
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Ultimo Id Creado "+id); 
		sleep(2000);
		
		String nombre = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[4]/div")).getText();
		System.out.println("Nombre: "+ nombre); 
		sleep(2000);
		
		String status = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Status: "+ status); 
		sleep(2000);
		
		String nombreProceso = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[21]/div")).getText();
		System.out.println("Nombre Proceso: "+ nombreProceso); 
		sleep(2000);
		
		sucesso.add(nombre.contains("Gateway autom�tico"));
		sucesso.add(status.contains("Concluida"));
		sucesso.add(nombreProceso.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL"));
		
		
		/*sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		
		System.out.println(sucesso);
		return sucesso;		
	}
	
}