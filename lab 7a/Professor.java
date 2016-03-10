public class Professor extends Employee implements Employable, Comparable<Professor>
{
    private String teachingMajor;
    
    public static final double HIGH_OVERTIME_PAY_RATE = 2.0;
    
    public Professor(String name, String teachingMajor) {
        super(name);
        setTeachingMajor(teachingMajor);
    }
    
    public void setTeachingMajor(String teachingMajor) {
        this.teachingMajor = teachingMajor;
    }
    
    public String getTeachingMajor() {
        return teachingMajor;
    }
    
    @Override
    public String getDressCode() {
        return "fancy";
    }
    
    @Override
    public boolean isPaidSalary() {
        return true;
    }
    
    @Override
    public boolean postSecondaryEducationRequired() {
        return true;
    }
    
    @Override
    public String getWorkVerb() {
        return "teach";
    }
    
    @Override
    public double getOvertimePayRate() {
        return HIGH_OVERTIME_PAY_RATE;
    }
    
    @Override
    public boolean equals(Object that) {
        if  (that == null) {
            return false;
        }
        if  (that == this) {
            return true;
        }
        if  (!(that instanceof Professor)) {
            return false;
        }
        
        Professor prof = (Professor)that;
        if  (this.getTeachingMajor().equalsIgnoreCase(prof.getTeachingMajor())) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(Professor that) {
        String teachingMajor = this.getTeachingMajor();
        String otherTeachingMajor = that.getTeachingMajor();
        
        if  (teachingMajor.equalsIgnoreCase("Computer Systems") && 
        (!(otherTeachingMajor.equalsIgnoreCase("Computer Systems")))){
            return -1;
        }
        else if (teachingMajor.equalsIgnoreCase("Computer Systems") && 
        otherTeachingMajor.equalsIgnoreCase("Computer Systems")) {
            return 0;
        }
        else if (!(teachingMajor.equalsIgnoreCase("Computer Systems")) && 
        otherTeachingMajor.equalsIgnoreCase("Computer Systems")){
            return +1;
        }
        return 0;
    }
    
    public String getProfessorName() {
        return super.getName();
    }
}