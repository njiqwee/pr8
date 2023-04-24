package pr8;

import java.io.Serializable;
import java.util.ArrayList;

public class City implements Serializable{
    private String name;
    private ArrayList<Building> buildings = new ArrayList();
    
    //name
    public void setName(String name){
	this.name = name;
    }
    public String getName(){
	return this.name;
    }
    
    //buildings
    public void addBuilds(Building b){
	this.buildings.add(b);
    }
    public void addBuilds(ArrayList<Building> ab){
	for(Building a : ab){
	    this.buildings.add(a);
	}
    }
    public void delBuilds(Building b){
	this.buildings.remove(b);
    }
    public void delBuilds(){
	this.buildings.clear();
    }
    
    //report
    public String report(){
	String report = new String();
	report += (this.getName() + "\n");
	for(int i = 0; i < this.buildings.size(); ++i){
	    report += (this.buildings.get(i).report() + "\n");
	}
	
	return report;
    }
    
    //construct
    public City(String name){
	this.name = name;
    }
}
