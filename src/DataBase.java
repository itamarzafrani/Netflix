import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class DataBase {
    ArrayList<User> usersList = new ArrayList<User>();


    public void createNewUser(String name, String password, LocalDate creationDate, LocalTime exceptionDate,LocalDate finishAccount,int counterEpisodes) {
        Stack<Episode> watchedSeries =new Stack<>();
       Map<String,String> lastEpisodeFromSeries = new HashMap(' ',' ');
        User user = new User(name, password,creationDate,exceptionDate,watchedSeries,finishAccount,counterEpisodes,lastEpisodeFromSeries);
        usersList.add(user);
    }
}
