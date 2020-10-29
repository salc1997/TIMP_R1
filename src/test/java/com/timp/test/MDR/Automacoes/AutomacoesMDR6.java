package com.timp.test.MDR.Automacoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroCriarPO;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela05.TiposDeRegistroVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela06.PaisesVisualizar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesCriar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesEditar;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesExcluir;
import com.timp.test.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesVisualizar;

public class AutomacoesMDR6 extends TestBaseSteven{
	
	// Tabela 01 - Categorias De Trabalhadores
			CategoriasDeTrabalhadoresCriar categoriasDeTrabalhadoresCriar;
			CategoriasDeTrabalhadoresEditar categoriasDeTrabalhadoresEditar;
			CategoriasDeTrabalhadoresVisualizar categoriasDeTrabalhadoresVisualizar;
			CategoriasDeTrabalhadoresExcluir categoriasDeTrabalhadoresExcluir;
		
		// Tabela 02 - Financiamento De Apos Esp
			FinanciamentoDeAposEspCriar financiamentoDeAposEspCriar;
			FinanciamentoDeAposEspEditar financiamentoDeAposEspEditar;
			FinanciamentoDeAposEspVisualizar financiamentoDeAposEspVisualizar;
			FinanciamentoDeAposEspExcluir financiamentoDeAposEspExcluir;
		
		// Tabela 03 - Natureza Das Rubricas
			NaturezaDasRubricasCriar naturezaDasRubricasCriar;
			NaturezaDasRubricasEditar naturezaDasRubricasEditar;
			NaturezaDasRubricasVisualizar naturezaDasRubricasVisualizar;
			NaturezaDasRubricasExcluir naturezaDasRubricasExcluir;
			
		//Tabela 04 - Codigos E Aliq. De FPRAS
			CodigosEAliqDeFPRASCriar codigosEAliqDeFPRASCriar;
			CodigosEAliqDeFPRASEditar codigosEAliqDeFPRASEditar;
			CodigosEAliqDeFPRASVisualizar codigosEAliqDeFPRASVisualizar;
			CodigosEAliqDeFPRASExcluir codigosEAliqDeFPRASExcluir;
			
		//Tabela 05 - Tipos de Registro
			TiposDeRegistroCriar tiposDeRegistroCriar;
			TiposDeRegistroEditar tiposDeRegistroEditar;
			TiposDeRegistroVisualizar tiposDeRegistroVisualizar;
			TiposDeRegistroExcluir tiposDeRegistroExcluir;
			
		//Tabela 06 - Paises
			PaisesCriar paisesCriar;
			PaisesEditar paisesEditar;
			PaisesVisualizar paisesVisualizar;
			PaisesExcluir paisesExcluir;
		
		//Tabela 07 - Tipos de Dependentes
			TiposDeDependentesCriar tiposDeDependentesCriar;
			TiposDeDependentesEditar tiposDeDependentesEditar;
			TiposDeDependentesVisualizar tiposDeDependentesVisualizar;
			TiposDeDependentesExcluir tiposDeDependentesExcluir;
		//--------------------------------------------------------------------------
			
			//0
			// Tabela 01 - Categorias De Trabalhadores
			
			@Test(priority = 0)
			public void categoriasDeTrabalhadoresCriar() {
				System.out.println("------------------- Tabela 01 - Categorias De Trabalhadores-------------------------");
				categoriasDeTrabalhadoresCriar = new CategoriasDeTrabalhadoresCriar();
				categoriasDeTrabalhadoresCriar.beforeClass();
				categoriasDeTrabalhadoresCriar.login();
				categoriasDeTrabalhadoresCriar.acessarMDR();
				categoriasDeTrabalhadoresCriar.criar();
				categoriasDeTrabalhadoresCriar.afterClass();

			}
			
			@Test(priority = 1)
			public void categoriasDeTrabalhadoresEditar() {
				categoriasDeTrabalhadoresEditar = new CategoriasDeTrabalhadoresEditar();
				categoriasDeTrabalhadoresEditar.beforeClass();
				categoriasDeTrabalhadoresEditar.login();
				categoriasDeTrabalhadoresEditar.acessarMDR();
				categoriasDeTrabalhadoresEditar.editar();
				categoriasDeTrabalhadoresEditar.afterClass();

			}
			
