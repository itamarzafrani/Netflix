import java.util.ArrayList;

public class Series {
    private String seriesName;
    private ArrayList<Episode> episodes;

    public Series(String seriesName , ArrayList<Episode> episodes) {
        this.seriesName = seriesName;
        this.episodes = episodes;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }
}