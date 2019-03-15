package lab7;

import lab7.task1.AllOverParticipantImpl;
import lab7.task1.JumpingAthleteImpl;
import lab7.task1.SwimmingAthleteImpl;
import lab7.task1.TeamPlayerImpl;
import lab7.task2.Task2;
import lab7.task2.Week;
import lab7.task3.MathOperator;

public class Main {
    public static void main(String[] args) {
        SwimmingAthleteImpl swimmer = new SwimmingAthleteImpl();
        JumpingAthleteImpl jumper = new JumpingAthleteImpl();
        TeamPlayerImpl teamPlayer = new TeamPlayerImpl();
        AllOverParticipantImpl athlete = new AllOverParticipantImpl();

        swimmer.participate();
        jumper.participate();
        teamPlayer.participate();
        athlete.participate();

        Week a;
        a = Week.SATURDAY;
        System.out.println(a.getAbbreviation());
        System.out.println(a.isWeekend());
        System.out.println(a.getText());

        for (Week e : Week.values()) {
            System.out.println(e.name());
        }

        Week b = Week.valueOf("FRIDAY");
        switch (b) {
            case FRIDAY: {
                System.out.println("FRIDAY");
                break;
            }
            case SATURDAY: {
                System.out.println("SATURDAY");
                break;
            }
        }

        if (b == Week.FRIDAY) {
            System.out.println("True");
        }
        if (a.name().equals("SATURDAY")) {
            System.out.println("True");
        }

        MathOperator e = MathOperator.ADD;
        System.out.println(e.execute(1, 3));

    }
}
