class HockeyPlayer extends Employee implements Employable, Comparable<HockeyPlayer>
{
    private int numberOfGoals;
    
    public static final double NO_OVERTIME_PAY_RATE = 0.0;
    
    public HockeyPlayer(String name, int numberOfGoals) {
        super(name);
        setNumberOfGoals(numberOfGoals);
    }
    
    @Override
    public String getDressCode() {
        return "jersey";
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
        return "play";
    }
    
    public void setNumberOfGoals(int numberOfGoals) {
        if  (numberOfGoals >= 0) {
            this.numberOfGoals = numberOfGoals;
        }
    }
    
    public int getNumberOfGoals() {
        return numberOfGoals;
    }
    
    @Override
    public double getOvertimePayRate() {
        return NO_OVERTIME_PAY_RATE;
    }
    
    @Override
    public boolean equals(Object that) {
        if  (that == null) {
            return false;
        }
        if  (that == this) {
            return true;
        }
        if  (!(that instanceof HockeyPlayer)) {
            return false;
        }
        
        HockeyPlayer player = (HockeyPlayer)that;
        if  (this.getNumberOfGoals() == player.getNumberOfGoals()) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    public int compareTo(HockeyPlayer that) {
        int numberOfGoals = this.getNumberOfGoals();
        int otherNumberOfGoals = that.getNumberOfGoals();
        
        if  (numberOfGoals > otherNumberOfGoals) {
            return -1;
        }
        else if(numberOfGoals == otherNumberOfGoals) {
            return 0;
        }
        else{
            return +1;
        }
    }
    
    public String getHockeyPlayerName() {
        return super.getName();
    }
}