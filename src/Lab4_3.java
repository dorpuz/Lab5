public class Lab4_3 {
    public static void main(String[] args) {


        Song[] songs = {new Song("Ala","A","Album1"),
                new Song("Basia","B","Album2"),
                new Song("Czarek","C","Album2"),
                new Song("Jan","1","mp3_1"),
                new Song("Jaś","2","mp3_2"),
                new Song("Jasiu","2","mp3_3")};




        MusicPlayer player1 = new MP3Player("On",songs);
        MusicPlayer player2 = new CDPlayer("off", songs);
        player1.play();
        player2.play();
        player2.prev();
        player2.next();
        player1.pause();

    }
}
