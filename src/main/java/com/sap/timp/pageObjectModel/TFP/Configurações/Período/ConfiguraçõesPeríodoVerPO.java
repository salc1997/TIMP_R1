package com.sap.timp.pageObjectModel.TFP.Configura��es.Per�odo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Configura��esPer�odoVerPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Configura��es\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Per�odo\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	public Configura��esPer�odoVerPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void Ver() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter4();
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

		menu.click();
		sleep(1000);
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}

}
