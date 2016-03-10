import java.util.ArrayList;
import java.util.Collections;

class Employees
{
    private ArrayList<HockeyPlayer> hockeyPlayers;
    private ArrayList<Professor> professors;
    private ArrayList<Parent> parents;
    private ArrayList<GasStationAttendant> gasStationAttendants;
    public Employees() {
        hockeyPlayers = new ArrayList<> ();
        professors = new ArrayList<> ();
        parents = new ArrayList<> ();
        gasStationAttendants = new ArrayList<> ();

        hockeyPlayers.add(new HockeyPlayer("Wayne Gretsky", 894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretsky", 1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure", 437));
        hockeyPlayers.add(new HockeyPlayer("Jason Harrison", 0));

        professors.add(new Professor("Albert Einstein", "Physics"));
        professors.add(new Professor("Jason Harrison", "Computer Systems"));
        professors.add(new Professor("Richard Feynman", "Physics"));
        professors.add(new Professor("BCIT Instructor", "Computer Systems"));
        professors.add(new Professor("Kurt Godel", "Logic"));

        parents.add(new Parent("Tiger Woods", 1));
        parents.add(new Parent("Super Mom", 168));
        parents.add(new Parent("Lazy Larry", 20));
        parents.add(new Parent("Ex Hausted", 168));
        parents.add(new Parent("Super Dad", 167));

        gasStationAttendants.add(new GasStationAttendant("Joe Smith", 10.0));
        gasStationAttendants.add(new GasStationAttendant("Tony Baloney", 100.0));
        gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 101.0));
        gasStationAttendants.add(new GasStationAttendant("Bee See", 1.0));

        System.out.println("Before sorting: ");
        System.out.println();
        for(HockeyPlayer h: hockeyPlayers) {
            System.out.println(h.getName());
        }
        System.out.println();
        for(Professor p: professors) {
            System.out.println(p.getName());
        }
        System.out.println();
        for(Parent p: parents) {
            System.out.println(p.getName());
        }
        System.out.println();
        for(GasStationAttendant g: gasStationAttendants) {
            System.out.println(g.getName());
        }
        System.out.println();
        
        System.out.println("After sorting: ");
        System.out.println();
        Collections.sort(hockeyPlayers);
        for(HockeyPlayer h: hockeyPlayers) {
            System.out.println(h.getName());
        }
        System.out.println();
        Collections.sort(professors);
        for(Professor p: professors) {
            System.out.println(p.getName());
        }
        System.out.println();
        Collections.sort(parents);
        for(Parent p: parents) {
            System.out.println(p.getName());
        }
        System.out.println();
        Collections.sort(gasStationAttendants);
        for(GasStationAttendant g: gasStationAttendants) {
            System.out.println(g.getName());
        }
    }
}