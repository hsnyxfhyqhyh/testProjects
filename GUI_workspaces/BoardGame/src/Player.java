import java.util.ArrayList;

public class Player {

	private boolean isGreen = false; 
	private boolean isBlue = false; 
	private boolean isPink = false; 
	private boolean isYellow = false; 
	private GButton homeButton = null;
	
	private String name= ""; 
	
	private ArrayList<GButton> positions = new ArrayList(); 
	
	private ArrayList<GButton> routePositions =  new ArrayList();
	
	
	public ArrayList<GButton> getRoutePositions() {
		return routePositions;
	}

	public void setRoutePositions(Layout layout) {
		GButton[][] buttons = layout.getButtons();
		if (this.isPink()) {
			routePositions.add(buttons[1][2]);
			routePositions.add(buttons[1][3]);
			routePositions.add(buttons[1][4]);
			routePositions.add(buttons[1][5]);
			routePositions.add(buttons[1][6]);
			routePositions.add(buttons[1][7]);
			routePositions.add(buttons[1][8]);
			routePositions.add(buttons[1][9]);
			routePositions.add(buttons[2][9]);
			routePositions.add(buttons[3][9]);
			routePositions.add(buttons[4][9]);
			routePositions.add(buttons[5][9]);
			routePositions.add(buttons[6][9]);
			routePositions.add(buttons[7][9]);
			routePositions.add(buttons[8][9]);
			routePositions.add(buttons[9][9]);
			routePositions.add(buttons[9][8]);
			routePositions.add(buttons[9][7]);
			routePositions.add(buttons[9][6]);
			routePositions.add(buttons[9][5]);
			routePositions.add(buttons[9][4]);
			routePositions.add(buttons[9][3]);
			routePositions.add(buttons[9][2]);
			routePositions.add(buttons[9][1]);
			routePositions.add(buttons[8][1]);
			routePositions.add(buttons[7][1]);
			routePositions.add(buttons[6][1]);
			routePositions.add(buttons[5][1]);
			routePositions.add(buttons[4][1]);
			routePositions.add(buttons[3][1]);
			routePositions.add(buttons[2][1]);
			routePositions.add(buttons[1][1]);
			
			routePositions.add(buttons[2][2]);
			routePositions.add(buttons[3][3]);
			routePositions.add(buttons[4][4]);
		} else if (this.isGreen()) {
			routePositions.add(buttons[2][9]);
			routePositions.add(buttons[3][9]);
			routePositions.add(buttons[4][9]);
			routePositions.add(buttons[5][9]);
			routePositions.add(buttons[6][9]);
			routePositions.add(buttons[7][9]);
			routePositions.add(buttons[8][9]);
			routePositions.add(buttons[9][9]);
			
			routePositions.add(buttons[9][8]);
			routePositions.add(buttons[9][7]);
			routePositions.add(buttons[9][6]);
			routePositions.add(buttons[9][5]);
			routePositions.add(buttons[9][4]);
			routePositions.add(buttons[9][3]);
			routePositions.add(buttons[9][2]);
			routePositions.add(buttons[9][1]);
			
			routePositions.add(buttons[8][1]);
			routePositions.add(buttons[7][1]);
			routePositions.add(buttons[6][1]);
			routePositions.add(buttons[5][1]);
			routePositions.add(buttons[4][1]);
			routePositions.add(buttons[3][1]);
			routePositions.add(buttons[2][1]);
			routePositions.add(buttons[1][1]);
			
			routePositions.add(buttons[1][2]);
			routePositions.add(buttons[1][3]);
			routePositions.add(buttons[1][4]);
			routePositions.add(buttons[1][5]);
			routePositions.add(buttons[1][6]);
			routePositions.add(buttons[1][7]);
			routePositions.add(buttons[1][8]);
			routePositions.add(buttons[1][9]);
			
			routePositions.add(buttons[2][8]);
			routePositions.add(buttons[3][7]);
			routePositions.add(buttons[4][6]);
		} else if (this.isBlue()) {
			routePositions.add(buttons[9][8]);
			routePositions.add(buttons[9][7]);
			routePositions.add(buttons[9][6]);
			routePositions.add(buttons[9][5]);
			routePositions.add(buttons[9][4]);
			routePositions.add(buttons[9][3]);
			routePositions.add(buttons[9][2]);
			routePositions.add(buttons[9][1]);
			
			routePositions.add(buttons[8][1]);
			routePositions.add(buttons[7][1]);
			routePositions.add(buttons[6][1]);
			routePositions.add(buttons[5][1]);
			routePositions.add(buttons[4][1]);
			routePositions.add(buttons[3][1]);
			routePositions.add(buttons[2][1]);
			routePositions.add(buttons[1][1]);
			
			routePositions.add(buttons[1][2]);
			routePositions.add(buttons[1][3]);
			routePositions.add(buttons[1][4]);
			routePositions.add(buttons[1][5]);
			routePositions.add(buttons[1][6]);
			routePositions.add(buttons[1][7]);
			routePositions.add(buttons[1][8]);
			routePositions.add(buttons[1][9]);
			
			routePositions.add(buttons[2][9]);
			routePositions.add(buttons[3][9]);
			routePositions.add(buttons[4][9]);
			routePositions.add(buttons[5][9]);
			routePositions.add(buttons[6][9]);
			routePositions.add(buttons[7][9]);
			routePositions.add(buttons[8][9]);
			routePositions.add(buttons[9][9]);
			
			routePositions.add(buttons[8][8]);
			routePositions.add(buttons[7][7]);
			routePositions.add(buttons[6][6]);
		} else if (this.isYellow()) {
			routePositions.add(buttons[8][1]);
			routePositions.add(buttons[7][1]);
			routePositions.add(buttons[6][1]);
			routePositions.add(buttons[5][1]);
			routePositions.add(buttons[4][1]);
			routePositions.add(buttons[3][1]);
			routePositions.add(buttons[2][1]);
			routePositions.add(buttons[1][1]);
			
			routePositions.add(buttons[1][2]);
			routePositions.add(buttons[1][3]);
			routePositions.add(buttons[1][4]);
			routePositions.add(buttons[1][5]);
			routePositions.add(buttons[1][6]);
			routePositions.add(buttons[1][7]);
			routePositions.add(buttons[1][8]);
			routePositions.add(buttons[1][9]);
			
			routePositions.add(buttons[2][9]);
			routePositions.add(buttons[3][9]);
			routePositions.add(buttons[4][9]);
			routePositions.add(buttons[5][9]);
			routePositions.add(buttons[6][9]);
			routePositions.add(buttons[7][9]);
			routePositions.add(buttons[8][9]);
			routePositions.add(buttons[9][9]);
			
			routePositions.add(buttons[9][8]);
			routePositions.add(buttons[9][7]);
			routePositions.add(buttons[9][6]);
			routePositions.add(buttons[9][5]);
			routePositions.add(buttons[9][4]);
			routePositions.add(buttons[9][3]);
			routePositions.add(buttons[9][2]);
			routePositions.add(buttons[9][1]);
			
			routePositions.add(buttons[8][2]);
			routePositions.add(buttons[7][3]);
			routePositions.add(buttons[6][4]);
		}
		
	}

