package ventanaPrincipal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import clases.PreguntaNumerica;
import clases.PreguntaTexto;
import ventanas.ventanaFinal;
import ventanas.ventanap1;
import ventanas.ventanap2;
import ventanas.ventanap3;
import ventanas.ventanap4;
import ventanas.ventanap5;
import ventanas.ventanap6;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField respuesta1;
	private JTextField respuesta2;
	private JTextField respuesta3;
	private JTextField respuesta4;
	private JList list_1;
	private JList list_2;
	private JList list_3;
	private JList list_4;
	private JList list_5;
	private JList list_6;
	private JButton btnPregunta1;
	private JButton btnPregunta2;
	private JButton btnPregunta3;
	private JButton btnPregunta4;
	private JButton btnPregunta5;
	private JButton btnPregunta6;
	private JList listprueba;
	private JButton btnPreguntaprueba;
	private JButton btnBienvenido;
	private JButton btnResolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		
		JOptionPane.showMessageDialog(VentanaPrincipal.this, "Bienvenido, el objetivo de este juego es encontrar el orden y los cuatro "
				+ "digitos que pertenenecen al panel de contraseña del menu principal. Para ello, deberas ir interactuando con las "
				+ "diferentes habitaciones del programa e ir obteniendo pistas que te ayuden a descubrir la contraseña.");
		
		//Preguntas disponibles
		PreguntaNumerica p1 = new PreguntaNumerica("Matemáticas", "Bienvenido a la habitación -MATEMATICAS- .Aquí suelo practicar operaciones matemáticas, me entretengo resolviendo diferentes"
				+ " operaciones, pero, ahora mismo no se como resolver esta ecuación.", -3);
		PreguntaTexto p2 = new PreguntaTexto("Servidor", "Esta habitación es solo para uso del administrador, es decir yo, por favor sal ahora mismo de aquí usando el botón Volver", "HABITACIÓN ADMINISTRADOR");
		PreguntaNumerica p3 = new PreguntaNumerica("Información", "En esta habitación hay diferentes datos sobre mí", 0);
		PreguntaTexto p4 = new PreguntaTexto("Música", "Hey que tal, en esta habitación guardo mis canciones favoritas.", "");
		PreguntaNumerica p5 = new PreguntaNumerica("Arte", "Anda hola, bienvenido a mi sección artistica, aquí paso horas haciendo dibujos maravillosos", 2);
		PreguntaTexto p6 = new PreguntaTexto("Libre", "Esta habitación se diseño para que yo diseñara lo que quisiera, por eso decidí hacer una Habitación de acertijos. Juega conmigo al ajertijo que tengo preparado.", "HIJO");
		
	
		//Eleccion de pregunta a resolver
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list_1 = new JList();
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_1.getSelectedIndex();
				if(indiceSeleccionado>=0) {
					btnPregunta1.setEnabled(true);
				}else{
					btnPregunta1.setEnabled(false);
				}	
			}
		});
		list_1.setBounds(40, 136, 170, 26);
		DefaultListModel<PreguntaNumerica> modeloLista1 = new DefaultListModel<PreguntaNumerica>();
		modeloLista1.addElement(p1);
		list_1.setModel(modeloLista1);
		contentPane.add(list_1);
		
		list_2 = new JList();
		list_2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_2.getSelectedIndex();
				if(indiceSeleccionado>=0) {
					btnPregunta2.setEnabled(true);
				}else{
					btnPregunta2.setEnabled(false);
				}	
			}
		});
		list_2.setBounds(40, 181, 170, 26);
		DefaultListModel<PreguntaTexto> modeloLista2 = new DefaultListModel<PreguntaTexto>();
		modeloLista2.addElement(p2);
		list_2.setModel(modeloLista2);
		contentPane.add(list_2);
		
		list_3 = new JList();
		list_3.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_3.getSelectedIndex();
				if(indiceSeleccionado>=0) {
					btnPregunta3.setEnabled(true);
				}else{
					btnPregunta3.setEnabled(false);
				}	
			}
		});
		list_3.setBounds(40, 225, 170, 26);
		DefaultListModel<PreguntaNumerica> modeloLista3 = new DefaultListModel<PreguntaNumerica>();
		modeloLista3.addElement(p3);
		list_3.setModel(modeloLista3);
		contentPane.add(list_3);
		
		list_4 = new JList();
		list_4.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_4.getSelectedIndex();
				if(indiceSeleccionado>=0) {
					btnPregunta4.setEnabled(true);
				}else{
					btnPregunta4.setEnabled(false);
				}	
			}
		});
		list_4.setBounds(40, 270, 170, 26);
		DefaultListModel<PreguntaTexto> modeloLista4 = new DefaultListModel<PreguntaTexto>();
		modeloLista4.addElement(p4);
		list_4.setModel(modeloLista4);
		contentPane.add(list_4);
		
		list_5 = new JList();
		list_5.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_5.getSelectedIndex();
				if(indiceSeleccionado>=0) {
					btnPregunta5.setEnabled(true);
				}else{
					btnPregunta5.setEnabled(false);
				}	
			}
		});
		list_5.setBounds(40, 315, 170, 26);
		DefaultListModel<PreguntaNumerica> modeloLista5 = new DefaultListModel<PreguntaNumerica>();
		modeloLista5.addElement(p5);
		list_5.setModel(modeloLista5);
		contentPane.add(list_5);
		
		list_6 = new JList();
		list_6.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_6.getSelectedIndex();
					if(indiceSeleccionado>=0) {
						btnPregunta6.setEnabled(true);
					}else{
						btnPregunta6.setEnabled(false);
					}		
			}
		});
		list_6.setBounds(40, 359, 170, 26);
		DefaultListModel<PreguntaTexto> modeloLista6 = new DefaultListModel<PreguntaTexto>();
		modeloLista6.addElement(p6);
		list_6.setModel(modeloLista6);
		contentPane.add(list_6);
		
		
		btnPregunta1 = new JButton("Ecuación");
		btnPregunta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_1.getSelectedIndex();
				if(indiceSeleccionado>=0){
					ventanap1 v1 = new ventanap1(VentanaPrincipal.this, p1);
					v1.setVisible(true);
					VentanaPrincipal.this.setVisible(false);	
					JOptionPane.showMessageDialog(VentanaPrincipal.this, p1.getDescripcion());
					JOptionPane.showMessageDialog(VentanaPrincipal.this, "Que tal si me ayudas a resolver la ecuación."
							+ " Si quieres hablar conmigo pulsa el botón con mi nombre.");
				}
			}
		});
		btnPregunta1.setEnabled(false);
		btnPregunta1.setBounds(237, 133, 142, 29);
		contentPane.add(btnPregunta1);
		
		btnPregunta2 = new JButton("Administración");
		btnPregunta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_2.getSelectedIndex();
				if(indiceSeleccionado>=0){
					ventanap2 v2 = new ventanap2(VentanaPrincipal.this, p2);
					v2.setVisible(true);
					VentanaPrincipal.this.setVisible(false);	
					JOptionPane.showMessageDialog(VentanaPrincipal.this, p2.getDescripcion());
				}
			}
		});
		btnPregunta2.setEnabled(false);
		btnPregunta2.setBounds(237, 178, 142, 29);
		contentPane.add(btnPregunta2);
		
		btnPregunta3 = new JButton("SALPH");
		btnPregunta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_3.getSelectedIndex();
				if(indiceSeleccionado>=0){
					ventanap3 v3 = new ventanap3(VentanaPrincipal.this, p3);
					v3.setVisible(true);
					VentanaPrincipal.this.setVisible(false);	
				}
			}
		});
		btnPregunta3.setEnabled(false);
		btnPregunta3.setBounds(237, 222, 142, 29);
		contentPane.add(btnPregunta3);
		
		btnPregunta4 = new JButton("Canciones");
		btnPregunta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_4.getSelectedIndex();
				if(indiceSeleccionado>=0){
					ventanap4 v4 = new ventanap4(VentanaPrincipal.this, p4);
					v4.setVisible(true);
					VentanaPrincipal.this.setVisible(false);	
				}
			}
		});
		btnPregunta4.setEnabled(false);
		btnPregunta4.setBounds(237, 267, 142, 29);
		contentPane.add(btnPregunta4);
		
		btnPregunta5 = new JButton("Dibujo Binario");
		btnPregunta5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_5.getSelectedIndex();
				if(indiceSeleccionado>=0){
					ventanap5 v5 = new ventanap5(VentanaPrincipal.this, p5);
					v5.setVisible(true);
					VentanaPrincipal.this.setVisible(false);	
					JOptionPane.showMessageDialog(VentanaPrincipal.this, p5.getDescripcion());
					JOptionPane.showMessageDialog(VentanaPrincipal.this, "Admira mi dibujo durante un rato y luego habla conmigo");
				}
			}
		});
		btnPregunta5.setEnabled(false);
		btnPregunta5.setBounds(237, 312, 142, 29);
		contentPane.add(btnPregunta5);
		
		btnPregunta6 = new JButton("Acertijo");
		btnPregunta6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indiceSeleccionado=list_6.getSelectedIndex();
				if(indiceSeleccionado>=0){
					ventanap6 v6 = new ventanap6(VentanaPrincipal.this, p6);
					v6.setVisible(true);
					VentanaPrincipal.this.setVisible(false);
					JOptionPane.showMessageDialog(VentanaPrincipal.this, p6.getDescripcion());
					JOptionPane.showMessageDialog(VentanaPrincipal.this, "Habla conmigo una vez creas que tienes la respuesta correcta");
				}
			}
		});
		btnPregunta6.setEnabled(false);
		btnPregunta6.setBounds(237, 356, 142, 29);
		contentPane.add(btnPregunta6);
		
		
		//Marcar respuesta final
		respuesta1 = new JTextField();
		respuesta1.setBounds(398, 165, 30, 26);
		contentPane.add(respuesta1);
		respuesta1.setColumns(10);
		
		respuesta2 = new JTextField();
		respuesta2.setColumns(10);
		respuesta2.setBounds(434, 165, 30, 26);
		contentPane.add(respuesta2);
		
		respuesta3 = new JTextField();
		respuesta3.setColumns(10);
		respuesta3.setBounds(470, 165, 30, 26);
		contentPane.add(respuesta3);
		
		respuesta4 = new JTextField();
		respuesta4.setColumns(10);
		respuesta4.setBounds(506, 165, 30, 26);
		contentPane.add(respuesta4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+1);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+1);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+1);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+1);
							}
						}
					}
				}	
			}
		});
		btn1.setBounds(398, 207, 41, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+2);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+2);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+2);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+2);
							}
						}
					}
				}	
			}
		});
		btn2.setBounds(447, 207, 41, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+3);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+3);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+3);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+3);
							}
						}
					}
				}	
			}
		});
		btn3.setBounds(497, 207, 41, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+4);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+4);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+4);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+4);
							}
						}
					}
				}	
			}
		});
		btn4.setBounds(398, 246, 41, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+5);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+5);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+5);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+5);
							}
						}
					}
				}	
			}
		});
		btn5.setBounds(447, 246, 41, 29);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+6);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+6);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+6);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+6);
							}
						}
					}
				}	
			}
		});
		btn6.setBounds(497, 246, 41, 29);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+7);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+7);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+7);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+7);
							}
						}
					}
				}	
			}
		});
		btn7.setBounds(398, 285, 41, 29);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+8);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+8);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+8);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+8);
							}
						}
					}
				}	
			}
		});
		btn8.setBounds(447, 285, 41, 29);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+9);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+9);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+9);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+9);
							}
						}
					}
				}	
			}
		});
		btn9.setBounds(497, 285, 41, 29);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().length()<1){
					respuesta1.setText(respuesta1.getText()+0);
				}else{
					if(respuesta2.getText().length()<1){
						respuesta2.setText(respuesta2.getText()+0);
					}else{
						if(respuesta3.getText().length()<1){
							respuesta3.setText(respuesta3.getText()+0);
						}else{
							if(respuesta4.getText().length()<1){
								respuesta4.setText(respuesta4.getText()+0);
							}
						}
					}
				}	
			}
		});
		btn0.setBounds(447, 323, 41, 29);
		contentPane.add(btn0);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				respuesta1.setText("");
				respuesta2.setText("");
				respuesta3.setText("");
				respuesta4.setText("");
			}	
		});
		btnX.setForeground(Color.RED);
		btnX.setBounds(398, 323, 48, 29);
		contentPane.add(btnX);
		
		btnResolver = new JButton("Resolver");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(respuesta1.getText().equals("4")&&respuesta2.getText().equals("0")&&respuesta3.getText().equals("1")&&respuesta4.getText().equals("5")){
					ventanaFinal vFinal = new ventanaFinal(VentanaPrincipal.this);
					vFinal.setVisible(true);
					VentanaPrincipal.this.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(VentanaPrincipal.this, "Esa no es la contraseña del panel principal");
				}
			}
		});
		btnResolver.setBounds(408, 368, 115, 29);
		contentPane.add(btnResolver);
		
		btnBienvenido = new JButton("Bienvenido");
		btnBienvenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaPrincipal.this, "Hola, bienvenido a mi software, soy el Sistema de Administración Local de Personalidad Hiperbólica, SALPH."
						+ " Yo dirijo todos los sistemas de este programa, espero que pases un muy buen rato "
						+ "y como me has caido super bien te voy a contar un secreto, mi numero favorito es el 475821.");
			}
		});
		btnBienvenido.setBounds(40, 26, 170, 78);
		contentPane.add(btnBienvenido);
	}
}
