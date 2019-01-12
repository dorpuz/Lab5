public class MP3Player extends MusicPlayer {

    public MP3Player(String status, Song[] songs) {
        super(status);
        Song[] mp3_songs = songs;
    }


    public String play(){
        this.status = "Gra odtwarzacz MP3";
        System.out.println("Gra odtwarzacz MP3 - " );
        return status;
    }
    public String pause(){
        System.out.println("Odtwarzacz MP3 - Pauza");
        return "pause";
    }

    public String next(){
        System.out.println("Następna");
        return "next";
    }
    public String prev(){
        System.out.println("Poprzednia");
        return "prev";
    }

}
