package com.timp.test.BRB.Automacoes;


import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.timp.test.ADM.LoginBRB;
import com.timp.test.BRB.*;

public class AutomacoesBrbTest extends TestBaseSteven{
	LoginBRB loginTest;
	BRBAcessar brbAcessar;
	paginacion paginacion;
	ReordenarColuna reordenarColuna;
	FiltrosAvançados filtrosAvanaçados;
	NovoRelatorio novoRelatirio;
	PublicoYPrivado publicoYPrivado;
	ExcluirColuna excluirColuna;
	Editar editar;
	Filtros filtros;
	CriarCopia criarCopia;
	AtivarCorrecao ativarCorrecao;
	AtivarComentario ativarComentario;
	RenomearColuna renomearColuna;
	Formula formula;
	AgrupadoPeloCampo agrupadoPeloCampo;
	CampoOutput campoOutput;
	FormatacaoEVariante formatacaoEVariante;
	FiltroColunas filtroColunas;
	GruposAvanzados gruposAvanzados;
	CrescenteEDecrescente crescenteEDecrescente;
	ListaSuspensa listaSuspensa;
	ComentarioLibre comentarioLibre;
	Imprimir imprimir;
	Exportar exportar;
	Visualizar visualizar;
	Eliminar eliminar;
	Cabeçalho cabeçalho;
	Regras regras;
	
	
    @Test(priority = 0)
	public void login() {
    	
    	
    	System.out.println("-------------------Login-------------------------");
    	loginTest = new LoginBRB();
    	
		loginTest.beforeClass();
		
		System.out.println("Ambiente: "+ driver.getCurrentUrl());
		loginTest.Login();
		loginTest.afterClass();
		
		System.out.println("--------------------------------------------------");

	}
    
    
    @Test(priority = 1)
	public void acessarBRB() {
    	
    	System.out.println("-------------------Acessar BRB-------------------------");
		brbAcessar = new BRBAcessar();
		
    	brbAcessar.beforeClass();

    	brbAcessar.login();
    	brbAcessar.brbEntrar();
    	brbAcessar.afterClass();
    	System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 2)
	public void paginacion() {
    	
		System.out.println("-------------------Psginação-------------------------");
    	
		paginacion = new paginacion();
		
		paginacion.beforeClass();

		paginacion.login();
		paginacion.brbEntrar();
		paginacion.paginacion();
		paginacion.afterClass();
		System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 3)
	public void filtrosAvanzados() {
    	

    	System.out.println("-------------------Filtros Avançados-------------------------");
		filtrosAvanaçados = new FiltrosAvançados();
		
		filtrosAvanaçados.beforeClass();

		filtrosAvanaçados.login();
		
		filtrosAvanaçados.brbEntrar();
		filtrosAvanaçados.filtrosAvanzados();
		filtrosAvanaçados.afterClass();
		System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 4)
    public void novoRelatorio() {
    	
		System.out.println("-------------------Novo Relatório-------------------------");
    	
		novoRelatirio = new NovoRelatorio();
		novoRelatirio.beforeClass();

		novoRelatirio.login();
		novoRelatirio.brbEntrar();
		novoRelatirio.novoRelatorio();
		novoRelatirio.colunas();
		novoRelatirio.afterClass();
		System.out.println("--------------------------------------------------");
		
	}
    
   

    @Test(priority = 5)
	public void publicoYPrivado() {
    	
    	System.out.println("-------------------Publico e Privado-------------------------");
		publicoYPrivado = new PublicoYPrivado();
		
		publicoYPrivado.beforeClass();

		publicoYPrivado.login();
		publicoYPrivado.brbEntrar();
		publicoYPrivado.publicoYPRivado();
		publicoYPrivado.afterClass();
		System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 6)
	public void excluirColuna() {
    	
    	System.out.println("-------------------Excluir Coluna-------------------------");
    	
		excluirColuna = new ExcluirColuna();
		
		excluirColuna.beforeClass();

		excluirColuna.login();
		excluirColuna.brbEntrar();
		excluirColuna.excluirColunaDragNDrop();
		excluirColuna.excluirColunaOpcao();
		excluirColuna.afterClass();
		System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 7)
	public void editarRelatorio() {
    	

    	System.out.println("-------------------Editar Relatório-------------------------");
		editar = new Editar();
		
		editar.beforeClass();

		editar.login();
		editar.brbEntrar();
		editar.editar();
		editar.afterClass();
		System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 8)
	public void reordenarColuna() {
    	
    	System.out.println("-------------------Reordenar Coluna-------------------------");
    	
		reordenarColuna = new ReordenarColuna();
		
		reordenarColuna.beforeClass();

		reordenarColuna.login();
		reordenarColuna.brbEntrar();
		reordenarColuna.reordenar();
		reordenarColuna.afterClass();
		System.out.println("--------------------------------------------------");

	}
   
