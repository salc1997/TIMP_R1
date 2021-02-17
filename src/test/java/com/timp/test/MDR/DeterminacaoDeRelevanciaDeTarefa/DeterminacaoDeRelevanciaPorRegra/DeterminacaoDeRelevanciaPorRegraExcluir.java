<<<<<<< HEAD
package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluirPO;

public class DeterminacaoDeRelevanciaPorRegraExcluir extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeRelevanciaPorRegraExcluirPO determinacaoDeRelevanciaPorRegraExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeRelevanciaPorRegraExcluirPO = new DeterminacaoDeRelevanciaPorRegraExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void excluir() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoDeRelevanciaPorRegraExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
}
=======
package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluirPO;

public class DeterminacaoDeRelevanciaPorRegraExcluir extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeRelevanciaPorRegraExcluirPO determinacaoDeRelevanciaPorRegraExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeRelevanciaPorRegraExcluirPO = new DeterminacaoDeRelevanciaPorRegraExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = determinacaoDeRelevanciaPorRegraExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
}
>>>>>>> refs/heads/Fernando
