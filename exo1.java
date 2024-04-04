package tp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;

public class exo1 {
	public static void main(String[] args) {

	        ArrayList<String> faculteUSTHB = new ArrayList<>();
	       // LinkedList <String> faculte =new LinkedList<String>(faculteUSTHB);
	        
	        
	        faculteUSTHB.add("Informatique");
	        faculteUSTHB.add("Mathématiques");
	        faculteUSTHB.add("Génie Civil");
	        faculteUSTHB.add("Physique");
	        faculteUSTHB.add("Chimie");
	        faculteUSTHB.add("Biologie");
	        faculteUSTHB.add("Géologie");
	        faculteUSTHB.add("Génie Mécanique");

	        // Affichage les noms des facultés
	        System.out.println("Affichage sans itérateur :");
	        for (int i = 0; i < faculteUSTHB.size(); i++) {
	            System.out.println(faculteUSTHB.get(i));
	        }
	        System.out.println("Affichage avec itérateur :");
	        Iterator<String> iterator = faculteUSTHB.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	     
	        System.out.println("Taille de la collection : " + faculteUSTHB.size());

	     
	        for (int i = 0; i < faculteUSTHB.size(); i++) {
	            if (faculteUSTHB.get(i).equals("Géologie")) {
	                faculteUSTHB.set(i, "Sciences de la Terre");
	                break; 
	            }
	        }
	        for (int i = 0; i < faculteUSTHB.size(); i++) {
	            if (faculteUSTHB.get(i).equals("Sciences de la Terre")) {
	            	 System.out.println("Affichage de nouveau nom de la faculté:"+faculteUSTHB.get(i));
	            }
	        }
	        // trie de la collection
	        Collections.sort(faculteUSTHB);

	        System.out.println("la collection triée :");
	          iterator =  faculteUSTHB.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	    }
	
}

