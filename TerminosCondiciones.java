import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TerminosCondiciones extends JFrame implements ActionListener, ChangeListener{

	private JLabel titulo,logo;
	private JTextArea cuadroTerminos;
	private JCheckBox acepto;
	private JButton continuar,noAcepto;
	private JScrollPane ventanaTerminos;
	InterfazBienvenida interfazBienvenida = new InterfazBienvenida();
	private String nUsuario = interfazBienvenida.nombreUsuario;
	
	public TerminosCondiciones (){
	
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		titulo = new JLabel("TERMINOS Y CONDICIONES");
		titulo.setFont(new Font("Andale Mono",1,20));
		titulo.setBounds(330,20,300,30);
		add(titulo);
		
		String enunciado = 
		"""
			 Fecha de actualización: [06/04/2025]
	
			 Bienvenido al sistema de Cálculo de Vacaciones de Coca-Cola. Al acceder, utilizar o interactuar con este software, usted acepta cumplir 
			 con los presentes Términos y Condiciones. Si no está de acuerdo con alguna de las disposiciones aquí contenidas, le recomendamos no
			 utilizar esta herramienta.
			
			 El presente software ha sido desarrollado con el fin de calcular de forma automatizada y precisa los días de vacaciones correspondientes 
			 a cada colaborador de Coca-Cola, conforme a la legislación laboral vigente y las políticas internas de la compañía.
			
			 - Este sistema es de uso exclusivo para empleados y personal autorizado de Coca-Cola.
			 - Su utilización está limitada a fines laborales relacionados con la gestión de vacaciones del personal.
			 - Queda prohibido su uso para fines personales, comerciales o ajenos a la compañía.
			
			 Todos los derechos del software, incluyendo su codigo fuente, diseño, interfaz y logica de funcionamiento, pertenecen a Coca-Cola.

			 No se permite la reproducción, modificación, distribucion ni divulgacion total o parcial del sistema sin autorizacion escrita de la 
			 compania.
			
			 - La informacion procesada en este sistema es confidencial y está protegida por las políticas de privacidad de Coca-Cola.
			 - Los usuarios están obligados a mantener la confidencialidad de los datos accesados y procesados.
			 - El software cumple con las normativas aplicables de protección de datos personales.

			 Coca-Cola no se responsabiliza por errores derivados del mal uso del sistema, ingreso de datos incorrectos o fallas tecnicas ajenas al 
			 software.

			 El sistema es una herramienta de apoyo y sus resultados deben ser validados por el área de Recursos Humanos cuando corresponda.			

			 NOTA: El uso del sistema implica la aceptación total de los presentes Términos y Condiciones. Coca-Cola se reserva el derecho de 
			 modificarlos en cualquier momento, publicando las actualizaciones correspondientes en los canales internos de comunicación.
			""";
		
		cuadroTerminos = new JTextArea(enunciado);
		cuadroTerminos.setFont(new Font("Andale Mono",0,14));
		cuadroTerminos.setEditable(false);
		ventanaTerminos = new JScrollPane(cuadroTerminos);
		ventanaTerminos.setBounds(18,60,897,360);
		add(ventanaTerminos);
		
		acepto = new JCheckBox("Yo " + nUsuario + " acepto");
		acepto.setBounds(18,440,280,20);
		acepto.setFont(new Font("Andale Mono",1,15));
		acepto.addChangeListener(this);
		add(acepto);
		
		noAcepto = new JButton("No acepto");
		noAcepto.setBounds(18,475,180,40);
		noAcepto.setFont(new Font("Andale Mono",1,17));
		noAcepto.addActionListener(this);
		add(noAcepto);
		
		continuar = new JButton("Continuar");
		continuar.setBounds(208,475,180,40);
		continuar.setFont(new Font("Andale Mono",1,17));
		continuar.addActionListener(this);
		add(continuar);
		
		ImageIcon imagen = new ImageIcon("images/coca-cola.png");
		logo = new JLabel(imagen);
		logo.setBounds(570,440,450,80);
		add(logo);
	}
	
	public void stateChanged(ChangeEvent e){
		if(acepto.isSelected()){
			continuar.setEnabled(true);
			noAcepto.setEnabled(false);
		}else{
			continuar.setEnabled(false);
			noAcepto.setEnabled(true);
		}
	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == continuar){
			PantallaPrincipal ventana = new PantallaPrincipal();
			ventana.setBounds(0,0,870,720);
			ventana.setVisible(true);
			ventana.setResizable(false);
			ventana.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == noAcepto){
			InterfazBienvenida ventana = new InterfazBienvenida();
			ventana.setBounds(0,0,520,700);
			ventana.setVisible(true);
			ventana.setLocationRelativeTo(null);
			ventana.setResizable(false);
			this.setVisible(false);
		}	
	}
	
	public static void main (String args[]){
		
		TerminosCondiciones ventana = new TerminosCondiciones();
		ventana.setBounds(0,0,950,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);	
		ventana.setResizable(false);
	}
}

