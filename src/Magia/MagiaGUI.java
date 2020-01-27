package Magia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JSlider;
import java.awt.Panel;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MagiaGUI {

	private static final String ImageIO = null;
	private JFrame frame;
	private JTextField textFieldCa;
	private JTextField textFieldCon;
	private JTextField textFieldR;
	private final JLabel lblNewLabel = new JLabel("New label");
	private JTextField textFieldRank1;
	private JLabel lblNvel;
	private JLabel lblMagia;
	private JLabel lblArma;
	private JTextField textFieldA;
	private JLabel lblPoderMagicoAMP;
	private JTextField textFieldAMP;
	private JLabel lblRankMagia;
	private JLabel lblRankBatalha;
	private JTextField textFieldRank2;
	private JLabel lblFsico;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblEquipamentos;
	private JTextField textFieldAr;
	private JTextField textFieldDes;
	private JLabel lblHabilidade;
	private JTextField textFieldH;
	private JTextField textFieldRank3;
	private JLabel lblRankHab;
	private JTextField textFieldRank4;
	private JLabel lblRank;
	private JTextField textFieldPT;
	private JTextField textFieldNivel;
	private JLabel lblNvel_1;
	private JLabel lblPontuaoTotal;
	private JLabel lblFora;
	private JTextField textFieldForca;
	private JLabel lblConstituio;
	private JTextField textFieldCons;
	private JTextField textFieldR3;
	private JLabel lblRank_1;
	private JLabel lblNewLabel_3;
	private JTextField textFieldForcaR;
	private JTextField textFieldDesR;
	private JTextField textFieldConsR;
	private JLabel label;
	private JLabel lblNewLabel_4;
	private JTextField textFieldIL;
	private JLabel lblItemNvel;
	private JLabel lblNewLabel_5;
	private JTextField textFieldPET;
	private JLabel lblPontuaoEfetivaTotal;
	private JLabel label_1;
	private JTextField textFieldEstouro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MagiaGUI window = new MagiaGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MagiaGUI() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculador de Nível e Rank Alfa 0.6");
		frame.setAutoRequestFocus(true);
		frame.getContentPane();
		frame.setResizable(false);
		frame.setBounds(100, 100, 505, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldCa = new JTextField();
		textFieldCa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldCa.setBounds(95, 33, 86, 20);
		frame.getContentPane().add(textFieldCa);
		textFieldCa.setColumns(10);
		textFieldCa.setToolTipText("<html><h4 style=\"color:black\">Capacidade(0 a 100)<br>\r\nTodos os seres tem \"mana\" dentro deles, a capacidade \u00E9 relacionada <br>diretamente a idade, entre 0 e 100%, <br>\r\nNaturalmente quando crian\u00E7a tem-se 30% da capacidade, <br>\r\na qual vai aumentando at\u00E9 seu auge entre os 18 e 24 anos(80~100%) <br>\r\ne ao envelhecer vai diminuido.<br><br>\r\nImplementa\u00E7\u00E3o: <br>\r\nRa\u00E7a n\u00E3o implementada<br>\r\nGr\u00E1fico n\u00E3o implementado<br>\r\nD20 seria uma boa implementa\u00E7\u00E3o se isso fosse feito para um jogo :v");
		
		JLabel lblTeri = new JLabel("Capacidade");
		lblTeri.setForeground(Color.BLACK);
		lblTeri.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeri.setBounds(17, 35, 73, 14);
		frame.getContentPane().add(lblTeri);
		
		textFieldCon = new JTextField();
		textFieldCon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldCon.setToolTipText("<html><h4 style=\"color:black\">\r\nControle reflete a efici\u00EAncia do uso.<br> \r\nO mesmo poder com mesma intensidade pode consumir <br>\r\ndiferentes quantidades de mana, dependendo do seu controle, <br>\r\nquanto maior o controle, menos mana se usa para um mesmo ataque.<br>\r\n Tamb\u00E9m influencia diretamente na velocidade de conjuramento.<br>\r\nTem escala logar\u00EDtmica de base 3;<br>\r\nCO = 2 significa 3 vezes menos controle que algu\u00E9m com CO = 1;<br>\r\nCO inicial 0; CO m\u00E1ximo = 10;<br>\r\nAventureiros mais experientes comumente tem CO = 6(contando apenas m\u00E1gicos);<br>\r\nO m\u00E1ximo registrado na hist\u00F3ria foi CO = 10;<br><br>\r\nImplementa\u00E7\u00E3o:<br>\r\nGr\u00E1fico n\u00E3o implmentado");
		textFieldCon.setBounds(95, 62, 86, 20);
		frame.getContentPane().add(textFieldCon);
		textFieldCon.setColumns(10);
		
		JLabel lblControleDeMana = new JLabel("Controle");
		lblControleDeMana.setForeground(Color.BLACK);
		lblControleDeMana.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblControleDeMana.setBounds(33, 64, 66, 14);
		frame.getContentPane().add(lblControleDeMana);
		
		textFieldR = new JTextField();
		textFieldR.setBounds(394, 33, 86, 20);
		frame.getContentPane().add(textFieldR);
		textFieldR.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado Magia");
		lblResultado.setForeground(Color.BLACK);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(374, 8, 110, 14);
		frame.getContentPane().add(lblResultado);
		lblNewLabel.setBounds(36, -27, 98, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldRank1 = new JTextField();
		textFieldRank1.setBounds(394, 53, 86, 20);
		frame.getContentPane().add(textFieldRank1);
		textFieldRank1.setColumns(10);
		
		lblNvel = new JLabel("Pontua\u00E7\u00E3o");
		lblNvel.setForeground(Color.BLACK);
		lblNvel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNvel.setBounds(306, 35, 89, 14);
		frame.getContentPane().add(lblNvel);
		
		lblMagia = new JLabel("Magia");
		lblMagia.setForeground(Color.BLACK);
		lblMagia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMagia.setBounds(71, 8, 46, 14);
		frame.getContentPane().add(lblMagia);
		
		lblArma = new JLabel("Arma");
		lblArma.setForeground(Color.BLACK);
		lblArma.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblArma.setBounds(53, 316, 46, 14);
		frame.getContentPane().add(lblArma);
		
		textFieldA = new JTextField();
		textFieldA.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldA.setBounds(95, 313, 86, 20);
		frame.getContentPane().add(textFieldA);
		textFieldA.setColumns(10);
		
		lblPoderMagicoAMP = new JLabel("Pontua\u00E7\u00E3o Efetiva");
		lblPoderMagicoAMP.setForeground(Color.BLACK);
		lblPoderMagicoAMP.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPoderMagicoAMP.setBounds(264, 80, 130, 14);
		frame.getContentPane().add(lblPoderMagicoAMP);
		
		textFieldAMP = new JTextField();
		textFieldAMP.setBounds(394, 76, 86, 20);
		frame.getContentPane().add(textFieldAMP);
		textFieldAMP.setColumns(10);
		
		lblRankMagia = new JLabel("Rank");
		lblRankMagia.setForeground(Color.BLACK);
		lblRankMagia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRankMagia.setBounds(344, 56, 51, 14);
		frame.getContentPane().add(lblRankMagia);
		
		lblRankBatalha = new JLabel("Rank ");
		lblRankBatalha.setForeground(Color.BLACK);
		lblRankBatalha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRankBatalha.setBounds(344, 98, 50, 14);
		frame.getContentPane().add(lblRankBatalha);
		
		textFieldRank2 = new JTextField();
		textFieldRank2.setBounds(394, 96, 86, 20);
		frame.getContentPane().add(textFieldRank2);
		textFieldRank2.setColumns(10);
		
		lblFsico = new JLabel("F\u00EDsico");
		lblFsico.setForeground(Color.BLACK);
		lblFsico.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFsico.setBounds(71, 97, 46, 14);
		frame.getContentPane().add(lblFsico);
		
		lblNewLabel_1 = new JLabel("Destreza");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 156, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Armadura");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(26, 285, 66, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblEquipamentos = new JLabel("Equipamentos");
		lblEquipamentos.setForeground(Color.BLACK);
		lblEquipamentos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEquipamentos.setBounds(71, 259, 89, 14);
		frame.getContentPane().add(lblEquipamentos);
		
		textFieldAr = new JTextField();
		textFieldAr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldAr.setBounds(95, 285, 86, 20);
		frame.getContentPane().add(textFieldAr);
		textFieldAr.setColumns(10);
		
		textFieldDes = new JTextField();
		textFieldDes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldDes.setBounds(95, 153, 86, 20);
		frame.getContentPane().add(textFieldDes);
		textFieldDes.setColumns(10);
		
		lblHabilidade = new JLabel("Pontua\u00E7\u00E3o Efetiva");
		lblHabilidade.setForeground(Color.BLACK);
		lblHabilidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHabilidade.setBounds(265, 196, 130, 20);
		frame.getContentPane().add(lblHabilidade);
		
		textFieldH = new JTextField();
		textFieldH.setBounds(394, 197, 86, 20);
		frame.getContentPane().add(textFieldH);
		textFieldH.setColumns(10);
		
		textFieldRank3 = new JTextField();
		textFieldRank3.setBounds(394, 174, 86, 20);
		frame.getContentPane().add(textFieldRank3);
		textFieldRank3.setColumns(10);
		
		lblRankHab = new JLabel("Pontua\u00E7\u00E3o");
		lblRankHab.setForeground(Color.BLACK);
		lblRankHab.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRankHab.setBounds(312, 156, 79, 14);
		frame.getContentPane().add(lblRankHab);
		
		textFieldRank4 = new JTextField();
		textFieldRank4.setForeground(Color.BLACK);
		textFieldRank4.setBounds(394, 217, 86, 20);
		frame.getContentPane().add(textFieldRank4);
		textFieldRank4.setColumns(10);
		
		lblRank = new JLabel("Rank");
		lblRank.setForeground(Color.BLACK);
		lblRank.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRank.setBounds(349, 219, 46, 14);
		frame.getContentPane().add(lblRank);
		
		textFieldPT = new JTextField();
		textFieldPT.setBounds(394, 264, 86, 20);
		frame.getContentPane().add(textFieldPT);
		textFieldPT.setColumns(10);
		
		textFieldNivel = new JTextField();
		textFieldNivel.setBounds(394, 324, 86, 20);
		frame.getContentPane().add(textFieldNivel);
		textFieldNivel.setColumns(10);
		
		lblNvel_1 = new JLabel("N\u00EDvel");
		lblNvel_1.setForeground(Color.BLACK);
		lblNvel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNvel_1.setBounds(349, 326, 46, 14);
		frame.getContentPane().add(lblNvel_1);
		
		lblPontuaoTotal = new JLabel("Pontua\u00E7\u00E3o Total");
		lblPontuaoTotal.setForeground(Color.BLACK);
		lblPontuaoTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPontuaoTotal.setBounds(276, 266, 115, 14);
		frame.getContentPane().add(lblPontuaoTotal);
		
		lblFora = new JLabel("For\u00E7a");
		lblFora.setForeground(Color.BLACK);
		lblFora.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFora.setBounds(53, 127, 43, 14);
		frame.getContentPane().add(lblFora);
		
		textFieldForca = new JTextField();
		textFieldForca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldForca.setBounds(95, 125, 86, 20);
		frame.getContentPane().add(textFieldForca);
		textFieldForca.setColumns(10);
		
		lblConstituio = new JLabel("Constitui\u00E7\u00E3o");
		lblConstituio.setForeground(Color.BLACK);
		lblConstituio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConstituio.setBounds(10, 184, 89, 14);
		frame.getContentPane().add(lblConstituio);
		
		textFieldCons = new JTextField();
		textFieldCons.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Calculo();
			}
		});
		textFieldCons.setBounds(95, 181, 86, 20);
		frame.getContentPane().add(textFieldCons);
		textFieldCons.setColumns(10);
		
		textFieldR3 = new JTextField();
		textFieldR3.setBounds(394, 154, 86, 20);
		frame.getContentPane().add(textFieldR3);
		textFieldR3.setColumns(10);
		
		lblRank_1 = new JLabel("Rank");
		lblRank_1.setForeground(Color.BLACK);
		lblRank_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRank_1.setBounds(349, 176, 46, 14);
		frame.getContentPane().add(lblRank_1);
		

		
		textFieldForcaR = new JTextField();
		textFieldForcaR.setToolTipText("<html><h4 style=\"color:black\">F\u00EDsico: <br>\r\n Valor 1 significa pessoa comum, os aventureiros mais fortes,  <br>\r\ncomo guerreiros e tanques tem for\u00E7a de 3x a 4x mais forte que uma  <br>pessoa comum,  \r\no m\u00E1ximo j\u00E1 registrado foi 5x.");
		textFieldForcaR.setBounds(184, 125, 36, 20);
		frame.getContentPane().add(textFieldForcaR);
		textFieldForcaR.setColumns(10);
		
		textFieldDesR = new JTextField();
		textFieldDesR.setBounds(184, 154, 36, 20);
		frame.getContentPane().add(textFieldDesR);
		textFieldDesR.setColumns(10);
		
		textFieldConsR = new JTextField();
		textFieldConsR.setBounds(184, 181, 36, 20);
		frame.getContentPane().add(textFieldConsR);
		textFieldConsR.setColumns(10);
		
		label = new JLabel("");
		label.setToolTipText("<html><h4 style=\"color:black\">F\u00EDsico: <br>\r\n Valor entre 0x e 2x significa pessoa comum, os aventureiros mais fortes e mais experientes,  <br>\r\ncomo guerreiros e tanques tem for\u00E7a de 6x a 8x em rela\u00E7\u00E3o a uma <br>pessoa comum,  \r\no m\u00E1ximo j\u00E1 registrado foi 12x.");
		label.setIcon(new ImageIcon(MagiaGUI.class.getResource("/Magia/questao.gif")));
		label.setBounds(118, 93, 29, 23);
		frame.getContentPane().add(label);
	
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setToolTipText("<html><h4 style=\"color:black\">Capacidade(0 a 100)<br>\r\nTodos os seres tem \"mana\" dentro deles, a capacidade \u00E9 relacionada <br>diretamente a idade, entre 0 e 100%, <br>\r\nNaturalmente quando crian\u00E7a tem-se 30% da capacidade, <br>\r\na qual vai aumentando at\u00E9 seu auge entre os 18 e 24 anos(80~100%) <br>\r\ne ao envelhecer vai diminuido.<br><br>\r\nImplementa\u00E7\u00E3o: <br>\r\nRa\u00E7a n\u00E3o implementada<br>\r\n\r\n<html><h4 style=\"color:black\">\r\nControle reflete a efici\u00EAncia do uso.<br> \r\nO mesmo poder com mesma intensidade pode consumir <br>\r\ndiferentes quantidades de mana, dependendo do seu controle, <br>\r\nquanto maior o controle, menos mana se usa para um mesmo ataque.<br>\r\n Tamb\u00E9m influencia diretamente na velocidade de conjuramento.<br>\r\nTem escala logar\u00EDtmica de base 3;<br>\r\nCO = 2 significa 3 vezes menos controle que algu\u00E9m com CO = 1;<br>");
		lblNewLabel_4.setIcon(new ImageIcon(MagiaGUI.class.getResource("/Magia/questao.gif")));
		lblNewLabel_4.setBounds(118, 8, 16, 17);
		frame.getContentPane().add(lblNewLabel_4);
		

		
		
		
