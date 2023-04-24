package pr8;

import java.io.Serializable;

abstract public class Basement implements Serializable{
    private int num;
    private int surf;
    private Building building = null;
    
    //num
    public void setNum(int n){
	this.num = n;
    }
    public int getNum(){
	return this.num;
    }
    
    //surf
    public void setSurf(int s){
	this.surf = s;
    }
    public int getSurf(){
	return this.surf;
    }
    
    //building
    public void setB(Building b){
	this.building = b;
	b.addBases(this);
    }
    public Building getB(){
	return this.building;
    }
    
    //calc
    public abstract double calculateMonthlyFee();
    
    //report
    public abstract String report();
    
    //construct
    public Basement(int n, int s, Building b){
	this.num = n;
	this.surf = s;
	setB(b);
    }
}
