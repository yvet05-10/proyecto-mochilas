package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Ventas extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cboModelo;
	private JTextArea txtSArea;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
	private JLabel lblModelo;
	private JButton btnVender;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventas dialog = new Ventas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventas() {
		setTitle("VENTAS");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 436, 263);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblModelo.setBounds(23, 10, 68, 31);
			contentPanel.add(lblModelo);
		}
		{
			lblPrecio = new JLabel("Precio s/");
			lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPrecio.setBounds(23, 38, 68, 31);
			contentPanel.add(lblPrecio);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCantidad.setBounds(23, 66, 68, 31);
			contentPanel.add(lblCantidad);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(112, 46, 129, 19);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setEditable(false);
			txtCantidad.setBounds(112, 74, 129, 19);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(112, 17, 129, 21);
		contentPanel.add(cboModelo);
		
		txtSArea = new JTextArea();
		txtSArea.setBounds(10, 106, 416, 147);
		contentPanel.add(txtSArea);
		
		btnVender = new JButton("Vender");
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVender.addActionListener(this);
		btnVender.setBounds(298, 12, 85, 31);
		contentPanel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCerrar.setBounds(298, 46, 85, 31);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
