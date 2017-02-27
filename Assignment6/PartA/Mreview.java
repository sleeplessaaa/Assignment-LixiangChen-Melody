package assignment6;

import java.util.*;


public class Mreview {
	private ArrayList<Integer> ratings; 
	private String title;
	
	public Mreview(){
		title = "";
		ratings = new ArrayList<>();
	}
	
	
	public Mreview(String title){
		this.title = title;
		ratings = new ArrayList<>();
	}
	
	public Mreview(String title, int firstRating){
		//sets title to the parameter string and creates a rating list whose size() is one, having the 
		//parameter int as the (only/first) element.
		
		this.title = title;
		ratings = new ArrayList<>(1);
		ratings.add(firstRating);
	}
	
	
	
	public void addRating(int r){
		ratings.add(r);
	}
	
	public double avgRating(){
		double avgRating = 0.0;
		for(int i: ratings){
			avgRating += i; 
		}
		
		avgRating /= ratings.size();
		return avgRating;
	}
	
	public int compareTo(Mreview obj){
		return this.title.compareTo(obj.title);
	}
	
	public boolean equals(Object obj){
		return this.title.equals(((Mreview)obj).title);
	}
	
	public String getTitle(){
		return title;
	}
	
	public int numRating(){
		return ratings.size();
	}
	
	public String toString(){
		return title + ",average " + String.format("%.1f", avgRating()) + " out of " + ratings.size() + " ratings"; 
	}
	
	
	
	
	
	
	
}
