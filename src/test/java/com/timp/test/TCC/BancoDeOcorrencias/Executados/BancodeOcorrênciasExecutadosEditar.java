package com.timp.test.TCC.BancoDeOcorrencias.Executados;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.Executados.ExecutadosEditarPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.Executados.BancodeOcorr�nciasExecutadosEditarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BancodeOcorr�nciasExecutadosEditar extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	BancodeOcorr�nciasExecutadosEditarPO bancodeOcorr�nciasExecutadosEditarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		bancodeOcorr�nciasExecutadosEditarPO = new BancodeOcorr�nciasExecutadosEditarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarTCC() {
		acessarTCCPO.acessarTCC();
	}
	
	@Test(priority = 2)
	public void executarEditar() {
		bancodeOcorr�nciasExecutadosEditarPO.editar();
		/*boolean sucesso = configuracaoEExecucaoExecutarPO.executar();
		assertTrue(sucesso, Criar);*/
	}
}
