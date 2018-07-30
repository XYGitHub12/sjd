package com.qf.portal.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPBrandIsNull() {
            addCriterion("p_brand is null");
            return (Criteria) this;
        }

        public Criteria andPBrandIsNotNull() {
            addCriterion("p_brand is not null");
            return (Criteria) this;
        }

        public Criteria andPBrandEqualTo(String value) {
            addCriterion("p_brand =", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandNotEqualTo(String value) {
            addCriterion("p_brand <>", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandGreaterThan(String value) {
            addCriterion("p_brand >", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandGreaterThanOrEqualTo(String value) {
            addCriterion("p_brand >=", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandLessThan(String value) {
            addCriterion("p_brand <", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandLessThanOrEqualTo(String value) {
            addCriterion("p_brand <=", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandLike(String value) {
            addCriterion("p_brand like", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandNotLike(String value) {
            addCriterion("p_brand not like", value, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandIn(List<String> values) {
            addCriterion("p_brand in", values, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandNotIn(List<String> values) {
            addCriterion("p_brand not in", values, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandBetween(String value1, String value2) {
            addCriterion("p_brand between", value1, value2, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPBrandNotBetween(String value1, String value2) {
            addCriterion("p_brand not between", value1, value2, "pBrand");
            return (Criteria) this;
        }

        public Criteria andPPriceIsNull() {
            addCriterion("p_price is null");
            return (Criteria) this;
        }

        public Criteria andPPriceIsNotNull() {
            addCriterion("p_price is not null");
            return (Criteria) this;
        }

        public Criteria andPPriceEqualTo(Double value) {
            addCriterion("p_price =", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotEqualTo(Double value) {
            addCriterion("p_price <>", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceGreaterThan(Double value) {
            addCriterion("p_price >", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("p_price >=", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceLessThan(Double value) {
            addCriterion("p_price <", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceLessThanOrEqualTo(Double value) {
            addCriterion("p_price <=", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceIn(List<Double> values) {
            addCriterion("p_price in", values, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotIn(List<Double> values) {
            addCriterion("p_price not in", values, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceBetween(Double value1, Double value2) {
            addCriterion("p_price between", value1, value2, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotBetween(Double value1, Double value2) {
            addCriterion("p_price not between", value1, value2, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPRamIsNull() {
            addCriterion("p_RAM is null");
            return (Criteria) this;
        }

        public Criteria andPRamIsNotNull() {
            addCriterion("p_RAM is not null");
            return (Criteria) this;
        }

        public Criteria andPRamEqualTo(String value) {
            addCriterion("p_RAM =", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamNotEqualTo(String value) {
            addCriterion("p_RAM <>", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamGreaterThan(String value) {
            addCriterion("p_RAM >", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamGreaterThanOrEqualTo(String value) {
            addCriterion("p_RAM >=", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamLessThan(String value) {
            addCriterion("p_RAM <", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamLessThanOrEqualTo(String value) {
            addCriterion("p_RAM <=", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamLike(String value) {
            addCriterion("p_RAM like", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamNotLike(String value) {
            addCriterion("p_RAM not like", value, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamIn(List<String> values) {
            addCriterion("p_RAM in", values, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamNotIn(List<String> values) {
            addCriterion("p_RAM not in", values, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamBetween(String value1, String value2) {
            addCriterion("p_RAM between", value1, value2, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRamNotBetween(String value1, String value2) {
            addCriterion("p_RAM not between", value1, value2, "pRam");
            return (Criteria) this;
        }

        public Criteria andPRomIsNull() {
            addCriterion("p_ROM is null");
            return (Criteria) this;
        }

        public Criteria andPRomIsNotNull() {
            addCriterion("p_ROM is not null");
            return (Criteria) this;
        }

        public Criteria andPRomEqualTo(String value) {
            addCriterion("p_ROM =", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomNotEqualTo(String value) {
            addCriterion("p_ROM <>", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomGreaterThan(String value) {
            addCriterion("p_ROM >", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomGreaterThanOrEqualTo(String value) {
            addCriterion("p_ROM >=", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomLessThan(String value) {
            addCriterion("p_ROM <", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomLessThanOrEqualTo(String value) {
            addCriterion("p_ROM <=", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomLike(String value) {
            addCriterion("p_ROM like", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomNotLike(String value) {
            addCriterion("p_ROM not like", value, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomIn(List<String> values) {
            addCriterion("p_ROM in", values, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomNotIn(List<String> values) {
            addCriterion("p_ROM not in", values, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomBetween(String value1, String value2) {
            addCriterion("p_ROM between", value1, value2, "pRom");
            return (Criteria) this;
        }

        public Criteria andPRomNotBetween(String value1, String value2) {
            addCriterion("p_ROM not between", value1, value2, "pRom");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeIsNull() {
            addCriterion("p_screen_size is null");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeIsNotNull() {
            addCriterion("p_screen_size is not null");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeEqualTo(String value) {
            addCriterion("p_screen_size =", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeNotEqualTo(String value) {
            addCriterion("p_screen_size <>", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeGreaterThan(String value) {
            addCriterion("p_screen_size >", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeGreaterThanOrEqualTo(String value) {
            addCriterion("p_screen_size >=", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeLessThan(String value) {
            addCriterion("p_screen_size <", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeLessThanOrEqualTo(String value) {
            addCriterion("p_screen_size <=", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeLike(String value) {
            addCriterion("p_screen_size like", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeNotLike(String value) {
            addCriterion("p_screen_size not like", value, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeIn(List<String> values) {
            addCriterion("p_screen_size in", values, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeNotIn(List<String> values) {
            addCriterion("p_screen_size not in", values, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeBetween(String value1, String value2) {
            addCriterion("p_screen_size between", value1, value2, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPScreenSizeNotBetween(String value1, String value2) {
            addCriterion("p_screen_size not between", value1, value2, "pScreenSize");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeIsNull() {
            addCriterion("p_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeIsNotNull() {
            addCriterion("p_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeEqualTo(Date value) {
            addCriterion("p_upload_time =", value, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeNotEqualTo(Date value) {
            addCriterion("p_upload_time <>", value, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeGreaterThan(Date value) {
            addCriterion("p_upload_time >", value, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_upload_time >=", value, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeLessThan(Date value) {
            addCriterion("p_upload_time <", value, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("p_upload_time <=", value, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeIn(List<Date> values) {
            addCriterion("p_upload_time in", values, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeNotIn(List<Date> values) {
            addCriterion("p_upload_time not in", values, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeBetween(Date value1, Date value2) {
            addCriterion("p_upload_time between", value1, value2, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("p_upload_time not between", value1, value2, "pUploadTime");
            return (Criteria) this;
        }

        public Criteria andPSalesIsNull() {
            addCriterion("p_sales is null");
            return (Criteria) this;
        }

        public Criteria andPSalesIsNotNull() {
            addCriterion("p_sales is not null");
            return (Criteria) this;
        }

        public Criteria andPSalesEqualTo(Long value) {
            addCriterion("p_sales =", value, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesNotEqualTo(Long value) {
            addCriterion("p_sales <>", value, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesGreaterThan(Long value) {
            addCriterion("p_sales >", value, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("p_sales >=", value, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesLessThan(Long value) {
            addCriterion("p_sales <", value, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesLessThanOrEqualTo(Long value) {
            addCriterion("p_sales <=", value, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesIn(List<Long> values) {
            addCriterion("p_sales in", values, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesNotIn(List<Long> values) {
            addCriterion("p_sales not in", values, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesBetween(Long value1, Long value2) {
            addCriterion("p_sales between", value1, value2, "pSales");
            return (Criteria) this;
        }

        public Criteria andPSalesNotBetween(Long value1, Long value2) {
            addCriterion("p_sales not between", value1, value2, "pSales");
            return (Criteria) this;
        }

        public Criteria andPPictureIsNull() {
            addCriterion("p_picture is null");
            return (Criteria) this;
        }

        public Criteria andPPictureIsNotNull() {
            addCriterion("p_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPPictureEqualTo(String value) {
            addCriterion("p_picture =", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotEqualTo(String value) {
            addCriterion("p_picture <>", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureGreaterThan(String value) {
            addCriterion("p_picture >", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureGreaterThanOrEqualTo(String value) {
            addCriterion("p_picture >=", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureLessThan(String value) {
            addCriterion("p_picture <", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureLessThanOrEqualTo(String value) {
            addCriterion("p_picture <=", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureLike(String value) {
            addCriterion("p_picture like", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotLike(String value) {
            addCriterion("p_picture not like", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureIn(List<String> values) {
            addCriterion("p_picture in", values, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotIn(List<String> values) {
            addCriterion("p_picture not in", values, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureBetween(String value1, String value2) {
            addCriterion("p_picture between", value1, value2, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotBetween(String value1, String value2) {
            addCriterion("p_picture not between", value1, value2, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPDescIsNull() {
            addCriterion("p_desc is null");
            return (Criteria) this;
        }

        public Criteria andPDescIsNotNull() {
            addCriterion("p_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPDescEqualTo(String value) {
            addCriterion("p_desc =", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotEqualTo(String value) {
            addCriterion("p_desc <>", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThan(String value) {
            addCriterion("p_desc >", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThanOrEqualTo(String value) {
            addCriterion("p_desc >=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThan(String value) {
            addCriterion("p_desc <", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThanOrEqualTo(String value) {
            addCriterion("p_desc <=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLike(String value) {
            addCriterion("p_desc like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotLike(String value) {
            addCriterion("p_desc not like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescIn(List<String> values) {
            addCriterion("p_desc in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotIn(List<String> values) {
            addCriterion("p_desc not in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescBetween(String value1, String value2) {
            addCriterion("p_desc between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotBetween(String value1, String value2) {
            addCriterion("p_desc not between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(String value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(String value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(String value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(String value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(String value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(String value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLike(String value) {
            addCriterion("p_type like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotLike(String value) {
            addCriterion("p_type not like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<String> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<String> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(String value1, String value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(String value1, String value2) {
            addCriterion("p_type not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoIsNull() {
            addCriterion("p_type_info is null");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoIsNotNull() {
            addCriterion("p_type_info is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoEqualTo(String value) {
            addCriterion("p_type_info =", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoNotEqualTo(String value) {
            addCriterion("p_type_info <>", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoGreaterThan(String value) {
            addCriterion("p_type_info >", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("p_type_info >=", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoLessThan(String value) {
            addCriterion("p_type_info <", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoLessThanOrEqualTo(String value) {
            addCriterion("p_type_info <=", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoLike(String value) {
            addCriterion("p_type_info like", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoNotLike(String value) {
            addCriterion("p_type_info not like", value, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoIn(List<String> values) {
            addCriterion("p_type_info in", values, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoNotIn(List<String> values) {
            addCriterion("p_type_info not in", values, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoBetween(String value1, String value2) {
            addCriterion("p_type_info between", value1, value2, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPTypeInfoNotBetween(String value1, String value2) {
            addCriterion("p_type_info not between", value1, value2, "pTypeInfo");
            return (Criteria) this;
        }

        public Criteria andPInventoryIsNull() {
            addCriterion("p_inventory is null");
            return (Criteria) this;
        }

        public Criteria andPInventoryIsNotNull() {
            addCriterion("p_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andPInventoryEqualTo(Long value) {
            addCriterion("p_inventory =", value, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryNotEqualTo(Long value) {
            addCriterion("p_inventory <>", value, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryGreaterThan(Long value) {
            addCriterion("p_inventory >", value, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryGreaterThanOrEqualTo(Long value) {
            addCriterion("p_inventory >=", value, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryLessThan(Long value) {
            addCriterion("p_inventory <", value, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryLessThanOrEqualTo(Long value) {
            addCriterion("p_inventory <=", value, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryIn(List<Long> values) {
            addCriterion("p_inventory in", values, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryNotIn(List<Long> values) {
            addCriterion("p_inventory not in", values, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryBetween(Long value1, Long value2) {
            addCriterion("p_inventory between", value1, value2, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPInventoryNotBetween(Long value1, Long value2) {
            addCriterion("p_inventory not between", value1, value2, "pInventory");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNull() {
            addCriterion("p_status is null");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNotNull() {
            addCriterion("p_status is not null");
            return (Criteria) this;
        }

        public Criteria andPStatusEqualTo(Integer value) {
            addCriterion("p_status =", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotEqualTo(Integer value) {
            addCriterion("p_status <>", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThan(Integer value) {
            addCriterion("p_status >", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_status >=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThan(Integer value) {
            addCriterion("p_status <", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThanOrEqualTo(Integer value) {
            addCriterion("p_status <=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusIn(List<Integer> values) {
            addCriterion("p_status in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotIn(List<Integer> values) {
            addCriterion("p_status not in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusBetween(Integer value1, Integer value2) {
            addCriterion("p_status between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("p_status not between", value1, value2, "pStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}