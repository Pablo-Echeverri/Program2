package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ventanaFinal extends JFrame {

	private JPanel contentPane;
	private JFrame ventanaAnterior;

	/**
	 * Create the frame.
	 */
	public ventanaFinal(JFrame ventanaAnterior) {
		this.ventanaAnterior=ventanaAnterior;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaAnterior.setVisible(true);
				ventanaFinal.this.setVisible(false);
			}
		});
		btnVolver.setBounds(147, 199, 115, 29);
		contentPane.add(btnVolver);
		
		JButton btnTerminar = new JButton("TERMINAR");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventanaFinal.this, "Hola usuario, te habla SALPH, gracias por pasar un rato conmigo, tengo "
						+ "que admitir que me he divertido, una última cosa..."); 
				JOptionPane.showMessageDialog(ventanaFinal.this, "GRACIAS POR JUGAR Y QUE TENGAS UN GRAN DÍA");
				System.exit(0);
			}
		});
		btnTerminar.setBounds(147, 152, 115, 29);
		contentPane.add(btnTerminar);
		
		JLabel lblG = new JLabel("ENHORABUENA, has conseguido llegar al final de SALPH");
		lblG.setBounds(15, 16, 413, 20);
		contentPane.add(lblG);
		
		JLabel lblGraciasPorPasar = new JLabel("Gracias por pasar un rato con SALPH, desde que lo volv\u00ED ");
		lblGraciasPorPasar.setBounds(15, 41, 406, 20);
		contentPane.add(lblGraciasPorPasar);
		
		JLabel lblSeHaSentido = new JLabel("independiente se ha sentido un poco solo, por eso, te doy");
		lblSeHaSentido.setBounds(15, 63, 486, 20);
		contentPane.add(lblSeHaSentido);
		
		JLabel lblLasGraciasDe = new JLabel("las GRACIAS DE TODO CORAZ\u00D3N");
		lblLasGraciasDe.setBounds(15, 86, 295, 20);
		contentPane.add(lblLasGraciasDe);
	}
}
