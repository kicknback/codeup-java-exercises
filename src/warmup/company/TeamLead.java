package warmup.company;

public class TeamLead implements TimeSheets, FirePower{

    @Override
    public void fillOutTimesheets() {
        System.out.println("Team lead is filling out Timesheets.");
    }

    @Override
    public void firePeople() {
        System.out.println("You're firrrreduh..");
    }
}
