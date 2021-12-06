package Generics.taskGAME;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participat> {
    private String name;
    private List<T> participats = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewPerticipant (T participat) {
        participats.add(participat);
        System.out.println("в команду " + name + "был добавлен новый участник" + ((Participat)participat).getName());
    }
    public void  playWith (Team <T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0) {
            winnerName = this.name;
        }
        else {
            winnerName= team.name;
        }
        System.out.println("выиграла команда " + winnerName);

    }
}
