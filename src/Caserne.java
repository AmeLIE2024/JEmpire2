import java.util.List;

public class Caserne {

    private String nomCaserne;
    private List<Soldats> ListSoldats;
    private List<Eclaireus> ListEclaireurs;


    public Caserne(String nomCaserne, List<Soldats> listSoldats, List<Eclaireus> listEclaireurs) {
        this.nomCaserne = nomCaserne;
        ListSoldats = listSoldats;
        ListEclaireurs = listEclaireurs;
    }

    public String getNomCaserne() {
        return nomCaserne;
    }

    public void setNomCaserne(String nomCaserne) {
        this.nomCaserne = nomCaserne;
    }

    public List<Soldats> getListSoldats() {
        return ListSoldats;
    }

    public void setListSoldats(List<Soldats> listSoldats) {
        ListSoldats = listSoldats;
    }

    public List<Eclaireus> getListEclaireurs() {
        return ListEclaireurs;
    }

    public void setListEclaireurs(List<Eclaireus> listEclaireurs) {
        ListEclaireurs = listEclaireurs;
    }
}
