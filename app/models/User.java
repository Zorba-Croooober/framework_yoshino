package models;

import javax.persistence.*;
// import javax.persistence.Id;
 
import io.ebean.Model;
// import io.ebean.annotation.*;
import java.util.List;
 
@Entity
public class User extends Model{
    @Id
    private Long id;

    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy="user")
    private List<Entry> Entries;

    public Long getUserId(){
        return id;
    }
    public void setUserId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public List<Entry> getEntries(){
        return Entries;
    }
    public void setEntries(List<Entry> Entries){
        this.Entries = Entries;
    }
}
