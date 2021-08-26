import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class User {
    private String userName;
    private String password;
    private LocalDate creationDate;
    private LocalTime exceptionDate;
    private Stack<Episode> wachedEpisodes;
    private LocalDate finishAcoount;
    private int counterEpisodes;
    private final HashSet<String> watchedEpisode = new HashSet<>();
    private Map <String,String> lastEpisodeFromSeries = new HashMap<>();


    public void setLastEpisodeFromSeries(Map<String, String> lastEpisodeFromSeries) {
        this.lastEpisodeFromSeries = lastEpisodeFromSeries;
    }

    public HashSet<String> getWatchedEpisode() {
        return watchedEpisode;
    }

    public int getCounterEpisodes() {
        return counterEpisodes;
    }

    public void setCounterEpisodes(int counterEpisodes) {
        this.counterEpisodes = counterEpisodes;
    }

    public LocalDate getFinishAcoountDate() {
        return finishAcoount;
    }

    public Stack<Episode> getWachedEpisodes() {
        return wachedEpisodes;
    }

    public void setWachedEpisodes(Stack<Episode> wachedEpisodes) {
        this.wachedEpisodes = wachedEpisodes;
    }

    public LocalDate getFinishAcoount() {
        return finishAcoount;
    }

    public void setFinishAcoount(LocalDate finishAcoount) {
        this.finishAcoount = finishAcoount;
    }

    public User(String name, String password, LocalDate creationDate, LocalTime exceptionDate, Stack wachedEpisodes, LocalDate finishAcoount, int counterEpisodes,Map lastEpisodeFromSeries) {
        this.userName = name;
        this.password = password;
        this.creationDate = creationDate;
        this.exceptionDate = exceptionDate;
        this.wachedEpisodes = wachedEpisodes;
        this.finishAcoount = finishAcoount;
        this.counterEpisodes = counterEpisodes;
        this.lastEpisodeFromSeries = lastEpisodeFromSeries;
    }

    public Stack<Episode> getSeriesThatISaw() {
        return wachedEpisodes;
    }

    public void setSeriesThatISaw(Stack<Episode> wachedEpisodes) {
        wachedEpisodes = wachedEpisodes;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalTime getExceptionDate() {
        return exceptionDate;
    }

    public void setExceptionDate(LocalTime exceptionDate) {
        this.exceptionDate = exceptionDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Map<String, String> getLastEpisodeFromSeries() {
        return lastEpisodeFromSeries;
    }

}




