package controller;

public class ThreadSapo extends Thread {

	private int sapo;
	
	public ThreadSapo(int sapo) {
		this.sapo = sapo;
	}
	
	@Override
	public void run() {
		pulo();
	}
	
	private void pulo() {
		double d = 16;
		double salto;
		double disp = 0;
		while(d > 0) {
			try {
				sleep(100);
				salto = (Math.random()*1.6);
				disp += salto;
				d = d - salto;
				System.out.println("Sapo "+sapo+" pulou "+salto+" metro!");
				System.out.println("Sapo "+sapo+" percorreu "+disp+" metros!");
				if(d>0) {
				System.out.println("Faltam "+d+" metros para o Sapo "+sapo+" terminar a corrida");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Sapo "+sapo+" finalizou a corrida!");
	}

}
