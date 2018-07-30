package com.qf.manager.pojo.po;

import java.util.Date;

public class TbProduct {
    private Integer pId;

    private String pName;

    private String pBrand;

    private Double pPrice;

    private String pRam;

    private String pRom;

    private String pScreenSize;

    private Date pUploadTime;

    private Long pSales;

    private String pPicture;

    private String pDesc;

    private String pType;

    private String pTypeInfo;

    private Long pInventory;

    private Integer pStatus;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand == null ? null : pBrand.trim();
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public String getpRam() {
        return pRam;
    }

    public void setpRam(String pRam) {
        this.pRam = pRam == null ? null : pRam.trim();
    }

    public String getpRom() {
        return pRom;
    }

    public void setpRom(String pRom) {
        this.pRom = pRom == null ? null : pRom.trim();
    }

    public String getpScreenSize() {
        return pScreenSize;
    }

    public void setpScreenSize(String pScreenSize) {
        this.pScreenSize = pScreenSize == null ? null : pScreenSize.trim();
    }

    public Date getpUploadTime() {
        return pUploadTime;
    }

    public void setpUploadTime(Date pUploadTime) {
        this.pUploadTime = pUploadTime;
    }

    public Long getpSales() {
        return pSales;
    }

    public void setpSales(Long pSales) {
        this.pSales = pSales;
    }

    public String getpPicture() {
        return pPicture;
    }

    public void setpPicture(String pPicture) {
        this.pPicture = pPicture == null ? null : pPicture.trim();
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc == null ? null : pDesc.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public String getpTypeInfo() {
        return pTypeInfo;
    }

    public void setpTypeInfo(String pTypeInfo) {
        this.pTypeInfo = pTypeInfo == null ? null : pTypeInfo.trim();
    }

    public Long getpInventory() {
        return pInventory;
    }

    public void setpInventory(Long pInventory) {
        this.pInventory = pInventory;
    }

    public Integer getpStatus() {
        return pStatus;
    }

    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }
}