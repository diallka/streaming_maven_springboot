/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;
import streaming.entity.Lien;

/**
 *
 * @author ETY
 */
public interface FilmDAO extends CrudRepository<Film, Long>{
    
    //1. Le film pour un titre donné
    public Film findOneByTitre(String t);
    
    //2. Les films pour une année donnée
    public List <Film> findAllByAnnee (int annee);
    
    //3. Les films pour un titre donné ou un année donnée
    public List <Film> findAllByTitreOrAnnee (String titre, int annee);
    
    //4. Les films pour un titre et une année donnée
    public List<Film> findAllByTitreAndAnnee (String titre, int annee);
    
    //6. Les films pour un pays id donnée
    public List<Film> findOneById (Long id);
    
    //8. Les films pour un acteur (nom/prénom) donné
    public List<Film> findAllByActeurs(String nom, String prenom);
    
    //9. Le nombre de films pour un acteur donné
    public List<Film> countAllByActeurs(String nom, String prenom);
    
    //10. Les films pour un réalisateur donné, classés par titre
    public List<Film> findAllByRealisateursOrderByTitreAsc(String nom, String prenom);
    
    //11. Le nombre de films pour un réalisateur donné
    public List<Film> countAllByRealisateurs(String nom, String prenom);
    
    //12. Les films d'un pays donné, pour un genre donné, un réalisateur donné et un acteur donné
    
    
    
    

}
