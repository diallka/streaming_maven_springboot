/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import streaming.entity.Film;
import streaming.entity.Serie;

/**
 *
 * @author pro
 */
@Component
@Aspect
public class LoggingAspect {
    //Bien respecter le nom du package

    @Before("execution(* streaming.dao.FilmDAO.*(..))") //Ceci est le before d'aspect différent de celui de test
    //recuperer et afficher logs avant méthode save de Film DAO
    public void logFilm(JoinPoint jp1) {
        Film film = (Film) jp1.getArgs()[0];
        System.out.println(">>> le film <<" + film.getTitre() + ">> a été sauvegardé avec succès");
    }

    //recuperer et afficher logs après méthode save de Film DAO
    @After("execution(* streaming.dao.SerieDAO.*(..))") //Ceci est le before d'aspect différent de celui de test
    public void logSerie(JoinPoint jp2) {
        Serie serie = (Serie) jp2.getArgs()[0];
        System.out.println(">>> la serie <<" + serie.getTitre() + ">> a bien été ajoutée ");
    }

}
