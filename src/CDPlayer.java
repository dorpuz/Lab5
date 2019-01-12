public class CDPlayer extends MusicPlayer {

    public CDPlayer(String status, Song[] songs) {
        super(status);
        Song[] cd_songs = songs;
    }



    public String play(){
        status = "playing";
        System.out.println("Gra odtwarzacz CD");
        return status;
    }
    public String pause(){
        System.out.println("Odtwarzacz CD - Pauza");
        status = "pause";
        return status;
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
