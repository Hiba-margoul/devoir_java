package devoir_java.junit;
import java.util.List;
public class transaction {

	 private String type;
	 private String reference; 
	  private List<String>compte;
	      //constructer
	   public transaction(String type,String reference) {
		   this.type = type;
		  this.reference=reference;
		
	   }
	     
	  public String get_type() {
		  return this.type;
	  }
	  public String get_reference() {
		  return this.reference;
	  }
	 
}
