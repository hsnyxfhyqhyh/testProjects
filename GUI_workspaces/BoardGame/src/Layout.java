import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*; 

public class Layout extends JFrame{
	GButton[][] buttons = new GButton[10][10]; 
	Player[] players = new Player[4]; 
	
	Player  currentPlayer= null;
	
	int rows = 9; 
	int cols = 9; 
	
	public Layout() {
		setLayout(new GridLayout(rows, cols)); 
		
		initBoard();
		
		initPlayers(); 
	}
	
	private void initBoard() {
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=cols; j++) {
				GButton button = null; 
				
				//create button
				if (i==1 || i==9 || j==1 || j==9) {
					//Route button
					//button = new GButton(this, i + "" + j );
					button = new GButton(this);
				} else {
					//non route buttons, 
					button = new GButton(this);
				}
				
				//pink player final winning route button color
				if (i==j && i<5) {
					button.setBackground(Color.PINK);
//					button.setText(i + "" + j );
				}
				
				//Blue player final winning route button color
				if (i==j && i>5) {
					button.setBackground(Color.CYAN);
//					button.setText(i + "" + j );
				}
				
				//Green player final winning route button color
				if(i+j == 10 && i<5) {
					button.setBackground(Color.GREEN);
//					button.setText(i + "" + j );
				}
				
				//Yellow player final winning route button color
				if(i+j == 10 && i>5) {
					button.setBackground(Color.YELLOW);
//					button.setText(i + "" + j );
				}
				
				//Dice Button 
				if(i+j == 10 && i==5) {
					button.setBackground(Color.RED);
					button.setText("Roll");
					button.setEnabled(true);
					button.setDiceButton(true);
				}
				
				//Pink Home Button
				if (i==2 && j==3) {
					button.setText("PPPP");
					button.setForeground(Color.PINK);
					button.setHomeButton(true);
				}
				
				//Yellow Home Button
				if (i==7 && j==2) {
					button.setText("YYYY");
					button.setForeground(Color.YELLOW);
					button.setHomeButton(true);
				}
				
				//Green Home Button
				if (i==3 && j==8) {
					button.setText("GGGG");
					button.setForeground(Color.GREEN);
					button.setHomeButton(true);
				}
				
				//Blue Home Button
				if (i==8 && j==7) {
					button.setText("BBBB");
					button.setForeground(Color.BLUE);
					button.setHomeButton(true);
				}
				
				add(button);	
				buttons[i][j] = button; 
			}
			 
		}
	}

	private void initPlayers() {
		Player gPlayer = new Player("G");
		players[0] = gPlayer;
		
		Player bPlayer = new Player("B");
		players[1] = bPlayer;
		
		Player yPlayer = new Player("Y");
		players[2] = yPlayer;
		
		Player pPlayer = new Player("P");
		players[3] = pPlayer;
		
		//setup the player order.
		gPlayer.setNextPlayer(bPlayer);
		
		GButton gHomeButton = buttons[3][8] ; 
		gPlayer.setHomeButton(gHomeButton);
		
		bPlayer.setNextPlayer(yPlayer);
		GButton bHomeButton = buttons[8][7] ; 
		bPlayer.setHomeButton(bHomeButton);
		
		yPlayer.setNextPlayer(pPlayer);
		GButton yHomeButton = buttons[7][2] ; 
		yPlayer.setHomeButton(yHomeButton);
		
		pPlayer.setNextPlayer(gPlayer);
		GButton pHomeButton = buttons[2][3] ; 
		pPlayer.setHomeButton(pHomeButton);
		
		//set up the initial player - the pink player 
		currentPlayer = pPlayer;
		
//		ArrayList<GButton> gPositions = this.getCurrentPlayer().getPositions(); 
//		gPositions.add(buttons[1][3]);
//		gPositions.add(buttons[1][6]);
//		gPositions.add(buttons[4][9]);
//		gPositions.add(buttons[9][7]);
		
	}
	
	public String getClickedText() {
		// TODO Auto-generated method stub
		return "Clicked";
	}

	public GButton[][] getButtons() {
		return buttons;
	}
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
}
