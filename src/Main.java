import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();


        Episode lupinEpisode1 = new Episode("Lupin", " Lupin episode 1", "Arsen stole the neakleess", "12/4/2012", 0);
        Episode lupinEpisode2 = new Episode("Lupin", " Lupin episode 2", "Arsen jailed by the mafia", "4/7/2012", 0);
        Episode lupinEpisode3 = new Episode("Lupin", " Lupin episode 3", "Arsen die in the arena", "8/4/2021", 0);
        ArrayList<Episode> lupinEpisodes = new ArrayList<Episode>();
        lupinEpisodes.add(lupinEpisode1);
        lupinEpisodes.add(lupinEpisode2);
        lupinEpisodes.add(lupinEpisode3);
        Series lupin = new Series("Lupin", lupinEpisodes);

        Episode vikingsEpisode1 = new Episode("Vikings", "Vikings episode 1", "Ragnar became the ing of the north", "8/5/2010", 0);
        Episode vikingsEpisode2 = new Episode("Vikings", "Vikings episode 2", "The war became comlicated", "8/10/2011", 0);
        Episode vikingsEpisode3 = new Episode("Vikings", "Vikings episode 3", "Ragnar died by his wife", "12/3/2019", 0);
        ArrayList<Episode> vikingsEpisodes = new ArrayList<Episode>();
        vikingsEpisodes.add(vikingsEpisode1);
        vikingsEpisodes.add(vikingsEpisode2);
        vikingsEpisodes.add(vikingsEpisode3);
        Series vikings = new Series("Vikings", vikingsEpisodes);


        Episode queenOfTheNorthEpisode1 = new Episode("Queen Of The North", "Queen Of The North episode 1", "All the kartels kmow the new queen", "4/6/2020", 0);
        Episode queenOfTheNorthEpisode2 = new Episode("Queen Of The North", "Queen Of The North episode 2", "New prince came to the world", "9/12/2012", 0);
        Episode queenOfTheNorthEpisode3 = new Episode("Queen Of The North", "Queen Of The North episode 3", "The queen became the queen of the west", "6/4/2012", 0);
        ArrayList<Episode> queenOfTheNorthEpisodes = new ArrayList<Episode>();
        queenOfTheNorthEpisodes.add(queenOfTheNorthEpisode1);
        queenOfTheNorthEpisodes.add(queenOfTheNorthEpisode2);
        queenOfTheNorthEpisodes.add(queenOfTheNorthEpisode3);
        Series queenOfTheNorth = new Series("Queen Of The North", queenOfTheNorthEpisodes);


        ArrayList<Series> allSeries = new ArrayList<>();
        allSeries.add(lupin);
        allSeries.add(vikings);
        allSeries.add(queenOfTheNorth);


        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        String newUserName = " ";
        String newPassword = " ";
        while (true) {
            try {
                System.out.println("For enter your account enter 1:");
                System.out.println("For sigh up enter 2: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your user name: ");
                        String userName = scanner.nextLine();
                        System.out.println("Enter your password");
                        String password = scanner.nextLine();
                        for (int i = 0; i < dataBase.usersList.size(); i++) {
                            User currentUser = dataBase.usersList.get(i);
                            if (dataBase.usersList.get(i).getUserName().equals(userName) && dataBase.usersList.get(i).getPassword().equals(password)) {
                                while (true) {
                                    int option = menu();
                                    switch (option) {
                                        case 1:
                                            for (int j = 0; j < allSeries.size(); j++) {
                                                System.out.println(allSeries.get(j).getSeriesName());
                                            }
                                            break;
                                        case 2:
                                            if (dataBase.usersList.get(i).getSeriesThatISaw() == null) {
                                                System.out.println("You didnt start to watch any series");
                                            } else {
                                                System.out.println("The series that you start to watch is : ");
                                                if (currentUser.getLastEpisodeFromSeries() == null)
                                                    System.out.println("You havent saw any episode");
                                                else
                                                    System.out.println(currentUser.getLastEpisodeFromSeries().toString());
                                            }
                                            break;
                                        case 3:
                                            System.out.println("The date that this account create is : " + currentUser.getCreationDate());
                                            System.out.println("The time that this account create is : " + currentUser.getExceptionDate());
                                            System.out.println("The date that this accout finish is : " + currentUser.getFinishAcoountDate());
                                            System.out.println("You started : " + currentUser.getWachedEpisodes().size() + " episodes");
                                            System.out.println("Series started watching : " + currentUser.getLastEpisodeFromSeries().size());
                                            break;


                                        case 4:
                                            if (!currentUser.getWachedEpisodes().isEmpty()) {
                                                System.out.println("The last episode is:");
                                                System.out.println(currentUser.getWachedEpisodes().peek().getEpisodeName());
                                            } else
                                                System.out.println("You dont watch anything");
                                            System.out.println("Which series do you want to watch: ");
                                            String series = scanner.nextLine();
                                            for (int k = 0; k < allSeries.size(); k++) {
                                                if (allSeries.get(k).getSeriesName().equals(series)) {
                                                    for (int b = 0; b < allSeries.get(k).getEpisodes().size(); b++) {
                                                        System.out.println(b + ". " + allSeries.get(k).getEpisodes().get(b).getEpisodeName());
                                                        System.out.println(allSeries.get(k).getEpisodes().get(b).getBrief());
                                                        System.out.println(allSeries.get(k).getEpisodes().get(b).getDayOut());
                                                        System.out.println();
                                                    }
                                                }
                                                if (allSeries.get(k).getSeriesName().equals(series)) {
                                                    System.out.println("Plz enter the number of the episode that you want to watch :");
                                                    int episodeNum = scanner.nextInt();
                                                    scanner.nextLine();
                                                    currentUser.getWachedEpisodes().push(allSeries.get(k).getEpisodes().get(episodeNum));
                                                    currentUser.getWatchedEpisode().add(allSeries.get(k).getEpisodes().get(episodeNum).getEpisodeName());
                                                    currentUser.setCounterEpisodes(currentUser.getCounterEpisodes() + 1);
                                                    currentUser.getLastEpisodeFromSeries().put(allSeries.get(k).getSeriesName(), allSeries.get(k).getEpisodes().get(episodeNum).getEpisodeName());
                                                }
                                            }
                                            break;
                                        case 5:
                                            break;
                                    }
                                    if (option == 5){
                                        System.out.println("Goodbye!!");
                                    break;}
                                }
                            }
                        }
                        break;
                    case 2:             // check if the user name not exist.
                        while (true) {
                            System.out.println("Please choose your user name: ");
                            newUserName = scanner.nextLine();
                            if (isNameExist(newUserName, dataBase.usersList)) {
                                System.out.println("pls choose another name the name is taken");
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("Pls choose your password");
                            System.out.println("Pay attention on your password to be with 1 letter and 1 number");
                            newPassword = scanner.nextLine();
                            if (isPasswordStrong(newPassword)) {
                                dataBase.createNewUser(newUserName, newPassword, localDate, localTime, localDate.plusYears(1), 0);
                                System.out.println("your account is ready!");
                                break;
                            } else
                                System.out.println("please listen to the instruction");
                        }
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please listen to the instruction");
            }
        }

    }

    public static boolean isNameExist(String userName, ArrayList<User> usersList) {
        if (usersList == null) return false;
        for (User user : usersList) {
            if (userName.equals(user.getUserName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPasswordStrong(String userPassword) {
        int numCount = 0;
        int numEnglish = 0;
        if (userPassword.length() < 6)
            return false;
        for (int i = 0; i < userPassword.length(); i++) {
            if ((userPassword.charAt(i) >= 'a' && userPassword.charAt(i) <= 'z') ||
                    (userPassword.charAt(i) >= 'A' && userPassword.charAt(i) <= 'Z')) {
                numEnglish++;
            }
            if ((userPassword.charAt(i) >= '0' && userPassword.charAt(i) <= '9')) {
                numCount++;
            }
        }
        if (numCount > 0 && numEnglish > 0) {
            return true;
        } else
            return false;
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("For see all the series enter 1:");
        System.out.println("To see the series that you started to watch enter 2 ::");
        System.out.println("To see the account details enter 3:");
        System.out.println("For choose series to watch enter 4 :");
        System.out.println("For log out enter 5");
        System.out.println("Your choice: ");
        return scanner.nextInt();
    }


}