			@Test(priority = 2)
			public void categoriasDeTrabalhadoresVisualizar() {
				categoriasDeTrabalhadoresVisualizar = new CategoriasDeTrabalhadoresVisualizar();
				categoriasDeTrabalhadoresVisualizar.beforeClass();
				categoriasDeTrabalhadoresVisualizar.login();
				categoriasDeTrabalhadoresVisualizar.acessarMDR();
				categoriasDeTrabalhadoresVisualizar.Visualizar();
				categoriasDeTrabalhadoresVisualizar.afterClass();

			}
			
			
			@Test(priority = 3)
			public void categoriasDeTrabalhadoresExcluir() {
				categoriasDeTrabalhadoresExcluir = new CategoriasDeTrabalhadoresExcluir();
				categoriasDeTrabalhadoresExcluir.beforeClass();
				categoriasDeTrabalhadoresExcluir.login();
				categoriasDeTrabalhadoresExcluir.acessarMDR();
				categoriasDeTrabalhadoresExcluir.excluir();
				categoriasDeTrabalhadoresExcluir.afterClass();
				System.out.println("------------------- Tabela 01 - Categorias De Trabalhadores Fim-------------------------");
				
			}
			
			//6
			// Tabela 02 - Financiamento De Apos Esp
			
			@Test(priority = 6)
			public void financiamentoDeAposEspCriar() {
				System.out.println("------------------- Tabela 02 - Financiamento De Apos Esp-------------------------");
				financiamentoDeAposEspCriar = new FinanciamentoDeAposEspCriar();
				financiamentoDeAposEspCriar.beforeClass();
				financiamentoDeAposEspCriar.login();
				financiamentoDeAposEspCriar.acessarMDR();
				financiamentoDeAposEspCriar.criar();
				financiamentoDeAposEspCriar.afterClass();

			}
			
			@Test(priority = 7)
			public void financiamentoDeAposEspEditar() {
				financiamentoDeAposEspEditar = new FinanciamentoDeAposEspEditar();
				financiamentoDeAposEspEditar.beforeClass();
				financiamentoDeAposEspEditar.login();
				financiamentoDeAposEspEditar.acessarMDR();
				financiamentoDeAposEspEditar.editar();
				financiamentoDeAposEspEditar.afterClass();

			}
			
			@Test(priority = 8)
			public void financiamentoDeAposEspVisualizar() {
				financiamentoDeAposEspVisualizar = new FinanciamentoDeAposEspVisualizar();
				financiamentoDeAposEspVisualizar.beforeClass();
				financiamentoDeAposEspVisualizar.login();
				financiamentoDeAposEspVisualizar.acessarMDR();
				financiamentoDeAposEspVisualizar.Visualizar();
				financiamentoDeAposEspVisualizar.afterClass();

			}
			
			@Test(priority = 9)
			public void financiamentoDeAposEspExcluir() {
				financiamentoDeAposEspExcluir = new FinanciamentoDeAposEspExcluir();
				financiamentoDeAposEspExcluir.beforeClass();
				financiamentoDeAposEspExcluir.login();
				financiamentoDeAposEspExcluir.acessarMDR();
				financiamentoDeAposEspExcluir.excluir();
				financiamentoDeAposEspExcluir.afterClass();
				
				System.out.println("------------------- Tabela 02 - Financiamento De Apos Esp Fim-------------------------");
				

			}
			
			//12
			//Tabela 03 - Natureza Das Rubricas
			
			@Test(priority = 12)
			public void naturezaDasRubricasCriar() {
				System.out.println("------------------- Tabela 03 - Natureza Das Rubricas-------------------------");
				naturezaDasRubricasCriar = new NaturezaDasRubricasCriar();
				naturezaDasRubricasCriar.beforeClass();
				naturezaDasRubricasCriar.login();
				naturezaDasRubricasCriar.acessarMDR();
				naturezaDasRubricasCriar.criar();
				naturezaDasRubricasCriar.afterClass();

			}
			
			@Test(priority = 13)
			public void naturezaDasRubricasEditar() {
			    
				naturezaDasRubricasEditar = new NaturezaDasRubricasEditar();
				naturezaDasRubricasEditar.beforeClass();
				naturezaDasRubricasEditar.login();
				naturezaDasRubricasEditar.acessarMDR();
				naturezaDasRubricasEditar.editar();
				naturezaDasRubricasEditar.afterClass();

			}
			
