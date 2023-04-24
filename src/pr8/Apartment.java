package pr8;

import java.io.Serializable;
import java.util.ArrayList;

public class Apartment extends Basement implements Serializable{
    private ArrayList<String> residents = new ArrayList();
    
    //calc
    public double calculateMonthlyFee(){
	int rent = this.getB().getRent();
	int surf = this.getSurf();
	return (1 + 0.1 * residents.size()) * 1.0 * rent * surf;
    }
    
    //residents
    public ArrayList<String> getRes(){
	return this.residents;
    }
    public void addRes(String res){
	this.residents.add(res);
    }
    public void addRes(ArrayList<String> res){
	this.residents = res;
    }
    public void delRes(String res){
	this.residents.remove(res);
    }
    public void delRes(){
	this.residents.clear();
    }
    
    //report
    public String report(){
	String report = new String();
	report += ("\t\t" + this.getNum() +" "+ this.getSurf() +"\n");
	for(int i = 0; i< this.residents.size(); ++i){
	    report += ("\t\t\t" + this.residents.get(i) + "  \n");
	}
	return report;
    }
    
    //constr
    public Apartment(int n, int s, Building b, ArrayList<String> res){
	super(n, s, b);
	this.residents = res;
    }
    public Apartment(int n, int s, Building b){
	super(n, s, b);
    }
}