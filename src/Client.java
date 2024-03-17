public class Client {


    public Client(int ID, String name, String surename) {
        this.ID = ID;
        Name = name;
        Surename = surename;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurename() {
        return Surename;
    }

    public void setSurename(String surename) {
        Surename = surename;
    }

    private int ID;
    private String Name;
    private String Surename;
}
