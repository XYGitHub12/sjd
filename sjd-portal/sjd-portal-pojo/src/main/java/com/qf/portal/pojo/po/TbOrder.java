package com.qf.portal.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrder {
    private Integer oid;

    private Date ordertime;

    private Double total;

    private Integer state;

    private Integer uid;

    private Integer itemid;

    private Integer shopid;

    private String payment;

    private Integer status;

    private List<TbOrderitem> tbOrderitem=new ArrayList<>();
    private TbUser tbUser;

    public List<TbOrderitem> getTbOrderitem() {
        return tbOrderitem;
    }

    public void setTbOrderitem(List<TbOrderitem> tbOrderitem) {
        this.tbOrderitem = tbOrderitem;
    }

    public TbUser getTbUser() {
        return tbUser;
    }

    public void setTbUser(TbUser tbUser) {
        this.tbUser = tbUser;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TbOrder{" +
                "oid=" + oid +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", state=" + state +
                ", uid=" + uid +
                ", itemid=" + itemid +
                ", shopid=" + shopid +
                ", payment='" + payment + '\'' +
                ", status=" + status +
                ", tbOrderitem=" + tbOrderitem +
                ", tbUser=" + tbUser +
                '}';
    }
}