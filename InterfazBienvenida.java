import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class InterfazBienvenida extends JFrame implements ActionListener{
	
	private JLabel logo, titulo, instruccion, piePagina;
	private JTextField nombre;
	private JButton boton1;
	public static String nombreUsuario;


	public InterfazBienvenida (){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		JLabel logo = new JLabel(imagen);
		logo.setBounds(45,40,400,150);
		add(logo);
		
		titulo = new JLabel("Sistema de Control Vacacional");
		titulo.setBounds(105,170,500,20);
		titulo.setFont(new Font("Andale Mono",3,20));
		titulo.setForeground(new Color(255,255,255));
		add(titulo);
		
		instruccion = new JLabel("Ingrese su nombre:");
		instruccion.setBounds(102,280,150,20);
		instruccion.setFont(new Font("Andale Mono",1,13));
		instruccion.setForeground(new Color(255,255,255));
		add(instruccion);
		
		piePagina = new JLabel("© The 2025 The Coca-Cola Company");
		piePagina.setBounds(140,570,250,20);
		piePagina.setFont(new Font("Andale Mono",1,13));
		piePagina.setForeground(new Color(255,255,255));
		add(piePagina);
		
		nombre = new JTextField();
		nombre.setBounds(100,310,290,30);
		nombre.setBackground(new Color(255,255,255));
		nombre.setFont(new Font("Andale Mono",1,14));
		nombre.setForeground(new Color(255,0,0));
		add(nombre);
		
		boton1 = new JButton("Ingresar");
		boton1.setBounds(185,400,120,50);
		boton1.setBackground(new Color(255,255,190));
		boton1.setFont(new Font("Andale Mono",1,14));
		boton1.setForeground(new Color(255,0,0));
		boton1.addActionListener(this);
		add(boton1);
	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == boton1){
			nombreUsuario = nombre.getText().trim();
			if(nombreUsuario.equals("")){
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
			}else {
				TerminosCondiciones ventana = new TerminosCondiciones();
				ventana.setBounds(0,0,950,600);
				ventana.setVisible(true);
				ventana.setLocationRelativeTo(null);	
				ventana.setResizable(false);
				this.setVisible(false);
			}
		}
	}
	
	public static void main (String args[]){
		InterfazBienvenida ventana = new InterfazBienvenida();
		ventana.setBounds(0,0,520,700);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}
}