package com.sap.timp.pageObjectModel.MDR.Centralizacao;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class EstornodeCreditofiltrarPO extends TestBaseEliel {

	@FindBy(xpath = "//input[@placeholder=\"Senha\"]")
	public WebElement senha;
	
	@FindBy(xpath = "//button[@id=\"login-btn\"]")
	public WebElement entrar;
	

	@FindBy(xpath = "//input[@placeholder=\"Usuário\"]")
	public WebElement usuario;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	//botao para ir pra proxima pagina
	@FindBy(xpath = "//*[@id=\"tkb-right-arrow\"]")
	public WebElement ar;
	
	//botao para selecionar o idioma
	@FindBy(xpath="//*[@id=\"select\"]/div[2]")
	public WebElement botaoselecionar;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement idiomaportugues;
	
	public  EstornodeCreditofiltrarPO() {

		PageFactory.initElements(driver, this);
	}	
	
	public boolean Filtrar(){
		
		
		
		
		boolean text = false;
		return text;
	}





}
