package br.com.dio.gof;

import br.com.dio.gof.singleton.SingletonEager;
import br.com.dio.gof.singleton.SingletonLazy;
import br.com.dio.gof.singleton.SingletonLazyHolder;
import br.com.dio.gof.strategy.Comportamento;
import br.com.dio.gof.strategy.ComportamentoAgressivo;
import br.com.dio.gof.strategy.ComportamentoDefensivo;
import br.com.dio.gof.strategy.ComportamentoNormal;
import br.com.dio.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		//Relacionados ao Desing Pattern Singleton 
		System.out.println("--------------------");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println("--------------------");
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		System.out.println("--------------------");
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
	}
}
