/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import streaming.spring.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.FilmDAO;
import streaming.dao.SerieDAO;
import streaming.entity.Film;
import streaming.entity.Serie;

/**
 *
 * @author ETY
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class Tests {

    @Autowired
    private FilmDAO fdao;

    @Autowired
    private SerieDAO sdao;
//    
//    @Before
//    @Transactional
//    public void avant (){
//        //supprime tout les films
//        dao.deleteAll();
//        
//        //ajoute 2 film
//        dao.save(new Film(1L, "La communauté de l'anneau", "Bilbon prend sa retraite, Frodon doit partir ...", 2008, 210));
//        dao.save(new Film(2L, "Les deux tours", "Frodon par avec Sam, la communauté est séparée ...", 2009, 180));
//        dao.save(new Film(3L, "Le retour du roi", "Les terres du milieux ce réveillent, Sauron est en mauvaise posture ...", 2010, 270));
//    }
//    
//    @Test
//    public void testTroisFilms(){
//        Film one = dao.findOne(1L);
//        Film two = dao.findOne(2L);
//        Film three = dao.findOne(3L);
//        
//        Assert.assertEquals("La communauté de l'anneau", one.getTitre());
//        Assert.assertEquals("Les deux tours", two.getTitre());
//        Assert.assertEquals("Le retour du roi", three.getTitre());
//    }

    @Test
    public void testFilm() {
        //dao.findAll();

        fdao.save(new Film(4L, "Arnaqueurs", "Lebouquet final, Lol ...", 2016, 280));

        //fdao.deleteAll();
    }

    @Test
    public void testSerie() {
        //sdao.save(new Serie(1L, "Bureau des légendes", "blabla canal", ));
        Serie serie = new Serie();
        serie.setTitre("Bureau des légendes");
        sdao.save(serie);
    }

}
