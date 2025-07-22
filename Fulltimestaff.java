
/**
 * Write a description of class Fulltimestaff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fulltimestaff extends RecruitmentGUI
{
    // instance variables - replace the example below with your own
    private int Salary;
    private int Weeklyfunctionhours;
    
    

    /**
     * Constructor for objects of class Fulltimestaff
     */
    public Fulltimestaff(int Salary, int Weeklyfunctionhours
    ,int vacancyNumber, String destinationType,String jobType,String staffName, 
    String joiningDate, String qualification,String appointedBy, boolean joined )
    {
        super(vacancyNumber,destinationType, jobType,staffName, joiningDate, qualification,
        appointedBy, joined);
        this.Salary= Salary;
        this.Weeklyfunctionhours= Weeklyfunctionhours;
        
    

        
    
    }
     
    public void setsalary(int salary){
        this.Salary=Salary;
    }
    public int getsalary(){
        return salary;
    }
    
    public void setweeklyfunctionhours(int weeklyfunctionhours){
        this.weeklyfunctionhours=weeklyfunctionhours;
    }
    public int getweeklyfunctionhours(){
        return weeklyfunctionhours;
    }
    
    
    

