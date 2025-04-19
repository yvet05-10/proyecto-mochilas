package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenu mnOtros;
	private JMenu mnNewMenu;
	private JMenu mnDescuentos;
	private JMenu mnMantenimiento;
	private JMenu mnArchivo;
	private JMenuBar menuPrincipal;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmBeneficios;
	private JMenuItem mntmListaMochilas;
	private JMenuItem mntmVentas;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmLiquidacion;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Tienda Mochilas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuPrincipal = new JMenuBar();
		setJMenuBar(menuPrincipal);
		
		mnArchivo = new JMenu("Archivo");
		menuPrincipal.add(mnArchivo);
		
		mntmSalir = new JMenuItem(" Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuPrincipal.add(mnMantenimiento);
		
		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(this);
		mnMantenimiento.add(mntmConsultar);
		
		mntmBeneficios = new JMenuItem("Beneficios ");
		mntmBeneficios.addActionListener(this);
		mnMantenimiento.add(mntmBeneficios);
		
		mntmListaMochilas = new JMenuItem("Lista de Mochilas");
		mntmListaMochilas.addActionListener(this);
		mnMantenimiento.add(mntmListaMochilas);
		
		mnDescuentos = new JMenu("Descuentos ");
		menuPrincipal.add(mnDescuentos);
		
		mntmVentas = new JMenuItem("Ventas");
		mntmVentas.addActionListener(this);
		mnDescuentos.add(mntmVentas);
		
		mntmDescuentos = new JMenuItem("Descuento");
		mntmDescuentos.addActionListener(this);
		mnDescuentos.add(mntmDescuentos);
		
		mnNewMenu = new JMenu("Ofertas");
		menuPrincipal.add(mnNewMenu);
		
		mntmLiquidacion = new JMenuItem("Liquidacion");
		mntmLiquidacion.addActionListener(this);
		mnNewMenu.add(mntmLiquidacion);
		
		mnOtros = new JMenu("Otros");
		menuPrincipal.add(mnOtros);
		
		mntmNewMenuItem = new JMenuItem("Tienda");
		mntmNewMenuItem.addActionListener(this);
		mnOtros.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Ayuda");
		mntmNewMenuItem_1.addActionListener(this);
		mnOtros.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_8(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem_7(e);
		}
		if (e.getSource() == mntmLiquidacion) {
			actionPerformedMntmLiquidacion(e);
		}
		if (e.getSource() == mntmDescuentos) {
			actionPerformedMntmDescuentos(e);
		}
		if (e.getSource() == mntmVentas) {
			actionPerformedMntmVentas(e);
		}
		if (e.getSource() == mntmListaMochilas) {
			actionPerformedMntmListaMochilas(e);
		}
		if (e.getSource() == mntmBeneficios) {
			actionPerformedMntmBeneficios(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e)  
	{
		System.exit(0);
		
	}
	protected void actionPerformedMntmConsultar(ActionEvent e) 
	{
       ListadoMochilas consultar=new ListadoMochilas()	;
       consultar.setLocationRelativeTo(this);
       consultar.setVisible(true);
	}
	protected void actionPerformedMntmBeneficios(ActionEvent e) {
	}
	protected void actionPerformedMntmListaMochilas(ActionEvent e) 
	{
		ListaMochilas lm=new ListaMochilas();//creo un objeto de la clase
		lm.setLocationRelativeTo(this);//ubico el jdialog encima del jframe
		lm.setVisible(true);
	}
	protected void actionPerformedMntmVentas(ActionEvent e)
	{
		Ventas ventas=new Ventas();
		ventas.setLocationRelativeTo(this);
		ventas.setVisible(true);
	}
	protected void actionPerformedMntmDescuentos(ActionEvent e) {
	}
	protected void actionPerformedMntmLiquidacion(ActionEvent e) {
	}
	protected void actionPerformedMntmNewMenuItem_7(ActionEvent e) {
	}
	protected void actionPerformedMntmNewMenuItem_8(ActionEvent e) {
	}
}
