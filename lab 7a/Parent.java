public class Parent extends Employee implements Employable, Comparable<Parent>
{
    private int numberOfHoursSpentPerWeekWithKids;
    
    public static final double NEGATIVE_OVERTIME_PAY_RATE = -2.0;
    
    public Parent(String name, int numberOfHours) {
        super(name);
        setNumberOfHoursSpentPerWeekWithKids(numberOfHours);
    }
    
    public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHours) {
        if  (numberOfHours >= 0) {
            numberOfHoursSpentPerWeekWithKids = numberOfHours;
        }
    }
    
    public int getNumberOfHoursSpentPerWeekWithKids() {
        return numberOfHoursSpentPerWeekWithKids;
    }
    
    @Override
    public String getDressCode() {
        return "anything";
    }
    
    @Override
    public boolean isPaidSalary() {
        return false;
    }
    
    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }
    
    @Override
    public String getWorkVerb() {
        return "care";
    }
    
    @Override
    public double getOvertimePayRate() {
        return NEGATIVE_OVERTIME_PAY_RATE;
    }
    
    @Override
    public boolean equals(Object that) {
        if  (that == null) {
            return false;
        }
        if  (that == this) {
            return true;
        }
        if  (!(that instanceof Parent)) {
            return false;
        }
        
        Parent parent = (Parent)that;
        if  (parent.getNumberOfHoursSpentPerWeekWithKids() == this.getNumberOfHoursSpentPerWeekWithKids()) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(Parent that) {
        int parentHoursWithKids = this.getNumberOfHoursSpentPerWeekWithKids();
        int otherParentHoursWithKids = that.getNumberOfHoursSpentPerWeekWithKids();
        
        if  (parentHoursWithKids > otherParentHoursWithKids) {
            return -1;
        }
        else if(parentHoursWithKids == otherParentHoursWithKids){
            return 0;
        }
        else{
            return +1;
        }
        
    }
    
    public String getParentName() {
        return super.getName();
    }
}