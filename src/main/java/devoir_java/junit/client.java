package devoir_java.junit;
import java.util.List;
public class client {
 private int numClient;
 private String nom;
 private String prenom;
 private int phone;
 private String email;
 private List<String> compte; 
  
      //constructer
   public client(int num,String nom,String prenom, int phone , String email) {
	   this.numClient = num;
	   this.nom=nom;
	   this.prenom = prenom;
	   this.phone =phone;
	   this.email=email;
   }
     
  public int get_num() {
	  return this.numClient;
  }
  public String get_nom() {
	  return this.nom;
  }
  public String get_prenom() {
	  return this.prenom;
  }
  public int get_phone() {
	  return this.phone;
  }
  public String get_email() {
	  return this.email;
  }
  
}