//		textFieldIL = new JTextField();
//		textFieldIL.setBounds(394, 345, 86, 20);
//		frame.getContentPane().add(textFieldIL);
//		textFieldIL.setColumns(10);
//		
//		lblItemNvel = new JLabel("Item N\u00EDvel");
//		lblItemNvel.setFont(new Font("Tahoma", Font.BOLD, 12));
//		lblItemNvel.setBounds(316, 348, 79, 14);
//		frame.getContentPane().add(lblItemNvel);
		
		lblNewLabel_5 = new JLabel("Resultado F\u00EDsico");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(374, 131, 115, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textFieldPET = new JTextField();
		textFieldPET.setBounds(394, 284, 86, 20);
		frame.getContentPane().add(textFieldPET);
		textFieldPET.setColumns(10);
		
		lblPontuaoEfetivaTotal = new JLabel("Pontua\u00E7\u00E3o Efetiva Total");
		lblPontuaoEfetivaTotal.setForeground(Color.BLACK);
		lblPontuaoEfetivaTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPontuaoEfetivaTotal.setBounds(231, 287, 164, 14);
		frame.getContentPane().add(lblPontuaoEfetivaTotal);
		
		label_1 = new JLabel("");
		label_1.setToolTipText("<html><h4 style=\"color:black\">\r\nArmadura tem os seguintes valores:<br> \r\n1 -> Armadura de pano, usado principalemente por quem precisa de mobilidade m\u00E1xima(Ex. Magos)<br>\r\n2 -> Armadura de couro, usado principalmente por quem precisa atacar de perto(Ex. Guerreiros)<br>\r\n3 -> Armadura de metal, usada principalemento por quem tem que aguentar porrada(Ex. Tanques)<br>\r\nNada impede de um Guerreiro ter armadura de pano ou metal.<br>\r\nS\u00F3 \u00E9 calculada na pontua\u00E7\u00E3o efetiva f\u00EDsica.");
		label_1.setIcon(new ImageIcon(MagiaGUI.class.getResource("/Magia/questao.gif")));
		label_1.setBounds(191, 285, 29, 23);
		frame.getContentPane().add(label_1);
		
		textFieldEstouro = new JTextField();
		textFieldEstouro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Calculo();
			}
		});
		textFieldEstouro.setToolTipText("\"Estouro\" Habilidade especial do protagonista apenas.");
		textFieldEstouro.setText("1");
		textFieldEstouro.setBounds(184, 33, 36, 20);
		frame.getContentPane().add(textFieldEstouro);
		textFieldEstouro.setColumns(10);
	
		
		lblNewLabel_3 = new JLabel("New label"); //VICCFOTO
		lblNewLabel_3.setIcon(new ImageIcon("D:\\workspace\\LIVRO\\src\\Magia\\2.png"));
		lblNewLabel_3.setBounds(0, -2, 499, 388);
		frame.getContentPane().add(lblNewLabel_3);

	}

