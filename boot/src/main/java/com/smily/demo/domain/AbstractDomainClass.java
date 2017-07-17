package com.smily.demo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
@MappedSuperclass
public class AbstractDomainClass implements DomainObject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    
    @Version
    private Integer version;
    
    private Date dateCreated;
    private Date lastUpdated;
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getVersion() {
        return version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Date getLastUpdated() {
        return lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