	public ArrayList<GButton> getPositions() {
		return positions;
	}

	public void setPositions(ArrayList<GButton> positions) {
		this.positions = positions;
	}

	private Player nextPlayer = null;
	
	

	public Player(String name) {
		if (name ==null) {
			this.name = "G"; 
		} else {
			this.name = name;
		}
		
		if (this.name.equalsIgnoreCase("Y")) {
			this.isYellow = true; 
		} else if(this.name.equalsIgnoreCase("B")) {
			this.isBlue = true; 
		} else if (this.name.equalsIgnoreCase("P")) {
			this.isPink = true; 
		} else {
			this.isGreen = true;
			this.name = "G";
		}
	}
	
	public GButton getTargetMove(GButton origin, int steps) {
		return null;
	}

//	public GButton[] getPositions() {
//		return positions;
//	}
//
//	public void setPositions(GButton[] positions) {
//		this.positions = positions;
//	}

	public boolean isGreen() {
		return isGreen;
	}

	public boolean isBlue() {
		return isBlue;
	}

	public boolean isPink() {
		return isPink;
	}

	public boolean isYellow() {
		return isYellow;
	}

	public String getName() {
		return name;
	}
	
	public GButton getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(GButton homeButton) {
		this.homeButton = homeButton;
	}
	
	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
}
