
public class Gamer {
    private String nickname;
    private Boolean isActive;

    public Gamer(String nickname, Boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname() {
        return nickname;
    }

    public Boolean getIsActive() {
        return isActive;
    }
}