			@Test(priority = 14)
			public void naturezaDasRubricasVisualizar() {
			    
				naturezaDasRubricasVisualizar = new NaturezaDasRubricasVisualizar();
				naturezaDasRubricasVisualizar.beforeClass();
				naturezaDasRubricasVisualizar.login();
				naturezaDasRubricasVisualizar.acessarMDR();
				naturezaDasRubricasVisualizar.Visualizar();
				naturezaDasRubricasVisualizar.afterClass();

			}
			
			@Test(priority = 15)
			public void naturezaDasRubricasExcluir() {
			    
				naturezaDasRubricasExcluir = new NaturezaDasRubricasExcluir();
				naturezaDasRubricasExcluir.beforeClass();
				naturezaDasRubricasExcluir.login();
				naturezaDasRubricasExcluir.acessarMDR();
				naturezaDasRubricasExcluir.excluir();
				naturezaDasRubricasExcluir.afterClass();
				System.out.println("------------------- Tabela 03 - Natureza Das Rubricas Fim-------------------------");
				
			}
			
			//18
			//Tabela 04 - Codigos E Aliq. De FPRAS
			@Test(priority = 18)
			public void codigosEAliqDeFPRASCriar() {
				System.out.println("------------------- Tabela 04 - Codigos E Aliq. De FPRAS-------------------------");
				codigosEAliqDeFPRASCriar = new CodigosEAliqDeFPRASCriar();
				codigosEAliqDeFPRASCriar.beforeClass();
				codigosEAliqDeFPRASCriar.login();
				codigosEAliqDeFPRASCriar.acessarMDR();
				codigosEAliqDeFPRASCriar.criar();
				codigosEAliqDeFPRASCriar.afterClass();

			}
			
			@Test(priority = 19)
			public void codigosEAliqDeFPRASEditar() {
				codigosEAliqDeFPRASEditar = new CodigosEAliqDeFPRASEditar();
				codigosEAliqDeFPRASEditar.beforeClass();
				codigosEAliqDeFPRASEditar.login();
				codigosEAliqDeFPRASEditar.acessarMDR();
				codigosEAliqDeFPRASEditar.editar();
				codigosEAliqDeFPRASEditar.afterClass();

			}
			
			@Test(priority = 20)
			public void codigosEAliqDeFPRASVisualizar() {
				codigosEAliqDeFPRASVisualizar = new CodigosEAliqDeFPRASVisualizar();
				codigosEAliqDeFPRASVisualizar.beforeClass();
				codigosEAliqDeFPRASVisualizar.login();
				codigosEAliqDeFPRASVisualizar.acessarMDR();
				codigosEAliqDeFPRASVisualizar.Visualizar();
				codigosEAliqDeFPRASVisualizar.afterClass();

			}
			
			@Test(priority = 21)
			public void codigosEAliqDeFPRASExcluir() {
				codigosEAliqDeFPRASExcluir = new CodigosEAliqDeFPRASExcluir();
				codigosEAliqDeFPRASExcluir.beforeClass();
				codigosEAliqDeFPRASExcluir.login();
				codigosEAliqDeFPRASExcluir.acessarMDR();
				codigosEAliqDeFPRASExcluir.excluir();
				codigosEAliqDeFPRASExcluir.afterClass();
				System.out.println("------------------- Tabela 04 - Codigos E Aliq. De FPRAS Fim-------------------------");
				
			}
			//24
			//Tabela 05 - Tipos de Registro
			
			
			@Test(priority = 24)
			public void tiposDeRegistroCriar() {
				System.out.println("------------------- Tabela 05 - Tipos de Registro-------------------------");
				tiposDeRegistroCriar = new TiposDeRegistroCriar();
				tiposDeRegistroCriar.beforeClass();
				tiposDeRegistroCriar.login();
				tiposDeRegistroCriar.acessarMDR();
				tiposDeRegistroCriar.criar();
				tiposDeRegistroCriar.afterClass();

			}
			
			@Test(priority = 25)
			public void tiposDeRegistroEditar() {
				tiposDeRegistroEditar = new TiposDeRegistroEditar();
				tiposDeRegistroEditar.beforeClass();
				tiposDeRegistroEditar.login();
				tiposDeRegistroEditar.acessarMDR();
				tiposDeRegistroEditar.editar();
				tiposDeRegistroEditar.afterClass();

			}
			
