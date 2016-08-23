import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Estacionamento {

	static JFrame tela = new JFrame();
	static JLabel fundo = new JLabel(new ImageIcon("imagem\\estacionamento.png"));

	static JPanel def1 = new JPanel();
	static JPanel def2 = new JPanel();
	static JPanel def3 = new JPanel();
	static JPanel def4 = new JPanel();
	static JPanel def5 = new JPanel();
	static JPanel def6 = new JPanel();
	static JPanel def7 = new JPanel();
	static JPanel def8 = new JPanel();
	static JPanel def9 = new JPanel();
	static JPanel def10 = new JPanel();
	static JPanel def11 = new JPanel();
	static JPanel def12 = new JPanel();
	static JPanel def13 = new JPanel();
	static JPanel def14 = new JPanel();
	static JPanel def15 = new JPanel();

	static JPanel moto1 = new JPanel();
	static JPanel moto2 = new JPanel();
	static JPanel moto3 = new JPanel();
	static JPanel moto4 = new JPanel();
	static JPanel moto5 = new JPanel();
	static JPanel moto6 = new JPanel();
	static JPanel moto7 = new JPanel();
	static JPanel moto8 = new JPanel();
	static JPanel moto9 = new JPanel();
	static JPanel moto10 = new JPanel();
	static JPanel moto11 = new JPanel();
	static JPanel moto12 = new JPanel();
	static JPanel moto13 = new JPanel();
	static JPanel moto14 = new JPanel();
	static JPanel moto15 = new JPanel();
	static JPanel moto16 = new JPanel();
	static JPanel moto17 = new JPanel();
	static JPanel moto18 = new JPanel();
	static JPanel moto19 = new JPanel();
	static JPanel moto20 = new JPanel();
	static JPanel moto21 = new JPanel();
	static JPanel moto22 = new JPanel();
	static JPanel moto23 = new JPanel();
	static JPanel moto24 = new JPanel();
	static JPanel moto25 = new JPanel();
	static JPanel moto26 = new JPanel();
	static JPanel moto27 = new JPanel();
	static JPanel moto28 = new JPanel();
	static JPanel moto29 = new JPanel();
	static JPanel moto30 = new JPanel();

	static JPanel carro1 = new JPanel();
	static JPanel carro2 = new JPanel();
	static JPanel carro3 = new JPanel();
	static JPanel carro4 = new JPanel();
	static JPanel carro5 = new JPanel();
	static JPanel carro6 = new JPanel();
	static JPanel carro7 = new JPanel();
	static JPanel carro8 = new JPanel();
	static JPanel carro9 = new JPanel();
	static JPanel carro10 = new JPanel();
	static JPanel carro11 = new JPanel();
	static JPanel carro12 = new JPanel();
	static JPanel carro13 = new JPanel();
	static JPanel carro14 = new JPanel();
	static JPanel carro15 = new JPanel();
	static JPanel carro16 = new JPanel();
	static JPanel carro17 = new JPanel();
	static JPanel carro18 = new JPanel();
	static JPanel carro19 = new JPanel();
	static JPanel carro20 = new JPanel();
	static JPanel carro21 = new JPanel();
	static JPanel carro22 = new JPanel();
	static JPanel carro23 = new JPanel();
	static JPanel carro24 = new JPanel();
	static JPanel carro25 = new JPanel();
	static JPanel carro26 = new JPanel();
	static JPanel carro27 = new JPanel();
	static JPanel carro28 = new JPanel();
	static JPanel carro29 = new JPanel();
	static JPanel carro30 = new JPanel();
	static JPanel carro31 = new JPanel();
	static JPanel carro32 = new JPanel();
	static JPanel carro33 = new JPanel();
	static JPanel carro34 = new JPanel();
	static JPanel carro35 = new JPanel();
	static JPanel carro36 = new JPanel();
	static JPanel carro37 = new JPanel();
	static JPanel carro38 = new JPanel();
	static JPanel carro39 = new JPanel();
	static JPanel carro40 = new JPanel();
	static JPanel carro41 = new JPanel();
	static JPanel carro42 = new JPanel();
	static JPanel carro43 = new JPanel();
	static JPanel carro44 = new JPanel();
	static JPanel carro45 = new JPanel();

	static JButton deficientee = new JButton("DEFICIENTES E");
	static JButton deficientes = new JButton("DEFICIENTES S");
	static JButton motoe = new JButton("MOTOS E");
	static JButton motos = new JButton("MOTOS S");
	static JButton carroe = new JButton("CARROS E");
	static JButton carros = new JButton("CARROS S");

	static boolean[] d = new boolean[15];
	static boolean[] m = new boolean[30];
	static boolean[] c = new boolean[45];

	static int defl = 15;
	static int defo = 0;
	static int motol = 30;
	static int motoo = 0;
	static int carrol = 45;
	static int carroo = 0;

	static void lalala() {
		tela.setTitle("ESTACIONAMENTO DA AMANDA");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLocation(350, 0);
		tela.setSize(550, 600);

		tela.add(def1).setBounds(205, 65, 20, 20);
		tela.add(def2).setBounds(231, 65, 20, 20);
		tela.add(def3).setBounds(258, 65, 20, 20);
		tela.add(def4).setBounds(285, 65, 20, 20);
		tela.add(def5).setBounds(311, 65, 20, 20);
		tela.add(def6).setBounds(205, 245, 20, 20);
		tela.add(def7).setBounds(231, 245, 20, 20);
		tela.add(def8).setBounds(258, 245, 20, 20);
		tela.add(def9).setBounds(285, 245, 20, 20);
		tela.add(def10).setBounds(311, 245, 20, 20);
		tela.add(def11).setBounds(206, 425, 20, 20);
		tela.add(def12).setBounds(231, 425, 20, 20);
		tela.add(def13).setBounds(258, 425, 20, 20);
		tela.add(def14).setBounds(285, 425, 20, 20);
		tela.add(def15).setBounds(311, 425, 20, 20);

		tela.add(moto1).setBounds(68, 65, 20, 20);
		tela.add(moto2).setBounds(95, 65, 20, 20);
		tela.add(moto3).setBounds(121, 65, 20, 20);
		tela.add(moto4).setBounds(148, 65, 20, 20);
		tela.add(moto5).setBounds(174, 65, 20, 20);
		tela.add(moto6).setBounds(343, 65, 20, 20);
		tela.add(moto7).setBounds(370, 65, 20, 20);
		tela.add(moto8).setBounds(396, 65, 20, 20);
		tela.add(moto9).setBounds(423, 65, 20, 20);
		tela.add(moto10).setBounds(449, 65, 20, 20);
		tela.add(moto11).setBounds(68, 245, 20, 20);
		tela.add(moto12).setBounds(95, 245, 20, 20);
		tela.add(moto13).setBounds(121, 245, 20, 20);
		tela.add(moto14).setBounds(148, 245, 20, 20);
		tela.add(moto15).setBounds(174, 245, 20, 20);
		tela.add(moto16).setBounds(343, 245, 20, 20);
		tela.add(moto17).setBounds(370, 245, 20, 20);
		tela.add(moto18).setBounds(396, 245, 20, 20);
		tela.add(moto19).setBounds(423, 245, 20, 20);
		tela.add(moto20).setBounds(449, 245, 20, 20);
		tela.add(moto21).setBounds(69, 425, 20, 20);
		tela.add(moto22).setBounds(95, 425, 20, 20);
		tela.add(moto23).setBounds(121, 425, 20, 20);
		tela.add(moto24).setBounds(148, 425, 20, 20);
		tela.add(moto25).setBounds(174, 425, 20, 20);
		tela.add(moto26).setBounds(343, 425, 20, 20);
		tela.add(moto27).setBounds(370, 425, 20, 20);
		tela.add(moto28).setBounds(396, 425, 20, 20);
		tela.add(moto29).setBounds(423, 425, 20, 20);
		tela.add(moto30).setBounds(449, 425, 20, 20);

		tela.add(carro1).setBounds(68, 120, 20, 20);
		tela.add(carro2).setBounds(95, 120, 20, 20);
		tela.add(carro3).setBounds(121, 120, 20, 20);
		tela.add(carro4).setBounds(148, 120, 20, 20);
		tela.add(carro5).setBounds(174, 120, 20, 20);
		tela.add(carro6).setBounds(205, 120, 20, 20);
		tela.add(carro7).setBounds(231, 120, 20, 20);
		tela.add(carro8).setBounds(258, 120, 20, 20);
		tela.add(carro9).setBounds(285, 120, 20, 20);
		tela.add(carro10).setBounds(311, 120, 20, 20);
		tela.add(carro11).setBounds(343, 120, 20, 20);
		tela.add(carro12).setBounds(370, 120, 20, 20);
		tela.add(carro13).setBounds(396, 120, 20, 20);
		tela.add(carro14).setBounds(423, 120, 20, 20);
		tela.add(carro15).setBounds(449, 120, 20, 20);
		tela.add(carro16).setBounds(68, 300, 20, 20);
		tela.add(carro17).setBounds(95, 300, 20, 20);
		tela.add(carro18).setBounds(121, 300, 20, 20);
		tela.add(carro19).setBounds(148, 300, 20, 20);
		tela.add(carro20).setBounds(174, 300, 20, 20);
		tela.add(carro21).setBounds(205, 300, 20, 20);
		tela.add(carro22).setBounds(231, 300, 20, 20);
		tela.add(carro23).setBounds(258, 300, 20, 20);
		tela.add(carro24).setBounds(285, 300, 20, 20);
		tela.add(carro25).setBounds(311, 300, 20, 20);
		tela.add(carro26).setBounds(343, 300, 20, 20);
		tela.add(carro27).setBounds(370, 300, 20, 20);
		tela.add(carro28).setBounds(396, 300, 20, 20);
		tela.add(carro29).setBounds(423, 300, 20, 20);
		tela.add(carro30).setBounds(449, 300, 20, 20);
		tela.add(carro31).setBounds(68, 480, 20, 20);
		tela.add(carro32).setBounds(95, 480, 20, 20);
		tela.add(carro33).setBounds(121, 480, 20, 20);
		tela.add(carro34).setBounds(148, 480, 20, 20);
		tela.add(carro35).setBounds(174, 480, 20, 20);
		tela.add(carro36).setBounds(205, 480, 20, 20);
		tela.add(carro37).setBounds(231, 480, 20, 20);
		tela.add(carro38).setBounds(258, 480, 20, 20);
		tela.add(carro39).setBounds(285, 480, 20, 20);
		tela.add(carro40).setBounds(311, 480, 20, 20);
		tela.add(carro41).setBounds(343, 480, 20, 20);
		tela.add(carro42).setBounds(370, 480, 20, 20);
		tela.add(carro43).setBounds(396, 480, 20, 20);
		tela.add(carro44).setBounds(423, 480, 20, 20);
		tela.add(carro45).setBounds(449, 480, 20, 20);

		tela.add(deficientee).setBounds(80,515,120,20);
		tela.add(deficientes).setBounds(80, 540, 120, 20);
		tela.add(motoe).setBounds(215, 515, 120, 20);
		tela.add(motos).setBounds(215, 540, 120, 20);
		tela.add(carroe).setBounds(350,515,120,20);
		tela.add(carros).setBounds(350,540,120,20);
		tela.add(fundo).setBounds(0, 0, 100, 650);

		tela.getContentPane().setBackground(Color.magenta);
		tela.setVisible(true);
	}

	static void sorteio_def() {
		d[0] = false;
		d[1] = false;
		d[2] = false;
		d[3] = false;
		d[4] = false;
		d[5] = false;
		d[6] = false;
		d[7] = false;
		d[8] = false;
		d[9] = false;
		d[10] = false;
		d[11] = false;
		d[12] = false;
		d[13] = false;
		d[14] = false;
		vagaDef();

	}

	static void sorteio_moto() {
		m[0] = false;
		m[1] = false;
		m[2] = false;
		m[3] = false;
		m[4] = false;
		m[5] = false;
		m[6] = false;
		m[7] = false;
		m[8] = false;
		m[9] = false;
		m[10] = false;
		m[11] = false;
		m[12] = false;
		m[13] = false;
		m[14] = false;
		m[15] = false;
		m[16] = false;
		m[17] = false;
		m[18] = false;
		m[19] = false;
		m[20] = false;
		m[21] = false;
		m[22] = false;
		m[23] = false;
		m[24] = false;
		m[25] = false;
		m[26] = false;
		m[27] = false;
		m[28] = false;
		m[29] = false;
		vagaMoto();

	}
	static void sorteio_carro() {
		c[0] = false;
		c[1] = false;
		c[2] = false;
		c[3] = false;
		c[4] = false;
		c[5] = false;
		c[6] = false;
		c[7] = false;
		c[8] = false;
		c[9] = false;
		c[10] = false;
		c[11] = false;
		c[12] = false;
		c[13] = false;
		c[14] = false;
		c[15] = false;
		c[16] = false;
		c[17] = false;
		c[18] = false;
		c[19] = false;
		c[20] = false;
		c[21] = false;
		c[22] = false;
		c[23] = false;
		c[24] = false;
		c[25] = false;
		c[26] = false;
		c[27] = false;
		c[28] = false;
		c[29] = false;
		c[30] = false;
		c[31] = false;
		c[32] = false;
		c[33] = false;
		c[34] = false;
		c[35] = false;
		c[36] = false;
		c[37] = false;
		c[38] = false;
		c[39] = false;
		c[40] = false;
		c[41] = false;
		c[42] = false;
		c[43] = false;
		c[44] = false;
		vagaCarro();

	}

	static void vagaDef() {

		if (d[0] == true) {
			def1.setBackground(Color.red);

		} else {
			def1.setBackground(Color.green);
		}
		if (d[1] == true) {
			def2.setBackground(Color.red);

		} else {
			def2.setBackground(Color.green);
		}
		if (d[2] == true) {
			def3.setBackground(Color.red);

		} else {
			def3.setBackground(Color.green);
		}

		if (d[3] == true) {
			def4.setBackground(Color.red);

		} else {
			def4.setBackground(Color.green);
		}
		if (d[4] == true) {
			def5.setBackground(Color.red);

		} else {

			def5.setBackground(Color.green);
		}
		if (d[5] == true) {
			def6.setBackground(Color.red);

		} else {
			def6.setBackground(Color.green);
		}
		if (d[6] == true) {
			def7.setBackground(Color.red);

		} else {
			def7.setBackground(Color.green);
		}
		if (d[7] == true) {
			def8.setBackground(Color.red);

		} else {
			def8.setBackground(Color.green);
		}
		if (d[8] == true) {
			def9.setBackground(Color.red);

		} else {
			def9.setBackground(Color.green);
		}
		if (d[9] == true) {
			def10.setBackground(Color.red);

		} else {
			def10.setBackground(Color.green);
		}
		if (d[10] == true) {
			def11.setBackground(Color.red);

		} else {
			def11.setBackground(Color.green);
		}
		if (d[11] == true) {
			def12.setBackground(Color.red);

		} else {
			def12.setBackground(Color.green);
		}
		if (d[12] == true) {
			def13.setBackground(Color.red);

		} else {
			def13.setBackground(Color.green);
		}
		if (d[13] == true) {
			def14.setBackground(Color.red);

		} else {
			def14.setBackground(Color.green);
		}
		if (d[14] == true) {
			def15.setBackground(Color.red);

		} else {
			def15.setBackground(Color.green);
		}
	}
	
	static void vagaMoto() {

		if (m[0] == true) {
			moto1.setBackground(Color.red);

		} else {
			moto1.setBackground(Color.green);
		}
		if (m[1] == true) {
			moto2.setBackground(Color.red);

		} else {
			moto2.setBackground(Color.green);
		}
		if (m[2] == true) {
			moto3.setBackground(Color.red);

		} else {
			moto3.setBackground(Color.green);
		}

		if (m[3] == true) {
			moto4.setBackground(Color.red);

		} else {
			moto4.setBackground(Color.green);
		}
		if (m[4] == true) {
			moto5.setBackground(Color.red);

		} else {
			moto5.setBackground(Color.green);
		}
		if (m[5] == true) {
			moto6.setBackground(Color.red);

		} else {
			moto6.setBackground(Color.green);
		}
		if (m[6] == true) {
			moto7.setBackground(Color.red);

		} else {
			moto7.setBackground(Color.green);
		}
		if (m[7] == true) {
			moto8.setBackground(Color.red);

		} else {
			moto8.setBackground(Color.green);
		}
		if (m[8] == true) {
			moto9.setBackground(Color.red);

		} else {
			moto9.setBackground(Color.green);
		}
		if (m[9] == true) {
			moto10.setBackground(Color.red);

		} else {
			moto10.setBackground(Color.green);
		}
		if (m[10] == true) {
			moto11.setBackground(Color.red);

		} else {
			moto11.setBackground(Color.green);
		}
		if (m[11] == true) {
			moto12.setBackground(Color.red);

		} else {
			moto12.setBackground(Color.green);
		}
		if (m[12] == true) {
			moto13.setBackground(Color.red);

		} else {
			moto13.setBackground(Color.green);
		}
		if (m[13] == true) {
			moto14.setBackground(Color.red);

		} else {
			moto14.setBackground(Color.green);
		}
		if (m[14] == true) {
			moto15.setBackground(Color.red);

		} else {
			moto15.setBackground(Color.green);
		}

		if (m[15] == true) {
			moto16.setBackground(Color.red);

		} else {
			moto16.setBackground(Color.green);
		}
		if (m[16] == true) {
			moto17.setBackground(Color.red);

		} else {
			moto17.setBackground(Color.green);
		}
		if (m[17] == true) {
			moto18.setBackground(Color.red);

		} else {
			moto18.setBackground(Color.green);
		}
		if (m[18] == true) {
			moto19.setBackground(Color.red);

		} else {
			moto19.setBackground(Color.green);
		}
		if (m[19] == true) {
			moto20.setBackground(Color.red);

		} else {
			moto20.setBackground(Color.green);
		}
		if (m[20] == true) {
			moto21.setBackground(Color.red);

		} else {
			moto21.setBackground(Color.green);
		}
		if (m[21] == true) {
			moto22.setBackground(Color.red);

		} else {
			moto22.setBackground(Color.green);
		}
		if (m[22] == true) {
			moto23.setBackground(Color.red);

		} else {
			moto23.setBackground(Color.green);
		}
		if (m[23] == true) {
			moto24.setBackground(Color.red);

		} else {
			moto24.setBackground(Color.green);
		}
		if (m[24] == true) {
			moto25.setBackground(Color.red);

		} else {
			moto25.setBackground(Color.green);
		}
		if (m[25] == true) {
			moto26.setBackground(Color.red);

		} else {
			moto26.setBackground(Color.green);
		}
		if (m[26] == true) {
			moto27.setBackground(Color.red);

		} else {
			moto27.setBackground(Color.green);
		}
		if (m[27] == true) {
			moto28.setBackground(Color.red);

		} else {
			moto28.setBackground(Color.green);
		}
		if (m[28] == true) {
			moto29.setBackground(Color.red);

		} else {
			moto29.setBackground(Color.green);
		}
		if (m[29] == true) {
			moto30.setBackground(Color.red);

		} else {
			moto30.setBackground(Color.green);
		}
	}
	
	static void vagaCarro() {

		if (c[0] == true) {
			carro1.setBackground(Color.red);

		} else {
			carro1.setBackground(Color.green);
		}
		if (c[1] == true) {
			carro2.setBackground(Color.red);

		} else {
			carro2.setBackground(Color.green);
		}
		if (c[2] == true) {
			carro3.setBackground(Color.red);

		} else {
			carro3.setBackground(Color.green);
		}

		if (c[3] == true) {
			carro4.setBackground(Color.red);

		} else {
			carro4.setBackground(Color.green);
		}
		if (c[4] == true) {
			carro5.setBackground(Color.red);

		} else {
			carro5.setBackground(Color.green);
		}
		if (c[5] == true) {
			carro6.setBackground(Color.red);

		} else {
			carro6.setBackground(Color.green);
		}
		if (c[6] == true) {
			carro7.setBackground(Color.red);

		} else {
			carro7.setBackground(Color.green);
		}
		if (c[7] == true) {
			carro8.setBackground(Color.red);

		} else {
			carro8.setBackground(Color.green);
		}
		if (c[8] == true) {
			carro9.setBackground(Color.red);

		} else {
			carro9.setBackground(Color.green);
		}
		if (c[9] == true) {
			carro10.setBackground(Color.red);

		} else {
			carro10.setBackground(Color.green);
		}
		if (c[10] == true) {
			carro11.setBackground(Color.red);

		} else {
			carro11.setBackground(Color.green);
		}
		if (c[11] == true) {
			carro12.setBackground(Color.red);

		} else {
			carro12.setBackground(Color.green);
		}
		if (c[12] == true) {
			carro13.setBackground(Color.red);

		} else {
			carro13.setBackground(Color.green);
		}
		if (c[13] == true) {
			carro14.setBackground(Color.red);

		} else {
			carro14.setBackground(Color.green);
		}
		if (c[14] == true) {
			carro15.setBackground(Color.red);

		} else {
			carro15.setBackground(Color.green);
		}

		if (c[15] == true) {
			carro16.setBackground(Color.red);

		} else {
			carro16.setBackground(Color.green);
		}
		if (c[16] == true) {
			carro17.setBackground(Color.red);

		} else {
			carro17.setBackground(Color.green);
		}
		if (c[17] == true) {
			carro18.setBackground(Color.red);

		} else {
			carro18.setBackground(Color.green);
		}
		if (c[18] == true) {
			carro19.setBackground(Color.red);

		} else {
			carro19.setBackground(Color.green);
		}
		if (c[19] == true) {
			carro20.setBackground(Color.red);

		} else {
			carro20.setBackground(Color.green);
		}
		if (c[20] == true) {
			carro21.setBackground(Color.red);

		} else {
			carro21.setBackground(Color.green);
		}
		if (c[21] == true) {
			carro22.setBackground(Color.red);

		} else {
			carro22.setBackground(Color.green);
		}
		if (c[22] == true) {
			carro23.setBackground(Color.red);

		} else {
			carro23.setBackground(Color.green);
		}
		if (c[23] == true) {
			carro24.setBackground(Color.red);

		} else {
			carro24.setBackground(Color.green);
		}
		if (c[24] == true) {
			carro25.setBackground(Color.red);

		} else {
			carro25.setBackground(Color.green);
		}
		if (c[25] == true) {
			carro26.setBackground(Color.red);

		} else {
			carro26.setBackground(Color.green);
		}
		if (c[26] == true) {
			carro27.setBackground(Color.red);

		} else {
			carro27.setBackground(Color.green);
		}
		if (c[27] == true) {
			carro28.setBackground(Color.red);

		} else {
			carro28.setBackground(Color.green);
		}
		if (c[28] == true) {
			carro29.setBackground(Color.red);

		} else {
			carro29.setBackground(Color.green);
		}
		if (c[29] == true) {
			carro30.setBackground(Color.red);

		} else {
			carro30.setBackground(Color.green);
		}
		if (c[30] == true) {
			carro31.setBackground(Color.red);

		} else {
			carro31.setBackground(Color.green);
		}
		if (c[31] == true) {
			carro32.setBackground(Color.red);

		} else {
			carro32.setBackground(Color.green);
		}
		if (c[32] == true) {
			carro33.setBackground(Color.red);

		} else {
			carro33.setBackground(Color.green);
		}
		if (c[33] == true) {
			carro34.setBackground(Color.red);

		} else {
			carro34.setBackground(Color.green);
		}
		if (c[34] == true) {
			carro35.setBackground(Color.red);

		} else {
			carro35.setBackground(Color.green);
		}
		if (c[35] == true) {
			carro36.setBackground(Color.red);

		} else {
			carro36.setBackground(Color.green);
		}
		if (c[36] == true) {
			carro37.setBackground(Color.red);

		} else {
			carro37.setBackground(Color.green);
		}
		if (c[37] == true) {
			carro38.setBackground(Color.red);

		} else {
			carro38.setBackground(Color.green);
		}
		if (c[38] == true) {
			carro39.setBackground(Color.red);

		} else {
			carro39.setBackground(Color.green);
		}
		if (c[39] == true) {
			carro40.setBackground(Color.red);

		} else {
			carro40.setBackground(Color.green);
		}
		if (c[40] == true) {
			carro41.setBackground(Color.red);

		} else {
			carro41.setBackground(Color.green);
		}
		if (c[41] == true) {
			carro42.setBackground(Color.red);

		} else {
			carro42.setBackground(Color.green);
		}
		if (c[42] == true) {
			carro43.setBackground(Color.red);

		} else {
			carro43.setBackground(Color.green);
		}
		if (c[43] == true) {
			carro44.setBackground(Color.red);

		} else {
			carro44.setBackground(Color.green);
		}
		if (c[44] == true) {
			carro45.setBackground(Color.red);

		} else {
			carro45.setBackground(Color.green);
		}
	}

	static void entradaDef() {
		int x = (int) (Math.random() * 15);

		if (d[x] == false) {
			d[x] = true;
			if (defl > 0) {
				defl--;
				defo++;
			}

		} else if (d[x] == true && defl > 0) {
			entradaDef();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupadas. ");
		}

	}

	static void saidaDef() {
		int x = (int) (Math.random() * 15);

		if (d[x] == true) {
			d[x] = false;
			if (defo > 0) {
				defo--;
				defl++;
			}

		} else if (d[x] == false && defo > 0) {
			saidaDef();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão livres. ");
		}

	}
	static void entradaMoto() {
		int y = (int) (Math.random() * 30);

		if (m[y] == false) {
			m[y] = true;
			if (motol > 0) {
				motol--;
				motoo++;
			}

		} else if (m[y] == true && motol > 0) {
			entradaMoto();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupadas. ");
		}
	}
	static void saidaMoto() {
		int y = (int) (Math.random() * 30);

		if (m[y] == true) {
			m[y] = false;
			if (motoo > 0) {
				motoo--;
				motol++;
			}

		} else if (m[y] == false && motoo > 0) {
			saidaMoto();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão livres. ");
		}
	}
		static void entradaCarro() {
			int z = (int) (Math.random() * 45);

			if (c[z] == false) {
				c[z] = true;
				if (carrol > 0) {
					carrol--;
					carroo++;
				}

			} else if (c[z] == true && carrol > 0) {
				entradaCarro();
			} else {
				JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupadas. ");
			}

	}
		static void saidaCarro() {
			int z = (int) (Math.random() * 45);

			if (c[z] == true) {
				c[z] = false;
				if (carroo > 0) {
					carroo--;
					carrol++;
				}

			} else if (c[z] == false && carroo> 0) {
				saidaCarro();
			} else {
				JOptionPane.showMessageDialog(null, "Todas as vagas estão livres. ");
			}

	}

	static void acaoBotao() {
		deficientee.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				entradaDef();
				vagaDef();

			}
		});

		deficientes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saidaDef();
				vagaDef();

			}
		});
		motoe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				entradaMoto();
				vagaMoto();

			}
		});


		motos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saidaMoto();
				vagaMoto();

			}
		});

		carroe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				entradaCarro();
				vagaCarro();

			}
		});
		carros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saidaCarro();
				vagaCarro();

			}
		});
	}

	public static void main(String[] args) {
		lalala();
		acaoBotao();
	}
}