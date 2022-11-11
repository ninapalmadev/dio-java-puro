package br.com.dio.gof.singleton;

/**
 * Singleton "pregui�oso".
 *
 * @author ninapalmadev
 */

public class SingletonLazy {
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
