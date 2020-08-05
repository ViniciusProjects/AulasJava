package cursojava.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<FilaThread> FILA_PILHA = new ConcurrentLinkedQueue<FilaThread>();

	public static void add(FilaThread obj) {
		FILA_PILHA.add(obj);
	}

	@Override
	public void run() {
		System.out.println("FILA RODANDO");

		while (true) {

			synchronized (FILA_PILHA) { // BLOQUEAR O ACESSO A ESTÁ LISTA PARA OS OUTROS PROCESSOS
				
				
				java.util.Iterator<FilaThread> iteracao = FILA_PILHA.iterator();
				while (iteracao.hasNext()) { // enquanto tiver dados na lista, vai processar

					FilaThread processar = (FilaThread) iteracao.next(); // pega o objeto
					// PROCESSAR VARIAS COISAS
					// PROCESSAR VARIAS COISAS

					System.out.println("------------------------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					iteracao.remove(); // tira ele da fila

					try {
						Thread.sleep(1000); // dar um tempo de descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

			try {
				Thread.sleep(1000); // processou toda a lista, dá um tempo para a limpeza de memoria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
