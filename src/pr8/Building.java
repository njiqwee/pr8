package pr8;

import java.io.Serializable;
import java.util.ArrayList;

public class Building implements Serializable{
    private String street;
    private int num;
    private int rent;
    private City city;
    private ArrayList<Basement> basements = new ArrayList();
    
    //street
    public void setStreet(String s){
	this.street = s;
    }
    public String getStreet(){
	return this.street;
    }
    
    //num
    public void setNum(int n){
	this.num = n;
    }
    public int getNum(){
	return this.num;
    }
    
    //rent
    public void setRent(int r){
	this.rent = r;
    }
    public int getRent(){
	return this.rent;
    }
    
    //city
    public void setCity(City city){
	this.city = city;
	city.addBuilds(this);
    }
    public City getCity(){
	return this.city;
    }
    
    //basements
    public void addBases(Basement b){
	this.basements.add(b);
    }
    public void addBases(ArrayList<Basement> ab){
	for(Basement a : ab){
	    this.basements.add(a);
	}
    }
    public void delBases(Basement b){
	this.basements.remove(b);
    }
    public void delBases(){
	this.basements.clear();
    }
    public ArrayList<Basement> getBases(){
	return this.basements;
    }
    
    //surf
    public int getSurf(){
	int sum = 0;
	return sum;
    }
    
    //report
    public String report(){
	String report = new String();
	report += ("\t" + this.street +" "+this.num +" "+this.rent +"\n");
	for(int i = 0; i<this.basements.size(); ++i){
	    report += (this.basements.get(i).report());
	}
	return report;
    }
    
    //construct
    public Building(String s, int n, int r, City c){
	this.street = s;
	this.num = n;
	this.rent = r;
	setCity(c);
    }
}
