package Test_1;

import java.util.ArrayList;
import java.util.List;

public class Noeud {
	
	private String token;
	private List<Noeud> noeuds;
	public Noeud(String token) {
		this.token = token;
		noeuds = new ArrayList<Noeud>();
	}
	
	public Noeud() {
		noeuds = new ArrayList<Noeud>();
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	void addFin(String token){
		noeuds.add(new Noeud(token));
	}
	
	List<Noeud> List(){
		return noeuds;
	}
	
	Noeud next(int i) {
		if(i < noeuds.size())
			return noeuds.get(i);
		return null;
	}
	
	public boolean isComplete() {
		for(Noeud n : noeuds) {
			if(n.getToken().equals("fin")) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean equal(String token) {
		return this.token == token;
	}
	public boolean equals(Object obj) {
		if(obj != null  && obj.getClass().equals(this.token.getClass()))
			return token.equals(obj);
		else {
			return false;
		}
	}
	
	int size(){
		return noeuds.size();
	}
	String getToken() {
		return token;
	}
}