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
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes

	private JLabel nome = new JLabel("Nome");
	private JTextField campoNome = new JTextField();

	private JLabel email = new JLabel("Email");
	private JTextField campoEmail = new JTextField();

	// BOTÕES
	private JButton addLista = new JButton("Add");
	private JButton stop = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() {
		setTitle("Adicionar lista");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null); // pede outro componente, mas só temos essa tela.
		setResizable(false); // não deixa aumentar e diminuir a telinha

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Gerenciador de layout
		gridBagConstraints.gridy = 0;// x linhas
		gridBagConstraints.gridx = 0; // y colunas
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5); // alinhar espaço
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		nome.setPreferredSize(new Dimension(200, 25));
		jPanel.add(nome, gridBagConstraints);

		campoNome.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;

		jPanel.add(campoNome, gridBagConstraints);

		email.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(email, gridBagConstraints);

		campoEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;

		jPanel.add(campoEmail, gridBagConstraints);

		gridBagConstraints.gridwidth = 1; // antes dos botões, o tamanho dos campos vão ocupar 1.

		addLista.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(addLista, gridBagConstraints);

		stop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(stop, gridBagConstraints);

		addLista.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // executa o clique no botão

				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for (int i = 0; i < 100; i++) {
					FilaThread filaThread = new FilaThread();
					filaThread.setNome(campoNome.getText());
					filaThread.setEmail(campoEmail.getText() + " - " + i);

					fila.add(filaThread);

				}

			}
		});
		try {
			stop.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					fila.stop();
					fila = null;
					
				}
			});

		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		fila.start();
		add(jPanel, BorderLayout.WEST);
		setVisible(true); // torna a tela visivel ao usuário
	}
}
