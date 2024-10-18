package com.sap.timp.pageObjectModel.ADM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBase;

public class LoginTC extends TestBase{
	
	
	@FindBy(xpath = "//*[@id=\"login-username\"]/div/div/input")
	public WebElement usuario;
	
	@FindBy(xpath = "//*[@id=\"password\"]/div/div/input")
	public WebElement senha;
	
	@FindBy(xpath = "//div[@id=\"j_username-group\"]/div[2]//input")
	public WebElement usuarioCLOUD;
	
	@FindBy(xpath = "//div[@id=\"j_password-group\"]/div[2]//input")
	public WebElement senhaCLOUD;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	//cloud 
	@FindBy(xpath = "//div[@class=\"content\"]//div[@class=\"saml-login\"]/div[1]/a")
	public WebElement urlAlltax;
	

	@FindBy(xpath = "//*[@id=\"logOnFormSubmit\"]")
	public WebElement botaoCLOUD;
	
	public LoginTC() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean cloud  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("cloud")){
			cloud = true;
		}
		
		
		
		if (cloud == true ) {
			sleep(3000);
			urlAlltax.click();
			sleep(3000);
			
			waitExpectedElement(usuarioCLOUD);
			sleep(3000);
			//Usuario Correto e Senha Correta
			usuarioCLOUD.sendKeys(usuarioLL);
			senhaCLOUD.sendKeys(senhaLL);
			sleep(1000);
			botaoCLOUD.click();
			waitExpectedElement("//*[@id=\"home-icon\"]");
			
			
		}else {
			
			sleep(3000);
			waitExpectedElement(botao);

			//Usuario Correto e Senha Correta
			usuario.sendKeys(usuarioL);
			senha.sendKeys(senhaL);
			sleep(1000);
			botao.click();
			waitExpectedElement("//*[@id=\"home-icon\"]");
			
		}
			
		
		

	
		
	}
	

}
