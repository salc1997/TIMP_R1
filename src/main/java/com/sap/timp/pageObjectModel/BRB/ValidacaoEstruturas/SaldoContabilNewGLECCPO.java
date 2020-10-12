package com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class SaldoContabilNewGLECCPO extends TestBaseEliel{
	
	
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
	
	@FindBy(xpath = "//div[@data-column=\"12\" and not(@data-path or @aria-label)]/div")
	public WebElement saldojaneiro;
	
	@FindBy(xpath = "//div[@data-column=\"13\" and not(@data-path or @aria-label)]/div")
	public WebElement saldofevereiro;
	
	@FindBy(xpath = "//div[@data-column=\"14\" and not(@data-path or @aria-label)]/div")
	public WebElement saldomarco;
	
	@FindBy(xpath = "//div[@data-column=\"15\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoabril;
	
	@FindBy(xpath = "//div[@data-column=\"28\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladojaneiro;
	
	@FindBy(xpath = "//div[@data-column=\"29\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladofevereiro ;
	
	@FindBy(xpath = "//div[@data-column=\"30\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladomarco ;
	
	@FindBy(xpath = "//div[@data-column=\"31\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladoabril ;
	
	@FindBy(xpath = "//div[@data-column=\"32\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladomaio ;
	
	@FindBy(xpath = "//div[@data-column=\"33\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladojunho;
	
	@FindBy(xpath = "//div[@data-column=\"34\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladojulho;
	
	@FindBy(xpath = "//div[@data-column=\"35\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladoagosto;
	
	@FindBy(xpath = "//div[@data-column=\"36\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladosetembro;
	
	@FindBy(xpath = "//div[@data-column=\"37\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladooutubro;
	
	@FindBy(xpath = "//div[@data-column=\"38\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladonovembro;
	
	@FindBy(xpath = "//div[@data-column=\"39\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumuladodezembro;
	
	@FindBy(xpath = "//div[@data-column=\"40\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumulado13;
	
	@FindBy(xpath = "//div[@data-column=\"41\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumulado14;
	
	@FindBy(xpath = "//div[@data-column=\"42\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumulado15;
	
	@FindBy(xpath = "//div[@data-column=\"43\" and not(@data-path or @aria-label)]/div")
	public WebElement saldoacumulado16;
	
	@FindBy(xpath = "//div[@data-column=\"44\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladojaneiro;
	
	@FindBy(xpath = "//div[@data-column=\"45\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladofevereiro;
	
	@FindBy(xpath = "//div[@data-column=\"46\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladomarco;
	
	@FindBy(xpath = "//div[@data-column=\"47\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladoabril;
	
	@FindBy(xpath = "//div[@data-column=\"48\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladomaio;
	
	@FindBy(xpath = "//div[@data-column=\"49\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladojunho;
	
	@FindBy(xpath = "//div[@data-column=\"50\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladojulho;
	
	@FindBy(xpath = "//div[@data-column=\"51\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladoagosto;
	
	@FindBy(xpath = "//div[@data-column=\"52\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladosetembro;
	
	@FindBy(xpath = "//div[@data-column=\"53\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladooutubro;
	
	@FindBy(xpath = "//div[@data-column=\"54\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladonovembro;

	@FindBy(xpath = "//div[@data-column=\"55\" and not(@data-path or @aria-label)]/div")
	public WebElement creditoacumuladodezembro;
	
	@FindBy(xpath = "//div[@data-column=\"60\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladojaneiro;
	
	@FindBy(xpath = "//div[@data-column=\"61\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladofevereiro;
	
	@FindBy(xpath = "//div[@data-column=\"62\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladomarco;
	
	@FindBy(xpath = "//div[@data-column=\"63\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladoabril;
	
	@FindBy(xpath = "//div[@data-column=\"64\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladomaio;
	
	@FindBy(xpath = "//div[@data-column=\"65\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladojunho;
	
	@FindBy(xpath = "//div[@data-column=\"66\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladojulho;
	
	@FindBy(xpath = "//div[@data-column=\"67\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladoagosto;
	
	@FindBy(xpath = "//div[@data-column=\"68\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladosetembro;
	
	@FindBy(xpath = "//div[@data-column=\"69\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladooutubro;
	
	@FindBy(xpath = "//div[@data-column=\"70\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladonovembro;
	
	@FindBy(xpath = "//div[@data-column=\"71\" and not(@data-path or @aria-label)]/div")
	public WebElement debitoacumuladodezembro;
	
	public SaldoContabilNewGLECCPO() {
		PageFactory.initElements(driver, this);
	}

public ArrayList<Boolean> verificar() {
		
		sleep(2000);
		ferramenta.sendKeys("8004413");
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
		int esperadoLinhas = 990;
		System.out.println(esperadoLinhas);
		sucesso.add(igualInt(totalLinhasI, esperadoLinhas));
		System.out.println(igualInt(totalLinhasI, esperadoLinhas)+" numero linhas");
		
		System.out.println("-------------------------------------------------");
		//Saldo Janeiro
		System.out.println("Saldo Janeiro");
		String saldojaneiroS = saldojaneiro.getText();
		saldojaneiroS = saldojaneiroS.replace(".", "");
		saldojaneiroS = saldojaneiroS.replace(",", ".");
		System.out.println(saldojaneiroS + " String");
		double saldojaneiroD = new Double(saldojaneiroS);
		System.out.println(saldojaneiroD + " Double");
		double esperadoSaldoJaneiro = 2891.57;
		System.out.println(esperadoSaldoJaneiro + " Esperado");
		sucesso.add(igualDobule(saldojaneiroD, esperadoSaldoJaneiro));
		System.out.println(igualDobule(saldojaneiroD, esperadoSaldoJaneiro) +" Saldo Janeiro");
		
		System.out.println("-------------------------------------------------");
		//Saldo fevereiro
		System.out.println("Saldo fevereiro");
		String saldofevereiroS = saldofevereiro.getText();
		saldofevereiroS = saldofevereiroS.replace(".", "");
		saldofevereiroS = saldofevereiroS.replace(",", ".");
		System.out.println(saldofevereiroS + " String");
		double saldofevereiroD = new Double(saldofevereiroS);
		System.out.println(saldofevereiroD + " Double");
		double esperadoSaldoFevereiro = 2891.56;
		System.out.println(esperadoSaldoFevereiro + " Esperado");
		sucesso.add(igualDobule(saldofevereiroD , esperadoSaldoFevereiro));
		System.out.println(igualDobule(saldofevereiroD , esperadoSaldoFevereiro) +" Saldo fevereiro");
		
		System.out.println("-------------------------------------------------");
		//Saldo Março
		System.out.println("Saldo março");
		String saldomarcoS = saldomarco.getText();
		saldomarcoS = saldomarcoS.replace(".", "");
		saldomarcoS = saldomarcoS.replace(",", ".");
		System.out.println(saldomarcoS + " String");
		double saldomarcoD = new Double(saldomarcoS);
		System.out.println( saldomarcoD + " Double");
		double esperadoSaldoMarco = 2891.57;
		System.out.println(esperadoSaldoMarco + " Esperado");
		sucesso.add(igualDobule( saldomarcoD , esperadoSaldoMarco));
		System.out.println(igualDobule( saldomarcoD , esperadoSaldoMarco) +" Saldo marco");
		
		System.out.println("-------------------------------------------------");
		//Saldo Abril
		System.out.println("Saldo abril");
		String saldoabrilS = saldoabril.getText();
		saldoabrilS = saldoabrilS.replace(".", "");
		saldoabrilS = saldoabrilS.replace(",", ".");
		System.out.println(saldoabrilS+ " String");
		double saldoabrilD = new Double(saldoabrilS);
		System.out.println( saldoabrilD + " Double");
		double esperadoSaldoAbril = 3006.96;
		System.out.println(esperadoSaldoAbril + " Esperado");
		sucesso.add(igualDobule( saldoabrilD , esperadoSaldoAbril));
		System.out.println(igualDobule(saldoabrilD , esperadoSaldoAbril) +" Saldo abril");
		
		
		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Janeiro
		System.out.println("Saldo Acumulado Janeiro");
		String saldoacumuladojaneiroS = saldoacumuladojaneiro.getText();
		saldoacumuladojaneiroS = saldoacumuladojaneiroS.replace(".", "");
		saldoacumuladojaneiroS = saldoacumuladojaneiroS.replace(",", ".");
		System.out.println(saldoacumuladojaneiroS+ " String");
		double saldoacumuladojaneiroD = new Double(saldoacumuladojaneiroS);
		System.out.println( saldoacumuladojaneiroD + " Double");
		double esperadoSaldoAcumuladoJaneiro = 2891.57;
		System.out.println(esperadoSaldoAcumuladoJaneiro + " Esperado");
		sucesso.add(igualDobule( saldoacumuladojaneiroD , esperadoSaldoAcumuladoJaneiro));
		System.out.println(igualDobule(saldoacumuladojaneiroD , esperadoSaldoAcumuladoJaneiro) +" Saldo Acumulado Janeiro");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Fevereiro
		System.out.println("Saldo Acumulado fevereiro");
		String saldoacumuladofevereiroS = saldoacumuladofevereiro.getText();
		saldoacumuladofevereiroS = saldoacumuladofevereiroS.replace(".", "");
		saldoacumuladofevereiroS = saldoacumuladofevereiroS.replace(",", ".");
		System.out.println(saldoacumuladofevereiroS+ " String");
		double saldoacumuladofevereiroD = new Double(saldoacumuladofevereiroS);
		System.out.println( saldoacumuladofevereiroD + " Double");
		double esperadoSaldoAcumuladoFevereiro = 5783.13;
		System.out.println(esperadoSaldoAcumuladoFevereiro+ " Esperado");
		sucesso.add(igualDobule( saldoacumuladofevereiroD , esperadoSaldoAcumuladoFevereiro));
		System.out.println(igualDobule(saldoacumuladofevereiroD , esperadoSaldoAcumuladoFevereiro) +" Saldo Acumulado fevereiro");

		
		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Marco
		System.out.println("Saldo Acumulado marco");
		String  saldoacumuladomarcoS = saldoacumuladomarco.getText();
		 saldoacumuladomarcoS =  saldoacumuladomarcoS.replace(".", "");
		 saldoacumuladomarcoS =  saldoacumuladomarcoS.replace(",", ".");
		System.out.println( saldoacumuladomarcoS+ " String");
		double  saldoacumuladomarcoD = new Double( saldoacumuladomarcoS);
		System.out.println(  saldoacumuladomarcoD + " Double");
		double esperadoSaldoAcumuladoMarco = 8674.70;
		System.out.println(esperadoSaldoAcumuladoMarco + " Esperado");
		sucesso.add(igualDobule( saldoacumuladomarcoD , esperadoSaldoAcumuladoMarco));
		System.out.println(igualDobule(saldoacumuladomarcoD , esperadoSaldoAcumuladoMarco) +" Saldo Acumulado marco");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Abril
		System.out.println("Saldo Acumulado abril");
		String  saldoacumuladoabrilS = saldoacumuladoabril.getText();
		saldoacumuladoabrilS =  saldoacumuladoabrilS.replace(".", "");
		saldoacumuladoabrilS =  saldoacumuladoabrilS.replace(",", ".");
		System.out.println( saldoacumuladoabrilS+ " String");
		double  saldoacumuladoabrilD = new Double( saldoacumuladoabrilS);
		System.out.println(  saldoacumuladoabrilD + " Double");
		double esperadoSaldoAcumuladoAbril = 11681.66;
		System.out.println(esperadoSaldoAcumuladoAbril + " Esperado");
		sucesso.add(igualDobule( saldoacumuladoabrilD , esperadoSaldoAcumuladoAbril));
		System.out.println(igualDobule(saldoacumuladoabrilD , esperadoSaldoAcumuladoAbril) +" Saldo Acumulado abril");
		
		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Maio
		System.out.println("Saldo Acumulado maio");
		String  saldoacumuladomaioS = saldoacumuladomaio.getText();
		saldoacumuladomaioS =  saldoacumuladomaioS.replace(".", "");
		saldoacumuladomaioS =  saldoacumuladomaioS.replace(",", ".");
		System.out.println( saldoacumuladomaioS+ " String");
		double  saldoacumuladomaioD = new Double( saldoacumuladomaioS);
		System.out.println(  saldoacumuladomaioD + " Double");
		double esperadoSaldoAcumuladoMaio = 11681.66;
		System.out.println(esperadoSaldoAcumuladoMaio + " Esperado");
		sucesso.add(igualDobule( saldoacumuladomaioD , esperadoSaldoAcumuladoMaio));
		System.out.println(igualDobule(saldoacumuladomaioD , esperadoSaldoAcumuladoMaio) +" Saldo Acumulado maio");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Junho
		System.out.println("Saldo Acumulado junho");
		String  saldoacumuladojunhoS = saldoacumuladojunho.getText();
		saldoacumuladojunhoS =  saldoacumuladojunhoS.replace(".", "");
		saldoacumuladojunhoS =  saldoacumuladojunhoS.replace(",", ".");
		System.out.println( saldoacumuladojunhoS+ " String");
		double saldoacumuladojunhoD = new Double( saldoacumuladojunhoS);
		System.out.println(  saldoacumuladojunhoD + " Double");
		double esperadoSaldoAcumuladoJunho = 11681.66;
		System.out.println( esperadoSaldoAcumuladoJunho + " Esperado");
		sucesso.add(igualDobule( saldoacumuladojunhoD ,  esperadoSaldoAcumuladoJunho));
		System.out.println(igualDobule(saldoacumuladojunhoD ,  esperadoSaldoAcumuladoJunho) +" Saldo Acumulado junho");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Julho
		System.out.println("Saldo Acumulado julho");
		String  saldoacumuladojulhoS = saldoacumuladojulho.getText();
		saldoacumuladojulhoS =  saldoacumuladojulhoS.replace(".", "");
		saldoacumuladojulhoS =  saldoacumuladojulhoS.replace(",", ".");
		System.out.println( saldoacumuladojulhoS+ " String");
		double saldoacumuladojulhoD = new Double( saldoacumuladojulhoS);
		System.out.println(  saldoacumuladojulhoD + " Double");
		double esperadoSaldoAcumuladoJulho = 11681.66;
		System.out.println( esperadoSaldoAcumuladoJulho + " Esperado");
		sucesso.add(igualDobule( saldoacumuladojulhoD ,  esperadoSaldoAcumuladoJulho));
		System.out.println(igualDobule(saldoacumuladojulhoD ,  esperadoSaldoAcumuladoJulho) +" Saldo Acumulado julho");

		
		
		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Agosto
		System.out.println("Saldo Acumulado agosto");
		String  saldoacumuladoagostoS = saldoacumuladoagosto.getText();
		saldoacumuladoagostoS =  saldoacumuladoagostoS.replace(".", "");
		saldoacumuladoagostoS =  saldoacumuladoagostoS.replace(",", ".");
		System.out.println( saldoacumuladoagostoS+ " String");
		double saldoacumuladoagostoD = new Double( saldoacumuladoagostoS);
		System.out.println(  saldoacumuladoagostoD + " Double");
		double esperadoSaldoAcumuladoAgosto = 11681.66;
		System.out.println( esperadoSaldoAcumuladoAgosto + " Esperado");
		sucesso.add(igualDobule( saldoacumuladoagostoD ,  esperadoSaldoAcumuladoAgosto));
		System.out.println(igualDobule(saldoacumuladoagostoD ,  esperadoSaldoAcumuladoAgosto) +" Saldo Acumulado agosto");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Setembro
		System.out.println("Saldo Acumulado setembro");
		String  saldoacumuladosetembroS = saldoacumuladosetembro.getText();
		saldoacumuladosetembroS =  saldoacumuladosetembroS.replace(".", "");
		saldoacumuladosetembroS =  saldoacumuladosetembroS.replace(",", ".");
		System.out.println( saldoacumuladosetembroS+ " String");
		double saldoacumuladosetembroD = new Double(saldoacumuladosetembroS);
		System.out.println(  saldoacumuladosetembroD + " Double");
		double esperadoSaldoAcumuladoSetembro = 11681.66;
		System.out.println( esperadoSaldoAcumuladoSetembro + " Esperado");
		sucesso.add(igualDobule( saldoacumuladosetembroD ,  esperadoSaldoAcumuladoSetembro));
		System.out.println(igualDobule(saldoacumuladosetembroD ,  esperadoSaldoAcumuladoSetembro) +" Saldo Acumulado setembro");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Outubro
		System.out.println("Saldo Acumulado outubro");
		String  saldoacumuladooutubroS = saldoacumuladooutubro.getText();
		saldoacumuladooutubroS =  saldoacumuladooutubroS.replace(".", "");
		saldoacumuladooutubroS =  saldoacumuladooutubroS.replace(",", ".");
		System.out.println( saldoacumuladooutubroS+ " String");
		double saldoacumuladooutubroD = new Double(saldoacumuladooutubroS);
		System.out.println(  saldoacumuladooutubroD + " Double");
		double esperadoSaldoAcumuladoOutubro = 11681.66;
		System.out.println( esperadoSaldoAcumuladoOutubro  + " Esperado");
		sucesso.add(igualDobule( saldoacumuladooutubroD ,  esperadoSaldoAcumuladoOutubro ));
		System.out.println(igualDobule(saldoacumuladooutubroD , esperadoSaldoAcumuladoOutubro ) +" Saldo Acumulado outubro");

		
		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Novembro
		System.out.println("Saldo Acumulado novembro");
		String  saldoacumuladonovembroS = saldoacumuladonovembro.getText();
		saldoacumuladonovembroS =  saldoacumuladonovembroS.replace(".", "");
		saldoacumuladonovembroS =  saldoacumuladonovembroS.replace(",", ".");
		System.out.println( saldoacumuladonovembroS+ " String");
		double saldoacumuladonovembroD = new Double(saldoacumuladonovembroS);
		System.out.println(  saldoacumuladonovembroD + " Double");
		double esperadoSaldoAcumuladoNovembro = 11681.66;
		System.out.println( esperadoSaldoAcumuladoNovembro  + " Esperado");
		sucesso.add(igualDobule( saldoacumuladonovembroD , esperadoSaldoAcumuladoNovembro ));
		System.out.println(igualDobule(saldoacumuladonovembroD , esperadoSaldoAcumuladoNovembro ) +" Saldo Acumulado novembro");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado Dezembro
		System.out.println("Saldo Acumulado dezembro");
		String  saldoacumuladodezembroS = saldoacumuladodezembro.getText();
		saldoacumuladodezembroS =  saldoacumuladodezembroS.replace(".", "");
		saldoacumuladodezembroS =  saldoacumuladodezembroS.replace(",", ".");
		System.out.println( saldoacumuladodezembroS+ " String");
		double saldoacumuladodezembroD = new Double(saldoacumuladodezembroS);
		System.out.println( saldoacumuladodezembroD + " Double");
		double esperadoSaldoAcumuladoDezembro = 11681.66;
		System.out.println( esperadoSaldoAcumuladoDezembro  + " Esperado");
		sucesso.add(igualDobule( saldoacumuladodezembroD , esperadoSaldoAcumuladoDezembro ));
		System.out.println(igualDobule(saldoacumuladodezembroD , esperadoSaldoAcumuladoDezembro ) +" Saldo Acumulado dezembro");
		
		System.out.println("-------------------------------------------------");
		//Saldo Acumulado 13
		System.out.println("Saldo Acumulado 13");
		String  saldoacumulado13S = saldoacumulado13.getText();
		saldoacumulado13S = saldoacumulado13S.replace(".", "");
		saldoacumulado13S =  saldoacumulado13S.replace(",", ".");
		System.out.println( saldoacumulado13S+ " String");
		double saldoacumulado13D = new Double(saldoacumulado13S);
		System.out.println(saldoacumulado13D + " Double");
		double esperadoSaldoAcumulado13 = 11681.66;
		System.out.println( esperadoSaldoAcumulado13  + " Esperado");
		sucesso.add(igualDobule(saldoacumulado13D , esperadoSaldoAcumulado13 ));
		System.out.println(igualDobule(saldoacumulado13D , esperadoSaldoAcumulado13 ) +" Saldo Acumulado 13");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado 14
		System.out.println("Saldo Acumulado 14");
		String  saldoacumulado14S = saldoacumulado14.getText();
		saldoacumulado14S = saldoacumulado14S.replace(".", "");
		saldoacumulado14S =  saldoacumulado14S.replace(",", ".");
		System.out.println( saldoacumulado14S+ " String");
		double saldoacumulado14D = new Double(saldoacumulado14S);
		System.out.println(saldoacumulado14D + " Double");
		double esperadoSaldoAcumulado14 = 11681.66;
		System.out.println( esperadoSaldoAcumulado14  + " Esperado");
		sucesso.add(igualDobule(saldoacumulado14D , esperadoSaldoAcumulado14 ));
		System.out.println(igualDobule(saldoacumulado14D , esperadoSaldoAcumulado14 ) +" Saldo Acumulado 14");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado 15
		System.out.println("Saldo Acumulado 15");
		String  saldoacumulado15S = saldoacumulado15.getText();
		saldoacumulado15S = saldoacumulado15S.replace(".", "");
		saldoacumulado15S =  saldoacumulado15S.replace(",", ".");
		System.out.println( saldoacumulado15S+ " String");
		double saldoacumulado15D = new Double(saldoacumulado15S);
		System.out.println(saldoacumulado15D + " Double");
		double esperadoSaldoAcumulado15 = 11681.66;
		System.out.println( esperadoSaldoAcumulado15  + " Esperado");
		sucesso.add(igualDobule(saldoacumulado14D , esperadoSaldoAcumulado15 ));
		System.out.println(igualDobule(saldoacumulado14D , esperadoSaldoAcumulado15 ) +" Saldo Acumulado 15");

		System.out.println("-------------------------------------------------");
		//Saldo Acumulado 16
		System.out.println("Saldo Acumulado 16");
		String  saldoacumulado16S = saldoacumulado16.getText();
		saldoacumulado16S = saldoacumulado16S.replace(".", "");
		saldoacumulado16S =  saldoacumulado16S.replace(",", ".");
		System.out.println( saldoacumulado16S+ " String");
		double saldoacumulado16D = new Double(saldoacumulado16S);
		System.out.println(saldoacumulado16D + " Double");
		double esperadoSaldoAcumulado16 = 11681.66;
		System.out.println( esperadoSaldoAcumulado16  + " Esperado");
		sucesso.add(igualDobule(saldoacumulado16D , esperadoSaldoAcumulado16 ));
		System.out.println(igualDobule(saldoacumulado16D , esperadoSaldoAcumulado16 ) +" Saldo Acumulado 16");

		
		
		System.out.println("-------------------------------------------------");
		//Credito acumulado janeiro
		System.out.println("Credito acumulado janeiro");
		String  creditoacumuladojaneiroS = creditoacumuladojaneiro.getText();
		creditoacumuladojaneiroS = creditoacumuladojaneiroS.replace(".", "");
		creditoacumuladojaneiroS = creditoacumuladojaneiroS.replace(",", ".");
		System.out.println( creditoacumuladojaneiroS+ " String");
		double creditoacumuladojaneiroD = new Double(creditoacumuladojaneiroS);
		System.out.println(creditoacumuladojaneiroD + " Double");
		double esperadocreditoacumuladojaneiro = 42306690413.66;
		System.out.println( esperadocreditoacumuladojaneiro  + " Esperado");
		sucesso.add(igualDobule(creditoacumuladojaneiroD , esperadocreditoacumuladojaneiro ));
		System.out.println(igualDobule(creditoacumuladojaneiroD , esperadocreditoacumuladojaneiro ) +" Credito acumulado janeiro");

		System.out.println("-------------------------------------------------");
		//Credito acumulado fevereiro
		System.out.println("Credito acumulado fevereiro");
		String  creditoacumuladofevereiroS = creditoacumuladofevereiro.getText();
		creditoacumuladofevereiroS = creditoacumuladofevereiroS.replace(".", "");
		creditoacumuladofevereiroS = creditoacumuladofevereiroS.replace(",", ".");
		System.out.println( creditoacumuladofevereiroS+ " String");
		double creditoacumuladofevereiroD = new Double(creditoacumuladofevereiroS);
		System.out.println(creditoacumuladofevereiroD + " Double");
		double esperadocreditoacumuladofevereiro = 69820361837.93;
		System.out.println( esperadocreditoacumuladofevereiro  + " Esperado");
		sucesso.add(igualDobule(creditoacumuladofevereiroD , esperadocreditoacumuladofevereiro));
		System.out.println(igualDobule(creditoacumuladofevereiroD , esperadocreditoacumuladofevereiro ) +" Credito acumulado fevereiro");

		System.out.println("-------------------------------------------------");
		//Credito acumulado marco
		System.out.println("Credito acumulado marco");
		String  creditoacumuladomarcoS = creditoacumuladomarco.getText();
		creditoacumuladomarcoS = creditoacumuladomarcoS.replace(".", "");
		creditoacumuladomarcoS = creditoacumuladomarcoS.replace(",", ".");
		System.out.println( creditoacumuladomarcoS+ " String");
		double creditoacumuladomarcoD = new Double(creditoacumuladomarcoS);
		System.out.println(creditoacumuladomarcoD + " Double");
		double esperadocreditoacumuladomarco = 22522317200.22;
		System.out.println( esperadocreditoacumuladomarco  + " Esperado");
		sucesso.add(igualDobule(creditoacumuladomarcoD , esperadocreditoacumuladomarco));
		System.out.println(igualDobule(creditoacumuladomarcoD , esperadocreditoacumuladomarco ) +" Credito acumulado marco");

		
		System.out.println("-------------------------------------------------");
		//Credito acumulado abril
		System.out.println("Credito acumulado abril");
		String  creditoacumuladoabrilS = creditoacumuladoabril.getText();
		creditoacumuladoabrilS = creditoacumuladoabrilS.replace(".", "");
		creditoacumuladoabrilS = creditoacumuladoabrilS.replace(",", ".");
		System.out.println( creditoacumuladoabrilS+ " String");
		double creditoacumuladoabrilD = new Double(creditoacumuladoabrilS);
		System.out.println(creditoacumuladoabrilD + " Double");
		double esperadocreditoacumuladoabril = 20369504016.14;
		System.out.println( esperadocreditoacumuladoabril + " Esperado");
		sucesso.add(igualDobule(creditoacumuladoabrilD , esperadocreditoacumuladoabril));
		System.out.println(igualDobule(creditoacumuladoabrilD , esperadocreditoacumuladoabril ) +" Credito acumulado abril");
		
		System.out.println("-------------------------------------------------");
		//Credito acumulado maio
		System.out.println("Credito acumulado maio");
		String  creditoacumuladomaioS = creditoacumuladomaio.getText();
		creditoacumuladomaioS = creditoacumuladomaioS.replace(".", "");
		creditoacumuladomaioS = creditoacumuladomaioS.replace(",", ".");
		System.out.println( creditoacumuladomaioS+ " String");
		double creditoacumuladomaioD = new Double(creditoacumuladomaioS);
		System.out.println(creditoacumuladomaioD + " Double");
		double esperadocreditoacumuladomaio = 12032697944.82;
		System.out.println( esperadocreditoacumuladomaio + " Esperado");
		sucesso.add(igualDobule(creditoacumuladomaioD , esperadocreditoacumuladomaio));
		System.out.println(igualDobule(creditoacumuladomaioD , esperadocreditoacumuladomaio ) +" Credito acumulado maio");

		
		System.out.println("-------------------------------------------------");
		//Credito acumulado junho
		System.out.println("Credito acumulado junho");
		String  creditoacumuladojunhoS = creditoacumuladojunho.getText();
		creditoacumuladojunhoS = creditoacumuladojunhoS.replace(".", "");
		creditoacumuladojunhoS = creditoacumuladojunhoS.replace(",", ".");
		System.out.println( creditoacumuladojunhoS+ " String");
		double creditoacumuladojunhoD = new Double(creditoacumuladojunhoS);
		System.out.println(creditoacumuladojunhoD + " Double");
		double esperadocreditoacumuladojunho = 21911123104.85;
		System.out.println( esperadocreditoacumuladojunho + " Esperado");
		sucesso.add(igualDobule(creditoacumuladojunhoD , esperadocreditoacumuladojunho));
		System.out.println(igualDobule(creditoacumuladojunhoD , esperadocreditoacumuladojunho ) +" Credito acumulado junho");

		
		System.out.println("-------------------------------------------------");
		//Credito acumulado julho
		System.out.println("Credito acumulado julho");
		String  creditoacumuladojulhoS = creditoacumuladojulho.getText();
		creditoacumuladojulhoS = creditoacumuladojulhoS.replace(".", "");
		creditoacumuladojulhoS = creditoacumuladojulhoS.replace(",", ".");
		System.out.println(creditoacumuladojulhoS+ " String");
		double creditoacumuladojulhoD = new Double(creditoacumuladojulhoS);
		System.out.println(creditoacumuladojulhoD + " Double");
		double esperadocreditoacumuladojulho = 24356170594.44;
		System.out.println( esperadocreditoacumuladojulho + " Esperado");
		sucesso.add(igualDobule(creditoacumuladojulhoD , esperadocreditoacumuladojulho));
		System.out.println(igualDobule(creditoacumuladojulhoD , esperadocreditoacumuladojulho ) +" Credito acumulado julho");

		System.out.println("-------------------------------------------------");
		//Credito acumulado Agosto
		System.out.println("Credito acumulado agosto");
		String  creditoacumuladoagostoS = creditoacumuladoagosto.getText();
		creditoacumuladoagostoS = creditoacumuladoagostoS.replace(".", "");
		creditoacumuladoagostoS = creditoacumuladoagostoS.replace(",", ".");
		System.out.println(creditoacumuladoagostoS+ " String");
		double creditoacumuladoagostoD = new Double(creditoacumuladoagostoS);
		System.out.println(creditoacumuladoagostoD + " Double");
		double esperadocreditoacumuladoagosto = 4481888678.88;
		System.out.println( esperadocreditoacumuladoagosto + " Esperado");
		sucesso.add(igualDobule(creditoacumuladoagostoD , esperadocreditoacumuladoagosto));
		System.out.println(igualDobule(creditoacumuladoagostoD , esperadocreditoacumuladoagosto ) +" Credito acumulado agosto");

		
		System.out.println("-------------------------------------------------");
		//Credito acumulado Setembro
		System.out.println("Credito acumulado setembro");
		String  creditoacumuladosetembroS = creditoacumuladosetembro.getText();
		creditoacumuladosetembroS = creditoacumuladosetembroS.replace(".", "");
		creditoacumuladosetembroS = creditoacumuladosetembroS.replace(",", ".");
		System.out.println(creditoacumuladosetembroS+ " String");
		double creditoacumuladosetembroD = new Double(creditoacumuladosetembroS);
		System.out.println(creditoacumuladosetembroD + " Double");
		double esperadocreditoacumuladosetembro = 3581708266.64;
		System.out.println( esperadocreditoacumuladosetembro + " Esperado");
		sucesso.add(igualDobule(creditoacumuladosetembroD , esperadocreditoacumuladosetembro));
		System.out.println(igualDobule(creditoacumuladosetembroD , esperadocreditoacumuladosetembro ) +" Credito acumulado setembro");

		
		
		System.out.println("-------------------------------------------------");
		//Credito acumulado Outubro
		System.out.println("Credito acumulado outubro");
		String  creditoacumuladooutubroS = creditoacumuladooutubro.getText();
		creditoacumuladooutubroS = creditoacumuladooutubroS.replace(".", "");
		creditoacumuladooutubroS = creditoacumuladooutubroS.replace(",", ".");
		System.out.println(creditoacumuladooutubroS+ " String");
		double creditoacumuladooutubroD = new Double(creditoacumuladooutubroS);
		System.out.println(creditoacumuladooutubroD + " Double");
		double esperadocreditoacumuladooutubro = 184009388.79;
		System.out.println( esperadocreditoacumuladooutubro + " Esperado");
		sucesso.add(igualDobule(creditoacumuladooutubroD , esperadocreditoacumuladooutubro));
		System.out.println(igualDobule(creditoacumuladooutubroD , esperadocreditoacumuladooutubro ) +" Credito acumulado outubro");

		System.out.println("-------------------------------------------------");
		//Credito acumulado Novembro
		System.out.println("Credito acumulado novembro");
		String  creditoacumuladonovembroS = creditoacumuladonovembro.getText();
		creditoacumuladonovembroS = creditoacumuladonovembroS.replace(".", "");
		creditoacumuladonovembroS = creditoacumuladonovembroS.replace(",", ".");
		System.out.println(creditoacumuladonovembroS+ " String");
		double creditoacumuladonovembroD = new Double(creditoacumuladonovembroS);
		System.out.println(creditoacumuladonovembroD + " Double");
		double esperadocreditoacumuladonovembro = 2876229227.56 ;
		System.out.println( esperadocreditoacumuladonovembro + " Esperado");
		sucesso.add(igualDobule(creditoacumuladonovembroD , esperadocreditoacumuladonovembro));
		System.out.println(igualDobule(creditoacumuladonovembroD , esperadocreditoacumuladonovembro ) +" Credito acumulado novembro");

		
		System.out.println("-------------------------------------------------");
		//Credito acumulado Dezembro
		System.out.println("Credito acumulado dezembro");
		String  creditoacumuladodezembroS = creditoacumuladodezembro.getText();
		creditoacumuladodezembroS = creditoacumuladodezembroS.replace(".", "");
		creditoacumuladodezembroS = creditoacumuladodezembroS.replace(",", ".");
		System.out.println(creditoacumuladodezembroS+ " String");
		double creditoacumuladodezembroD = new Double(creditoacumuladodezembroS);
		System.out.println(creditoacumuladodezembroD + " Double");
		double esperadocreditoacumuladodezembro = 3406334619.14 ;
		System.out.println( esperadocreditoacumuladodezembro + " Esperado");
		sucesso.add(igualDobule(creditoacumuladodezembroD , esperadocreditoacumuladodezembro));
		System.out.println(igualDobule(creditoacumuladodezembroD , esperadocreditoacumuladodezembro ) +" Credito acumulado dezembro");

		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado Janeiro
		System.out.println("Debito Acumulado Janeiro");
		String  debitoacumuladojaneiroS = debitoacumuladojaneiro.getText();
		debitoacumuladojaneiroS = debitoacumuladojaneiroS.replace(".", "");
		debitoacumuladojaneiroS = debitoacumuladojaneiroS.replace(",", ".");
		System.out.println(debitoacumuladojaneiroS+ " String");
		double debitoacumuladojaneiroD = new Double(debitoacumuladojaneiroS);
		System.out.println(debitoacumuladojaneiroD + " Double");
		double esperadodebitoacumuladojaneiro = -42306693305.23 ;
		System.out.println( esperadodebitoacumuladojaneiro + " Esperado");
		sucesso.add(igualDobule(debitoacumuladojaneiroD , esperadodebitoacumuladojaneiro));
		System.out.println(igualDobule(debitoacumuladojaneiroD , esperadodebitoacumuladojaneiro) +"Debito Acumulado Janeiro");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado fevereiro
		System.out.println("Debito Acumulado fevereiro");
		String  debitoacumuladofevereiroS = debitoacumuladofevereiro.getText();
		debitoacumuladofevereiroS = debitoacumuladofevereiroS.replace(".", "");
		debitoacumuladofevereiroS = debitoacumuladofevereiroS.replace(",", ".");
		System.out.println(debitoacumuladofevereiroS+ " String");
		double debitoacumuladofevereiroD = new Double(debitoacumuladofevereiroS);
		System.out.println(debitoacumuladofevereiroD + " Double");
		double esperadodebitoacumuladofevereiro = -69820364729.49;
		System.out.println( esperadodebitoacumuladofevereiro + " Esperado");
		sucesso.add(igualDobule(debitoacumuladofevereiroD , esperadodebitoacumuladofevereiro));
		System.out.println(igualDobule(debitoacumuladofevereiroD , esperadodebitoacumuladofevereiro) +"Debito Acumulado fevereiro");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado marco
		System.out.println("Debito Acumulado marco");
		String  debitoacumuladomarcoS = debitoacumuladomarco.getText();
		debitoacumuladomarcoS = debitoacumuladomarcoS.replace(".", "");
		debitoacumuladomarcoS = debitoacumuladomarcoS.replace(",", ".");
		System.out.println(debitoacumuladomarcoS+ " String");
		double debitoacumuladomarcoD = new Double(debitoacumuladomarcoS);
		System.out.println(debitoacumuladomarcoD + " Double");
		double esperadodebitoacumuladomarco = -22522320091.79;
		System.out.println( esperadodebitoacumuladomarco + " Esperado");
		sucesso.add(igualDobule(debitoacumuladomarcoD , esperadodebitoacumuladomarco));
		System.out.println(igualDobule(debitoacumuladomarcoD , esperadodebitoacumuladomarco) +"Debito Acumulado marco");
		
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado abril
		System.out.println("Debito Acumulado abril");
		String  debitoacumuladoabrilS = debitoacumuladoabril.getText();
		debitoacumuladoabrilS = debitoacumuladoabrilS.replace(".", "");
		debitoacumuladoabrilS = debitoacumuladoabrilS.replace(",", ".");
		System.out.println(debitoacumuladoabrilS+ " String");
		double debitoacumuladoabrilD = new Double(debitoacumuladoabrilS);
		System.out.println(debitoacumuladoabrilD + " Double");
		double esperadodebitoacumuladoabril = -20369507023.10;
		System.out.println( esperadodebitoacumuladoabril + " Esperado");
		sucesso.add(igualDobule(debitoacumuladoabrilD , esperadodebitoacumuladoabril));
		System.out.println(igualDobule(debitoacumuladoabrilD , esperadodebitoacumuladoabril) +"Debito Acumulado abril");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado maio
		System.out.println("Debito Acumulado maio");
		String  debitoacumuladomaioS = debitoacumuladomaio.getText();
		debitoacumuladomaioS = debitoacumuladomaioS.replace(".", "");
		debitoacumuladomaioS = debitoacumuladomaioS.replace(",", ".");
		System.out.println(debitoacumuladomaioS+ " String");
		double debitoacumuladomaioD = new Double(debitoacumuladomaioS);
		System.out.println(debitoacumuladomaioD + " Double");
		double esperadodebitoacumuladomaio = -12032697944.82;
		System.out.println( esperadodebitoacumuladomaio + " Esperado");
		sucesso.add(igualDobule(debitoacumuladomaioD , esperadodebitoacumuladomaio));
		System.out.println(igualDobule(debitoacumuladomaioD , esperadodebitoacumuladomaio) +"Debito Acumulado maio");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado junho
		System.out.println("Debito Acumulado junho");
		String  debitoacumuladojunhoS = debitoacumuladojunho.getText();
		debitoacumuladojunhoS = debitoacumuladojunhoS.replace(".", "");
		debitoacumuladojunhoS = debitoacumuladojunhoS.replace(",", ".");
		System.out.println(debitoacumuladojunhoS+ " String");
		double debitoacumuladojunhoD = new Double(debitoacumuladojunhoS);
		System.out.println(debitoacumuladojunhoD + " Double");
		double esperadodebitoacumuladojunho = -21911123104.85;
		System.out.println( esperadodebitoacumuladojunho + " Esperado");
		sucesso.add(igualDobule(debitoacumuladojunhoD , esperadodebitoacumuladojunho));
		System.out.println(igualDobule(debitoacumuladojunhoD , esperadodebitoacumuladojunho) +"Debito Acumulado junho");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado julho
		System.out.println("Debito Acumulado julho");
		String  debitoacumuladojulhoS = debitoacumuladojulho.getText();
		debitoacumuladojulhoS = debitoacumuladojulhoS.replace(".", "");
		debitoacumuladojulhoS = debitoacumuladojulhoS.replace(",", ".");
		System.out.println(debitoacumuladojulhoS+ " String");
		double debitoacumuladojulhoD = new Double(debitoacumuladojulhoS);
		System.out.println(debitoacumuladojulhoD + " Double");
		double esperadodebitoacumuladojulho = -24356170594.44;
		System.out.println( esperadodebitoacumuladojulho + " Esperado");
		sucesso.add(igualDobule(debitoacumuladojulhoD , esperadodebitoacumuladojulho));
		System.out.println(igualDobule(debitoacumuladojulhoD , esperadodebitoacumuladojulho) +"Debito Acumulado julho");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado Agosto
		System.out.println("Debito Acumulado agosto");
		String  debitoacumuladoagostoS = debitoacumuladoagosto.getText();
		debitoacumuladoagostoS = debitoacumuladoagostoS.replace(".", "");
		debitoacumuladoagostoS = debitoacumuladoagostoS.replace(",", ".");
		System.out.println(debitoacumuladoagostoS+ " String");
		double debitoacumuladoagostoD = new Double(debitoacumuladoagostoS);
		System.out.println(debitoacumuladoagostoD + " Double");
		double esperadodebitoacumuladoagosto = -4481888678.88;
		System.out.println( esperadodebitoacumuladoagosto + " Esperado");
		sucesso.add(igualDobule(debitoacumuladoagostoD , esperadodebitoacumuladoagosto));
		System.out.println(igualDobule(debitoacumuladoagostoD , esperadodebitoacumuladoagosto) +"Debito Acumulado agosto");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado Setembro
		System.out.println("Debito Acumulado setembro");
		String debitoacumuladosetembroS = debitoacumuladosetembro.getText();
		debitoacumuladosetembroS = debitoacumuladosetembroS.replace(".", "");
		debitoacumuladosetembroS = debitoacumuladosetembroS.replace(",", ".");
		System.out.println(debitoacumuladosetembroS+ " String");
		double debitoacumuladosetembroD = new Double(debitoacumuladosetembroS);
		System.out.println(debitoacumuladosetembroD + " Double");
		double esperadodebitoacumuladosetembro = -3581708266.64;
		System.out.println( esperadodebitoacumuladosetembro + " Esperado");
		sucesso.add(igualDobule(debitoacumuladosetembroD , esperadodebitoacumuladosetembro));
		System.out.println(igualDobule(debitoacumuladosetembroD , esperadodebitoacumuladosetembro) +"Debito Acumulado setembro");
		
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado outubro
		System.out.println("Debito Acumulado outubro");
		String debitoacumuladooutubroS = debitoacumuladooutubro.getText();
		debitoacumuladooutubroS = debitoacumuladooutubroS.replace(".", "");
		debitoacumuladooutubroS = debitoacumuladooutubroS.replace(",", ".");
		System.out.println(debitoacumuladooutubroS+ " String");
		double debitoacumuladooutubroD = new Double(debitoacumuladooutubroS);
		System.out.println(debitoacumuladooutubroD + " Double");
		double esperadodebitoacumuladooutubro = -184009388.79;
		System.out.println( esperadodebitoacumuladooutubro + " Esperado");
		sucesso.add(igualDobule(debitoacumuladooutubroD , esperadodebitoacumuladooutubro));
		System.out.println(igualDobule(debitoacumuladooutubroD , esperadodebitoacumuladooutubro) +"Debito Acumulado outubro");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado novembro
		System.out.println("Debito Acumulado novembro");
		String debitoacumuladonovembroS = debitoacumuladonovembro.getText();
		debitoacumuladonovembroS = debitoacumuladonovembroS.replace(".", "");
		debitoacumuladonovembroS = debitoacumuladonovembroS.replace(",", ".");
		System.out.println(debitoacumuladonovembroS+ " String");
		double debitoacumuladonovembroD = new Double(debitoacumuladonovembroS);
		System.out.println(debitoacumuladonovembroD + " Double");
		double esperadodebitoacumuladonovembro = -2876229227.56;
		System.out.println( esperadodebitoacumuladonovembro + " Esperado");
		sucesso.add(igualDobule(debitoacumuladonovembroD , esperadodebitoacumuladonovembro));
		System.out.println(igualDobule(debitoacumuladonovembroD , esperadodebitoacumuladonovembro) +"Debito Acumulado novembro");
		
		System.out.println("-------------------------------------------------");
		//Debito Acumulado dezembro
		System.out.println("Debito Acumulado dezembro");
		String debitoacumuladodezembroS = debitoacumuladodezembro.getText();
		debitoacumuladodezembroS = debitoacumuladodezembroS.replace(".", "");
		debitoacumuladodezembroS = debitoacumuladodezembroS.replace(",", ".");
		System.out.println(debitoacumuladodezembroS+ " String");
		double debitoacumuladodezembroD = new Double(debitoacumuladodezembroS);
		System.out.println(debitoacumuladodezembroD + " Double");
		double esperadodebitoacumuladodezembro = -3406334619.14;
		System.out.println( esperadodebitoacumuladodezembro + " Esperado");
		sucesso.add(igualDobule(debitoacumuladodezembroD , esperadodebitoacumuladodezembro));
		System.out.println(igualDobule(debitoacumuladodezembroD , esperadodebitoacumuladodezembro) +"Debito Acumulado dezembro");
		
		
		return sucesso;
}
	
	
	
	

}
