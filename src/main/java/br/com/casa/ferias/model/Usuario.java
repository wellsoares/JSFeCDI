package br.com.casa.ferias.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author well
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    private Integer id;
    
    private String name;
    private String password;

    @Override
    public String toString() {
        return this.name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
