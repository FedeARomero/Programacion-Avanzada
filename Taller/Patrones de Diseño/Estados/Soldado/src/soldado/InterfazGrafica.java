package soldado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InterfazGrafica extends JFrame implements ActionListener{

	private JButton disparo, curacion;
	private JTextField dialogo;
	private JLabel soldadoDatos;
	private Soldado soldado;
	
	public InterfazGrafica() {
		setLayout(null);
		this.soldado = new Soldado();
		this.soldadoDatos = new JLabel(this.soldado.toString());
		this.soldadoDatos.setBounds(10, 10, 400, 20);
		add(this.soldadoDatos);
		
		this.dialogo = new JTextField();
		this.dialogo.setBounds(10, 50, 300, 20);
		add(this.dialogo);
	
		this.disparo = new JButton("Disparo");
		this.disparo.setBounds(10, 100, 100, 30);
		this.disparo.addActionListener(this);
		add(this.disparo);
		
		this.curacion = new JButton("Curacion");
		this.curacion.setBounds(150, 100, 100, 30);
		this.curacion.addActionListener(this);
		add(this.curacion);
	}
	
	public static void main(String[] args) {

		InterfazGrafica interfaz = new InterfazGrafica();
		
		interfaz.setBounds(583, 284, 400, 400);
		interfaz.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		if( evento.getSource() == this.disparo )
			this.dialogo.setText(this.soldado.recibioDisparo());
		
		if( evento.getSource() == this.curacion )
			this.dialogo.setText(this.soldado.recibioCuracion());
		
		this.soldadoDatos.setText(this.soldado.toString());
	}

}
