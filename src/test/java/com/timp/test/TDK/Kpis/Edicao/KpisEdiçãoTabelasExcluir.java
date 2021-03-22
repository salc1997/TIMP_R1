package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisEdiçãoTabelasExcluirPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisTabelasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisEdiçãoTabelasExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisEdiçãoTabelasExcluirPO kpisEdiçãoTabelasExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisEdiçãoTabelasExcluirPO = new KpisEdiçãoTabelasExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Editar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisEdiçãoTabelasExcluirPO.tabelas();
	}
}
