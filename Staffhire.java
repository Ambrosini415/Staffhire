
/**
 * Write a description of class Staffhire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staffhire extends RecruitmentGUI 
{
    // instance variables - replace the example below with your own
    private int vacancyNumber;
    private String destinationType;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    
    
    

    /**
     * Constructor for objects of class Staffhire
     */
    public Staffhire(int vacancynumber, String destinationtype,String jobtype,String staffname, 
    String joiningdate, String qualification,String appointedBY, boolean joined)
    {
        this.vacancyNumber= vacancyNumber;
        this.destinationType= destinationType;
        this.jobType= jobType;
        this.staffName= staffName;
        this.joiningDate= joiningDate;
        this.qualification= qualification;
        this.appointedBy= appointedBy;
        this.joined= joined;
        
        

    }
    public int getvacancyNumber(){
        return vacancyNumber;
    }
    public void setvacancyNumber(int vacancyNumber){
        this.vacancyNumber=vacancyNumber;
    }
    
    public String getdestinationType(){
        return destinationType;
    }
    public void setdestinationType(String destinationType){
        this.destinationType=destinationType;
    }
    
    public String getjobtype(){
        return jobType;
        
    }
    
    public String getstaffName(){
        return staffName;
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    
    public String getjoiningDate(){
         return joiningDate;
     }
    public void setjoiningDate (String joiningDate){
        this.joiningDate=joiningDate;
    }
    
    public String getqualification(){
         return qualification;
     }
    public void setqualification (String qualification){
        this.qualification=qualification;
    }
    
    public String getappointedBy(){
        return appointedBy;
        
    }
    public void setappointedBy (String appointedBy){
        this.appointedBy=appointedBy;
    }
    
    public boolean getjoined(){
        return joined ;
    }
    public void setjoined (boolean joined){
        this.joined=joined;
    }
    
    
            
        
    }


