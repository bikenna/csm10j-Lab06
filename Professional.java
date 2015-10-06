//package csm10jlab06;
import java.util.Vector;

/**
 *
 * @author brianobioha
 */
public class Professional {
    public Professional(String name){
        Name = name;
    }
    
    public String[] getQualifications(){
        return qualifications.toArray(new String[qualifications.size()]);
    }
    
    public boolean hasQualification(String toCheck){
        for (String q : qualifications) {
            if (q.toLowerCase().equals(toCheck.toLowerCase())) { 
                return true;
            }
        }
        return false;
    }
    
    public void addQualification(String toAdd){
        if(!hasQualification(toAdd))
            qualifications.add(toAdd);
    }
    //private members
    private String getName(){
        return Name;
    }
    private String Name;
    private Vector<String> qualifications = new Vector<String>();
    
    public static void PrintMatches(Vector<Professional> profs, String qual){
        boolean match = false;
        System.out.println("Searching for " + qual);
        for(Professional p : profs){
            if(p.hasQualification(qual)){
                System.out.printf("%s has qualification %s%n", p.getName(), qual);
                match = true;
            }
        }

        if(!match){
            System.out.println("No matches found");
        }
    } 
}
