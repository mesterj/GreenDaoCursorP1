package tries.joco.kite.com.greendaocursorp1;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by meste on 2018. 03. 19..
 */

@Entity
public class Proba {

    @Id(autoincrement = true)
    private Long id;
    
    private String name;

    private String szin;

    @Generated(hash = 2042131130)
    public Proba(Long id, String name, String szin) {
        this.id = id;
        this.name = name;
        this.szin = szin;
    }

    @Generated(hash = 930809158)
    public Proba() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSzin() {
        return this.szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }


}

