package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class CIAPPO extends TestBaseEliel {
	
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
	
	@FindBy(xpath = "//div[@data-column=\"15\" and not(@data-path or @aria-label)]/div")
	public WebElement valordamercadoria;
	
	@FindBy(xpath = "//div[@data-column=\"17\" and not(@data-path or @aria-label)]/div")
	public WebElement basedoicms;
	
	@FindBy(xpath = "//div[@data-column=\"18\" and not(@data-path or @aria-label)]/div")
	public WebElement valordoicms;
	
	@FindBy(xpath = "//div[@data-column=\"24\" and not(@data-path or @aria-label)]/div")
	public WebElement valordoicmstotal;
	
	@FindBy(xpath = "//div[@data-column=\"25\" and not(@data-path or @aria-label)]/div")
	public WebElement valorparacreditodoicms;
	
	@FindBy(xpath = "//div[@data-column=\"26\" and not(@data-path or @aria-label)]/div")
	public WebElement valornaocreditadodoicms;
	
	@FindBy(xpath = "//div[@data-column=\"27\" and not(@data-path or @aria-label)]/div")
	public WebElement valordocreditodoicms;
	
	@FindBy(xpath = "//div[@data-column=\"34\" and not(@data-path or @aria-label)]/div")
	public WebElement quantidade;
	
	@FindBy(xpath = "//div[@data-column=\"116\" and not(@data-path or @aria-label)]/div")
	public WebElement quantidadeoriginal;
	
	@FindBy(xpath = "//div[@data-column=\"118\" and not(@data-path or @aria-label)]/div")
	public WebElement totalvalorciap ;
	
	@FindBy(xpath = "//div[@data-column=\"60\" and not(@data-path or @aria-label)]/div")
	public WebElement valordecreditoicmspossivel;
	
	@FindBy(xpath = "//div[@data-column=\"61\" and not(@data-path or @aria-label)]/div")
	public WebElement valordecreditoicmsefetivado;
	
	@FindBy(xpath = "//div[@data-column=\"62\" and not(@data-path or @aria-label)]/div")
	public WebElement valordecreditoicmsnaoefetivado;
	
	@FindBy(xpath = "//div[@data-column=\"63\" and not(@data-path or @aria-label)]/div")
	public WebElement fatordecreditamentodaparcela;
	
	public CIAPPO() {
		PageFactory.initElements(driver, this);
	}

public ArrayList<Boolean> verificar() {
		
		sleep(2000);
		ferramenta.sendKeys("8004409");
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
		
		//Valor de mercadoria
		System.out.println("-------------------------------------------------");
		System.out.println("Valor de Mercadoria");
		String valorMercadoriaS = valordamercadoria.getText();
		valorMercadoriaS = valorMercadoriaS.replace(",", ".");
		System.out.println(valorMercadoriaS + " String");
		double valorMercadoriaD = new Double(valorMercadoriaS);
		System.out.println(valorMercadoriaD + " Double");
		double esperadovalorMercadoria = 400;
		System.out.println(esperadovalorMercadoria + " Esperado");
		sucesso.add(igualDobule(valorMercadoriaD, esperadovalorMercadoria));
		System.out.println(igualDobule(valorMercadoriaD,  esperadovalorMercadoria)+" Valor de Mercadoria");
		
		System.out.println("-------------------------------------------------");
		//Base do ICMS
		System.out.println("Base do ICMS");
		String BaseICMSS = basedoicms.getText();
		BaseICMSS =BaseICMSS.replace(",", ".");
		System.out.println(BaseICMSS+ " String");
		double BaseICMSD = new Double(BaseICMSS);
		System.out.println(BaseICMSD + " Double");
		double esperadoBaseICMS = 487.80;
		System.out.println(esperadoBaseICMS + " Esperado");
		sucesso.add(igualDobule(BaseICMSD, esperadoBaseICMS));
		System.out.println(igualDobule(BaseICMSD, esperadoBaseICMS)+" Base do ICMS");
		
		System.out.println("-------------------------------------------------");
		//Valor do ICMS
		System.out.println("Valor do ICMS");
		String valorICMSS = valordoicms.getText();
		valorICMSS = valorICMSS.replace(",", ".");
		System.out.println(valorICMSS+ " String");
		double valorICMSD = new Double(valorICMSS);
		System.out.println(valorICMSD + " Double");
		double esperadoValorICMS = 87.80;
		System.out.println(esperadoValorICMS + " Esperado");
		sucesso.add(igualDobule(valorICMSD, esperadoValorICMS));
		System.out.println(igualDobule(valorICMSD, esperadoValorICMS)+" Valor do ICMS");
		
		System.out.println("-------------------------------------------------");
		//Valor do ICMS Total
		System.out.println("Valor do ICMS Total");
		String valorICMSTotalS = valordoicmstotal.getText();
		valorICMSTotalS = valorICMSTotalS.replace(",", ".");
		System.out.println(valorICMSTotalS+ " String");
		double valorICMSTotalD = new Double(valorICMSTotalS);
		System.out.println(valorICMSTotalD + " Double");
		double esperadoValorICMSTotal = 87.80;
		System.out.println(esperadoValorICMSTotal + " Esperado");
		sucesso.add(igualDobule(valorICMSTotalD, esperadoValorICMSTotal));
		System.out.println(igualDobule(valorICMSTotalD, esperadoValorICMSTotal)+" Valor do ICMS Total");
		
		
		System.out.println("-------------------------------------------------");
		//Valor para credito do ICMS 
		System.out.println("Valor para credito do ICMS");
		String valorcreditoICMSS = valorparacreditodoicms.getText();
		valorcreditoICMSS = valorcreditoICMSS.replace(",", ".");
		System.out.println(valorcreditoICMSS+ " String");
		double valorcreditoICMSD = new Double(valorcreditoICMSS);
		System.out.println(valorcreditoICMSD + " Double");
		double esperadoValorcreditoICMS = 86.90;
		System.out.println(esperadoValorcreditoICMS + " Esperado");
		sucesso.add(igualDobule(valorcreditoICMSD, esperadoValorcreditoICMS));
		System.out.println(igualDobule(valorcreditoICMSD, esperadoValorcreditoICMS)+" Valor para credito do ICMS ");
		
		System.out.println("-------------------------------------------------");
		//Valor nao creditado do ICMS 
		System.out.println("Valor nao creditado do ICMS");
		String valornaocreditadoICMSS = valornaocreditadodoicms.getText();
		valornaocreditadoICMSS = valornaocreditadoICMSS.replace(",", ".");
		System.out.println(valornaocreditadoICMSS+ " String");
		double valornaocreditadoICMSD = new Double(valornaocreditadoICMSS);
		System.out.println(valornaocreditadoICMSD + " Double");
		double esperadoValornaocreditadoICMS = 0.02;
		System.out.println(esperadoValornaocreditadoICMS + " Esperado");
		sucesso.add(igualDobule(valornaocreditadoICMSD, esperadoValornaocreditadoICMS));
		System.out.println(igualDobule(valornaocreditadoICMSD, esperadoValornaocreditadoICMS)+" Valor nao creditado do ICMS ");
		
		System.out.println("-------------------------------------------------");
		//Valor do creditado do ICMS 
		System.out.println("Valor do creditado do ICMS");
		String valordocreditoICMSS = valordocreditodoicms.getText();
		valordocreditoICMSS = valordocreditoICMSS.replace(",", ".");
		System.out.println(valordocreditoICMSS+ " String");
		double valordocreditoICMSD = new Double(valordocreditoICMSS);
		System.out.println(valordocreditoICMSD + " Double");
		double esperadoValordocreditoICMS = 0.88;
		System.out.println(esperadoValordocreditoICMS + " Esperado");
		sucesso.add(igualDobule(valordocreditoICMSD, esperadoValordocreditoICMS));
		System.out.println(igualDobule(valordocreditoICMSD, esperadoValordocreditoICMS)+" Valor do creditado do ICMS ");
		
		System.out.println("-------------------------------------------------");
		//Quantidade 
		System.out.println("Quantidade");
		String quantidadeS = quantidade.getText();
		quantidadeS = quantidadeS.replace(",", ".");
		System.out.println(quantidadeS+ " String");
		double quantidadeD = new Double(quantidadeS);
		System.out.println(quantidadeD + " Double");
		double esperadoQuantidade = 4;
		System.out.println(esperadoQuantidade + " Esperado");
		sucesso.add(igualDobule(quantidadeD, esperadoQuantidade));
		System.out.println(igualDobule(quantidadeD, esperadoQuantidade)+"Quantidade");
		
		System.out.println("-------------------------------------------------");
		//Quantidade Original 
		System.out.println("Quantidade Original");
		String quantidadeoriginalS = quantidadeoriginal.getText();
		quantidadeoriginalS = quantidadeoriginalS.replace(",", ".");
		System.out.println(quantidadeoriginalS+ " String");
		double quantidadeoriginalD = new Double(quantidadeoriginalS);
		System.out.println(quantidadeoriginalD + " Double");
		double esperadoQuantidadeOriginal = 4;
		System.out.println(esperadoQuantidadeOriginal + " Esperado");
		sucesso.add(igualDobule(quantidadeoriginalD, esperadoQuantidadeOriginal));
		System.out.println(igualDobule(quantidadeoriginalD, esperadoQuantidadeOriginal)+"Quantidade Original");
		
		System.out.println("-------------------------------------------------");
		//Total valor CIAP
		System.out.println("Total valor CIAP");
		String totalvalorciapS = totalvalorciap.getText();
		totalvalorciapS =totalvalorciapS.replace(",", ".");
		System.out.println(totalvalorciapS+ " String");
		double totalvalorciapD = new Double(totalvalorciapS);
		System.out.println(totalvalorciapD + " Double");
		double esperadoTotalValorCIAP = 487.80;
		System.out.println(esperadoTotalValorCIAP + " Esperado");
		sucesso.add(igualDobule(totalvalorciapD, esperadoTotalValorCIAP));
		System.out.println(igualDobule(totalvalorciapD, esperadoTotalValorCIAP)+"Total valor CIAP");
		
		System.out.println("-------------------------------------------------");
		//Valor de credito do ICMS Possivel
		System.out.println("Valor de credito do ICMS Possivel");
		String icmspossivelS = valordecreditoicmspossivel.getText();
		icmspossivelS =icmspossivelS.replace(",", ".");
		System.out.println(icmspossivelS+ " String");
		double icmspossivelD = new Double(icmspossivelS);
		System.out.println(icmspossivelD + " Double");
		double esperadoICMSPossivel = 0.45;
		System.out.println(esperadoICMSPossivel + " Esperado");
		sucesso.add(igualDobule(icmspossivelD, esperadoICMSPossivel));
		System.out.println(igualDobule(icmspossivelD, esperadoICMSPossivel)+"Valor de credito do ICMS Possivel");
		
		System.out.println("-------------------------------------------------");
		//Valor de credito do ICMS Efetivado
		System.out.println("Valor de credito do ICMS efetivado");
		String icmsefetivadoS = valordecreditoicmsefetivado.getText();
		icmsefetivadoS =icmsefetivadoS.replace(",", ".");
		System.out.println(icmsefetivadoS+ " String");
		double icmsefetivadoD = new Double(icmsefetivadoS);
		System.out.println(icmsefetivadoD + " Double");
		double esperadoICMSEfetivado = 0.44;
		System.out.println(esperadoICMSEfetivado + " Esperado");
		sucesso.add(igualDobule(icmsefetivadoD, esperadoICMSEfetivado));
		System.out.println(igualDobule(icmsefetivadoD, esperadoICMSEfetivado)+"Valor de credito do ICMS efetivado");
		
		System.out.println("-------------------------------------------------");
		//Valor de credito do ICMS nao Efetivado
		System.out.println("Valor de credito do ICMS nao efetivado");
		String icmsnaoefetivadoS = valordecreditoicmsnaoefetivado.getText();
		icmsnaoefetivadoS =icmsnaoefetivadoS.replace(",", ".");
		System.out.println(icmsnaoefetivadoS+ " String");
		double icmsnaoefetivadoD = new Double(icmsnaoefetivadoS);
		System.out.println(icmsnaoefetivadoD + " Double");
		double esperadoICMSNaoEfetivado = 0.01;
		System.out.println(esperadoICMSNaoEfetivado + " Esperado");
		sucesso.add(igualDobule(icmsnaoefetivadoD, esperadoICMSNaoEfetivado));
		System.out.println(igualDobule(icmsnaoefetivadoD, esperadoICMSNaoEfetivado)+"Valor de credito do ICMS efetivado");
		
		
		System.out.println("-------------------------------------------------");
		//Fator de crediamento da parcela
		System.out.println("Fator de crediamento da parcela");
		String fatorS = fatordecreditamentodaparcela.getText();
		fatorS =fatorS.replace(",", ".");
		System.out.println(fatorS+ " String");
		double fatorD = new Double(fatorS);
		System.out.println(fatorD + " Double");
		double esperadoFator = -2.02;
		System.out.println(esperadoFator + " Esperado");
		sucesso.add(igualDobule(fatorD, esperadoFator));
		System.out.println(igualDobule(fatorD, esperadoFator)+"Fator de crediamento da parcela");
		System.out.println("-------------------------------------------------");
		
		return sucesso;
}
}
