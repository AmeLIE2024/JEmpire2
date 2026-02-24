public class Maison {


    private String nomMaison;
    private List<Villageois> ListVillageois

    public Maison(String nomMaison, List<Villageois> listVillageois) {
        this.nomMaison = nomMaison;
        ListVillageois = listVillageois;
    }

    public String getNomMaison() {
        return nomMaison;
    }

    public void setNomMaison(String nomMaison) {
        this.nomMaison = nomMaison;
    }

    public List<Villageois> getListVillageois() {
        return ListVillageois;
    }

    public void setListVillageois(List<Villageois> listVillageois) {
        ListVillageois = listVillageois;
    }
}
