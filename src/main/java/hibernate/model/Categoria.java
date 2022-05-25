package hibernate.model;

import modelo.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import modelo.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author 20132bsi0079
 */

@Entity
@Table(name = "categoria")

public class Categoria {
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    
    private int id;
    
    private String nome;

    public Categoria setNome(String nome) {
        this.nome = nome;

        return this;
    }

    public String getNome() {
        return nome;
    }
}
