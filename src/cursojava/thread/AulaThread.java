package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		String name = "Vinicius";
		// String name1 = "Santos";

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

//----------------------------------------------------------------------------------------------------------------------------

		System.out.println(name); // codigo do sistema e continua o fluxo de trabalho (será executado primeiro)
		JOptionPane.showMessageDialog(null, "AGUARDE O PROCESSO"); //logo depois isso irá executar
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina que eu quero execute em paralelo
			for (int i = 0; i < 5; i++) {
				// quero executar com um tempo de parada ou com um tempo determinado
				System.out.println("ENVIANDO EMAIIL AO USUARIO");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			for (int i = 0; i < 5; i++) {
				// quero executar com um tempo de parada ou com um tempo determinado
				System.out.println("ENVIANDO NOTA FISCAL AO USUARIO");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

}
