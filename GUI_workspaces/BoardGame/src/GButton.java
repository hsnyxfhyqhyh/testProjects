import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class GButton extends JButton {
	
//	private Player player; 
	private boolean isHomeButton = false; 
	private boolean isDiceButton = false; 
	private boolean isRouteButton = false;
	
	private Layout layout; 
	
	private long sleepinterval =200; 
	
	public GButton(Layout layout) {
		super();
		this.setEnabled(false);
		addAction();
		this.layout = layout; 
	}
	
	public GButton(Layout layout, String text) {
		super(text);
		this.setEnabled(false);
		addAction();
		this.layout = layout; 
	}

//	public Player getPlayer() {
//		return player;
//	}
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}

	public boolean isHomeButton() {
		return isHomeButton;
	}

	public void setHomeButton(boolean isHomeButton) {
		this.isHomeButton = isHomeButton;
	}

	public boolean isDiceButton() {
		return isDiceButton;
	}

	public void setDiceButton(boolean isDiceButton) {
		this.isDiceButton = isDiceButton;
	}
	
	public boolean isRouteButton() {
		return isRouteButton;
	}

	public void setRouteButton(boolean isRouteButton) {
		this.isRouteButton = isRouteButton;
	}

	private void addAction() {
		this.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	GButton b = (GButton)e.getSource(); 

		    	if (b.isDiceButton()) {
		    		int diceRoll = getRandomNumberInRange(1, 6); 
			    	
			    	b.setText(diceRoll + "");	
			    	GButton[][] buttons = b.getGLayout().getButtons(); 
			    	
			    	Player currentPlayer = layout.getCurrentPlayer(); 
			    	for (GButton b1: currentPlayer.getPositions()) {
			    		b1.setEnabled(true);
			    	}
			    	
			    	GButton currentPlayerHomeButton = currentPlayer.getHomeButton(); 
			    	
			    	if (currentPlayerHomeButton.getText().length()>0) {
			    		currentPlayerHomeButton.setEnabled(true);
			    		b.setEnabled(false);
			    	}
		    	} else if(b.isHomeButton()) {
		    		GButton[][] buttons = b.getGLayout().getButtons(); 
			    	
			    	Player currentPlayer = layout.getCurrentPlayer();
			    	ArrayList<GButton> positions = currentPlayer.getPositions(); 
			    	
			    	String text = b.getText(); 
			    	b.setText(text.substring(0, text.length()-1));
			    	if (currentPlayer.isPink()) {
			    		GButton newPosition = buttons[1][2]; 
			    		newPosition.setText("P");
			    		Color c = newPosition.getBackground();
			    		newPosition.setBackground(Color.ORANGE); 
			    		sleep(sleepinterval);
			    		newPosition.setBackground(c);
			    		
			    		newPosition.setEnabled(false);
			    		
			    		b.setEnabled(false);
			    		
			    		positions.add(newPosition); 
			    	}
			    	
			    	if (currentPlayer.isGreen()) {
			    		GButton newPosition = buttons[2][9]; 
			    		newPosition.setText("G");
			    		Color c = newPosition.getBackground();
			    		newPosition.setBackground(Color.ORANGE); 
			    		sleep(sleepinterval);
			    		newPosition.setBackground(c);
			    		newPosition.setEnabled(false);
			    		
			    		b.setEnabled(false);
			    		
			    		positions.add(newPosition); 
			    	}
			    	
			    	if (currentPlayer.isBlue()) {
			    		GButton newPosition = buttons[9][8]; 
			    		newPosition.setText("B");
			    		newPosition.setEnabled(false);
			    		
			    		b.setEnabled(false);
			    		
			    		positions.add(newPosition); 
			    	}
			    	
			    	if (currentPlayer.isYellow()) {
			    		GButton newPosition = buttons[8][1]; 
			    		newPosition.setText("Y");
			    		newPosition.setEnabled(false);
			    		
			    		b.setEnabled(false);
			    		
			    		positions.add(newPosition); 
			    	}
			    	
			    	for (GButton b1: currentPlayer.getPositions()) {
			    		b1.setEnabled(false);
			    	}
			    	
			    	GButton diceButton = buttons[5][5]; 
			    	diceButton.setText("Roll");
			    	diceButton.setEnabled(true);
			    	
			    	currentPlayer = currentPlayer.getNextPlayer();
			    	getGLayout().setCurrentPlayer(currentPlayer);
			    	
			    	
		    	} else if(b.isRouteButton()) {
		    		
		    	}
		    	
		    }
		});
	}

	public Layout getGLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}
	
	public int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public void sleep(long interval) {
		try {
			Thread.sleep(interval);
		}catch (Exception e) {
			
		}
	}
}
