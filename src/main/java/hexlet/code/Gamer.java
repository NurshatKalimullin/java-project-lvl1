package hexlet.code;

public class Gamer {

    private String gamerName;

    public String getGamerName() {
        return gamerName;
    }

    public Gamer withGamerName(String gamerName) {
        this.gamerName = gamerName;
        return this;
    }

}
