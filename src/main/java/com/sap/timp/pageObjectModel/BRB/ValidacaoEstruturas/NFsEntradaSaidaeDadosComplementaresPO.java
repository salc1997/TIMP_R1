package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class NFsEntradaSaidaeDadosComplementaresPO extends TestBaseSteven{
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement execucao;
	@FindBy(xpath = "//button[@tabindex=\"0\"]/span[text()=\"Executar\"]")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"total-record\"]/span[@class=\"value cell\"]")
	public WebElement totalLinhas;
	@FindBy(xpath = "//div[@data-column=\"46\" and not(@data-path or @aria-label)]/div")
	public WebElement pesoBruto;
	@FindBy(xpath = "//div[@data-column=\"47\" and not(@data-path or @aria-label)]/div")
	public WebElement pesoLiquido;
	@FindBy(xpath = "//div[@data-column=\"79\" and not(@data-path or @aria-label)]/div")
	public WebElement valorDocFiscal;
	
	@FindBy(xpath = "//div[@data-column=\"174\" and not(@data-path or @aria-label)]/div")
	public WebElement valorOperICMS;
	@FindBy(xpath = "//div[@data-column=\"175\" and not(@data-path or @aria-label)]/div")
	public WebElement valorLiquido;
	@FindBy(xpath = "//div[@data-column=\"250\" and not(@data-path or @aria-label)]/div")
	public WebElement valorTotalDocFiscal;
	@FindBy(xpath = "//div[@data-column=\"77\" and not(@data-path or @aria-label)]/div")
	public WebElement valorMercadoriasServicos;
	
	@FindBy(xpath = "//div[@data-column=\"132\" and not(@data-path or @aria-label)]/div")
	public WebElement quantidade;
	@FindBy(xpath = "//div[@data-column=\"133\" and not(@data-path or @aria-label)]/div")
	public WebElement quantidadeBCCOFINS;
	@FindBy(xpath = "//div[@data-column=\"138\" and not(@data-path or @aria-label)]/div")
	public WebElement valorItem;
	@FindBy(xpath = "//div[@data-column=\"139\" and not(@data-path or @aria-label)]/div")
	public WebElement valorUnitarioLiquido;
	@FindBy(xpath = "//div[@data-column=\"187\" and not(@data-path or @aria-label)]/div")
	public WebElement valorUnitarioComImposto;
	@FindBy(xpath = "//div[@data-column=\"4\" and not(@data-path or @aria-label)]/div")
	public WebElement bcPis;
	@FindBy(xpath = "//div[@data-column=\"5\" and not(@data-path or @aria-label)]/div")
	public WebElement bcICMS;
	@FindBy(xpath = "//div[@data-column=\"6\" and not(@data-path or @aria-label)]/div")
	public WebElement bcICMSST;
	@FindBy(xpath = "//div[@data-column=\"60\" and not(@data-path or @aria-label)]/div")
	public WebElement bcCofins;
	@FindBy(xpath = "//div[@data-column=\"61\" and not(@data-path or @aria-label)]/div")
	public WebElement bcDifal;
	@FindBy(xpath = "//div[@data-column=\"66\" and not(@data-path or @aria-label)]/div")
	public WebElement valorICMS;
	@FindBy(xpath = "//div[@data-column=\"67\" and not(@data-path or @aria-label)]/div")
	public WebElement valorICMSST;
	
	@FindBy(xpath = "//div[@data-column=\"73\" and not(@data-path or @aria-label)]/div")
	public WebElement valorCofins;
	@FindBy(xpath = "//div[@data-column=\"76\" and not(@data-path or @aria-label)]/div")
	public WebElement valorDifal;
	@FindBy(xpath = "//div[@data-column=\"81\" and not(@data-path or @aria-label)]/div")
	public WebElement valorPis;
	@FindBy(xpath = "//div[@data-column=\"178\" and not(@data-path or @aria-label)]/div")
	public WebElement bcOutrasICMS;
	@FindBy(xpath = "//div[@data-column=\"182\" and not(@data-path or @aria-label)]/div")
	public WebElement bcOutrasIPI;
	@FindBy(xpath = "//div[@data-column=\"184\" and not(@data-path or @aria-label)]/div")
	public WebElement bcOutrasDIFAL;
	@FindBy(xpath = "//div[@data-column=\"202\" and not(@data-path or @aria-label)]/div")
	public WebElement qtdBCPIS;
	@FindBy(xpath = "//div[@data-column=\"365\" and not(@data-path or @aria-label)]/div")
	public WebElement valorOutrasDIFAL;
	@FindBy(xpath = "//div[@data-column=\"363\" and not(@data-path or @aria-label)]/div")
	public WebElement valorOutrasICMS;
	@FindBy(xpath = "//div[@data-column=\"367\" and not(@data-path or @aria-label)]/div")
	public WebElement valorContaICMS;
	@FindBy(xpath = "//div[@data-column=\"368\" and not(@data-path or @aria-label)]/div")
	public WebElement valorContaICMSST;
	@FindBy(xpath = "//div[@data-column=\"369\" and not(@data-path or @aria-label)]/div")
	public WebElement valorContaDifal;
	

	
	public NFsEntradaSaidaeDadosComplementaresPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public ArrayList<Boolean> verificar() {
		
		sleep(2000);
		ferramenta.sendKeys("8004404");
		ferramenta.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(1000);
		execucao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		//total de linhas
		
		System.out.println("-------------------------------------------------");
		System.out.println("total de linhas");
		String totalLinhasS = totalLinhas.getText();
		System.out.println(totalLinhasS);
		int totalLinhasI = Integer.valueOf(totalLinhasS);
		int esperadoLinhas = 4;
		System.out.println(esperadoLinhas);
		sucesso.add(igualInt(totalLinhasI, esperadoLinhas));
		System.out.println(igualInt(totalLinhasI, esperadoLinhas)+" numero linhas");
		
		System.out.println("-------------------------------------------------");
		//peso bruto
		System.out.println("peso bruto");
		String pesoBrutoS = pesoBruto.getText();
		pesoBrutoS = pesoBrutoS.replace(",", "");
		System.out.println(pesoBrutoS + " String");
		double pesoBrutoD = new Double(pesoBrutoS);
		System.out.println(pesoBrutoD + " Double");
		double esperadoPesoBruto = 717000;
		System.out.println(esperadoPesoBruto + " Esperado");
		sucesso.add(igualDobule(pesoBrutoD, esperadoPesoBruto));
		System.out.println(igualDobule(pesoBrutoD, esperadoPesoBruto)+" peso bruto");
		
		System.out.println("-------------------------------------------------");
		//peso liquido
		System.out.println("peso liquido");
		String pesoLiquidoS = pesoLiquido.getText();
		pesoLiquidoS = pesoLiquidoS.replace(",", "");
		System.out.println(pesoLiquidoS+ " String");
		double pesoLiquidoD = new Double(pesoLiquidoS);
		System.out.println(pesoLiquidoD + " Double");
		double esperadoPesoLiquido = 645300;
		System.out.println(esperadoPesoLiquido + " Esperado");
		sucesso.add(igualDobule(pesoLiquidoD, esperadoPesoLiquido));
		System.out.println(igualDobule(pesoLiquidoD, esperadoPesoLiquido)+" peso Liquido");
		
		System.out.println("-------------------------------------------------");
		//valor Doc Fiscal
		System.out.println("valor Doc Fiscal");
		String valorDocFiscalS = valorDocFiscal.getText();
		valorDocFiscalS = valorDocFiscalS.replace(".", "");
		valorDocFiscalS = valorDocFiscalS.replace(",", ".");
		System.out.println(valorDocFiscalS + " String");
		double valorDocFiscalD = new Double(valorDocFiscalS);
		System.out.println(valorDocFiscalD + " Double");
		double esperadoValorDocFiscal = 530581.41;
		System.out.println(esperadoValorDocFiscal + " Esperado");
		sucesso.add(igualDobule(valorDocFiscalD, esperadoValorDocFiscal));
		System.out.println(igualDobule(valorDocFiscalD, esperadoValorDocFiscal) +" Valor Doc Fiscal");
		
		System.out.println("-------------------------------------------------");
		/*
		// Valor oper. ICMS ( BC+ISENT+OUT)
		System.out.println("Valor oper. ICMS ( BC+ISENT+OUT)");
		String valorOperICMSS = valorOperICMS.getText();
		valorOperICMSS = remplazarPuntos(valorOperICMSS);
		valorOperICMSS = remplazarComas(valorOperICMSS);
		System.out.println(valorOperICMSS + " String");
		double valorOperICMSD = new Double(valorOperICMSS);
		System.out.println(esperadoValorDocFiscal + " Double");
		double esperadovalorOperICMS = 4468639588.03;
		System.out.println(esperadovalorOperICMS + " Esperado");
		sucesso.add(igualDobule(valorOperICMSD, esperadovalorOperICMS));
		System.out.println(sucesso.get(4) + " Valor oper. ICMS ( BC+ISENT+OUT)");
		
		System.out.println("-------------------------------------------------");
		*/
		
		// Valor liquido
		System.out.println(" Valor liquido");
		String valorLiquidoS = valorLiquido.getText();
		valorLiquidoS = valorLiquidoS.replace(".", "");
		valorLiquidoS = valorLiquidoS.replace(",", ".");
		System.out.println(valorLiquidoS+" String");
		double valorLiquidoD = new Double(valorLiquidoS);
		System.out.println(valorLiquidoD + " Double");
		double esperadovalorLiquido = 717118;
		System.out.println(esperadovalorLiquido + " Esperado");
		sucesso.add(igualDobule(valorLiquidoD, esperadovalorLiquido));
		System.out.println(igualDobule(valorLiquidoD, esperadovalorLiquido) + " Valor Liquido");
		System.out.println("-------------------------------------------------");
		
		//valor Total Doc Fiscal
		System.out.println("valor Total Doc Fiscal");
		String valorTotalDocFiscalS = valorTotalDocFiscal.getText();
		valorTotalDocFiscalS = valorTotalDocFiscalS.replace(".", "");
		valorTotalDocFiscalS = valorTotalDocFiscalS.replace(",", ".");
		System.out.println(valorTotalDocFiscalS+" String");
		double valorTotalDocFiscalD = new Double(valorTotalDocFiscalS);
		System.out.println(valorTotalDocFiscalD + " Double");
		double esperadovalorTotalDocFiscal = 530581.41;
		sucesso.add(igualDobule(valorTotalDocFiscalD, esperadovalorTotalDocFiscal));
		System.out.println(esperadovalorTotalDocFiscal + " Esperado");
		System.out.println(igualDobule(valorTotalDocFiscalD, esperadovalorTotalDocFiscal) +" Valor Total Doc Fiscal");
		
		System.out.println("-------------------------------------------------");
		// Totalizador de "Valor de Mercadorias e Serviços"
		System.out.println("Totalizador de \"Valor Mercadorias e Serviços");
		String valorMercadoriasServicosS = valorMercadoriasServicos.getText();
		valorMercadoriasServicosS = valorMercadoriasServicosS.replace(".", "");
		valorMercadoriasServicosS = valorMercadoriasServicosS.replace(",", ".");
		System.out.println(valorMercadoriasServicosS+" String");
		double valorMercadoriasServicosD = new Double(valorMercadoriasServicosS);
		System.out.println(valorMercadoriasServicosD + " Double");
		double esperadovalorMercadoriasServicos = 717118;
		System.out.println(esperadovalorMercadoriasServicos + " Esperado");
		sucesso.add(igualDobule(valorMercadoriasServicosD, esperadovalorMercadoriasServicos));
		System.out.println(igualDobule(valorMercadoriasServicosD, esperadovalorMercadoriasServicos) + " Totalizador de Valor Mercadorias e Serviços");
		
		System.out.println("-------------------------------------------------");
		// Quantidade
		System.out.println("Quantidade");
		String quantidadeS = quantidade.getText();
		quantidadeS = quantidadeS.replace(",", ".");
		System.out.println(quantidadeS +" String");
		double quantidadeD = new Double(quantidadeS);
		System.out.println(quantidadeD + " Double");
		double esperadoquantidade = 719;
		System.out.println(esperadoquantidade + " Esperado");
		sucesso.add(igualDobule(quantidadeD, esperadoquantidade));
		System.out.println(igualDobule(quantidadeD, esperadoquantidade) + " Quantidade");
		
		
		System.out.println("-------------------------------------------------");
		
		// Quantidade BC COFINS
		System.out.println(" Quantidade BC COFINS");
		String quantidadeBCCOFINSS = quantidadeBCCOFINS.getText();
		quantidadeBCCOFINSS = quantidadeBCCOFINSS.replace(",", ".");
		System.out.println(quantidadeBCCOFINSS +" String");
		double quantidadeBCCOFINSD = new Double(quantidadeBCCOFINSS);
		System.out.println(quantidadeBCCOFINSD + " Double");
		double esperadoquantidadeBCCOFINS = 719;
		System.out.println(esperadoquantidadeBCCOFINS + " Esperando");
		sucesso.add(igualDobule(quantidadeBCCOFINSD, esperadoquantidadeBCCOFINS));
		System.out.println(igualDobule(quantidadeBCCOFINSD, esperadoquantidadeBCCOFINS) + " quantidade BC COFINS");
		
		
		System.out.println("-------------------------------------------------");
		// Valor do Item
		System.out.println("Valor do Item");
		String valorItemS = valorItem.getText();
		valorItemS = valorItemS.replace(".", "");
		valorItemS = valorItemS.replace(",", ".");
		System.out.println(valorItemS + " String");
		double valorItemD = new Double(valorItemS);
		System.out.println(valorItemD + " Double");
		double esperadovalorItem = 717118;
		System.out.println(esperadovalorItem + " Esperado");
		sucesso.add(igualDobule(valorItemD, esperadovalorItem));
		System.out.println(igualDobule(valorItemD, esperadovalorItem) + " Valor do Item");
		
		
		System.out.println("-------------------------------------------------");
		// Valor Unitário Líquido
		System.out.println("Valor Unitário Líquido");
		String valorUnitarioLiquidoS = valorUnitarioLiquido.getText();
		valorUnitarioLiquidoS = valorUnitarioLiquidoS.replace(".", "");
		valorUnitarioLiquidoS = valorUnitarioLiquidoS.replace(",", ".");
		System.out.println(valorUnitarioLiquidoS+ " String");
		double valorUnitarioLiquidoD = new Double(valorUnitarioLiquidoS);
		System.out.println(valorUnitarioLiquidoD + " Double");
		double esperadovalorUnitarioLiquido = 3100;
		System.out.println(esperadovalorUnitarioLiquido + " Esperado");
		sucesso.add(igualDobule(valorUnitarioLiquidoD, esperadovalorUnitarioLiquido));
		System.out.println(igualDobule(valorUnitarioLiquidoD, esperadovalorUnitarioLiquido) + " Valor Unitário Líquido");
		System.out.println("-------------------------------------------------");
		
		// Valor Unitário com Imposto
		System.out.println("Valor Unitário com Imposto");
		String valorUnitarioComImpostoS = valorUnitarioComImposto.getText();
		valorUnitarioComImpostoS = valorUnitarioComImpostoS.replace(".", "");
		valorUnitarioComImpostoS = valorUnitarioComImpostoS.replace(",", ".");
		System.out.println(valorUnitarioComImpostoS + " String");
		double valorUnitarioComImpostoD = new Double(valorUnitarioComImpostoS);
		System.out.println(valorUnitarioComImpostoD + " Double");
		double esperadovalorUnitarioComImposto = 3118;
		System.out.println(esperadovalorUnitarioComImposto + " Esperado");
		sucesso.add(igualDobule(valorUnitarioComImpostoD, esperadovalorUnitarioComImposto));
		System.out.println(igualDobule(valorUnitarioComImpostoD, esperadovalorUnitarioComImposto) + " Valor Unitário com Imposto");
		System.out.println("-------------------------------------------------");
		/*
		// BC Pis
		System.out.println("BC Pis");
		String bcPisS = bcPis.getText();
		bcPisS = remplazarPuntos(bcPisS);
		bcPisS = remplazarComas(bcPisS);
		System.out.println(bcPisS + " String");
		double bcPisD = new Double(bcPisS);
		System.out.println(bcPisD + " Double");
		double esperadobcPis = 3500302180.05;
		System.out.println(esperadobcPis + " Esperado");
		sucesso.add(igualDobule(bcPisD, esperadobcPis));
		System.out.println(sucesso.get(13) + " BC Pis");
		System.out.println("-------------------------------------------------");
		
		// BC ICMS
		System.out.println("BC ICMS");
		String bcICMSS = bcICMS.getText();
		bcICMSS = remplazarPuntos(bcICMSS);
		bcICMSS = remplazarComas(bcICMSS);
		System.out.println(bcICMSS +" String");
		double bcICMSD = new Double(bcICMSS);
		System.out.println(bcICMSD + " Double");
		double esperadobcICMS = 806620036.04;
		System.out.println(esperadobcICMS + " Esperado");
		sucesso.add(igualDobule(bcICMSD, esperadobcICMS));
		System.out.println(sucesso.get(13) + " BC ICMS");
		*/
		System.out.println("-------------------------------------------------");
		// BC ICMS ST
		System.out.println("BC ICMS ST");
		String bcICMSSTS = bcICMSST.getText();
		bcICMSSTS = bcICMSSTS.replace(".", "");
		bcICMSSTS = bcICMSSTS.replace(",", ".");
		System.out.println(bcICMSSTS+" String");
		double bcICMSSTD = new Double(bcICMSSTS);
		System.out.println(bcICMSSTD + " Double");
		double esperadobcICMSST = 874390.23;
		System.out.println(esperadobcICMSST + " Esperado");
		sucesso.add(igualDobule(bcICMSSTD, esperadobcICMSST));
		System.out.println(igualDobule(bcICMSSTD, esperadobcICMSST) + " BC ICMS ST");
		/*
		System.out.println("-------------------------------------------------");
		// BC Cofins
		System.out.println("BC Cofins");
		String bcCofinsS = bcCofins.getText();
		bcCofinsS=remplazarPuntos(bcCofinsS);
		bcCofinsS=remplazarComas(bcCofinsS);
		System.out.println(bcCofinsS+" String");
		double bcCofinsD = new Double(bcCofinsS);
		System.out.println(bcCofinsD + " Double");
		double esperadobcCofins = 3500302180.05;
		System.out.println(esperadobcCofins + " Esperado");
		sucesso.add(igualDobule(bcCofinsD, esperadobcCofins));
		System.out.println(sucesso.get(13) + " BC Cofins");
		
		*/
		
		
		System.out.println("-------------------------------------------------");
		// BC Difal
		System.out.println("BC Difal");
		String bcDifalS = bcDifal.getText();
		bcDifalS= bcDifalS.replace(".", "");
		bcDifalS= bcDifalS.replace(",", ".");
		System.out.println(bcDifalS+ " String");
		double bcDifalD = new Double(bcDifalS);
		System.out.println(bcDifalD + " Double");
		double esperadobcDifal = 5240.00;
		System.out.println(esperadobcDifal + " Esperado");
		sucesso.add(igualDobule(bcDifalD, esperadobcDifal));
		System.out.println(igualDobule(bcDifalD, esperadobcDifal) + " BC Difal");
		/*
		System.out.println("-------------------------------------------------");
		// Valor ICMS
		System.out.println("Valor ICMS");
		String valorICMSS = valorICMS.getText();
		valorICMSS = remplazarPuntos(valorICMSS);
		valorICMSS = remplazarComas(valorICMSS);
		System.out.println(valorICMSS+" String");
		double valorICMSD = new Double(valorICMSS);
		System.out.println(valorICMSD + " Double");
		double esperadovalorICMS = 157390.23;
		System.out.println(esperadovalorICMS + " Esperado");
		sucesso.add(igualDobule(valorICMSD, esperadovalorICMS));
		System.out.println(sucesso.get(13) + " Valor ICMS");
		*/
		
		System.out.println("-------------------------------------------------");
		// Valor ICMS ST
		System.out.println("Valor ICMS ST");
		String valorICMSSTS = valorICMSST.getText();
		valorICMSSTS = valorICMSSTS.replace(".", "");
		valorICMSSTS = valorICMSSTS.replace(",", ".");
		System.out.println(valorICMSSTS+ " String");
		double valorICMSSTD = new Double(valorICMSSTS);
		System.out.println(valorICMSSTD + " Double");
		double esperadovalorICMSST = 157390.23;
		System.out.println(esperadovalorICMSST+ " Esperado");
		sucesso.add(igualDobule(valorICMSSTD, esperadovalorICMSST));
		System.out.println(igualDobule(valorICMSSTD, esperadovalorICMSST) + " Valor ICMS ST");
		/*
		System.out.println("-------------------------------------------------");
		// Valor Cofins
		System.out.println("Valor Cofins");
		
		
		String valorCofinsS = valorCofins.getText();
		valorCofinsS = remplazarPuntos(valorCofinsS);
		valorCofinsS = remplazarComas(valorCofinsS);
		System.out.println(valorCofinsS +" String");
		double valorCofinsD = new Double(valorCofinsS);
		System.out.println(valorCofinsD + " Double");
		double esperadovalorCofins = 343133716.72;
		System.out.println(esperadovalorCofins + " Esperado");
		sucesso.add(igualDobule(valorCofinsD, esperadovalorCofins));
		System.out.println(sucesso.get(13) + " Valor Cofins");
		*/
		
		System.out.println("-------------------------------------------------");
		// Valor Difal
		System.out.println("Valor Difal");
		String valorDifalS = valorDifal.getText();
		valorDifalS = valorDifalS.replace(".", "");
		valorDifalS = valorDifalS.replace(",", ".");
		System.out.println(valorDifalS+ " String");
		double valorDifalD = new Double(valorDifalS);
		System.out.println(valorDifalD + " Double");
		double esperadovalorDifal = 1201;
		System.out.println(esperadovalorDifal + " Esperado");
		sucesso.add(igualDobule(valorDifalD, esperadovalorDifal));
		System.out.println(igualDobule(valorDifalD, esperadovalorDifal) + " Valor Difal");
		/*
		System.out.println("-------------------------------------------------");
		
		// Valor PIS
		System.out.println("Valor PIS");
		String valorPisS = valorPis.getText();

		valorPisS = remplazarPuntos(valorPisS);
		valorPisS = remplazarComas(valorPisS);
		System.out.println(valorPisS + " String");
		double valorPisD = new Double(valorPisS);
		System.out.println(valorPisD + " Double");
		double esperadovalorPis = 74455267.50;
		System.out.println(esperadovalorPis + " esperado");
		sucesso.add(igualDobule(valorPisD, esperadovalorPis));
		System.out.println(sucesso.get(13) + " Valor PIS");
		System.out.println("-------------------------------------------------");
		
		// BC Outras ICMS
		System.out.println("BC Outras ICMS");
		String bcOutrasICMSS = bcOutrasICMS.getText();
		bcOutrasICMSS = remplazarPuntos(bcOutrasICMSS);
		bcOutrasICMSS = remplazarComas(bcOutrasICMSS);
		System.out.println(bcOutrasICMSS+ " String");
		double bcOutrasICMSD = new Double(bcOutrasICMSS);
		System.out.println(bcOutrasICMSD + " Double");
		double esperadobcOutrasICMS = 3662019551.99;
		System.out.println(esperadobcOutrasICMS + " Esperado");
		sucesso.add(igualDobule(bcOutrasICMSD, esperadobcOutrasICMS));
		System.out.println(sucesso.get(13) + " BC Outras ICMS");
		*/
		System.out.println("-------------------------------------------------");
		
		// BC Outras IPI
		System.out.println("BC Outras IPI");
		String bcOutrasIPIS = bcOutrasIPI.getText();
		bcOutrasIPIS = bcOutrasIPIS.replace(".", "");
		bcOutrasIPIS = bcOutrasIPIS.replace(",", ".");
		System.out.println(bcOutrasIPIS+ " String");
		double bcOutrasIPID = new Double(bcOutrasIPIS);
		System.out.println(bcOutrasIPID + " Double");
		double esperadobcOutrasIPI = 874390.23;
		System.out.println(esperadobcOutrasIPI + " Esperado");
		sucesso.add(igualDobule(bcOutrasIPID, esperadobcOutrasIPI));
		System.out.println(igualDobule(bcOutrasIPID, esperadobcOutrasIPI) + " BC Outras IPI");
		/*
		System.out.println("-------------------------------------------------");
		
		// BC Outras DIFAL
		System.out.println("BC Outras DIFAL");
		String bcOutrasDIFALS = bcOutrasDIFAL.getText();

		bcOutrasDIFALS = remplazarPuntos(bcOutrasDIFALS);
		bcOutrasDIFALS = remplazarComas(bcOutrasDIFALS);
		System.out.println(bcOutrasDIFALS + " String");
		double bcOutrasDIFALD = new Double(bcOutrasDIFALS);
		System.out.println(bcOutrasDIFALD + " Double");
		double esperadobcOutrasDIFAL = 14235090.90;
		System.out.println(esperadobcOutrasDIFAL + " Esperado");
		sucesso.add(igualDobule(bcOutrasDIFALD, esperadobcOutrasDIFAL));
		System.out.println(sucesso.get(13) + " BC Outras DIFAL");
		*/
		
		System.out.println("-------------------------------------------------");
		// QTD. BC PIS
		System.out.println("QTD. BC PIS");
		String qtdBCPISS = qtdBCPIS.getText();
		qtdBCPISS = qtdBCPISS.replace(",", ".");
		System.out.println(qtdBCPISS + "String");
		double qtdBCPISD = new Double(qtdBCPISS);
		System.out.println(qtdBCPISD + " Double");
		double esperadoqtdBCPIS = 719;
		System.out.println(esperadoqtdBCPIS + " Esperado");
		sucesso.add(igualDobule(qtdBCPISD, esperadoqtdBCPIS));
		System.out.println(igualDobule(qtdBCPISD, esperadoqtdBCPIS) + " QTD. BC PIS");
		/*
		System.out.println("-------------------------------------------------");
		// Valor Outras DIFAL
		System.out.println("Valor Outras DIFAL");
		String valorOutrasDIFALS = valorOutrasDIFAL.getText();

		valorOutrasDIFALS = remplazarPuntos(valorOutrasDIFALS);
		valorOutrasDIFALS = remplazarComas(valorOutrasDIFALS);
		System.out.println(valorOutrasDIFALS+ " String");
		double valorOutrasDIFALD = new Double(valorOutrasDIFALS);
		System.out.println(valorOutrasDIFALD + " Double");
		double esperadovalorOutrasDIFAL = 5.40;
		System.out.println(esperadovalorOutrasDIFAL + " Esperado");
		sucesso.add(igualDobule(valorOutrasDIFALD, esperadovalorOutrasDIFAL));
		System.out.println(sucesso.get(13) + " Valor Outras DIFAL");
		
		System.out.println("-------------------------------------------------");
		// Valor Outras ICMS
		System.out.println("Valor Outras ICMS");
		String valorOutrasICMSS = valorOutrasICMS.getText();

		valorOutrasICMSS = remplazarPuntos(valorOutrasICMSS);
		valorOutrasICMSS = remplazarComas(valorOutrasICMSS);
		System.out.println(valorOutrasICMSS+ " String");
		double valorOutrasICMSD = new Double(valorOutrasICMSS);
		System.out.println(valorOutrasICMSD + " Double");
		double esperadovalorOutrasICMS = 517778827.46;
		System.out.println(esperadovalorOutrasICMS + " Esperado");
		sucesso.add(igualDobule(valorOutrasICMSD, esperadovalorOutrasICMS));
		System.out.println(sucesso.get(13) + " Valor Outras ICMS");
		
		System.out.println("-------------------------------------------------");
		// Valor Conta ICMS
		System.out.println("Valor Conta ICMS");
		String valorContaICMSS = valorContaICMS.getText();

		valorContaICMSS = remplazarPuntos(valorContaICMSS);
		valorContaICMSS = remplazarComas(valorContaICMSS);
		System.out.println(valorContaICMSS+ " String");
		double valorContaICMSD = new Double(valorContaICMSS);
		System.out.println(valorContaICMSD + " Double");
		double esperadovalorContaICMS = 518584179.560000;
		System.out.println(esperadovalorContaICMS + " Esperado");
		sucesso.add(igualDobule(valorContaICMSD, esperadovalorContaICMS));
		System.out.println(sucesso.get(13) + " Valor Conta ICMS");
		*/
		System.out.println("-------------------------------------------------");
		
		// Valor Conta ICMS ST
		System.out.println(" Valor Conta ICMS ST");
		String valorContaICMSSTS = valorContaICMSST.getText();
		valorContaICMSSTS = valorContaICMSSTS.replace(".", "");
		valorContaICMSSTS = valorContaICMSSTS.replace(",", ".");
		System.out.println(valorContaICMSSTS + " String");
		double valorContaICMSSTD = new Double(valorContaICMSSTS);
		System.out.println(valorContaICMSSTD + " Double");
		double esperadovalorContaICMSST = 157390.23;
		System.out.println(esperadovalorContaICMSST + " Esperado");
		sucesso.add(igualDobule(valorContaICMSSTD, esperadovalorContaICMSST));
		System.out.println(igualDobule(valorContaICMSSTD, esperadovalorContaICMSST) + " Valor Conta ICMS ST");
		
		
		System.out.println("-------------------------------------------------");
		// Valor Conta Difal
		System.out.println("Valor Conta Difal");
		String valorContaDifalS = valorContaDifal.getText();
		valorContaDifalS = valorContaDifalS.replace(".", "");
		valorContaDifalS = valorContaDifalS.replace(",", ".");
		System.out.println(valorContaDifalS+ " String");
		double valorContaDifalD = new Double(valorContaDifalS);
		System.out.println(valorContaDifalD + " Double");
		double esperadovalorContaDifal = 1201;
		System.out.println(esperadovalorContaDifal + " Double");
		sucesso.add(igualDobule(valorContaDifalD, esperadovalorContaDifal));
		System.out.println(igualDobule(valorContaDifalD, esperadovalorContaDifal) + " Valor Conta Difal");
		System.out.println("-------------------------------------------------");
		System.out.println(sucesso);
		return sucesso;
		
	}
	

	
}
	


