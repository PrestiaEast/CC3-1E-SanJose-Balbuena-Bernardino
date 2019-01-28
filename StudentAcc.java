
package studentacc;


public class StudentAcc {

    public static void main(String[] args) 
    {
        StudentInfo a = new StudentInfo ("CITCS", "2nd term", "2019-2018");
        
        a.setIdNumber("18-7095-336");
        a.setFamilyname("San Jose");
        a.setFirstName("Marco");
        a.setAcadProg("BSIT");
        a.setTrack("Web Tech");
        a.college = ("COA");
        
        a.print();
        
        StudentInfo b = new StudentInfo ("CITCS", "2nd term", "2019-2018");
        
        b.setIdNumber("18-7098-564");
        b.setFamilyname("Bernardino");
        b.setFirstName("Zeth");
        b.setAcadProg("BSIT");
        b.setTrack("ERP");
        b.setTrack("Web");
        
        
        b.print();
        
        
        StudentInfo c = new StudentInfo ("CITCS", "2nd term", "2019-2018");
        
        c.setIdNumber("18-7099-436");
        c.setFamilyname("Balbuena");
        c.setFirstName("Prestia");
        c.setAcadProg("BSIT");
        c.setTrack("ERP");
        
        c.print();
        
        System.out.println(c.getIdNumber() + c.getFamilyname());

      
    }
    
}
