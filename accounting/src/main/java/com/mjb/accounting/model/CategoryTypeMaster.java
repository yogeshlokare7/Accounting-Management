/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjb.accounting.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author YogeshL
 */
@Entity
@Table(name = "category_type_master")
public class CategoryTypeMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categorytype_id")
    private Integer categorytypeId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public CategoryTypeMaster() {
    }

    public CategoryTypeMaster(Integer categorytypeId) {
        this.categorytypeId = categorytypeId;
    }

    public Integer getCategorytypeId() {
        return categorytypeId;
    }

    public void setCategorytypeId(Integer categorytypeId) {
        this.categorytypeId = categorytypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categorytypeId != null ? categorytypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryTypeMaster)) {
            return false;
        }
        CategoryTypeMaster other = (CategoryTypeMaster) object;
        if ((this.categorytypeId == null && other.categorytypeId != null) || (this.categorytypeId != null && !this.categorytypeId.equals(other.categorytypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mjb.model.CategoryTypeMaster[ categorytypeId=" + categorytypeId + " ]";
    }
    
}
