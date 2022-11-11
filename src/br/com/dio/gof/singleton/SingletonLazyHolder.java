package br.com.dio.gof.singleton;

/**
 * Singleton "Lazy Holder. thread safe".
 *
 * @author ninapalmadev
 */

public class SingletonLazyHolder {
	
	private static class IntanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return IntanceHolder.instancia;
	}
}
