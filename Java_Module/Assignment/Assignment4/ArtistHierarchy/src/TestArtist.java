class Artist {

    String name;
    int age;

    // Getter
    String getName() {
        return name;
    }

    // Setter
    void setName(String name) {
        this.name = name;
    }

    // Getter
    int getAge() {
        return age;
    }

    // Setter
    void setAge(int age) {
        this.age = age;
    }

    // Default constructor
    Artist() {
        this.name = "NA";
        this.age = 0;
    }

    // Parameterized constructor
    Artist(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}


// Painter is-a Artist
class Painter extends Artist {

    String paintingStyle;
    String mediumUsed;
    int numberOfPaintings;

    // Default constructor
    Painter() {
        super();
        this.paintingStyle = "NA";
        this.mediumUsed = "NA";
        this.numberOfPaintings = 0;
    }

    // Parameterized constructor
    Painter(String name, int age, String paintingStyle,String mediumUsed, int numberOfPaintings) {
        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    // Getter
    String getPaintingStyle() {
        return paintingStyle;
    }

    // Setter
    void setPaintingStyle(String paintingStyle) {
        this.paintingStyle = paintingStyle;
    }

    // Getter
    String getMediumUsed() {
        return mediumUsed;
    }

    // Setter
    void setMediumUsed(String mediumUsed) {
        this.mediumUsed = mediumUsed;
    }

    // Getter
    int getNumberOfPaintings() {
        return numberOfPaintings;
    }

    // Setter
    void setNumberOfPaintings(int numberOfPaintings) {
        this.numberOfPaintings = numberOfPaintings;
    }

    void display() {
        super.display();
        System.out.println("Painting Style : " + this.paintingStyle);
        System.out.println("Medium Used : " + this.mediumUsed);
        System.out.println("Number Of Paintings : " + this.numberOfPaintings);
    }
}


// Musician is-a Artist
class Musician extends Artist {
    String instrument;
    String musicGenre;
    int numberOfAlbums;

    // Default constructor
    Musician() {
        super();
        this.instrument = "NA";
        this.musicGenre = "NA";
        this.numberOfAlbums = 0;
    }

    // Parameterized constructor
    Musician(String name, int age, String instrument, String musicGenre, int numberOfAlbums) {
        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    // Getter
    String getInstrument() {
        return instrument;
    }

    // Setter
    void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    // Getter
    String getMusicGenre() {
        return musicGenre;
    }

    // Setter
    void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    // Getter
    int getNumberOfAlbums() {
        return numberOfAlbums;
    }

    // Setter
    void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    void display() {
        super.display();

        System.out.println("Instrument : " + this.instrument);
        System.out.println("Music Genre : " + this.musicGenre);
        System.out.println("Number Of Albums : " + this.numberOfAlbums);
    }
}


// Actor is-a Artist
class Actor extends Artist {

    String filmIndustry;
    int numberOfMovies;

    // Default constructor
    Actor() {
        super();
        this.filmIndustry = "NA";
        this.numberOfMovies = 0;
    }

    // Parameterized constructor
    Actor(String name, int age, String filmIndustry,int numberOfMovies) {
        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    // Getter
    String getFilmIndustry() {
        return filmIndustry;
    }

    // Setter
    void setFilmIndustry(String filmIndustry) {
        this.filmIndustry = filmIndustry;
    }

    // Getter
    int getNumberOfMovies() {
        return numberOfMovies;
    }

    // Setter
    void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    void display() {
        super.display();
        System.out.println("Film Industry : " + this.filmIndustry);
        System.out.println("Number Of Movies : " + this.numberOfMovies);
    }
}


// Main class
class TestArtist {

    public static void main(String[] args) {

        System.out.println("Artist Details");

        Artist a = new Artist("Rahul", 30);
        a.display();
        System.out.println();

        System.out.println("Painter Details");
        Painter p = new Painter("Raja",45,"Realism","Oil Paint",50);
        p.display();
        System.out.println();

        System.out.println("Musician Details");
        Musician m = new Musician("Arijit Singh",38,"Vocal","Bollywood",10);
        m.display();
        System.out.println();

        System.out.println("Actor Details");
        Actor ac = new Actor("Amitabh Bachchan",83,"Bollywood",200);
        ac.display();
    }
}

