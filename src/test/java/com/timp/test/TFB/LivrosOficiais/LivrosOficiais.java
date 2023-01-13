package com.timp.test.TFB.LivrosOficiais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFB.AccesarTFBPO;
import com.sap.timp.pageObjectModel.TFB.LivrosOficiais.LivrosOficiaisPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LivrosOficiais extends TestBaseMassiel{
	
	LoginTC loginTC;
	AccesarTFBPO accesarTFBPO;
	LivrosOficiaisPO librosOficiaisPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  accesarTFBPO = new AccesarTFBPO();
	  librosOficiaisPO = new LivrosOficiaisPO();
  }

  @AfterClass
  public void afterClass() {
  }
  @Test(priority = 0)
	public void livrosOficias() {
		loginTC.login();
		accesarTFBPO.acessarTFB();
		
		boolean sucesso =  librosOficiaisPO.livros();
		assertTrue(sucesso, "The element is not present");
			
		
	}
  

 /* @Test(priority = 1)

	public void livrosICMS() {
		

		ArrayList<Boolean> sucesso = librosOficiaisPO.livrosICMS();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(2000);
		
	}
  

 @Test(priority = 2)
	public void livrosICMSST() {
	
		
	  
	  ArrayList<Boolean> sucesso = librosOficiaisPO.LivrosICMSST();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(2000);
	
			
	
	}*/
 

  
  @Test(priority = 3)
   	public void livrosIPI() {
 	
 	  librosOficiaisPO.LivrosIPI();
 	/*  
 	ArrayList<Boolean> sucesso = librosOficiaisPO.LivrosICMSST();

 		for (int i = 0; i < sucesso.size(); i++) {
 			assertTrue(sucesso.get(i), Criar);
 		}
 		sleep(2000);*/
 	
 			
 	}

/*
   @Test(priority = 4)
	public void livrosICMSDIFAL() {
	
	  ArrayList<Boolean> sucesso = librosOficiaisPO.LivroICMSDIFAL();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(2000);
	
			
		
	}*/
}
