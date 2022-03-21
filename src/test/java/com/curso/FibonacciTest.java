package com.curso;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	private Fibonacci fib;
	
	@Before
	public void init() {
			fib = new Fibonacci();
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		//1.cenário
		long posicao =1L;
		
		
		//2.Ação
		long valor = fib.calcular(posicao);
		
		//3.Validação
		Assert.assertEquals(1L, valor);
	}
	
	@Test
	public void deve_retorna_fibonacci_posicao_2() {
		long posicao = 2L;
		
		long valor = fib.calcular(posicao);
		
		Assert.assertEquals(1L, valor);
	}
	
	@Test
	public void deve_retorna_fibonacci_posicao_0() {
		long posicao = 0L;
		
		long valor = fib.calcular(posicao);
		
		Assert.assertEquals(0L, valor);
	}
	
}
