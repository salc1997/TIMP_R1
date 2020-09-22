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
    	
    	
    	
    	loginTest = new LoginBRB();
    	
		loginTest.beforeClass();
		System.out.println("-------------------Login-------------------------");
		System.out.println("Ambiente: "+ driver.getCurrentUrl());
		loginTest.Login();
		loginTest.afterClass();

	}
    
    
    @Test(priority = 1)
	public void acessarBRB() {
    	
    	
		brbAcessar = new BRBAcessar();
		
    	brbAcessar.beforeClass();
    	System.out.println("-------------------Acessar BRB-------------------------");
    	brbAcessar.login();
    	brbAcessar.brbEntrar();
    	brbAcessar.afterClass();

	}
    
    @Test(priority = 2)
	public void paginacion() {
    	
    	
    	
		paginacion = new paginacion();
		
		paginacion.beforeClass();
		System.out.println("-------------------Psginação-------------------------");
		paginacion.login();
		paginacion.brbEntrar();
		paginacion.paginacion();
		paginacion.afterClass();

	}
    
    @Test(priority = 3)
	public void filtrosAvanzados() {
    	

    	
		filtrosAvanaçados = new FiltrosAvançados();
		
		filtrosAvanaçados.beforeClass();
    	System.out.println("-------------------Filtros Avançados-------------------------");
		filtrosAvanaçados.login();
		
		filtrosAvanaçados.brbEntrar();
		filtrosAvanaçados.filtrosAvanzados();
		filtrosAvanaçados.afterClass();

	}
    
    @Test(priority = 4)
    public void novoRelatorio() {
    	
    	
    	
		novoRelatirio = new NovoRelatorio();
		novoRelatirio.beforeClass();
		System.out.println("-------------------Novo Relatório-------------------------");
		novoRelatirio.login();
		novoRelatirio.brbEntrar();
		novoRelatirio.novoRelatorio();
		novoRelatirio.colunas();
		novoRelatirio.afterClass();
		
	}
    
   

    @Test(priority = 5)
	public void publicoYPrivado() {
    	

		publicoYPrivado = new PublicoYPrivado();
		
		publicoYPrivado.beforeClass();
    	System.out.println("-------------------Publico e Privado-------------------------");
		publicoYPrivado.login();
		publicoYPrivado.brbEntrar();
		publicoYPrivado.publicoYPRivado();
		publicoYPrivado.afterClass();

	}
    
    @Test(priority = 6)
	public void excluirColuna() {
    	

    	
		excluirColuna = new ExcluirColuna();
		
		excluirColuna.beforeClass();
    	System.out.println("-------------------Excluir Coluna-------------------------");
		excluirColuna.login();
		excluirColuna.brbEntrar();
		excluirColuna.excluirColunaDragNDrop();
		excluirColuna.excluirColunaOpcao();
		excluirColuna.afterClass();

	}
    
    @Test(priority = 7)
	public void editarRelatorio() {
    	

    	
		editar = new Editar();
		
		editar.beforeClass();
    	System.out.println("-------------------Editar Relatório-------------------------");
		editar.login();
		editar.brbEntrar();
		editar.editar();
		editar.afterClass();

	}
    
    @Test(priority = 8)
	public void reordenarColuna() {
    	

    	
		reordenarColuna = new ReordenarColuna();
		
		reordenarColuna.beforeClass();
    	System.out.println("-------------------Reordenar Coluna-------------------------");
		reordenarColuna.login();
		reordenarColuna.brbEntrar();
		reordenarColuna.reordenar();
		reordenarColuna.afterClass();

	}
   
    @Test(priority = 9)
	public void filtrosRelatorio() {
		filtros = new Filtros();
		
		filtros.beforeClass();
		System.out.println("-------------------Filtros Relartório-------------------------");
		filtros.login();
		filtros.brbEntrar();
		filtros.filtrosEditor();
		filtros.filtrosBiblioteca();
		filtros.asignarValores();
		filtros.afterClass();

	}
    
    @Test(priority = 10)
    public void criarCopia() {
    	criarCopia = new CriarCopia();
    	criarCopia.beforeClass();
    	System.out.println("-------------------Criar Cópia-------------------------");
    	criarCopia.login();
		criarCopia.brbEntrar();
		criarCopia.criarCopia();
		criarCopia.afterClass();
	}
    
    @Test(priority = 11)
    public void ativarCorrecao() {
    	ativarCorrecao= new AtivarCorrecao();
		ativarCorrecao.beforeClass();
		System.out.println("-------------------Ativar Correção-------------------------");
		ativarCorrecao.login();
		ativarCorrecao.brbEntrar();
		ativarCorrecao.ativarCorreccion();
		ativarCorrecao.afterClass();
	}
 
    @Test(priority = 12)
    public void ativarComentario() {
    	ativarComentario = new AtivarComentario();
		ativarComentario.beforeClass();
		System.out.println("-------------------Ativar Comentário-------------------------");
		ativarComentario.login();
		ativarComentario.brbEntrar();
		ativarComentario.ativarComentarios();
		ativarComentario.afterClass();
		
	}
    
    @Test(priority = 13)
    public void renomearColuna() {
    	renomearColuna = new RenomearColuna();
		renomearColuna.beforeClass();
		System.out.println("-------------------Renomear Coluna-------------------------");
		renomearColuna.login();
		renomearColuna.brbEntrar();
		renomearColuna.renomearColuna();
		renomearColuna.afterClass();
	}
   
    @Test(priority = 14)
    public void formula() {
    	formula = new Formula();
    	formula.beforeClass();
    	System.out.println("-------------------Fórmula-------------------------");
    	formula.login();
    	formula.brbEntrar();
    	formula.formulaColuna();
    	formula.formulaBoton();
    	formula.aplicar();
    	formula.afterClass();
    	
    	
	}
    
    @Test(priority = 15)
    public void agrupadoPeloCampo() {
    	agrupadoPeloCampo =new AgrupadoPeloCampo();
    	
		agrupadoPeloCampo.beforeClass();
		System.out.println("-------------------Agrupado Pelo Campo-------------------------");
		agrupadoPeloCampo.login();
		agrupadoPeloCampo.brbEntrar();
		agrupadoPeloCampo.agrupadoPeloCampo();
		agrupadoPeloCampo.afterClass();
		
	}
    
    @Test(priority = 16)
    public void campoOutput() {
		campoOutput = new CampoOutput();
    	campoOutput.beforeClass();
    	System.out.println("-------------------Campo Output-------------------------");
    	campoOutput.login();
    	campoOutput.brbEntrar();
    	campoOutput.campoOutput();
    	campoOutput.afterClass();
    	
    	
    	
	}
    
    @Test(priority = 17)
    public void formatacaoEVariante() {
    	formatacaoEVariante = new FormatacaoEVariante();
		formatacaoEVariante.beforeClass();
		System.out.println("-------------------Formatação e Variante-------------------------");
		formatacaoEVariante.login();
		formatacaoEVariante.brbEntrar();
		formatacaoEVariante.formatacaoEVariante();
		formatacaoEVariante.excluirVariante();
		formatacaoEVariante.afterClass();
		
		
	}
    
    @Test(priority = 18)
    public void filtroColunas() {
    	filtroColunas = new FiltroColunas();
		filtroColunas.beforeClass();
		System.out.println("------------------Filtro Colunas-------------------------");
		filtroColunas.login();
		filtroColunas.brbEntrar();
		filtroColunas.filtroConFerramenta1();
		filtroColunas.filtroConFerramenta2();
		filtroColunas.afterClass();
	}
    
    @Test(priority = 19)
    public void gruposAvanzados() {
    	gruposAvanzados = new GruposAvanzados();
		gruposAvanzados.beforeClass();
		System.out.println("-------------------Grupos Avançados-------------------------");
		gruposAvanzados.login();
		gruposAvanzados.brbEntrar();
		gruposAvanzados.gruposAvanzados();
		gruposAvanzados.eliminarGrupos();
		gruposAvanzados.afterClass();
	}
    
    @Test(priority = 20)
    public void crescenteEDecrescente() {
		crescenteEDecrescente = new CrescenteEDecrescente();
    	
    	crescenteEDecrescente.beforeClass();
    	System.out.println("-------------------Crescente e Descrecente-------------------------");
		crescenteEDecrescente.login();
		crescenteEDecrescente.brbEntrar();
		crescenteEDecrescente.crescenteEDecrescente();
		crescenteEDecrescente.afterClass();
		
		
	}
    
    @Test(priority = 21)
    public void comentarioListaSuspensa() {
		listaSuspensa = new ListaSuspensa();
    	
    	listaSuspensa.beforeClass();
    	System.out.println("-------------------Comentário em Lista Suspensa-------------------------");
		listaSuspensa.login();
		listaSuspensa.brbEntrar();
		listaSuspensa.listaSuspensa();
		listaSuspensa.afterClass();
		
		
	}
    
    @Test(priority = 22)
    public void comentarioLibre() {
		comentarioLibre = new ComentarioLibre();
    	
    	comentarioLibre.beforeClass();
    	System.out.println("-------------------Comentário Libre-------------------------");
		comentarioLibre.login();
		comentarioLibre.brbEntrar();
		comentarioLibre.comentarioLibre();
		comentarioLibre.afterClass();
		
		
	}
  
    @Test(priority = 23)
    public void imprimir() {
		imprimir = new Imprimir();
    	
    	imprimir.beforeClass();
    	System.out.println("-------------------Imprimir-------------------------");
		imprimir.login();
		imprimir.brbEntrar();
		imprimir.imprimir();
		imprimir.afterClass();
		
		
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
		cabeçalho = new Cabeçalho();
    	
    	cabeçalho.beforeClass();
    	System.out.println("-------------------Cabeçalho-------------------------");
		cabeçalho.login();
		cabeçalho.brbEntrar();
		cabeçalho.cabeçalho();
		cabeçalho.afterClass();
		
		
	}
    
    @Test(priority = 26)
    public void exportar() {
		exportar = new Exportar();
    	
    	exportar.beforeClass();
    	System.out.println("-------------------Exportar-------------------------");
		exportar.login();
		exportar.brbEntrar();
		exportar.exportarCSV();
		exportar.exportarXLSX();
		exportar.afterClass();
		
		
	}
    
 
    
    @Test(priority = 27)
    public void visualizar() {
		visualizar = new Visualizar();
    	
    	visualizar.beforeClass();
    	System.out.println("-------------------Visualizar-------------------------");
		visualizar.login();
		visualizar.brbEntrar();
		visualizar.visualizar();
		visualizar.afterClass();
		
		
	}
  
    
    @Test(priority = 28)
    public void ExcluirRelatorio() {
		eliminar = new Eliminar();
    	
    	eliminar.beforeClass();
    	System.out.println("-------------------Excluir-------------------------");
		eliminar.login();
		eliminar.brbEntrar();
		eliminar.eliminar();
		eliminar.eliminarLixeira();
		eliminar.afterClass();
		
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	
	
}
