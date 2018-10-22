package sample.Objects;

public class Usuario {

    private int usrID;
    private String usrName;
    private String usrPassword;

    public Usuario() {}

    public Usuario(int usrID, String usrName, String usrPassword) {
        this.usrID = usrID;
        this.usrName = usrName;
        this.usrPassword = usrPassword;
    }

    public int getUsrID() {
        return usrID;
    }

    public void setUsrID(int usrID) {
        this.usrID = usrID;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }
}
