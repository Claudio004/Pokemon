package it.pokèmon.basics.PokeInfos;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import it.pokèmon.basics.Pokèmon;

@SuppressWarnings("serial")
public class InfoPanel extends JPanel{
    private Pokèmon p;
    private JButton[] moves;
    private JLabel atk = new JLabel();
    private JLabel def = new JLabel();
    private JLabel atk_sp = new JLabel();
    private JLabel def_sp = new JLabel();
    private JLabel speed = new JLabel();
    private JLabel hp = new JLabel();
    private JLabel nome = new JLabel();
    private JLabel lvl = new JLabel();
    private Dimension labelSize = new Dimension(100, 30);
    private Dimension moveSize = new Dimension(140, 30);

    InfoPanel(Pokèmon p){
    	this.p = p;
        setLabelsProperties();
        setMovesProperties();
        setPanelProperties();
    }

    public void setPokemon(Pokèmon p){
        this.p = p;
    }

    public Pokèmon getPokemon(){
        return this.p;
    }

    private void setMovesProperties(){
        moves = new JButton[p.getMovesNumber()];
        for(int i = 0; i < moves.length; i++){
            moves[i] = new JButton();
            moves[i].setText(p.moves.get(i).getNome());
            moves[i].setPreferredSize(moveSize);
            moves[i].setBorder(new RoundedBorder(15));
            switch(moves.length){
                case 1:
                    moves[i].setBounds(105, 400, 140, 30);
                    break;
                case 2:
                    if(i == 0){
                        moves[i].setBounds(105, 400, 140, 30);
                    }else{
                        moves[i].setBounds(105, 440, 140, 30);
                    }
                    break;
                case 3:
                    switch(i){
                        case 0:
                            moves[i].setBounds(105, 400, 140, 30);
                            break;
                        case 1:
                            moves[i].setBounds(105, 440, 140, 30);
                            break;
                        case 2:
                            moves[i].setBounds(105, 480, 140, 30);
                            break;
                    }
                    break;
                case 4:
                    switch(i){
                        case 0:
                            moves[i].setBounds(105, 400, 140, 30);
                            break;
                        case 1:
                            moves[i].setBounds(105, 440, 140, 30);
                            break;
                        case 2:
                            moves[i].setBounds(105, 480, 140, 30);
                            break;
                        case 3:
                            moves[i].setBounds(105, 520, 140, 30);
                            break;
                    }
                    break;
            }
            moves[i].setBackground(null);
            switch(p.moves.get(i).getType()){
	            case NORMALE:
	                moves[i].setForeground(Color.white);
	                break;
	            case FUOCO:
	                moves[i].setForeground(new Color(242, 144, 72));
	                break;
	            case LOTTA:
	            	moves[i].setForeground(new Color(190, 55, 95));
	                break;
	            case ACQUA:
	            	moves[i].setForeground(Color.blue);
	                break;
	            case VOLANTE:
	            	moves[i].setForeground(new Color(127, 155, 211));
	                break;
	            case ERBA:
	            	moves[i].setForeground(Color.green);
	                break;
	            case VELENO:
	            	moves[i].setForeground(new Color(159, 95, 191));
	                break;
	            case ELETTRO:
	            	moves[i].setForeground(Color.yellow);
	                break;
	            case TERRA:
	            	moves[i].setForeground(new Color(201, 106, 54));
	                break;
	            case PSICO:
	            	moves[i].setForeground(new Color(229, 94, 100));
	                break;
	            case ROCCIA:
	            	moves[i].setForeground(new Color(181, 167, 122));
	                break;
	            case GHIACCIO:
	            	moves[i].setForeground(Color.cyan);
	                break;
	            case COLEOTTERO:
	            	moves[i].setForeground(new Color(136, 182, 40));
	                break;
	            case DRAGO:
	            	moves[i].setForeground(new Color(10, 104, 185));
	                break;
	            case SPETTRO:
	            	moves[i].setForeground(new Color(72, 96, 163));
	                break;
	            case BUIO:
	            	moves[i].setForeground(new Color(59, 0, 0));
	                break;
	            case ACCIAIO:
	            	moves[i].setForeground(new Color(85, 135, 155));
	                break;
	        }
            moves[i].setFocusable(false);
        }
    }

