package it.pokèmon.basics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;

import it.pokèmon.basics.PokeInfos.RoundedBorder;

@SuppressWarnings("serial")
public class GameUIpanel extends JPanel{
	private Pokèmon p;
	private Pokèmon p2;
	private JButton move1;
	private JButton move2;
	private JButton move3;
	private JButton move4;
	private Dimension buttonSize = new Dimension(100, 30);
	private JLabel p_p;
	private JLabel p_e;
	private Dimension labelSize = new Dimension(140, 30);
	private JFrame frame;
	
	GameUIpanel(Pokèmon p, Pokèmon p2, JFrame frame){
		this.frame = frame;
		this.p = p;
		this.p2 = p2;
		setLabelProperties();
		setButtonsProperties();
		setPanelProperties();
	}
	
	private void setLabelProperties() {
		p_p = new JLabel(p.getNome() + ": " + p.getHP());
		p_p.setPreferredSize(labelSize);
		p_p.setBounds(5, 20, 140, 30);
		p_p.setVisible(true);
		p_e = new JLabel(p2.getNome() + ": " + p2.getHP());
		p_e.setPreferredSize(labelSize);
		p_e.setBounds(155, 20, 140, 30);
		p_e.setVisible(true);
	}
	
	private void setButtonsProperties() {
		switch(p.getMovesNumber()) {
			case 1:
				move1 = new JButton(p.moves.get(0).getNome());
				move1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
							if(p2.getHP() < 0) {
								Alerts.pokemon_ko(p2);
								Alerts.win();
								frame.dispose();
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
								if(p.getHP() < 0) {
									Alerts.pokemon_ko(p);
									Alerts.lose();
									frame.dispose();
								}
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							if(p.getHP() < 0) {
								Alerts.pokemon_ko(p);
								Alerts.lose();
								frame.dispose();
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(0).enemyDamage(p, p2);
								if(p2.getHP() > 0) {
									Alerts.pokemon_ko(p2);
									Alerts.win();
									frame.dispose();
								}
							}
						}
					}
				});
				move1.setFocusable(false);
				move1.setPreferredSize(buttonSize);
				move1.setBounds(100, 135, 100, 30);
				move1.setBorder(new RoundedBorder(10));
				move1.setBackground(null);
				move1.setForeground(Color.red);
				move1.setVisible(true);
				break;
			case 2:
				move1 = new JButton(p.moves.get(0).getNome());
				move1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move1.setFocusable(false);
				move1.setPreferredSize(buttonSize);
				move1.setBounds(25, 135, 100, 30);
				move1.setBorder(new RoundedBorder(10));
				move1.setBackground(null);
				move1.setForeground(Color.red);
				move1.setVisible(true);
				move2 = new JButton(p.moves.get(1).getNome());
				move2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(1).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(1).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move2.setFocusable(false);
				move2.setPreferredSize(buttonSize);
				move2.setBounds(175, 135, 100, 30);
				move2.setBorder(new RoundedBorder(10));
				move2.setBackground(null);
				move2.setForeground(Color.red);
				move2.setVisible(true);
				break;
			case 3:
				move1 = new JButton(p.moves.get(0).getNome());
				move1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move1.setFocusable(false);
				move1.setPreferredSize(buttonSize);
				move1.setBounds(25, 135, 100, 30);
				move1.setBorder(new RoundedBorder(10));
				move1.setBackground(null);
				move1.setForeground(Color.red);
				move1.setVisible(true);
				move2 = new JButton(p.moves.get(1).getNome());
				move2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(1).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(1).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move2.setFocusable(false);
				move2.setPreferredSize(buttonSize);
				move2.setBounds(175, 135, 100, 30);
				move2.setBorder(new RoundedBorder(10));
				move2.setBackground(null);
				move2.setForeground(Color.red);
				move2.setVisible(true);
				move3 = new JButton(p.moves.get(2).getNome());
				move3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(2).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(2).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move3.setFocusable(false);
				move3.setPreferredSize(buttonSize);
				move3.setBounds(100, 135, 100, 30);
				move3.setBorder(new RoundedBorder(10));
				move3.setBackground(null);
				move3.setForeground(Color.red);
				move3.setVisible(true);
				break;
			case 4:
				move1 = new JButton(p.moves.get(0).getNome());
				move1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(0).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move1.setFocusable(false);
				move1.setPreferredSize(buttonSize);
				move1.setBounds(25, 135, 100, 30);
				move1.setBorder(new RoundedBorder(10));
				move1.setBackground(null);
				move1.setForeground(Color.red);
				move1.setVisible(true);
				move2 = new JButton(p.moves.get(1).getNome());
				move2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(1).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(1).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move2.setFocusable(false);
				move2.setPreferredSize(buttonSize);
				move2.setBounds(175, 135, 100, 30);
				move2.setBorder(new RoundedBorder(10));
				move2.setBackground(null);
				move2.setForeground(Color.red);
				move2.setVisible(true);
				move3 = new JButton(p.moves.get(2).getNome());
				move3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(2).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(2).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move3.setFocusable(false);
				move3.setPreferredSize(buttonSize);
				move3.setBounds(25, 180, 100, 30);
				move3.setBorder(new RoundedBorder(10));
				move3.setBackground(null);
				move3.setForeground(Color.red);
				move3.setVisible(true);
				move4 = new JButton(p.moves.get(3).getNome());
				move4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int move_e = 0;
						switch(p2.moves.size()) {
							case 1:
								move_e = 0;
								break;
							default:
								move_e = (int)(Math.random()*(p2.moves.size()));
								break;
						}
						System.out.println(p2.moves.get(move_e).getNome());
						System.out.println(p.moves.get(3).getNome());
						if(p.getVelocità() >= p2.getVelocità()) {
							if(p.getHP() > 0) {
								p.moves.get(3).enemyDamage(p, p2);
							}
							//enemy 
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
						}else {
							if(p2.getHP() > 0) {
								p2.moves.get(move_e).enemyDamage(p2, p);
							}
							//player
							if(p.getHP() < 0) {
								p.moves.get(3).enemyDamage(p, p2);
							}
						}
						if(p.getHP() < 0) {
							Alerts.pokemon_ko(p);
							Alerts.lose();
							frame.dispose();
						}else {
							Alerts.pokemon_ko(p2);
							Alerts.win();
							frame.dispose();
						}
					}
				});
				move4.setFocusable(false);
				move4.setPreferredSize(buttonSize);
				move4.setBounds(175, 180, 100, 30);
				move4.setBorder(new RoundedBorder(10));
				move4.setBackground(null);
				move4.setForeground(Color.red);
				move4.setVisible(true);
				break;
		}
	}

	private void setPanelProperties() {
		switch(p.getMovesNumber()) {
			case 1:
				this.add(move1);
				break;
			case 2:
				this.add(move1);
				this.add(move2);
				break;
			case 3:
				this.add(move1);
				this.add(move2);
				this.add(move3);
				break;
			case 4:
				this.add(move1);
				this.add(move2);
				this.add(move3);
				this.add(move4);
				break;
		}
		this.add(p_p);
		this.add(p_e);
		this.setBackground(Color.black);
		this.setLayout(null);
		this.setPreferredSize(new Dimension(300,300));
		this.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
		p_p.setText(p.getNome() + ": " + p.getHP());
		p_e.setText(p2.getNome() + ": " + p2.getHP());
	}
}
