package model;

/**
 * Created by sg-0036936 on 03/01/2017.
 */
public class User {

    private int idUser;
    private String name;
    private String email;
    private String githubProfile;

    public User(){}

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithubProfile() {
        return githubProfile;
    }

    public void setGithubProfile(String githubProfile) {
        this.githubProfile = githubProfile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + idUser +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", githubProfile='" + githubProfile + '\'' +
                '}';
    }
}