    @Test(priority = 9)
	public void filtrosRelatorio() {
		filtros = new Filtros();
		
		System.out.println("-------------------Filtros Relartório-------------------------");
		filtros.beforeClass();

		filtros.login();
		filtros.brbEntrar();
		filtros.filtrosEditor();
		filtros.filtrosBiblioteca();
		filtros.asignarValores();
		filtros.afterClass();
		System.out.println("--------------------------------------------------");

	}
    
    @Test(priority = 10)
    public void criarCopia() {
    	
    	System.out.println("-------------------Criar Cópia-------------------------");
    	criarCopia = new CriarCopia();
    	criarCopia.beforeClass();

    	criarCopia.login();
		criarCopia.brbEntrar();
		criarCopia.criarCopia();
		criarCopia.afterClass();
		System.out.println("--------------------------------------------------");
	}
    
    @Test(priority = 11)
    public void ativarCorrecao() {
    	
		System.out.println("-------------------Ativar Correção-------------------------");
    	ativarCorrecao= new AtivarCorrecao();
		ativarCorrecao.beforeClass();

		ativarCorrecao.login();
		ativarCorrecao.brbEntrar();
		ativarCorrecao.ativarCorreccion();
		ativarCorrecao.afterClass();
		System.out.println("--------------------------------------------------");
	}
 
    @Test(priority = 12)
    public void ativarComentario() {
    	
		System.out.println("-------------------Ativar Comentário-------------------------");
    	ativarComentario = new AtivarComentario();
		ativarComentario.beforeClass();

		ativarComentario.login();
		ativarComentario.brbEntrar();
		ativarComentario.ativarComentarios();
		ativarComentario.afterClass();
		System.out.println("--------------------------------------------------");
		
	}
    
    @Test(priority = 13)
    public void renomearColuna() {
    	
		System.out.println("-------------------Renomear Coluna-------------------------");
    	renomearColuna = new RenomearColuna();
		renomearColuna.beforeClass();

		renomearColuna.login();
		renomearColuna.brbEntrar();
		renomearColuna.renomearColuna();
		renomearColuna.afterClass();
		System.out.println("--------------------------------------------------");
	}
   
    @Test(priority = 14)
    public void formula() {
    	
    	
    	System.out.println("-------------------Fórmula-------------------------");
    	formula = new Formula();
    	formula.beforeClass();

    	formula.login();
    	formula.brbEntrar();
    	formula.formulaColuna();
    	formula.formulaBoton();
    	formula.aplicar();
    	formula.afterClass();
    	System.out.println("--------------------------------------------------");
    	
	}
    
    @Test(priority = 15)
    public void agrupadoPeloCampo() {
    	
		System.out.println("-------------------Agrupado Pelo Campo-------------------------");
    	agrupadoPeloCampo =new AgrupadoPeloCampo();
    	
		agrupadoPeloCampo.beforeClass();

		agrupadoPeloCampo.login();
		agrupadoPeloCampo.brbEntrar();
		agrupadoPeloCampo.agrupadoPeloCampo();
		agrupadoPeloCampo.afterClass();
		System.out.println("--------------------------------------------------");
		
	}
    
    @Test(priority = 16)
    public void campoOutput() {
    	
    	System.out.println("-------------------Campo Output-------------------------");
		campoOutput = new CampoOutput();
    	campoOutput.beforeClass();

    	campoOutput.login();
    	campoOutput.brbEntrar();
    	campoOutput.campoOutput();
    	campoOutput.afterClass();
    	System.out.println("--------------------------------------------------");
    	
    	
    	
	}
    
