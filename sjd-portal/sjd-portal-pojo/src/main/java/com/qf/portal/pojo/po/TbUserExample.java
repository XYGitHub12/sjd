package com.qf.portal.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUheadIsNull() {
            addCriterion("uhead is null");
            return (Criteria) this;
        }

        public Criteria andUheadIsNotNull() {
            addCriterion("uhead is not null");
            return (Criteria) this;
        }

        public Criteria andUheadEqualTo(String value) {
            addCriterion("uhead =", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotEqualTo(String value) {
            addCriterion("uhead <>", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadGreaterThan(String value) {
            addCriterion("uhead >", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadGreaterThanOrEqualTo(String value) {
            addCriterion("uhead >=", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadLessThan(String value) {
            addCriterion("uhead <", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadLessThanOrEqualTo(String value) {
            addCriterion("uhead <=", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadLike(String value) {
            addCriterion("uhead like", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotLike(String value) {
            addCriterion("uhead not like", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadIn(List<String> values) {
            addCriterion("uhead in", values, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotIn(List<String> values) {
            addCriterion("uhead not in", values, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadBetween(String value1, String value2) {
            addCriterion("uhead between", value1, value2, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotBetween(String value1, String value2) {
            addCriterion("uhead not between", value1, value2, "uhead");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNull() {
            addCriterion("upwd is null");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNotNull() {
            addCriterion("upwd is not null");
            return (Criteria) this;
        }

        public Criteria andUpwdEqualTo(String value) {
            addCriterion("upwd =", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotEqualTo(String value) {
            addCriterion("upwd <>", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThan(String value) {
            addCriterion("upwd >", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThanOrEqualTo(String value) {
            addCriterion("upwd >=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThan(String value) {
            addCriterion("upwd <", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThanOrEqualTo(String value) {
            addCriterion("upwd <=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLike(String value) {
            addCriterion("upwd like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotLike(String value) {
            addCriterion("upwd not like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdIn(List<String> values) {
            addCriterion("upwd in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotIn(List<String> values) {
            addCriterion("upwd not in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdBetween(String value1, String value2) {
            addCriterion("upwd between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotBetween(String value1, String value2) {
            addCriterion("upwd not between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("utype is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("utype is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(Integer value) {
            addCriterion("utype =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(Integer value) {
            addCriterion("utype <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(Integer value) {
            addCriterion("utype >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("utype >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(Integer value) {
            addCriterion("utype <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(Integer value) {
            addCriterion("utype <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<Integer> values) {
            addCriterion("utype in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<Integer> values) {
            addCriterion("utype not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(Integer value1, Integer value2) {
            addCriterion("utype between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("utype not between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIsNull() {
            addCriterion("ubirthday is null");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIsNotNull() {
            addCriterion("ubirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday =", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday <>", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("ubirthday >", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday >=", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("ubirthday <", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday <=", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("ubirthday in", values, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("ubirthday not in", values, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ubirthday between", value1, value2, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ubirthday not between", value1, value2, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("usex is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("usex is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("usex =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("usex <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("usex >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("usex >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("usex <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("usex <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("usex like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("usex not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("usex in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("usex not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("usex between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("usex not between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUreceiverIsNull() {
            addCriterion("ureceiver is null");
            return (Criteria) this;
        }

        public Criteria andUreceiverIsNotNull() {
            addCriterion("ureceiver is not null");
            return (Criteria) this;
        }

        public Criteria andUreceiverEqualTo(String value) {
            addCriterion("ureceiver =", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverNotEqualTo(String value) {
            addCriterion("ureceiver <>", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverGreaterThan(String value) {
            addCriterion("ureceiver >", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverGreaterThanOrEqualTo(String value) {
            addCriterion("ureceiver >=", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverLessThan(String value) {
            addCriterion("ureceiver <", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverLessThanOrEqualTo(String value) {
            addCriterion("ureceiver <=", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverLike(String value) {
            addCriterion("ureceiver like", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverNotLike(String value) {
            addCriterion("ureceiver not like", value, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverIn(List<String> values) {
            addCriterion("ureceiver in", values, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverNotIn(List<String> values) {
            addCriterion("ureceiver not in", values, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverBetween(String value1, String value2) {
            addCriterion("ureceiver between", value1, value2, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUreceiverNotBetween(String value1, String value2) {
            addCriterion("ureceiver not between", value1, value2, "ureceiver");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNull() {
            addCriterion("uaddress is null");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNotNull() {
            addCriterion("uaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUaddressEqualTo(String value) {
            addCriterion("uaddress =", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotEqualTo(String value) {
            addCriterion("uaddress <>", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThan(String value) {
            addCriterion("uaddress >", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThanOrEqualTo(String value) {
            addCriterion("uaddress >=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThan(String value) {
            addCriterion("uaddress <", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThanOrEqualTo(String value) {
            addCriterion("uaddress <=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLike(String value) {
            addCriterion("uaddress like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotLike(String value) {
            addCriterion("uaddress not like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressIn(List<String> values) {
            addCriterion("uaddress in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotIn(List<String> values) {
            addCriterion("uaddress not in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressBetween(String value1, String value2) {
            addCriterion("uaddress between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotBetween(String value1, String value2) {
            addCriterion("uaddress not between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUstatusIsNull() {
            addCriterion("ustatus is null");
            return (Criteria) this;
        }

        public Criteria andUstatusIsNotNull() {
            addCriterion("ustatus is not null");
            return (Criteria) this;
        }

        public Criteria andUstatusEqualTo(Integer value) {
            addCriterion("ustatus =", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotEqualTo(Integer value) {
            addCriterion("ustatus <>", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusGreaterThan(Integer value) {
            addCriterion("ustatus >", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ustatus >=", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusLessThan(Integer value) {
            addCriterion("ustatus <", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ustatus <=", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusIn(List<Integer> values) {
            addCriterion("ustatus in", values, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotIn(List<Integer> values) {
            addCriterion("ustatus not in", values, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusBetween(Integer value1, Integer value2) {
            addCriterion("ustatus between", value1, value2, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ustatus not between", value1, value2, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUlevelIsNull() {
            addCriterion("ulevel is null");
            return (Criteria) this;
        }

        public Criteria andUlevelIsNotNull() {
            addCriterion("ulevel is not null");
            return (Criteria) this;
        }

        public Criteria andUlevelEqualTo(Integer value) {
            addCriterion("ulevel =", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotEqualTo(Integer value) {
            addCriterion("ulevel <>", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThan(Integer value) {
            addCriterion("ulevel >", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ulevel >=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThan(Integer value) {
            addCriterion("ulevel <", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThanOrEqualTo(Integer value) {
            addCriterion("ulevel <=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelIn(List<Integer> values) {
            addCriterion("ulevel in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotIn(List<Integer> values) {
            addCriterion("ulevel not in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelBetween(Integer value1, Integer value2) {
            addCriterion("ulevel between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ulevel not between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUquestionIsNull() {
            addCriterion("uquestion is null");
            return (Criteria) this;
        }

        public Criteria andUquestionIsNotNull() {
            addCriterion("uquestion is not null");
            return (Criteria) this;
        }

        public Criteria andUquestionEqualTo(String value) {
            addCriterion("uquestion =", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionNotEqualTo(String value) {
            addCriterion("uquestion <>", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionGreaterThan(String value) {
            addCriterion("uquestion >", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionGreaterThanOrEqualTo(String value) {
            addCriterion("uquestion >=", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionLessThan(String value) {
            addCriterion("uquestion <", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionLessThanOrEqualTo(String value) {
            addCriterion("uquestion <=", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionLike(String value) {
            addCriterion("uquestion like", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionNotLike(String value) {
            addCriterion("uquestion not like", value, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionIn(List<String> values) {
            addCriterion("uquestion in", values, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionNotIn(List<String> values) {
            addCriterion("uquestion not in", values, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionBetween(String value1, String value2) {
            addCriterion("uquestion between", value1, value2, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUquestionNotBetween(String value1, String value2) {
            addCriterion("uquestion not between", value1, value2, "uquestion");
            return (Criteria) this;
        }

        public Criteria andUanswerIsNull() {
            addCriterion("uanswer is null");
            return (Criteria) this;
        }

        public Criteria andUanswerIsNotNull() {
            addCriterion("uanswer is not null");
            return (Criteria) this;
        }

        public Criteria andUanswerEqualTo(String value) {
            addCriterion("uanswer =", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotEqualTo(String value) {
            addCriterion("uanswer <>", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerGreaterThan(String value) {
            addCriterion("uanswer >", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerGreaterThanOrEqualTo(String value) {
            addCriterion("uanswer >=", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerLessThan(String value) {
            addCriterion("uanswer <", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerLessThanOrEqualTo(String value) {
            addCriterion("uanswer <=", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerLike(String value) {
            addCriterion("uanswer like", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotLike(String value) {
            addCriterion("uanswer not like", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerIn(List<String> values) {
            addCriterion("uanswer in", values, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotIn(List<String> values) {
            addCriterion("uanswer not in", values, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerBetween(String value1, String value2) {
            addCriterion("uanswer between", value1, value2, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotBetween(String value1, String value2) {
            addCriterion("uanswer not between", value1, value2, "uanswer");
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