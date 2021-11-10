package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.PreguntaNumerica;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class ventanap1 extends JFrame {

	private JPanel contentPane;
	private JFrame ventanaAnterior;
	private PreguntaNumerica p1;
	private JLabel descp1_2;
	private JLabel lblRespuesta;
	private JLabel lblUsaEsteBotn;
	private JButton btnNewButton;
	private JButton btnComprobar;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public ventanap1(JFrame ventanaAnterior, PreguntaNumerica p1) {
		this.ventanaAnterior=ventanaAnterior;
		this.p1=p1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaAnterior.setVisible(true);
				ventanap1.this.setVisible(false);
			}
		});
		btnVolver.setBounds(15, 301, 115, 29);
		contentPane.add(btnVolver);
		
		JLabel ecuación = new JLabel("3x - 2 +3 -6x = 2 -2x +2");
		ecuación.setBounds(15, 98, 194, 20);
		contentPane.add(ecuación);
		
		descp1_2 = new JLabel("La respuesta debe ser un numero entero positivo o negativo.");
		descp1_2.setBounds(15, 63, 492, 20);
		contentPane.add(descp1_2);
		
		JTextField respuestap1 = new JTextField();
		respuestap1.setBounds(15, 224, 146, 26);
		contentPane.add(respuestap1);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuestaJugador = respuestap1.getText();
				if(respuestaJugador.equals("-3")){
					JOptionPane.showMessageDialog(ventanap1.this, "Respuesta correcta");
				}else{
					JOptionPane.showMessageDialog(ventanap1.this, "Respuesta incorrecta. Intentalo de nuevo");
				}
			}
		});
		btnComprobar.setBounds(176, 223, 115, 29);
		contentPane.add(btnComprobar);
		
		lblRespuesta = new JLabel("Respuesta:");
		lblRespuesta.setBounds(15, 193, 115, 20);
		contentPane.add(lblRespuesta);
		
		lblUsaEsteBotn = new JLabel("Usa este bot\u00F3n para volver al menu principal");
		lblUsaEsteBotn.setBounds(140, 305, 434, 20);
		contentPane.add(lblUsaEsteBotn);
		
		btnNewButton = new JButton("SALPH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuestaJugador = respuestap1.getText();
				if(respuestaJugador.equals("-3")){
					JOptionPane.showMessageDialog(ventanap1.this, "BIEN HECHO - Esa si es la respuesta correcta, Muchas gracias, como agradecimiento ahí va"
							+ " un dato para tí, odio los numeros negativos (son muy complicados) por eso "
							+ "SIEMPRE UTILIZO NUMEROS POSITIVOS PARA LAS SUMAS");
					}else{
						JOptionPane.showMessageDialog(ventanap1.this, "Me da que esta respuesta no esta bien. El botón Comporbar existe para "
								+ "validar la respuesta, úsalo");
				}
			}
			
			}
		);
		btnNewButton.setBounds(15, 266, 115, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("LOS NUMEROS SON BONITOS - NO ODIES LAS MATEM\u00C1TICAS");
		lblNewLabel.setBounds(15, 27, 631, 20);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
