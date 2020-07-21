package com.timp.test.BRB;


import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.BRD.*;
import com.timp.test.ADM.*;
import com.timp.test.BRB.*;

public class PruebaAutomatizacion extends TestBase{
	LoginTest loginTest;
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
    	loginTest = new LoginTest();
		loginTest.beforeClass();
		loginTest.Login();
		loginTest.afterClass();

	}
    
    
    @Test(priority = 1)
	public void acessarBRB() {
		brbAcessar = new BRBAcessar();
		
    	brbAcessar.beforeClass();
    	brbAcessar.login();
    	brbAcessar.brbEntrar();
    	brbAcessar.afterClass();

	}
    
    @Test(priority = 2)
	public void paginacion() {
		paginacion = new paginacion();
		
		paginacion.beforeClass();
		paginacion.login();
		paginacion.brbEntrar();
		paginacion.paginacion();
		paginacion.afterClass();

	}
    
    @Test(priority = 3)
	public void filtrosAvanzados() {
		filtrosAvanaçados = new FiltrosAvançados();
		
		filtrosAvanaçados.beforeClass();
		filtrosAvanaçados.login();
		filtrosAvanaçados.brbEntrar();
		filtrosAvanaçados.filtrosAvanzados();
		filtrosAvanaçados.afterClass();

	}
    
    @Test(priority = 4)
    public void novoRelatorio() {
		novoRelatirio = new NovoRelatorio();
		novoRelatirio.beforeClass();
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
		publicoYPrivado.login();
		publicoYPrivado.brbEntrar();
		publicoYPrivado.publicoYPRivado();
		publicoYPrivado.afterClass();

	}
    
    @Test(priority = 6)
	public void excluirColuna() {
		excluirColuna = new ExcluirColuna();
		
		excluirColuna.beforeClass();
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
		editar.login();
		editar.brbEntrar();
		editar.editar();
		editar.afterClass();

	}
    
    @Test(priority = 8)
	public void reordenarColuna() {
		reordenarColuna = new ReordenarColuna();
		
		reordenarColuna.beforeClass();
		reordenarColuna.login();
		reordenarColuna.brbEntrar();
		reordenarColuna.reordenar();
		reordenarColuna.afterClass();

	}
   
    @Test(priority = 9)
	public void filtrosRelatorio() {
		filtros = new Filtros();
		
		filtros.beforeClass();
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
    	criarCopia.login();
		criarCopia.brbEntrar();
		criarCopia.criarCopia();
		criarCopia.afterClass();
	}
    
    @Test(priority = 11)
    public void ativarCorrecao() {
    	ativarCorrecao= new AtivarCorrecao();
		ativarCorrecao.beforeClass();
		ativarCorrecao.login();
		ativarCorrecao.brbEntrar();
		ativarCorrecao.ativarCorreccion();
		ativarCorrecao.afterClass();
	}
 
    @Test(priority = 12)
    public void ativarComentario() {
    	ativarComentario = new AtivarComentario();
		ativarComentario.beforeClass();
		ativarComentario.login();
		ativarComentario.brbEntrar();
		ativarComentario.ativarComentarios();
		ativarComentario.afterClass();
		
	}
    
    @Test(priority = 13)
    public void renomearColuna() {
    	renomearColuna = new RenomearColuna();
		renomearColuna.beforeClass();
    	renomearColuna.login();
		renomearColuna.brbEntrar();
		renomearColuna.renomearColuna();
		renomearColuna.afterClass();
	}
   
    @Test(priority = 14)
    public void formula() {
    	formula = new Formula();
    	formula.beforeClass();
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
		agrupadoPeloCampo.login();
		agrupadoPeloCampo.brbEntrar();
		agrupadoPeloCampo.agrupadoPeloCampo();
		agrupadoPeloCampo.afterClass();
		
	}
    
    @Test(priority = 16)
    public void campoOutput() {
		campoOutput = new CampoOutput();
    	campoOutput.beforeClass();
    	campoOutput.login();
    	campoOutput.brbEntrar();
    	campoOutput.campoOutput();
    	campoOutput.afterClass();
    	
    	
    	
	}
    
    @Test(priority = 17)
    public void formatacaoEVariante() {
    	formatacaoEVariante = new FormatacaoEVariante();
		formatacaoEVariante.beforeClass();
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
		crescenteEDecrescente.login();
		crescenteEDecrescente.brbEntrar();
		crescenteEDecrescente.crescenteEDecrescente();
		crescenteEDecrescente.afterClass();
		
		
	}
    
    @Test(priority = 21)
    public void comentarioListaSuspensa() {
		listaSuspensa = new ListaSuspensa();
    	
    	listaSuspensa.beforeClass();
		listaSuspensa.login();
		listaSuspensa.brbEntrar();
		listaSuspensa.listaSuspensa();
		listaSuspensa.afterClass();
		
		
	}
    
    @Test(priority = 22)
    public void comentarioLibre() {
		comentarioLibre = new ComentarioLibre();
    	
    	comentarioLibre.beforeClass();
		comentarioLibre.login();
		comentarioLibre.brbEntrar();
		comentarioLibre.comentarioLibre();
		comentarioLibre.afterClass();
		
		
	}
  
    @Test(priority = 23)
    public void imprimir() {
		imprimir = new Imprimir();
    	
    	imprimir.beforeClass();
		imprimir.login();
		imprimir.brbEntrar();
		imprimir.imprimir();
		imprimir.afterClass();
		
		
	}
   
    
 
    @Test(priority = 24)
    public void regras() {
		regras = new Regras();
    	
    	regras.beforeClass();
		regras.login();
		regras.brbEntrar();
		regras.regras();
		regras.afterClass();
		
		
	}
    
    @Test(priority = 25)
    public void cabeçalho() {
		cabeçalho = new Cabeçalho();
    	
    	cabeçalho.beforeClass();
		cabeçalho.login();
		cabeçalho.brbEntrar();
		cabeçalho.cabeçalho();
		cabeçalho.afterClass();
		
		
	}
    
    @Test(priority = 26)
    public void exportar() {
		exportar = new Exportar();
    	
    	exportar.beforeClass();
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
		visualizar.login();
		visualizar.brbEntrar();
		visualizar.visualizar();
		visualizar.afterClass();
		
		
	}
  
    
    @Test(priority = 28)
    public void ExcluirRelatorio() {
		eliminar = new Eliminar();
    	
    	eliminar.beforeClass();
		eliminar.login();
		eliminar.brbEntrar();
		eliminar.eliminar();
		eliminar.eliminarLixeira();
		eliminar.afterClass();
		
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	
	
}
