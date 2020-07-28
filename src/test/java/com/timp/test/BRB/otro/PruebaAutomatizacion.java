package com.timp.test.BRB.otro;


import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRB.*;
import com.timp.test.ADM.*;
import com.timp.test.BRB.*;

public class PruebaAutomatizacion extends TestBaseSteven{
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
	
	
    @Test
	public void login() {
    	loginTest = new LoginTest();
		loginTest.beforeClass();
		loginTest.Login();
		loginTest.afterClass();

	}
    
    
    @Test
	public void acessarBRB() {
		brbAcessar = new BRBAcessar();
		
    	brbAcessar.beforeClass();
    	brbAcessar.login();
    	brbAcessar.brbEntrar();
    	brbAcessar.afterClass();

	}
    
    @Test
	public void paginacion() {
		paginacion = new paginacion();
		
		paginacion.beforeClass();
		paginacion.login();
		paginacion.brbEntrar();
		paginacion.paginacion();
		paginacion.afterClass();

	}
    
    @Test
	public void filtrosAvanzados() {
		filtrosAvanaçados = new FiltrosAvançados();
		
		filtrosAvanaçados.beforeClass();
		filtrosAvanaçados.login();
		filtrosAvanaçados.brbEntrar();
		filtrosAvanaçados.filtrosAvanzados();
		filtrosAvanaçados.afterClass();

	}
    
    @Test
    public void novoRelatorio() {
		novoRelatirio = new NovoRelatorio();
		novoRelatirio.beforeClass();
		novoRelatirio.login();
		novoRelatirio.brbEntrar();
		novoRelatirio.novoRelatorio();
		novoRelatirio.colunas();
		novoRelatirio.afterClass();
		
	}
    
   

    @Test
	public void publicoYPrivado() {
		publicoYPrivado = new PublicoYPrivado();
		
		publicoYPrivado.beforeClass();
		publicoYPrivado.login();
		publicoYPrivado.brbEntrar();
		publicoYPrivado.publicoYPRivado();
		publicoYPrivado.afterClass();

	}
    
    @Test
	public void excluirColuna() {
		excluirColuna = new ExcluirColuna();
		
		excluirColuna.beforeClass();
		excluirColuna.login();
		excluirColuna.brbEntrar();
		excluirColuna.excluirColunaDragNDrop();
		excluirColuna.excluirColunaOpcao();
		excluirColuna.afterClass();

	}
    
    @Test
	public void editarRelatorio() {
		editar = new Editar();
		
		editar.beforeClass();
		editar.login();
		editar.brbEntrar();
		editar.editar();
		editar.afterClass();

	}
    
    @Test
	public void reordenarColuna() {
		reordenarColuna = new ReordenarColuna();
		
		reordenarColuna.beforeClass();
		reordenarColuna.login();
		reordenarColuna.brbEntrar();
		reordenarColuna.reordenar();
		reordenarColuna.afterClass();

	}
   
    @Test
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
    
    @Test
    public void criarCopia() {
    	criarCopia = new CriarCopia();
    	criarCopia.beforeClass();
    	criarCopia.login();
		criarCopia.brbEntrar();
		criarCopia.criarCopia();
		criarCopia.afterClass();
	}
    
    @Test
    public void ativarCorrecao() {
    	ativarCorrecao= new AtivarCorrecao();
		ativarCorrecao.beforeClass();
		ativarCorrecao.login();
		ativarCorrecao.brbEntrar();
		ativarCorrecao.ativarCorreccion();
		ativarCorrecao.afterClass();
	}
 
    @Test
    public void ativarComentario() {
    	ativarComentario = new AtivarComentario();
		ativarComentario.beforeClass();
		ativarComentario.login();
		ativarComentario.brbEntrar();
		ativarComentario.ativarComentarios();
		ativarComentario.afterClass();
		
	}
    
    @Test
    public void renomearColuna() {
    	renomearColuna = new RenomearColuna();
		renomearColuna.beforeClass();
    	renomearColuna.login();
		renomearColuna.brbEntrar();
		renomearColuna.renomearColuna();
		renomearColuna.afterClass();
	}
   
    @Test
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
    
