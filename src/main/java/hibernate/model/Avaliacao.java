    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author 20181BSI0229
 */

@Entity
@Table(name = "avaliacao")

public class Avaliacao {
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")

    private int id;

    private float nota;

    public Avaliacao setNota(float nota) {
        this.nota = nota;

        return this;
    }

    public float getNota() {
        return nota;
    }
}
