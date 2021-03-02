package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TarefaManualPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[text()=\"Calendário\"]")
	public WebElement calendario;
	
	public TarefaManualPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> Manual() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		calendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		WebElement OPC = driver.findElement(By.xpath("//div[@id=\"year-wrapper\"]/div[2]/div/div[2]/div[1]/div[2]/div[23]"));

		OPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (tq1 == true) {

			WebElement OPC1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943537\")]"));
			actionsMoveToElementElement(OPC1);
			
			WebElement status1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943537\")]/div[5]"));
			
			
			WebElement nome1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943537\")]/div[4]"));
		
			
			
			String Status11 = status1.getText();
		
			
			String Nome11 = nome1.getText();
			
			
			sucesso.add(Status11.equals("Aberta"));
			
			
			sucesso.add(Nome11.equals("Tarefa Manual"));
			
			

		}else if (tc2 == true) {

			WebElement OPC1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6482\")]"));
			actionsMoveToElementElement(OPC1);
			
			WebElement status1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6482\")]/div[5]"));
			
			WebElement nome1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6482\")]/div[4]"));
	
			
			String Status11 = status1.getText();
		
			String Nome11 = nome1.getText();
			
			sucesso.add(Status11.equals("Aberta"));
			
			sucesso.add(Nome11.equals("Tarefa Manual"));
			
			
			
		}else {
			
		}
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
}
