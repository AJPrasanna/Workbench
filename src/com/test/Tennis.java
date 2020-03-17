package com.test;

public class Tennis {
	
	private String playerName;
	private String country;
	private String favoriteSurface;
	private String [] Tiles = { "Australian Open", "French Open", "Wimbledon", "US Open"};
	
	public Tennis()
	{
		
	}
	public String[] getTiles() {
		return Tiles;
	}
	public void setTiles(String[] tiles) {
		Tiles = tiles;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavoriteSurface() {
		return favoriteSurface;
	}
	public void setFavoriteSurface(String favoriteSurface) {
		this.favoriteSurface = favoriteSurface;
	}

}
