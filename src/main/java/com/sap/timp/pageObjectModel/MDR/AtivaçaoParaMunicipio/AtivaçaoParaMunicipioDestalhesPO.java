package com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class AtivaçaoParaMunicipioDestalhesPO extends TestBaseEliel{
	
	@FindBy(xpath = "//span[text()=\"Ativação para Município\"]")
	public WebElement ativaçaoparamunicipio;
	
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement novomunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocial;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralizing-branch\"]/div/div/div[2]")
	public WebElement filialcentralizadora;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"county\"]/div/div[2]")
	public WebElement municipio;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaomunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralized-branches\"]/div/div/div[2]")
	public WebElement filiaiscentralizadora;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofiliais;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public AtivaçaoParaMunicipioDestalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public String detalhes() {
		sleep(2000);
		ativaçaoparamunicipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//pega o ultimo id que foi gerado no criar
				String idRegistro = idObter1();
				
				WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
				WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
				
				actionsMoveToElementElement(menu);
				sleep(2000);
				menu.click();
				sleep(1000);
				detalhes.click();
				sleep(2000);
				
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				fechar.click();
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				
				/*waitExpectElement(siguiente);
				sleep(2000);
				siguiente.click();
				*/
				
				//pega o ultimo id que foi gerado no criar
				String idRegistro1 = idObter1();
				
				WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
				WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
				actionsMoveToElementElement(menu1);
				sleep(2000);
				menu1.click();
				sleep(1000);
				
				visualizar.click();
				sleep(2000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				
				String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
				System.out.println(sucesso);	
				return sucesso;	
		
	}

}
