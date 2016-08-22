/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Serie;

/**
 *
 * @author ETY
 */
public interface SerieDAO extends CrudRepository<Serie, Long>{
    
    
}
