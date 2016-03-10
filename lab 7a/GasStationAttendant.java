public class GasStationAttendant extends Employee implements Employable, Comparable<GasStationAttendant>
{
    private double numberOfDollarsStolenPerDay;
    
    public static final double LOW_OVERTIME_PAY_RATE = 1.5;
    
    public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
        super(name);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }
    
    public double getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }
    
    @Override
    public String getDressCode() {
        return "uniform";
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
        return "pump";
    }
    
    @Override
    public double getOvertimePayRate() {
        return LOW_OVERTIME_PAY_RATE;
    }
    
    @Override
    public boolean equals(Object that) {
        if  (that == null) {
            return false;
        }
        if  (that == this) {
            return true;
        }
        if  (!(that instanceof GasStationAttendant)) {
            return false;
        }
        
        GasStationAttendant gasPumper = (GasStationAttendant)that;
        if  (this.getNumberOfDollarsStolenPerDay() == gasPumper.getNumberOfDollarsStolenPerDay()) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(GasStationAttendant that) {
        double dollarsStolen = this.getNumberOfDollarsStolenPerDay();
        double otherDollarsStolen = that.getNumberOfDollarsStolenPerDay();
        
        if  (dollarsStolen > otherDollarsStolen) {
            return -1;
        }
        else if (dollarsStolen == otherDollarsStolen) {
            return 0;
        }
        else{
            return +1;
        }
    }
    
    public String getAttendantName() {
        return super.getName();
    }
}