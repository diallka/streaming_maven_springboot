/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Lien;

/**
 *
 * @author ETY
 */
public interface LienDAO extends CrudRepository<Lien, Long>{
    
        //13. Tous les liens d'un film donné
    public List<Lien> findAllByFilmTitre(String titre);
    
    //16. Tous les liens d'un numéro d'épisode d'un numéro de saison d'une série donnée
    public List<Lien> findAllByEpisode_NumEpisode_AndEpisode_Saison_NumSaison_AndEpisode_Saison_SerieId (int numEpisode, int numSaison, long serieId);
}
