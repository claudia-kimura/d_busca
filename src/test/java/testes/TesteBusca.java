package testes;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import elementos.Elementos;
import metodos.Metodos;

public class TesteBusca {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	
	

	@Before
	public void setUp() throws Exception {
		metodo.iniciarTeste();
	}

	@After
	public void tearDown() throws Exception {
		metodo.finalizarTeste();
	}

	@Test
	public void testBusca() throws InterruptedException, IOException  { 
		metodo.escrever(el.buscar, "Paracetamol");
		metodo.clicar(el.btnbusca);
		Thread.sleep(10000);
		metodo.evidencia("Evidencia Busca");
		
	
}
	@Test
	public void buscaEmBranco() throws InterruptedException, IOException {
		metodo.clicar(el.buscar);
		Thread.sleep(3000);
		metodo.evidencia("Evidencia BuscaEmBranco");
	}
	@Test
		public void buscaComNumero() throws InterruptedException, IOException {
			metodo.escrever(el.buscar, "3");
			metodo.clicar(el.btnbusca);
			Thread.sleep(5000);
			metodo.evidencia("Evidencia ComNumero3");
			metodo.clear(el.buscar);
			metodo.escrever(el.buscar, "12345678");
			metodo.clicar(el.btnbusca);
			Thread.sleep(5000);
			metodo.evidencia("Evidencia BuscaComNumero");
		
		}
	
	@Test
	public void buscaComUmaLetra() throws InterruptedException, IOException {
		metodo.escrever(el.buscar, "a");
		metodo.clicar(el.btnbusca);
		Thread.sleep(5000);
		metodo.evidencia("Evidencia BuscaComUmaLetra");
	}
	
	@Test
	public void buscaErroOrtografico() throws InterruptedException, IOException {
		metodo.escrever(el.buscar, "palacetamo");
		metodo.clicar(el.btnbusca);
		Thread.sleep(10000);
		metodo.evidencia("Evidencia BuscaErroOrtografico");
	}
	@Test
	public void buscarProdNaoFarma() throws InterruptedException, IOException {
		metodo.escrever(el.buscar, "caderno");
		metodo.clicar(el.btnbusca);
		Thread.sleep(5000);
		metodo.evidencia("Evidencia ProdNaoFarma");
	}
	
	}