public double Calculo(){
	double CAM, CON, A, Ar, R, R2, R3, R4, Des, Forca, Cons, Estouro;
	try {
		DecimalFormat df = new DecimalFormat("0.#");
		 CAM=Integer.parseInt(textFieldCa.getText());
		 CON=Integer.parseInt(textFieldCon.getText());
		 A=Integer.parseInt(textFieldA.getText());
		 Des=Integer.parseInt(textFieldDes.getText());
		 Ar=Integer.parseInt(textFieldAr.getText());
		 Forca=Integer.parseInt(textFieldForca.getText());
		 Cons=Integer.parseInt(textFieldCons.getText());
		 Estouro=Integer.parseInt(textFieldEstouro.getText());
		 if(CAM < 200 && CON <= 12 && A<200 && Des<500 && Ar<=3 && Forca<500 && Cons < 500 && Estouro < 200){
			
		 
		 String DesR = df.format(Des*0.05);
		 textFieldDesR.setText(DesR +"x");
		 String ForcaR = df.format(Forca*0.05);
		 textFieldForcaR.setText(ForcaR +"x");
		 String ConsR = df.format(Cons*0.05);
		 textFieldConsR.setText(ConsR +"x");
		 R = (double) (Estouro*CAM/100*Math.pow(CON, 3));
		 R3 = (Des+Forca+Cons);
		 
		 String Rd1 = df.format(R);
		 textFieldR.setText(Rd1);
		 if(R >= 1 && R < 8)
		 textFieldRank1.setText("D");
		 else if(R >= 8 && R < 27)
		 textFieldRank1.setText("C");
		 else if(R >= 27 && R < 64)
		 textFieldRank1.setText("B");
		 else if(R >= 64 && R < 125)
		 textFieldRank1.setText("A");
		 else if(R >= 125 && R < 216)
		 textFieldRank1.setText("S");
		 else if(R >= 216 && R < 343)
		 textFieldRank1.setText("S+");
		 else if(R >= 343 && R < 512)
		 textFieldRank1.setText("SS");
		 else if(R >= 512 && R < 729)
		 textFieldRank1.setText("SS+");
		 else if(R >= 729 && R < 1000)
			 textFieldRank1.setText("SSS");
			 else if(R >= 1000 )
				 textFieldRank1.setText("Zênite");
		 else
		textFieldRank1.setText("E");
		 
		 
		 R2 = (R*A/4);
		 String Rd2 = df.format(R2);
		 textFieldAMP.setText(Rd2);
		 if(R2 >= 1 && R2 < 160)
		 textFieldRank2.setText("D");
		 else if(R2 >= 160 && R2 < 540)
 		 textFieldRank2.setText("C");
 		 else if(R2 >= 540 && R2 < 1280)
		 textFieldRank2.setText("B");
		 else if(R2 >= 1280 && R2 < 2500)
		 textFieldRank2.setText("A");
		 else if(R2 >= 2500 && R2 < 4320)
		 textFieldRank2.setText("S");
		 else if(R2 >= 4320)
		 textFieldRank2.setText("S+");
		 else
		textFieldRank2.setText("E");
		 
		 
		 	if(R3 >= 1 && R3 < 50)// AQUI FIZ NO CHUTE!
			 textFieldRank3.setText("D");
		 	else if(R3 >= 50 && R3 < 110)
			 textFieldRank3.setText("C");
		 	else if(R3 >= 110 && R3 < 200)
			 textFieldRank3.setText("B");
		 	else if(R3 >= 200 && R3 < 300)
			 textFieldRank3.setText("A");
		 	else if(R3 >= 300 && R3 < 450)
			 textFieldRank3.setText("S");
		 	else if(R3 >= 450)
			 textFieldRank3.setText("S+");
			 else
			textFieldRank3.setText("E");
		 	String R3d = df.format(R3);
		 	 textFieldR3.setText(R3d);
		 	 
		 	double HA = 0;
		 if(Ar == 1) {
			 HA = A*Ar*(Des+Forca+Cons)/15; 
		 }
		 if(Ar == 2) {
			 HA = A*Ar*0.9*((Des-Des*0.2-10)+(Forca-Forca*0.1-3)+(Cons-Cons*0.05-5))/15; 
		 }
		 if(Ar == 3) {
			 HA = A*Ar*0.9*((Des-Des*0.2-20)+(Forca-Forca*0.2-20)+(Cons-Cons*0.1-10))/15;  
		 }
		 R4 = HA;
		 String Rd3 = df.format(HA);
		 textFieldH.setText(Rd3);
		 if(R4 >= 1 && R4 < 160)
		 textFieldRank4.setText("D");
		 else if(R4 >= 160 && R4 < 540)
 		 textFieldRank4.setText("C");
 		 else if(R4 >= 540 && R4 < 1280)
		 textFieldRank4.setText("B");
		 else if(R4 >= 1280 && R4 < 2500)
		 textFieldRank4.setText("A");
		 else if(R4 >= 2500 && R4 < 4320)
		 textFieldRank4.setText("S");
		 else if(R4 >= 4320)
		 textFieldRank4.setText("S+");
		 else
		textFieldRank4.setText("E");	 
		 
		 double PT = R+R3;
		 String Rd4 = df.format(PT);
		 textFieldPT.setText(Rd4);
			int i =0, l =0;
			 for(int c =50; c<PT; c+=50) {
				i++;
//				l = l +5;
//				c = c + l;
			 }
			 String PTd = df.format(i);
			 textFieldNivel.setText(PTd);
		 
		 double IL = R2+R4;
		 String Rd5 = df.format(IL);
		 textFieldPET.setText(Rd5);
		 }
		}catch(Exception e){
//			JOptionPane.showMessageDialog(null, "Coloque valores em todas as linhas da primeira coluna!"); //POP-UP!
		}
	return 0;

}
//	 void captureComponent(Component component) {
//		    Rectangle rect = component.getBounds();
//		 
//		    try {
//		        String format = "png";
//		        String fileName = component.getName() + "." + format;
//		        BufferedImage captureImage =
//		                new BufferedImage(rect.width, rect.height,
//		                                    BufferedImage.TYPE_INT_ARGB);
//		        component.paint(captureImage.getGraphics());
//		 
//		        ImageIO.write(captureImage, format, new File(fileName));
//		 
//		        System.out.printf("The screenshot of %s was saved!", component.getName());
//		    } catch (IOException ex) {
//		        System.err.println(ex);
//		    }
// }
}