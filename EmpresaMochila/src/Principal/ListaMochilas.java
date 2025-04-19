package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ListaMochilas extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPane;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextArea txtSArea;
	private JButton btnListar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListaMochilas dialog = new ListaMochilas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListaMochilas() {
		setTitle("Lista de Mochilas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 436, 232);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		scrollPane.setBounds(0, 0, 436, 232);
		contentPanel.add(scrollPane);
		
		txtSArea = new JTextArea();
		scrollPane.setViewportView(txtSArea);
		{
			buttonPane = new JPanel();
			buttonPane.setBounds(0, 232, 436, 31);
			getContentPane().add(buttonPane);
			{
				buttonPane.setLayout(null);
			}
			{
				btnListar = new JButton("Listar");
				btnListar.addActionListener(this);
				btnListar.setBounds(197, 10, 85, 21);
				buttonPane.add(btnListar);
			}
			{
				btnCerrar = new JButton("cerrar");
				btnCerrar.addActionListener(this);
				btnCerrar.setBounds(82, 10, 85, 21);
				buttonPane.add(btnCerrar);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