    @Test
    public void agrupadoPeloCampo() {
    	agrupadoPeloCampo =new AgrupadoPeloCampo();
		agrupadoPeloCampo.beforeClass();
		agrupadoPeloCampo.login();
		agrupadoPeloCampo.brbEntrar();
		agrupadoPeloCampo.agrupadoPeloCampo();
		agrupadoPeloCampo.afterClass();
		
	}
    
    @Test
    public void campoOutput() {
		campoOutput = new CampoOutput();
    	campoOutput.beforeClass();
    	campoOutput.login();
    	campoOutput.brbEntrar();
    	campoOutput.campoOutput();
    	campoOutput.afterClass();
    	
    	
    	
	}
    
    @Test
    public void formatacaoEVariante() {
    	formatacaoEVariante = new FormatacaoEVariante();
		formatacaoEVariante.beforeClass();
		formatacaoEVariante.login();
		formatacaoEVariante.brbEntrar();
		formatacaoEVariante.formatacaoEVariante();
		formatacaoEVariante.excluirVariante();
		formatacaoEVariante.afterClass();
		
		
	}
    
    @Test
    public void filtroColunas() {
    	filtroColunas = new FiltroColunas();
		filtroColunas.beforeClass();
		filtroColunas.login();
		filtroColunas.brbEntrar();
		filtroColunas.filtroConFerramenta1();
		filtroColunas.filtroConFerramenta2();
		filtroColunas.afterClass();
	}
    
    @Test
    public void gruposAvanzados() {
    	gruposAvanzados = new GruposAvanzados();
		gruposAvanzados.beforeClass();
		gruposAvanzados.login();
		gruposAvanzados.brbEntrar();
		gruposAvanzados.gruposAvanzados();
		gruposAvanzados.eliminarGrupos();
		gruposAvanzados.afterClass();
	}
    
    @Test
    public void crescenteEDecrescente() {
		crescenteEDecrescente = new CrescenteEDecrescente();
    	
    	crescenteEDecrescente.beforeClass();
		crescenteEDecrescente.login();
		crescenteEDecrescente.brbEntrar();
		crescenteEDecrescente.crescenteEDecrescente();
		crescenteEDecrescente.afterClass();
		
		
	}
    
    @Test
    public void comentarioListaSuspensa() {
		listaSuspensa = new ListaSuspensa();
    	
    	listaSuspensa.beforeClass();
		listaSuspensa.login();
		listaSuspensa.brbEntrar();
		listaSuspensa.listaSuspensa();
		listaSuspensa.afterClass();
		
		
	}
    
    @Test
    public void comentarioLibre() {
		comentarioLibre = new ComentarioLibre();
    	
    	comentarioLibre.beforeClass();
		comentarioLibre.login();
		comentarioLibre.brbEntrar();
		comentarioLibre.comentarioLibre();
		comentarioLibre.afterClass();
		
		
	}
  
    @Test
    public void imprimir() {
		imprimir = new Imprimir();
    	
    	imprimir.beforeClass();
		imprimir.login();
		imprimir.brbEntrar();
		imprimir.imprimir();
		imprimir.afterClass();
		
		
	}
   
    
 
    @Test
    public void regras() {
		regras = new Regras();
    	
    	regras.beforeClass();
		regras.login();
		regras.brbEntrar();
		regras.regras();
		regras.afterClass();
		
		
	}
    
    @Test
    public void cabeçalho() {
		cabeçalho = new Cabeçalho();
    	
    	cabeçalho.beforeClass();
		cabeçalho.login();
		cabeçalho.brbEntrar();
		cabeçalho.cabeçalho();
		cabeçalho.afterClass();
		
		
	}
    
    @Test
    public void exportar() {
		exportar = new Exportar();
    	
    	exportar.beforeClass();
		exportar.login();
		exportar.brbEntrar();
		exportar.exportarCSV();
		exportar.exportarXLSX();
		exportar.afterClass();
		
		
	}
    
 
    
    @Test
    public void visualizar() {
		visualizar = new Visualizar();
    	
    	visualizar.beforeClass();
		visualizar.login();
		visualizar.brbEntrar();
		visualizar.visualizar();
		visualizar.afterClass();
		
		
	}
  
    
    @Test
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
