
public class Episode {
    private String nameOfSeries;
    private String episodeName;
    private String brief;
    private String dayOut;
    private int watchCounter;

    public Episode(String nameOfSeries,String episodeName, String brief, String dayOut, int watchCounter) {
        this.episodeName = episodeName;
        this.brief = brief;
        this.dayOut = dayOut;
        this.watchCounter = 0;
        this.nameOfSeries = nameOfSeries;
    }

    public String getNameOfSeries() {
        return nameOfSeries;
    }

    public void setNameOfSeries(String nameOfSeries) {
        this.nameOfSeries = nameOfSeries;
    }

    public int getWatchCounter() {
        return watchCounter;
    }

    public void setWatchCounter(int watchCounter) {
        this.watchCounter = watchCounter;
    }

    public Episode episodeInfo() {
        Episode chosen = new Episode(this.episodeName,this.episodeName, this.brief, this.dayOut, this.watchCounter);
        return chosen;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }


}
