class Player {

    String name;
    int age;
    String country;
    int matchesPlayed;
    int jerseyNumber;

    // Getter and Setter for name
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for country
    String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    // Getter and Setter for matchesPlayed
    int getMatchesPlayed() {
        return matchesPlayed;
    }

    void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    // Getter and Setter for jerseyNumber
    int getJerseyNumber() {
        return jerseyNumber;
    }

    void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    // Default constructor
    Player() {
        this.name = "NA";
        this.age = 0;
        this.country = "NA";
        this.matchesPlayed = 0;
        this.jerseyNumber = 0;
    }

    // Parameterized constructor
    Player(String name, int age, String country,
           int matchesPlayed, int jerseyNumber) {

        super();

        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Country : " + this.country);
        System.out.println("Matches Played : " + this.matchesPlayed);
        System.out.println("Jersey Number : " + this.jerseyNumber);
    }
}


// CricketPlayer is-a Player
class CricketPlayer extends Player {

    int totalRuns;
    int totalWickets;
    String battingStyle;
    String bowlingStyle;

    // Default constructor
    CricketPlayer() {
        super();

        this.totalRuns = 0;
        this.totalWickets = 0;
        this.battingStyle = "NA";
        this.bowlingStyle = "NA";
    }

    // Parameterized constructor
    CricketPlayer(String name, int age, String country,
                  int matchesPlayed, int jerseyNumber,
                  int totalRuns, int totalWickets,
                  String battingStyle, String bowlingStyle) {

        super(name, age, country, matchesPlayed, jerseyNumber);

        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
    }

    // Getter and Setter for totalRuns
    int getTotalRuns() {
        return totalRuns;
    }

    void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    // Getter and Setter for totalWickets
    int getTotalWickets() {
        return totalWickets;
    }

    void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    // Getter and Setter for battingStyle
    String getBattingStyle() {
        return battingStyle;
    }

    void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    // Getter and Setter for bowlingStyle
    String getBowlingStyle() {
        return bowlingStyle;
    }

    void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    void display() {
        super.display();

        System.out.println("Total Runs : " + this.totalRuns);
        System.out.println("Total Wickets : " + this.totalWickets);
        System.out.println("Batting Style : " + this.battingStyle);
        System.out.println("Bowling Style : " + this.bowlingStyle);
    }
}


// FootballPlayer is-a Player
class FootballPlayer extends Player {

    int totalGoals;
    String playingPosition;

    // Default constructor
    FootballPlayer() {
        super();

        this.totalGoals = 0;
        this.playingPosition = "NA";
    }

    // Parameterized constructor
    FootballPlayer(String name, int age, String country,int matchesPlayed, int jerseyNumber,int totalGoals, String playingPosition) {
        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalGoals = totalGoals;
        this.playingPosition = playingPosition;
    }

    // Getter and Setter for totalGoals
    int getTotalGoals() {
        return totalGoals;
    }

    void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    // Getter and Setter for playingPosition
    String getPlayingPosition() {
        return playingPosition;
    }

    void setPlayingPosition(String playingPosition) {
        this.playingPosition = playingPosition;
    }

    void display() {
        super.display();
        System.out.println("Total Goals : " + this.totalGoals);
        System.out.println("Playing Position : " + this.playingPosition);
    }
}


// Main class
class TestPlayer {

    public static void main(String[] args) {

        System.out.println("Player Details");
        Player p = new Player("Rahul",25,"India",100,10);
        p.display();
        System.out.println();

        System.out.println("Cricket Player Details");
        CricketPlayer cp = new CricketPlayer("Virat Kohli",37,"India",550,18,27000,8,"Right Hand Batsman","Right Arm Medium");
        cp.display();
        System.out.println();
        
        System.out.println("Football Player Details");
        FootballPlayer fp = new FootballPlayer("Lionel Messi",39,"Argentina",1100,10,850,"Forward");
        fp.display();
    }
}