			@Test(priority = 25)
			public void tiposDeRegistroVisualizar() {
				tiposDeRegistroVisualizar = new TiposDeRegistroVisualizar();
				tiposDeRegistroVisualizar.beforeClass();
				tiposDeRegistroVisualizar.login();
				tiposDeRegistroVisualizar.acessarMDR();
				tiposDeRegistroVisualizar.Visualizar();
				tiposDeRegistroVisualizar.afterClass();

			}
			
			@Test(priority = 26)
			public void tiposDeRegistroExcluir() {
				tiposDeRegistroExcluir = new TiposDeRegistroExcluir();
				tiposDeRegistroExcluir.beforeClass();
				tiposDeRegistroExcluir.login();
				tiposDeRegistroExcluir.acessarMDR();
				tiposDeRegistroExcluir.excluir();
				tiposDeRegistroExcluir.afterClass();
				
				System.out.println("------------------- Tabela 05 - Tipos de Registro Fim-------------------------");
				

			}
			
			//28
			//Tabela 06 - Paises
			
			@Test(priority = 28)
			public void paisesCriar() {
				System.out.println("------------------- Tabela 06 - Paises-------------------------");
				paisesCriar = new PaisesCriar();
				paisesCriar.beforeClass();
				paisesCriar.login();
				paisesCriar.acessarMDR();
				paisesCriar.criar();
				paisesCriar.afterClass();

			}
			
			@Test(priority = 29)
			public void paisesEditar() {
				
				paisesEditar = new PaisesEditar();
				paisesEditar.beforeClass();
				paisesEditar.login();
				paisesEditar.acessarMDR();
				paisesEditar.editar();
				paisesEditar.afterClass();

			}
			
			@Test(priority = 30)
			public void paisesVisualizar() {
				
				paisesVisualizar = new PaisesVisualizar();
				paisesVisualizar.beforeClass();
				paisesVisualizar.login();
				paisesVisualizar.acessarMDR();
				paisesVisualizar.Visualizar();
				paisesVisualizar.afterClass();

			}
			
			@Test(priority = 31)
			public void paisesExcluir() {
				
				paisesExcluir = new PaisesExcluir();
				paisesExcluir.beforeClass();
				paisesExcluir.login();
				paisesExcluir.acessarMDR();
				paisesExcluir.excluir();
				paisesExcluir.afterClass();
				System.out.println("------------------- Tabela 06 - Paises Fim-------------------------");
				
			}
			//34
			//Tabela 07 - Tipos de Dependentes
			@Test(priority = 34)
			public void tiposDeDependentesCriar() {
				System.out.println("-------------------Tabela 07 - Tipos de Dependentes-------------------------");
				tiposDeDependentesCriar = new TiposDeDependentesCriar();
				tiposDeDependentesCriar.beforeClass();
				tiposDeDependentesCriar.login();
				tiposDeDependentesCriar.acessarMDR();
				tiposDeDependentesCriar.criar();
				tiposDeDependentesCriar.afterClass();

			}
			
			
			@Test(priority = 35)
			public void tiposDeDependentesEditar() {
			tiposDeDependentesEditar = new TiposDeDependentesEditar();
				tiposDeDependentesEditar.beforeClass();
				tiposDeDependentesEditar.login();
				tiposDeDependentesEditar.acessarMDR();
				tiposDeDependentesEditar.editar();
				tiposDeDependentesEditar.afterClass();

			}
			
			@Test(priority = 36)
			public void tiposDeDependentesVisualizar() {
				tiposDeDependentesVisualizar = new TiposDeDependentesVisualizar();
				tiposDeDependentesVisualizar.beforeClass();
				tiposDeDependentesVisualizar.login();
				tiposDeDependentesVisualizar.acessarMDR();
				tiposDeDependentesVisualizar.Visualizar();
				tiposDeDependentesVisualizar.afterClass();

			}
			
			@Test(priority = 37)
			public void tiposDeDependentesExcluir() {
				tiposDeDependentesExcluir = new TiposDeDependentesExcluir();
				tiposDeDependentesExcluir.beforeClass();
				tiposDeDependentesExcluir.login();
				tiposDeDependentesExcluir.acessarMDR();
				tiposDeDependentesExcluir.excluir();
				tiposDeDependentesExcluir.afterClass();
				System.out.println("-------------------Tabela 07 - Tipos de Dependentes Fim-------------------------");
				
			}
			
			
			

}
