
package studentacc;


public class StudentInfo {
    
    String university;
    String college;
    String SchoolYear;
    String Term;
    
    private String idNumber;
    private String familyName;
    private String firstName;
    private String acadProg;
    private String track;

    
    StudentInfo(String college, String Term, String SchoolYear)
    {
        this.university = "University of the Cordilleras";
        this.college = college;
        this.Term = Term;
        this.SchoolYear = SchoolYear;
        
    }
    public void setIdNumber (String idNumber)
    {
        this.idNumber = idNumber;
    }
    public String getIdNumber ()
    {
        return idNumber;
    }
    
    public void setFamilyname (String familyName)
    {
        this.familyName = familyName;
    }
    public String getFamilyname()
    {
        return familyName;
    }
    
    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setAcadProg(String acadProg)
    {
        this.acadProg = acadProg;
    }
    public String getAcadProg()
    {
        return acadProg;
    }
    
    public void setTrack (String track)
    {
        this.track= track;
    }
    public String getTrack()
    {
        return track;
    }
    
    public void print()
    {

         System.out.println("" + university);
         System.out.println("" + college);
         System.out.println("" + Term);
         System.out.println("S.Y." + SchoolYear); 
         System.out.println("");
         System.out.println("Student Info:");
         System.out.println("");
         System.out.println("ID Number:" + idNumber);
         System.out.println("Name:" + familyName + "," + firstName);
         System.out.println("Academic Program: " + acadProg + "-" + track);
         System.out.println("");
    }
    
    
}
