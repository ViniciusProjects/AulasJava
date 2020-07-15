package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		String name = "Vinicius";
		String name1 = "Santos";

		// Thread processando em paralelo do envio de email
		new Thread() {
			public void run() { // executa o que nós queremos
				// codigo da rotina que eu quero execute em paralelo
				for (int i = 0; i < 5; i++) {
					// quero executar com um tempo de parada ou com um tempo determinado
					System.out.println("ENVIANDO EMAIIL AO USUARIO: " + name);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();// liga a Thread que fica processando parelelamente por trás.
//------------------------------------------------------------------------------------------------------------------------------
		// Thread processando em paralelo envio de nota fiscal
		new Thread() {
			public void run() {

				for (int i = 0; i < 5; i++) {

					System.out.println("ENVIANDO NOTA FISCAL: " + name1);

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

		System.out.println(name); // codigo do sistema e continua o fluxo de trabalho (será executado primeiro)
		JOptionPane.showMessageDialog(null, "ENVIANDO EMAIL");
	}

}
