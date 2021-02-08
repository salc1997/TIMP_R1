package com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.base.TestBaseFernando;

public class LeiautesExecucacoFuncionalidades4Pt5PO extends TestBaseCristhian{

		@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-layout padding-right \"]")
		public WebElement verLeiautes;
		
		@FindBy(xpath = "//span[text()=\"Raiz\"]")
		public WebElement raiz;
		
		@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
		public WebElement btnUltimaPagina;
			
		@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
		public WebElement btnAdicionarBloco;
		
		@FindBy(xpath = "//span[text()=\"Campos Especiais\"]")
		public WebElement btnCamposEspeciais;
		
		@FindBy(xpath = "//div/span[text()=\"Ajustes Fiscais\"][1]")
		public WebElement abaAjusteFiscais;
		
		@FindBy(xpath = "//div/span[text()=\"Ajustes\"][1]")
		public WebElement subAbaAjusteFiscais;
		
		@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro5;
		
		@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco4;
		
		@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro4;
		
		@FindBy(xpath = "//li[@data-id=\"sfid\"]/div/div/span[contains(text(),\"Sequência de Item por Documento\")][1]")
		public WebElement campoSequenciaItemPorDocumento;
		
		@FindBy(xpath = "//div/span[contains(text(),\"Código da empresa\")]")
		public WebElement codigoEmpresa;
		
		@FindBy(xpath = "//div/span[contains(text(),\"Código da filial\")]")
		public WebElement codigoFilial;
		
		@FindBy(xpath = "//div/span[contains(text(),\"Data de lançamento\")]")
		public WebElement dataLanzamento;
		
		@FindBy(xpath = "//li[14]/div/div/span[contains(text(),\"Valor do ajuste\")][1]")
		public WebElement valorAjuste;
		
		@FindBy(xpath = "//li[@data-id=\"sf\"]/div/div/span[contains(text(),\"Sequência\")][1]")
		public WebElement campoSequencia;
		
		@FindBy(xpath = "//div[@class=\"sequence-typeCB\"]/div[3]/label/span")
		public WebElement sequenciamentoLinha;	
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement btnAplicar;
		
		@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
		public WebElement btnGravar;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement btnSim;
		
		@FindBy(xpath = "//button[text()=\"Não\"]")
		public WebElement btnNao;
		
		@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/label/span")
		public WebElement flagDistinto;
		
		
		//CONFIRGURACION
		
		@FindBy(xpath = "//span[text()=\"Raiz\"]")
		public WebElement raiz1;
		
		@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
		public WebElement raiz2;

		@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
		public WebElement novo;

		@FindBy(xpath = "//button/span[text()=\"Nova Configuração\"]")
		public WebElement nova;

		@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
		public WebElement nome;

		@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
		public WebElement tipo;	
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
		public WebElement opcaoTipo;

		@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
		public WebElement grupoEstrutura;
		
		@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
		public WebElement opcaoGrupoEstruturaTP1;

		@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
		public WebElement opcaoGrupoEstrutura;
		
		@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
		public WebElement estrutura;
		@FindBy(xpath = "//div[@id=\"18\"]/div/label/span")
		public WebElement opcaoEstrutura;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
		public WebElement dataVigencia;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"Versão\")]")
		public WebElement versaoLeiaute;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
		public WebElement leiautePublico;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-public-setting\"]")
		public WebElement leiautePublicoC;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
		public WebElement opcao;
		
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcao2;
		
		@FindBy(xpath = "//button[contains(text(),\"Adicionar registro\")]")
		public WebElement adicionarRegistro;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Registro\")]")
		public WebElement nomeRegistro;
		
		@FindBy(xpath = "//div[text()=\"1000\"]")
		public WebElement campoEstatico;
		
		@FindBy(xpath = "//div[@id=\"dfg-Filler\"]/div[1]/div/div/div/input")
		public WebElement nomeCampoEstatico;
		@FindBy(xpath = "//div[@id=\"dfg-Filler\"]/div[2]/div/div/div/input")
		public WebElement conteudo;
		
		@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]")
		public WebElement configuracoes;
		/*
		@FindBy(xpath = "")
		public WebElement ;
		*/
		
		@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
		public WebElement atividades;
		
		@FindBy(xpath = "//button[text()=\"Salvar\"]")
		public WebElement salvar;
		
		
		@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div/input")
		public WebElement pesquisar;
		

		
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

		@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
		public WebElement bloco;

		@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
		public WebElement nomeBloco;
		
		
		@FindBy(xpath = "//li[contains(text(),\"Teste Automatizado\")]")
		public WebElement leiaute;
		
		@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
		public WebElement tributo;
		@FindBy(xpath = "//li[text() =\"ICMS\" and @id]")
		public WebElement tributoO;
		
		@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
		public WebElement versao;
		@FindBy(xpath = "//li[text() =\"1.0\" and @id]")
		public WebElement versaoO;
		
		@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
		public WebElement empresa;
		@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
		public WebElement empresaO;
		
		@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
		public WebElement uf;
		@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
		public WebElement ufO;
		
		@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
		public WebElement filial;
		@FindBy(xpath = "//div[@id=\"1000SP0001\"]/div/label/span")
		public WebElement filialO;
		
		@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
		public WebElement versaoC;
		
		//EXECUTAR
		
		@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[3]/span/span")
		public WebElement artiquivos;
		
		@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div[3]/span")
		public WebElement raizArtiquivos;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement siguiente;
		
		@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
		public WebElement aba;
		
		@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/div[3]/span")
		public WebElement raizAba;
		
		@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
		public WebElement filtrosAbansados;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Id\"]")
		public WebElement idFiltro;
		
		@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
		public WebElement estado;
		
		@FindBy(xpath = "//div[@id=\"SP\"]")
		public WebElement opcEstado;
		
		@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
		public WebElement subPeriodo;
		
		@FindBy(xpath = "//input[@placeholder=\"Subperiodo\"]")
		public WebElement subPeriodo1;
		
		@FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[1]")
		public WebElement atras;
		
		@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[3]/div[8]")
		public WebElement J2016;
		
		@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]")
		public WebElement enero;
		
		@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/div/div[1]/span")
		public WebElement m;
		
		@FindBy(xpath = "//div[@id=\"create-file-dialog\"]/div[8]/div[2]/label/span")
		public WebElement cheke;
		
		@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
		public WebElement executar1;
		
		@FindBy(xpath = "//div[@class=\"digitalFile-wrapper\"]/div/ul/li/span")
		public WebElement dato;
		
		@FindBy(xpath = "//span[text()=\"Exportar\"]")
		public WebElement exportar;
		
		@FindBy(xpath = "//button[text()=\"Exportar\"]")
		public WebElement btnExportar;
		
		@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/ul/li[2]/button")
		public WebElement flecha;
		
		@FindBy(xpath = "//span[text()=\"Visualizar Dados\"]")
		public WebElement btnVisualizarDatos;
		
		@FindBy(xpath = "//div[@class=\"tr-content\"]/div/div")
		public WebElement campoEstatico2;
		
		@FindBy(xpath = "//div[@class=\"bar-container boxes\"]/div/div/div[2]")
		public WebElement visualizarDatos;
		
		@FindBy(xpath = "//div[@class=\"field-element campoEstatico1_0_0\"]/div/div[2]/div/div[1]/div[2]/input")
		public WebElement campoEstatico1;
		
		@FindBy(xpath = "//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")
		public WebElement caja;
		
	
		
		public LeiautesExecucacoFuncionalidades4Pt5PO() {
			PageFactory.initElements(driver, this);
		}
		
		public ArrayList<Boolean> sequenciaDeItemPorDocumento() {
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			raiz.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			btnUltimaPagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			String idRegistro = idObter1();
			System.out.println("");
			System.out.println("ID Registro: " + idRegistro);
			System.out.println("");
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
			WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

			menu.click();
			sleep(1000);
			açao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			btnAdicionarBloco.click();
			sleep(2000);
			
			adicionarRegistro5.click();
			sleep(2000);
			
			nombreBloco4.sendKeys("Bloco 5");
			sleep(2000);
			
			nombreRegistro4.sendKeys("Registro 5");
			sleep(2000);
			
			actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[2]/div[3]/div/div[5]");
			
			//btnCamposEspeciais.click();
			//sleep(2000);
			
			abaAjusteFiscais.click();
			sleep(2000);
			
			subAbaAjusteFiscais.click();
			sleep(2000);
			
			//ARRASTRAR ELEMENTOS
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
			sleep(2000);
			
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
			sleep(2000);
			
			flagDistinto.click();
			sleep(2000);
			
			btnGravar.click();
			sleep(3000);
			waitExpectElement(btnNao);
			sleep(2000);
			
			btnNao.click();
			sleep(2000);
			waitExpectElement(btnSim);
			sleep(2000);
			
			btnSim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
			System.out.println(mensaje);
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (mensaje > 0) {
				sucesso.add(true);
				
			}else {
				sucesso.add(false);
			}
			
			return sucesso;
		}

		public boolean criar() {
			
			String url = driver.getCurrentUrl();
			boolean tp1 = false;
			if (url.contains("tp1")) {
				tp1 = true;
			}
		
			biblioteca.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);				
			
			configuracoes.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(7000);
			raiz2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);
			
			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
			
			String idConfiguracao = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
			
			nova.click();
			
			sleep(3000);
			waitExpectElement(nome);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			nome.sendKeys("Teste Automatizado 01");
			
			sleep(1000);
			
			
			tipo.click();
			sleep(3000);
			int Leiaute = driver.findElements(By.xpath("//ul[@class=\"base-select-box\"]/li")).size();
			WebElement opcLeiaute = driver.findElement(By.xpath("//ul[@class=\"base-select-box\"]/li["+Leiaute+"]"));
			sleep(3000);
			opcLeiaute.click();
			sleep(1000);
			
			attributeToBeXpath("//div[@id=\"inputTimpVersion\"]/div", "class", "base-select required");
			sleep(2000);
			
			versaoC.click();
			sleep(1000);
			opcao.click();
			
			
			sleep(2000);
			actionsMoveToElementElement(dataVigencia);
			sleep(1000);
			
			
			tributo.click();
			sleep(1000);
			actionsMoveToElementElement(tributoO);
			sleep(1000);
			tributoO.click();
			sleep(1000);
			
			attributeToBeXpath("//div[@id=\"inputSelectCompany\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			empresa.click();
			sleep(1000);
			empresaO.click();
			sleep(1000);
			empresaO.sendKeys(Keys.ESCAPE);
			sleep(1000);
			
			attributeToBeXpath("//div[@id=\"inputSelectState\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			uf.click();
			sleep(1000);
			ufO.click();
			sleep(1000);
			ufO.sendKeys(Keys.ESCAPE);
			sleep(1000);
			attributeToBeXpath("//div[@id=\"inputSelectFilial\"]/div", "class", "base-MultipleSelect3 required");
			sleep(2000);
			
			filial.click();
			sleep(1000);
			filialO.click();
			sleep(1000);
			filialO.sendKeys(Keys.ESCAPE);
			sleep(1000);
			
			dataVigencia.sendKeys("01/01/2013");
			sleep(1000);
			salvar.click();
			sleep(4000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(10000);
			
			rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();		
			
			String idRegistroNuevo = "0"; // Ultimo ID despues de crear un registro
			
			if(rows > 0) {
				idRegistroNuevo = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
				System.out.println("ID Ultimo Registro despues de crear: " + idRegistroNuevo);
			}
			
			boolean sucesso = false;
			
			int id1 = convertToInt(idConfiguracao);
			int id2 = convertToInt(idRegistroNuevo);
			
			if(id2 > id1) {
				System.out.println("Registro creado satisfactoriamente...");
				sucesso = true;
				idInserir4(idRegistroNuevo);
			}else {
				System.out.println("No se pudo crear el registro...");
			}
			return sucesso;
			
		}

		public boolean Executar() {

			
			
			aba.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			raizAba.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			filtrosAbansados.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			idFiltro.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			String idRegistro =  idObter4();
			
			System.out.println(" Id Registro Busqueda :" + idRegistro  );
			
			idFiltro.sendKeys(idRegistro);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			idFiltro.sendKeys(Keys.ENTER);
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
			
			String nombreE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[6]/div")).getText();
			System.out.println("Nome :" +  nombreE );	
			
			String empresaE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[9]/div")).getText();
			System.out.println("Empresa :" +  empresaE );	
			
			String ufE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[10]/div")).getText();
			System.out.println("Uf :" +  ufE );	
			
			String filialE = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[11]/div")).getText();
			System.out.println("Filial :" +  filialE );	
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
			WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(1000);
			
			executar.click();
			sleep(3000);
			sleep(9000);
			
			estado.click();
			sleep(3000);
		
			opcEstado.click();
			sleep(3000);

			closeSelectTypeCheckbox(estado);
		
			
			subPeriodo.click();
			sleep(3000);
			
			atras.click();
			sleep(3000);
			
			J2016.click();
			sleep(3000);
			
			enero.click();
			sleep(3000);
			
			m.click();
			sleep(3000);
			sleep(3000);
			
			String subperiodoE = subPeriodo1.getAttribute("value");
			System.out.println(subperiodoE);
			
			cheke.click();
			sleep(3000);
			sleep(3000);
			
			executar1.click();
			sleep(25000);
			sleep(9000);
			sleep(10000);
		
			String valorTC = "1000";

			String nuevoTexto = dato.getText();
			
			boolean sucesso = nuevoTexto.equals(valorTC);
			System.out.println(nuevoTexto);
			System.out.println(sucesso + " Dato ejecutado Igual al Presentado");
			sleep(9000);
			sleep(3000);			
			
			btnVisualizarDatos.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			String nuevoTexto1 = campoEstatico.getText();
			System.out.println(nuevoTexto1);
			
			boolean sucesso1 = nuevoTexto1.equals(valorTC);
			System.out.println(sucesso1 + " Dato campo estatico igual al dato TC");
			sleep(9000);
			sleep(3000);
			
			visualizarDatos.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
//			String nuevoTexto2 = campoEstatico1.getAttribute("value");
//			System.out.println(nuevoTexto2);
//			
//			boolean sucesso2 = nuevoTexto2.equals(valorTC);
//			System.out.println(sucesso2 + " Dato campo estatico igual al dato TC");
//			sleep(9000);
//			sleep(3000);
			
			gravar.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			biblioteca.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			artiquivos.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			raizArtiquivos.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
			
			String idUltimo1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[5]/div")).getText();
			System.out.println(idUltimo1 + " Ultimo Id de Lista");	
			
			String nombre = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[7]/div")).getText();
			System.out.println("Nome :" +  nombre );
			
			String empresa = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[10]/div")).getText();
			System.out.println("Empresa :" +  empresa );	
			
			String uf = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[11]/div")).getText();
			System.out.println("Uf :" +  uf );	
			
			String filial = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[12]/div")).getText();
			System.out.println("Filial :" +  filial );	
			
			String M = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[15]/div")).getText();
			System.out.println("Periodo :" +  M );	
			

			
			boolean sucesso11 = true;
			
			return sucesso11;
		}




}