    private void setLabelsProperties(){
        nome.setText(p.getNome());
        nome.setPreferredSize(labelSize);
        nome.setBounds(125, 30, 100, 30);
        lvl.setText("Livello: " + p.getLevel());
        lvl.setPreferredSize(labelSize);
        lvl.setBounds(125, 70, 100, 30);
        atk.setText("Attacco: " + p.getAttacco());
        atk.setPreferredSize(labelSize);
        atk.setBounds(125, 110, 100, 30);
        def.setText("Difesa: " + p.getDifesa());
        def.setPreferredSize(labelSize);
        def.setBounds(125, 150, 100, 30);
        atk_sp.setText("Attacco Speciale: " + p.getAttaccoSp());
        atk_sp.setPreferredSize(new Dimension(140, 30));
        atk_sp.setBounds(125, 190, 140, 30);
        def_sp.setText("Difesa Speciale: " + p.getDifesaSp());
        def_sp.setPreferredSize(new Dimension(140, 30));
        def_sp.setBounds(125, 230, 140, 30);
        speed.setText("Velocità: " + p.getVelocità());
        speed.setPreferredSize(labelSize);
        speed.setBounds(125, 270, 100, 30);
        hp.setText("Punti Vita: " + p.getHP());
        hp.setPreferredSize(labelSize);
        hp.setBounds(125, 310, 100, 30);
    }

    private void setPanelProperties(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(350, 600));
        switch(p.getType1()){
            case NORMALE:
                this.setBackground(Color.white);
                break;
            case FUOCO:
                this.setBackground(new Color(242, 144, 72));
                break;
            case LOTTA:
                this.setBackground(new Color(190, 55, 95));
                break;
            case ACQUA:
                this.setBackground(Color.blue);
                break;
            case VOLANTE:
                this.setBackground(new Color(127, 155, 211));
                break;
            case ERBA:
                this.setBackground(Color.green);
                break;
            case VELENO:
                this.setBackground(new Color(159, 95, 191));
                break;
            case ELETTRO:
                this.setBackground(Color.yellow);
                break;
            case TERRA:
                this.setBackground(new Color(201, 106, 54));
                break;
            case PSICO:
                this.setBackground(new Color(229, 94, 100));
                break;
            case ROCCIA:
                this.setBackground(new Color(181, 167, 122));
                break;
            case GHIACCIO:
                this.setBackground(Color.cyan);
                break;
            case COLEOTTERO:
                this.setBackground(new Color(136, 182, 40));
                break;
            case DRAGO:
                this.setBackground(new Color(10, 104, 185));
                break;
            case SPETTRO:
                this.setBackground(new Color(72, 96, 163));
                break;
            case BUIO:
                this.setBackground(Color.black);
                nome.setForeground(Color.white);
                lvl.setForeground(Color.white);
                atk.setForeground(Color.white);
                def.setForeground(Color.white);
                atk_sp.setForeground(Color.white);
                def_sp.setForeground(Color.white);
                speed.setForeground(Color.white);
                hp.setForeground(Color.white);
                break;
            case ACCIAIO:
                this.setBackground(new Color(85, 135, 155));
                break;
        }
        for(int i = 0; i < moves.length; i++){
        	if(this.getBackground().equals(moves[i].getForeground())) {
        		if(this.getBackground().equals(Color.white)) {
        			moves[i].setForeground(Color.black);
        		}else {
        			moves[i].setForeground(Color.white);
        		}
        	}
        	moves[i].setVisible(true);
            this.add(moves[i]);
        }
        nome.setVisible(true);
        lvl.setVisible(true);
        atk.setVisible(true);
        def.setVisible(true);
        atk_sp.setVisible(true);
        def_sp.setVisible(true);
        speed.setVisible(true);
        hp.setVisible(true);
        this.add(nome);
        this.add(lvl);
        this.add(atk);
        this.add(def);
        this.add(atk_sp);
        this.add(def_sp);
        this.add(speed);
        this.add(hp);
        this.setVisible(true);
    }
}