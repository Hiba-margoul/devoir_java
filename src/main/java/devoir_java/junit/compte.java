package devoir_java.junit;

import java.util.Date;
import java.util.List;
public class compte {

	 private int numCompte;
	 private Date dateCreation;
	 private Date dateUpdate;
	
	 private client c; 
	  private List<String>transaction;
	      //constructer
	   public compte(int num,Date create,Date update) {
		   this.numCompte= num;
		  this.dateCreation=create;
		  this.dateUpdate=update;
	   }
	     
	  public int get_num() {
		  return this.numCompte;
	  }
	  public Date get_dc() {
		  return this.dateCreation;
	  }
	  public Date get_du() {
		  return this.dateUpdate;
	  }
	
	  
}
