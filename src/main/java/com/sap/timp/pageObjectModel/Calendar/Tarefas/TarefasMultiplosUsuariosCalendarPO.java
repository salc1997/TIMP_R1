package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TarefasMultiplosUsuariosCalendarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[text()=\"Calend�rio\"]")
	public WebElement calendario;
	
	public TarefasMultiplosUsuariosCalendarPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> Calendario() {
		
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
		
		if (tq1 == true) {

			WebElement OPC = driver.findElement(By.xpath("//div[@id=\"year-wrapper\"]/div[2]/div/div[2]/div[1]/div[2]/div[21]"));

			OPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else  {

			WebElement OPC = driver.findElement(By.xpath("//div[@id=\"year-wrapper\"]/div[2]/div/div[2]/div[1]/div[2]/div[22]"));

			OPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (tq1 == true) {

			WebElement OPC = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943468\")]"));
			actionsMoveToElementElement(OPC);
			
			WebElement status1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943468\")]/div[5]"));
			WebElement status2 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943469\")]/div[5]"));
			WebElement status3 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943470\")]/div[5]"));
			
			WebElement nome1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943468\")]/div[4]"));
			WebElement nome2 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943469\")]/div[4]"));
			WebElement nome3 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943470\")]/div[4]"));
			
			
			String Status11 = status1.getText();
			String Status22 = status2.getText();
			String Status33 = status3.getText();
			
			String Nome11 = nome1.getText();
			String Nome22 = nome2.getText();
			String Nome33 = nome3.getText();
			
			sucesso.add(Status11.equals("Aberta"));
			sucesso.add(Status22.equals("Em Fila"));
			sucesso.add(Status33.equals("Em Fila"));
			
			sucesso.add(Nome11.equals("Aprovado ou n�o?"));
			sucesso.add(Nome22.equals("Reprovado"));
			sucesso.add(Nome33.equals("Aprovado"));
			

		}else if (tc2 == true) {

			WebElement OPC = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6475\")]"));
			actionsMoveToElementElement(OPC);
			
			WebElement status1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6475\")]/div[5]"));
			WebElement status2 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6476\")]/div[5]"));
			WebElement status3 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6477\")]/div[5]"));
			
			WebElement nome1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6475\")]/div[4]"));
			WebElement nome2 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6476\")]/div[4]"));
			WebElement nome3 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6477\")]/div[4]"));
			
			
			String Status11 = status1.getText();
			String Status22 = status2.getText();
			String Status33 = status3.getText();
			
			String Nome11 = nome1.getText();
			String Nome22 = nome2.getText();
			String Nome33 = nome3.getText();
			
			sucesso.add(Status11.equals("Aberta"));
			sucesso.add(Status22.equals("Em Fila"));
			sucesso.add(Status33.equals("Em Fila"));
			
			sucesso.add(Nome11.equals("Aprovado ou n�o?"));
			sucesso.add(Nome22.equals("Reprovado"));
			sucesso.add(Nome33.equals("Aprovado"));
			
			
		}else {
			
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
}