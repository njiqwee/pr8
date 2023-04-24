package pr8;

import java.io.Serializable;

public class Office extends Basement implements Serializable{
    private String owner;
    private String doing;
    
    //owner
    public void setOwner(String o){
	this.owner = o;
    }
    public String getOwner(){
	return this.owner;
    }
    
    //doing
    public void setDoing(String d){
	this.doing = d;
    }
    public String getDoing(){
	return this.doing;
    }
    
    //calc
    @Override
    public double calculateMonthlyFee(){
	int rent = this.getB().getRent();
	int surf = this.getSurf();
	return rent * surf * 2.0;
    }
    
    //report
    @Override
    public String report(){
	String report = new String();
	report += ("\t\t" + this.getNum() +" "+ this.getSurf() +" "+ this.owner +" "+ this.doing+"\n");
	return report;
    }
    
    //constr
    public Office(int n, int s, Building b, String o, String d){
	super(n, s, b);
	this.owner = o;
	this.doing = d;
    }
}
