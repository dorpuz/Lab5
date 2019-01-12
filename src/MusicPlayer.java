abstract class MusicPlayer implements Player {
    String status;
    //Song[] songs;

    private Song[] library;
    private int current;

    public MusicPlayer(String status, Song[] library) {
        this.status = status;
        this.current = 0;
        this.library = library;
    }


}
