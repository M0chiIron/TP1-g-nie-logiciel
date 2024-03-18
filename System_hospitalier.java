package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {
        
        return "requête analysée";
    /*Cette méthode examine les détails d'une requête donnée afin de comprendre son objectif, elle retourne un message indiquant que la requête a été analysée avec succcès*/
    }

    private String comparerDonnes() {
        
        return "Cluster trouvé";
	/*Cette méthode compare les données des requêtes précedemment reçues pour identifier des similarités.  Elle retourne un message signalant la découverte d'un cluster des données*/
    }

}
