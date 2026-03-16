class Movie {
    String title;
    String type;
    int duration;
    String showtime;

    Movie(String t, String g, int d, String s) {
        title=t;
        type=g;
        duration=d;
        showtime=s;
    }

    void showMovie() {
        System.out.println("Movie:"+title+" Type:"+type+" Duration:"+duration+" Show:"+showtime);
    }
}