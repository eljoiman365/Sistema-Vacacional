import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener{

	private JMenuBar barraMenu;
	private JMenu m_opciones, m_calcular, m_acerca, m_colorFondo;
	private JMenuItem m_nuevo, m_salir, m_vacaciones, m_creador, m_rojo, m_azul, m_gris;
	private JLabel logo, titulo, subtitulo, nombre, primerApellido, segundoApellido, departamento, antiguedad, resultado, piePagina;	
	private JComboBox l_departamento, l_antiguedad;
	private JTextField txt_nombre, txt_primerApellido, txt_segundoApellido, txt_resultado;

	public PantallaPrincipal() {
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("Pantalla principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		barraMenu = new JMenuBar();
		barraMenu.setBackground(new Color(255,0,0));
		setJMenuBar(barraMenu);
		
		m_opciones = new JMenu("Opciones");
		m_opciones.setFont( new Font("Andale Mono",1,14));m_opciones.setFont( new Font("Andale Mono",1,14));
		m_opciones.setForeground( new Color(255,255,255));
		barraMenu.add(m_opciones);
		
		m_calcular = new JMenu("Calcular");
		m_calcular.setFont( new Font("Andale Mono",1,14));
		m_calcular.setForeground( new Color(255,255,255));
		barraMenu.add(m_calcular);
		
		m_acerca = new JMenu("Acerca de");
		m_acerca.setFont( new Font("Andale Mono",1,14));
		m_acerca.setForeground( new Color(255,255,255));
		barraMenu.add(m_acerca);
		
		m_colorFondo  = new JMenu("Color del fondo");
		m_colorFondo.setFont( new Font("Andale Mono",1,14));
		m_colorFondo.setForeground(new Color(255,0,0));
		
		m_nuevo  = new JMenuItem("Nuevo");
		m_nuevo.setFont( new Font("Andale Mono",1,14));
		m_nuevo.setForeground(new Color(255,0,0));
		m_nuevo.addActionListener(this);
		
		m_salir  = new JMenuItem("Salir");
		m_salir.setFont( new Font("Andale Mono",1,14));
		m_salir.setForeground(new Color(255,0,0));
		m_salir.addActionListener(this);
		
		m_rojo  = new JMenuItem("Rojo");
		m_rojo.setFont( new Font("Andale Mono",1,14));
		m_rojo.setForeground(new Color(255,0,0));
		m_rojo.addActionListener(this);
		
		m_azul  = new JMenuItem("Azul");
		m_azul.setFont( new Font("Andale Mono",1,14));
		m_azul.setForeground(new Color(255,0,0));
		m_azul.addActionListener(this);
		
		m_gris  = new JMenuItem("Gris");
		m_gris.setFont( new Font("Andale Mono",1,14));
		m_gris.setForeground(new Color(255,0,0));
		m_gris.addActionListener(this);
		
		m_opciones.add(m_colorFondo);
		m_opciones.add(m_nuevo);
		m_opciones.add(m_salir);
		
		m_colorFondo.add(m_rojo);
		m_colorFondo.add(m_azul);
		m_colorFondo.add(m_gris);
	
		m_vacaciones = new JMenuItem("Ver vacaciones");
		m_vacaciones.setFont(new Font("Andale Mono",1,14));
		m_vacaciones.setForeground(new Color(255,0,0));
		m_vacaciones.addActionListener(this);
		m_calcular.add(m_vacaciones);
		
		m_creador = new JMenuItem("Acerca del creador");
		m_creador.setFont(new Font("Andale Mono",1,14));
		m_creador.setForeground(new Color(255,0,0));
		m_creador.addActionListener(this);
		m_acerca.add(m_creador);
		
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		logo = new JLabel(imagen);
		logo.setBounds(20,30,230,100);
		add(logo);
		
		titulo = new JLabel("Bienvenido");
		titulo.setFont(new Font("Helvetica",3,50));
		titulo.setForeground(new Color(255,255,255));
		titulo.setBounds(400,40,300,80);
		add(titulo);
		
		subtitulo = new JLabel("Datos del trabajador para el cálculo de vacaciones");
		subtitulo.setBounds(110,150,700,50);
		subtitulo.setFont(new Font("Andale Mono",0,27));
		subtitulo.setForeground(new Color(255,255,255));
		add(subtitulo);
		
		nombre = new JLabel("Nombre completo:");
		nombre.setFont( new Font("Andale Mono",1,16));
		nombre.setForeground(new Color(255,255,255));
		nombre.setBounds(47,240,150,20);
		add(nombre);
		
		primerApellido = new JLabel("Nombres:");
		primerApellido.setFont( new Font("Andale Mono",1,16));
		primerApellido.setForeground(new Color(255,255,255));
		primerApellido.setBounds(47,340,150,20);
		add(primerApellido);
		
		segundoApellido = new JLabel("Apellidos:");
		segundoApellido.setFont( new Font("Andale Mono",1,16));
		segundoApellido.setForeground(new Color(255,255,255));
		segundoApellido.setBounds(47,440,150,20);
		add(segundoApellido);
		
		departamento = new JLabel("Selecciona el Departamento:");
		departamento.setFont( new Font("Andale Mono",1,16));
		departamento.setForeground(new Color(255,255,255));
		departamento.setBounds(320,240,250,20);
		add(departamento);
		
		antiguedad = new JLabel("Selecciona la Antiguedad:");
		antiguedad.setFont( new Font("Andale Mono",1,16));
		antiguedad.setForeground(new Color(255,255,255));
		antiguedad.setBounds(320,340,250,20);
		add(antiguedad);
		
		resultado = new JLabel("Resultado del cálculo:");
		resultado.setFont( new Font("Andale Mono",1,16));
		resultado.setForeground(new Color(255,255,255));
		resultado.setBounds(320,440,250,20);
		add(resultado);
		
		txt_nombre = new JTextField();
		txt_nombre.setBackground(new Color(255,255,190));
		txt_nombre.setFont(new Font("Andale Mono",1,13));
		txt_nombre.setForeground(new Color(255,0,0));
		txt_nombre.setBounds(47,277,220,30);
		txt_nombre.setEditable(false);
		add(txt_nombre);
		
		txt_primerApellido = new JTextField();
		txt_primerApellido.setBackground(new Color(255,255,190));
		txt_primerApellido.setFont(new Font("Andale Mono",1,13));
		txt_primerApellido.setForeground(new Color(255,0,0));
		txt_primerApellido.setBounds(47,377,220,30);
		add(txt_primerApellido);
		
		txt_segundoApellido = new JTextField();
		txt_segundoApellido.setBackground(new Color(255,255,190));
		txt_segundoApellido.setFont(new Font("Andale Mono",1,13));
		txt_segundoApellido.setForeground(new Color(255,0,0));
		txt_segundoApellido.setBounds(47,477,220,30);
		add(txt_segundoApellido);
		
		l_departamento = new JComboBox();
		l_departamento.setBackground(new Color(255,255,190));
		l_departamento.setFont(new Font("Andale Mono",1,13));
		l_departamento.setForeground(new Color(255,0,0));
		l_departamento.setBounds(320,277,320,30);
		l_departamento.addItem("");
		l_departamento.addItem("Atención al cliente");
		l_departamento.addItem("Logística");
		l_departamento.addItem("Gerencia");
		add(l_departamento);
		
		l_antiguedad = new JComboBox();
		l_antiguedad.setBackground(new Color(255,255,190));
		l_antiguedad.setFont(new Font("Andale Mono",1,13));
		l_antiguedad.setForeground(new Color(255,0,0));
		l_antiguedad.setBounds(320,377,320,30);
		l_antiguedad.addItem("");
		l_antiguedad.addItem("Menos de 1 año");
		l_antiguedad.addItem("1 año");
		l_antiguedad.addItem("Entre 2 a 3 años");
		l_antiguedad.addItem("7 años o más");
		add(l_antiguedad);
		
		txt_resultado = new JTextField("       Aqui aparece el resultado del cálculo de las operaciones");
		txt_resultado.setFont(new Font("Andale Mono",1,14));
		txt_resultado.setForeground(new Color(255,0,0));
		txt_resultado.setEditable(false);
		txt_resultado.setBackground(new Color(255,255,190));
		txt_resultado.setBounds(320,477,495,90);
		add(txt_resultado);
		
		piePagina = new JLabel("© 2025 The Coca-Cola Company | Todos los derechos reservados.");
		piePagina.setFont( new Font("Helvetica",0,17));
		piePagina.setForeground(new Color(255,255,255));
		piePagina.setBounds(185,610,600,20);
		add(piePagina);
	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == m_rojo){
			getContentPane().setBackground(new Color(255,0,0));
			barraMenu.setBackground(new Color(255,0,0));
			txt_nombre.setForeground(new Color(255,0,0));
			txt_primerApellido.setForeground(new Color(255,0,0));
			txt_segundoApellido.setForeground(new Color(255,0,0));
			l_departamento.setForeground(new Color(255,0,0));
			l_antiguedad.setForeground(new Color(255,0,0));
			txt_resultado.setForeground(new Color(255,0,0));

		}
		if(e.getSource() == m_azul){
			getContentPane().setBackground(new Color(0,191,255));
			barraMenu.setBackground(new Color(0,191,255));
			txt_nombre.setForeground(new Color(0,0,139));
			txt_primerApellido.setForeground(new Color(0,0,139));
			txt_segundoApellido.setForeground(new Color(0,0,139));
			l_departamento.setForeground(new Color(0,0,139));
			l_antiguedad.setForeground(new Color(0,0,139));
			txt_resultado.setForeground(new Color(0,0,139));
		}
		if(e.getSource() == m_gris){
			getContentPane().setBackground(new Color(128,128,128));
			barraMenu.setBackground(new Color(128,128,128));
			txt_nombre.setForeground(new Color(110,110,110));
			txt_primerApellido.setForeground(new Color(110,110,110));
			txt_segundoApellido.setForeground(new Color(110,110,110));
			l_departamento.setForeground(new Color(110,110,110));
			l_antiguedad.setForeground(new Color(110,110,110));
			txt_resultado.setForeground(new Color(110,110,110));
		}
		
		if(e.getSource() == m_nuevo){
			PantallaPrincipal ventana = new PantallaPrincipal();
			ventana.setBounds(0,0,870,720);
			ventana.setVisible(true);
			ventana.setResizable(false);
			ventana.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == m_salir){
			System.exit(0);
		}
		if(e.getSource() == m_vacaciones){
			String nombres = txt_primerApellido.getText();
			String apellidos = txt_segundoApellido.getText();
			String nombresCompletos = nombres + " " + apellidos;
			txt_nombre.setText(nombresCompletos);
			
			String departamento = l_departamento.getSelectedItem().toString();
			String antiguedad = l_antiguedad.getSelectedItem().toString();
			
			if(departamento.equals("Atención al cliente") && antiguedad.equals("Menos de 1 año")){
				txt_resultado.setText("       Aún lo cumples el tiempo necesario para vacaciones");
				
			}else if(departamento.equals("Atención al cliente") && antiguedad.equals("1 año")){
				txt_resultado.setText("       Tienes un total de 6 días de vacaciones");
				
			}else if(departamento.equals("Atención al cliente") && antiguedad.equals("Entre 2 a 3 años")){
				txt_resultado.setText("       Tienes un total de 14 días de vacaciones");
				
			}else if(departamento.equals("Atención al cliente") && antiguedad.equals("7 años o más")){
				txt_resultado.setText("       Tienes un total de 20 días de vacaciones");
				
			}else if(departamento.equals("") || antiguedad.equals("")){
				JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
			}
			
			if(departamento.equals("Logística") && antiguedad.equals("Menos de 1 año")){
				txt_resultado.setText("       Aún lo cumples el tiempo necesario para vacaciones");
				
			}else if(departamento.equals("Logística") && antiguedad.equals("1 año")){
				txt_resultado.setText("       Tienes un total de 7 días de vacaciones");
				
			}else if(departamento.equals("Logística") && antiguedad.equals("Entre 2 a 3 años")){
				txt_resultado.setText("       Tienes un total de 15 días de vacaciones");
				
			}else if(departamento.equals("Logística") && antiguedad.equals("7 años o más")){
				txt_resultado.setText("       Tienes un total de 22 días de vacaciones");
				
			}else if(departamento.equals("") || antiguedad.equals("")){
				JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
			}
			
			if(departamento.equals("Gerencia") && antiguedad.equals("Menos de 1 año")){
				txt_resultado.setText("       Aún lo cumples el tiempo necesario para vacaciones");
				
			}else if(departamento.equals("Gerencia") && antiguedad.equals("1 año")){
				txt_resultado.setText("       Tienes un total de 10 días de vacaciones");
				
			}else if(departamento.equals("Gerencia") && antiguedad.equals("Entre 2 a 3 años")){
				txt_resultado.setText("       Tienes un total de 20 días de vacaciones");
				
			}else if(departamento.equals("Gerencia") && antiguedad.equals("7 años o más")){
				txt_resultado.setText("       Tienes un total de 30 días de vacaciones");
				
			}else if(departamento.equals("") || antiguedad.equals("") || 
			txt_primerApellido.getText().equals("") || txt_segundoApellido.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
			}
		}
		if(e.getSource() == m_creador){
			Desktop url = Desktop.getDesktop();
			JOptionPane.showMessageDialog(null,"Desarrollado por eljoiman365: \n" + "    https://github.com/eljoiman365");
		}
	}
		
	public static void main (String args[]){
		PantallaPrincipal ventana = new PantallaPrincipal();
		ventana.setBounds(0,0,870,720);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
	}
}