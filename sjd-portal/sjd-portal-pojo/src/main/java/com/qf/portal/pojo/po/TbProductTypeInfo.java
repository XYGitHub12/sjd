package com.qf.portal.pojo.po;

public class TbProductTypeInfo {
    private Integer typeInfoId;

    private String typeInfoName;

    private Integer typeId;

    public Integer getTypeInfoId() {
        return typeInfoId;
    }

    public void setTypeInfoId(Integer typeInfoId) {
        this.typeInfoId = typeInfoId;
    }

    public String getTypeInfoName() {
        return typeInfoName;
    }

    public void setTypeInfoName(String typeInfoName) {
        this.typeInfoName = typeInfoName == null ? null : typeInfoName.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}