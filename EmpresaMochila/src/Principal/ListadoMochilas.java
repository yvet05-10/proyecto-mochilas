package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoMochilas extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblColor;
	private JLabel lblMaterial;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JTextField txtColor;
	private JTextField txtMaterial;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoMochilas dialog = new ListadoMochilas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoMochilas() {
		setTitle("ConsultarMochilas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 436, 263);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnCerrar.setBounds(283, 17, 113, 35);
			contentPanel.add(btnCerrar);
			btnCerrar.setActionCommand("Cancel");
		}
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 23, 65, 22);
		contentPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio s/");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(10, 60, 65, 32);
		contentPanel.add(lblPrecio);
		
		lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(10, 102, 65, 32);
		contentPanel.add(lblColor);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaterial.setBounds(10, 149, 65, 22);
		contentPanel.add(lblMaterial);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(92, 26, 120, 19);
		contentPanel.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(92, 69, 120, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setBounds(92, 111, 120, 19);
		contentPanel.add(txtColor);
		txtColor.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setBounds(92, 149, 120, 19);
		contentPanel.add(txtMaterial);
		txtMaterial.setColumns(10);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
