package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes

	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	//BOTÕES
	private JButton start = new JButton ("Start"); 
	private JButton stop = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while (true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while (true) {
				mostraTempo.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
	
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	


	public TelaTimeThread() {
		setTitle("Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null); // pede outro componente, mas só temos essa tela.
		setResizable(false); // não deixa aumentar e diminuir a telinha

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //Gerenciador de layout
		gridBagConstraints.gridy = 0;// x linhas
		gridBagConstraints.gridx = 0; // y colunas
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5); //alinhar espaço
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false); //desabilita a edição
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1; //antes dos botões, o tamanho dos campos vão ocupar 1. 
		
		start.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(start, gridBagConstraints);
		
		
		stop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(stop, gridBagConstraints);
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //executa o clique no botão
			
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				start.setEnabled(false);
				stop.setEnabled(true);
			}
		});
		
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			thread1Time.stop();
			thread2Time.stop();
			
			start.setEnabled(true);
			stop.setEnabled(false);
			}
		});
		
		stop.setEnabled(false);
		add(jPanel, BorderLayout.WEST);
		setVisible(true); //torna a tela visivel ao usuário
	}
}
