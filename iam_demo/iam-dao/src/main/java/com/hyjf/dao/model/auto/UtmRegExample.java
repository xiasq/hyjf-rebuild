package com.hyjf.dao.model.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UtmRegExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UtmRegExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUtmIdIsNull() {
            addCriterion("utm_id is null");
            return (Criteria) this;
        }

        public Criteria andUtmIdIsNotNull() {
            addCriterion("utm_id is not null");
            return (Criteria) this;
        }

        public Criteria andUtmIdEqualTo(Integer value) {
            addCriterion("utm_id =", value, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdNotEqualTo(Integer value) {
            addCriterion("utm_id <>", value, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdGreaterThan(Integer value) {
            addCriterion("utm_id >", value, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("utm_id >=", value, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdLessThan(Integer value) {
            addCriterion("utm_id <", value, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdLessThanOrEqualTo(Integer value) {
            addCriterion("utm_id <=", value, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdIn(List<Integer> values) {
            addCriterion("utm_id in", values, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdNotIn(List<Integer> values) {
            addCriterion("utm_id not in", values, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdBetween(Integer value1, Integer value2) {
            addCriterion("utm_id between", value1, value2, "utmId");
            return (Criteria) this;
        }

        public Criteria andUtmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("utm_id not between", value1, value2, "utmId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeIsNull() {
            addCriterion("invest_time is null");
            return (Criteria) this;
        }

        public Criteria andInvestTimeIsNotNull() {
            addCriterion("invest_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvestTimeEqualTo(Integer value) {
            addCriterion("invest_time =", value, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeNotEqualTo(Integer value) {
            addCriterion("invest_time <>", value, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeGreaterThan(Integer value) {
            addCriterion("invest_time >", value, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_time >=", value, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeLessThan(Integer value) {
            addCriterion("invest_time <", value, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("invest_time <=", value, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeIn(List<Integer> values) {
            addCriterion("invest_time in", values, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeNotIn(List<Integer> values) {
            addCriterion("invest_time not in", values, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeBetween(Integer value1, Integer value2) {
            addCriterion("invest_time between", value1, value2, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_time not between", value1, value2, "investTime");
            return (Criteria) this;
        }

        public Criteria andInvestAmountIsNull() {
            addCriterion("invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvestAmountIsNotNull() {
            addCriterion("invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestAmountEqualTo(BigDecimal value) {
            addCriterion("invest_amount =", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotEqualTo(BigDecimal value) {
            addCriterion("invest_amount <>", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountGreaterThan(BigDecimal value) {
            addCriterion("invest_amount >", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invest_amount >=", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountLessThan(BigDecimal value) {
            addCriterion("invest_amount <", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invest_amount <=", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountIn(List<BigDecimal> values) {
            addCriterion("invest_amount in", values, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotIn(List<BigDecimal> values) {
            addCriterion("invest_amount not in", values, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invest_amount between", value1, value2, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invest_amount not between", value1, value2, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeIsNull() {
            addCriterion("invest_project_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeIsNotNull() {
            addCriterion("invest_project_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeEqualTo(String value) {
            addCriterion("invest_project_type =", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeNotEqualTo(String value) {
            addCriterion("invest_project_type <>", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeGreaterThan(String value) {
            addCriterion("invest_project_type >", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invest_project_type >=", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeLessThan(String value) {
            addCriterion("invest_project_type <", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("invest_project_type <=", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeLike(String value) {
            addCriterion("invest_project_type like", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeNotLike(String value) {
            addCriterion("invest_project_type not like", value, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeIn(List<String> values) {
            addCriterion("invest_project_type in", values, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeNotIn(List<String> values) {
            addCriterion("invest_project_type not in", values, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeBetween(String value1, String value2) {
            addCriterion("invest_project_type between", value1, value2, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectTypeNotBetween(String value1, String value2) {
            addCriterion("invest_project_type not between", value1, value2, "investProjectType");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodIsNull() {
            addCriterion("invest_project_period is null");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodIsNotNull() {
            addCriterion("invest_project_period is not null");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodEqualTo(String value) {
            addCriterion("invest_project_period =", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodNotEqualTo(String value) {
            addCriterion("invest_project_period <>", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodGreaterThan(String value) {
            addCriterion("invest_project_period >", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("invest_project_period >=", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodLessThan(String value) {
            addCriterion("invest_project_period <", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodLessThanOrEqualTo(String value) {
            addCriterion("invest_project_period <=", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodLike(String value) {
            addCriterion("invest_project_period like", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodNotLike(String value) {
            addCriterion("invest_project_period not like", value, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodIn(List<String> values) {
            addCriterion("invest_project_period in", values, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodNotIn(List<String> values) {
            addCriterion("invest_project_period not in", values, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodBetween(String value1, String value2) {
            addCriterion("invest_project_period between", value1, value2, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andInvestProjectPeriodNotBetween(String value1, String value2) {
            addCriterion("invest_project_period not between", value1, value2, "investProjectPeriod");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNull() {
            addCriterion("open_account is null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNotNull() {
            addCriterion("open_account is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountEqualTo(Integer value) {
            addCriterion("open_account =", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotEqualTo(Integer value) {
            addCriterion("open_account <>", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThan(Integer value) {
            addCriterion("open_account >", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_account >=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThan(Integer value) {
            addCriterion("open_account <", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThanOrEqualTo(Integer value) {
            addCriterion("open_account <=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIn(List<Integer> values) {
            addCriterion("open_account in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotIn(List<Integer> values) {
            addCriterion("open_account not in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountBetween(Integer value1, Integer value2) {
            addCriterion("open_account between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("open_account not between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andBindCardIsNull() {
            addCriterion("bind_card is null");
            return (Criteria) this;
        }

        public Criteria andBindCardIsNotNull() {
            addCriterion("bind_card is not null");
            return (Criteria) this;
        }

        public Criteria andBindCardEqualTo(Integer value) {
            addCriterion("bind_card =", value, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardNotEqualTo(Integer value) {
            addCriterion("bind_card <>", value, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardGreaterThan(Integer value) {
            addCriterion("bind_card >", value, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_card >=", value, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardLessThan(Integer value) {
            addCriterion("bind_card <", value, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardLessThanOrEqualTo(Integer value) {
            addCriterion("bind_card <=", value, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardIn(List<Integer> values) {
            addCriterion("bind_card in", values, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardNotIn(List<Integer> values) {
            addCriterion("bind_card not in", values, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardBetween(Integer value1, Integer value2) {
            addCriterion("bind_card between", value1, value2, "bindCard");
            return (Criteria) this;
        }

        public Criteria andBindCardNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_card not between", value1, value2, "bindCard");
            return (Criteria) this;
        }

        public Criteria andHxyidIsNull() {
            addCriterion("hxyid is null");
            return (Criteria) this;
        }

        public Criteria andHxyidIsNotNull() {
            addCriterion("hxyid is not null");
            return (Criteria) this;
        }

        public Criteria andHxyidEqualTo(Long value) {
            addCriterion("hxyid =", value, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidNotEqualTo(Long value) {
            addCriterion("hxyid <>", value, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidGreaterThan(Long value) {
            addCriterion("hxyid >", value, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidGreaterThanOrEqualTo(Long value) {
            addCriterion("hxyid >=", value, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidLessThan(Long value) {
            addCriterion("hxyid <", value, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidLessThanOrEqualTo(Long value) {
            addCriterion("hxyid <=", value, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidIn(List<Long> values) {
            addCriterion("hxyid in", values, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidNotIn(List<Long> values) {
            addCriterion("hxyid not in", values, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidBetween(Long value1, Long value2) {
            addCriterion("hxyid between", value1, value2, "hxyid");
            return (Criteria) this;
        }

        public Criteria andHxyidNotBetween(Long value1, Long value2) {
            addCriterion("hxyid not between", value1, value2, "hxyid");
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