    @Test(priority = 17)
    public void formatacaoEVariante() {
		System.out.println("-------------------Formatação e Variante-------------------------");
    	formatacaoEVariante = new FormatacaoEVariante();
		formatacaoEVariante.beforeClass();

		formatacaoEVariante.login();
		formatacaoEVariante.brbEntrar();
		formatacaoEVariante.formatacaoEVariante();
		formatacaoEVariante.excluirVariante();
		formatacaoEVariante.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
    
    @Test(priority = 18)
    public void filtroColunas() {
		System.out.println("------------------Filtro Colunas-------------------------");
    	filtroColunas = new FiltroColunas();
		filtroColunas.beforeClass();

		filtroColunas.login();
		filtroColunas.brbEntrar();
		filtroColunas.filtroConFerramenta1();
		filtroColunas.filtroConFerramenta2();
		filtroColunas.afterClass();
		System.out.println("--------------------------------------------------");
	}
    
    @Test(priority = 19)
    public void gruposAvanzados() {
    	
		System.out.println("-------------------Grupos Avançados-------------------------");
    	gruposAvanzados = new GruposAvanzados();
		gruposAvanzados.beforeClass();

		gruposAvanzados.login();
		gruposAvanzados.brbEntrar();
		gruposAvanzados.gruposAvanzados();
		gruposAvanzados.eliminarGrupos();
		gruposAvanzados.afterClass();
		System.out.println("--------------------------------------------------");
	}
    
    @Test(priority = 20)
    public void crescenteEDecrescente() {
    	
    	System.out.println("-------------------Crescente e Descrecente-------------------------");
		crescenteEDecrescente = new CrescenteEDecrescente();
    	crescenteEDecrescente.beforeClass();
		crescenteEDecrescente.login();
		crescenteEDecrescente.brbEntrar();
		crescenteEDecrescente.crescenteEDecrescente();
		crescenteEDecrescente.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
    
    @Test(priority = 21)
    public void comentarioListaSuspensa() {
    	
    	System.out.println("-------------------Comentário em Lista Suspensa-------------------------");
		listaSuspensa = new ListaSuspensa();
    	listaSuspensa.beforeClass();
		listaSuspensa.login();
		listaSuspensa.brbEntrar();
		listaSuspensa.listaSuspensa();
		listaSuspensa.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
    
    @Test(priority = 22)
    public void comentarioLibre() {
    	
    	System.out.println("-------------------Comentário Libre-------------------------");
		comentarioLibre = new ComentarioLibre();
    	
    	comentarioLibre.beforeClass();

		comentarioLibre.login();
		comentarioLibre.brbEntrar();
		comentarioLibre.comentarioLibre();
		comentarioLibre.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
  
    @Test(priority = 23)
    public void imprimir() {
    	
     	System.out.println("-------------------Imprimir-------------------------");
		imprimir = new Imprimir();
    	
    	imprimir.beforeClass();
   
		imprimir.login();
		imprimir.brbEntrar();
		imprimir.imprimir();
		imprimir.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
   
    /*
 
    @Test(priority = 24)
    public void regras() {
		regras = new Regras();
    	
    	regras.beforeClass();
		regras.login();
		regras.brbEntrar();
		regras.regras();
		regras.afterClass();
		
		
	}
    */
    @Test(priority = 25)
    public void cabeçalho() {
    	
    	System.out.println("-------------------Cabeçalho-------------------------");
		cabeçalho = new Cabeçalho();
    	
    	cabeçalho.beforeClass();

		cabeçalho.login();
		cabeçalho.brbEntrar();
		cabeçalho.cabeçalho();
		cabeçalho.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
    
    @Test(priority = 26)
    public void exportar() {
    	System.out.println("-------------------Exportar-------------------------");
		exportar = new Exportar();
    	
    	exportar.beforeClass();

		exportar.login();
		exportar.brbEntrar();
		exportar.exportarCSV();
		exportar.exportarXLSX();
		exportar.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
    
 
    
    @Test(priority = 27)
    public void visualizar() {
    	
    	System.out.println("-------------------Visualizar-------------------------");
		visualizar = new Visualizar();
    	
    	visualizar.beforeClass();

		visualizar.login();
		visualizar.brbEntrar();
		visualizar.visualizar();
		visualizar.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
  
    
    @Test(priority = 28)
    public void ExcluirRelatorio() {
    	System.out.println("-------------------Excluir-------------------------");
		eliminar = new Eliminar();
    	
    	eliminar.beforeClass();

		eliminar.login();
		eliminar.brbEntrar();
		eliminar.eliminar();
		eliminar.eliminarLixeira();
		eliminar.afterClass();
		System.out.println("--------------------------------------------------");
		
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	
	
}
