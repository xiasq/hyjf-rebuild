package com.hyjf.iam.dao.model.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AccountExample() {
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(BigDecimal value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(BigDecimal value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(BigDecimal value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(BigDecimal value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<BigDecimal> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<BigDecimal> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andExpendIsNull() {
            addCriterion("expend is null");
            return (Criteria) this;
        }

        public Criteria andExpendIsNotNull() {
            addCriterion("expend is not null");
            return (Criteria) this;
        }

        public Criteria andExpendEqualTo(BigDecimal value) {
            addCriterion("expend =", value, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendNotEqualTo(BigDecimal value) {
            addCriterion("expend <>", value, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendGreaterThan(BigDecimal value) {
            addCriterion("expend >", value, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expend >=", value, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendLessThan(BigDecimal value) {
            addCriterion("expend <", value, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expend <=", value, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendIn(List<BigDecimal> values) {
            addCriterion("expend in", values, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendNotIn(List<BigDecimal> values) {
            addCriterion("expend not in", values, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expend between", value1, value2, "expend");
            return (Criteria) this;
        }

        public Criteria andExpendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expend not between", value1, value2, "expend");
            return (Criteria) this;
        }

        public Criteria andBankTotalIsNull() {
            addCriterion("bank_total is null");
            return (Criteria) this;
        }

        public Criteria andBankTotalIsNotNull() {
            addCriterion("bank_total is not null");
            return (Criteria) this;
        }

        public Criteria andBankTotalEqualTo(BigDecimal value) {
            addCriterion("bank_total =", value, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalNotEqualTo(BigDecimal value) {
            addCriterion("bank_total <>", value, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalGreaterThan(BigDecimal value) {
            addCriterion("bank_total >", value, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_total >=", value, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalLessThan(BigDecimal value) {
            addCriterion("bank_total <", value, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_total <=", value, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalIn(List<BigDecimal> values) {
            addCriterion("bank_total in", values, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalNotIn(List<BigDecimal> values) {
            addCriterion("bank_total not in", values, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_total between", value1, value2, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_total not between", value1, value2, "bankTotal");
            return (Criteria) this;
        }

        public Criteria andBankBalanceIsNull() {
            addCriterion("bank_balance is null");
            return (Criteria) this;
        }

        public Criteria andBankBalanceIsNotNull() {
            addCriterion("bank_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBankBalanceEqualTo(BigDecimal value) {
            addCriterion("bank_balance =", value, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceNotEqualTo(BigDecimal value) {
            addCriterion("bank_balance <>", value, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceGreaterThan(BigDecimal value) {
            addCriterion("bank_balance >", value, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_balance >=", value, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceLessThan(BigDecimal value) {
            addCriterion("bank_balance <", value, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_balance <=", value, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceIn(List<BigDecimal> values) {
            addCriterion("bank_balance in", values, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceNotIn(List<BigDecimal> values) {
            addCriterion("bank_balance not in", values, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_balance between", value1, value2, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_balance not between", value1, value2, "bankBalance");
            return (Criteria) this;
        }

        public Criteria andBankFrostIsNull() {
            addCriterion("bank_frost is null");
            return (Criteria) this;
        }

        public Criteria andBankFrostIsNotNull() {
            addCriterion("bank_frost is not null");
            return (Criteria) this;
        }

        public Criteria andBankFrostEqualTo(BigDecimal value) {
            addCriterion("bank_frost =", value, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostNotEqualTo(BigDecimal value) {
            addCriterion("bank_frost <>", value, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostGreaterThan(BigDecimal value) {
            addCriterion("bank_frost >", value, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_frost >=", value, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostLessThan(BigDecimal value) {
            addCriterion("bank_frost <", value, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_frost <=", value, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostIn(List<BigDecimal> values) {
            addCriterion("bank_frost in", values, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostNotIn(List<BigDecimal> values) {
            addCriterion("bank_frost not in", values, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_frost between", value1, value2, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankFrostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_frost not between", value1, value2, "bankFrost");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayIsNull() {
            addCriterion("bank_wait_repay is null");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayIsNotNull() {
            addCriterion("bank_wait_repay is not null");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay =", value, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayNotEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay <>", value, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayGreaterThan(BigDecimal value) {
            addCriterion("bank_wait_repay >", value, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay >=", value, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayLessThan(BigDecimal value) {
            addCriterion("bank_wait_repay <", value, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay <=", value, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayIn(List<BigDecimal> values) {
            addCriterion("bank_wait_repay in", values, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayNotIn(List<BigDecimal> values) {
            addCriterion("bank_wait_repay not in", values, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_repay between", value1, value2, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_repay not between", value1, value2, "bankWaitRepay");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashIsNull() {
            addCriterion("bank_balance_cash is null");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashIsNotNull() {
            addCriterion("bank_balance_cash is not null");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashEqualTo(BigDecimal value) {
            addCriterion("bank_balance_cash =", value, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashNotEqualTo(BigDecimal value) {
            addCriterion("bank_balance_cash <>", value, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashGreaterThan(BigDecimal value) {
            addCriterion("bank_balance_cash >", value, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_balance_cash >=", value, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashLessThan(BigDecimal value) {
            addCriterion("bank_balance_cash <", value, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_balance_cash <=", value, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashIn(List<BigDecimal> values) {
            addCriterion("bank_balance_cash in", values, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashNotIn(List<BigDecimal> values) {
            addCriterion("bank_balance_cash not in", values, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_balance_cash between", value1, value2, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankBalanceCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_balance_cash not between", value1, value2, "bankBalanceCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashIsNull() {
            addCriterion("bank_frost_cash is null");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashIsNotNull() {
            addCriterion("bank_frost_cash is not null");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashEqualTo(BigDecimal value) {
            addCriterion("bank_frost_cash =", value, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashNotEqualTo(BigDecimal value) {
            addCriterion("bank_frost_cash <>", value, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashGreaterThan(BigDecimal value) {
            addCriterion("bank_frost_cash >", value, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_frost_cash >=", value, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashLessThan(BigDecimal value) {
            addCriterion("bank_frost_cash <", value, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_frost_cash <=", value, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashIn(List<BigDecimal> values) {
            addCriterion("bank_frost_cash in", values, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashNotIn(List<BigDecimal> values) {
            addCriterion("bank_frost_cash not in", values, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_frost_cash between", value1, value2, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankFrostCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_frost_cash not between", value1, value2, "bankFrostCash");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalIsNull() {
            addCriterion("bank_wait_capital is null");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalIsNotNull() {
            addCriterion("bank_wait_capital is not null");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalEqualTo(BigDecimal value) {
            addCriterion("bank_wait_capital =", value, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalNotEqualTo(BigDecimal value) {
            addCriterion("bank_wait_capital <>", value, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalGreaterThan(BigDecimal value) {
            addCriterion("bank_wait_capital >", value, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_capital >=", value, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalLessThan(BigDecimal value) {
            addCriterion("bank_wait_capital <", value, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_capital <=", value, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalIn(List<BigDecimal> values) {
            addCriterion("bank_wait_capital in", values, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalNotIn(List<BigDecimal> values) {
            addCriterion("bank_wait_capital not in", values, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_capital between", value1, value2, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_capital not between", value1, value2, "bankWaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestIsNull() {
            addCriterion("bank_wait_interest is null");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestIsNotNull() {
            addCriterion("bank_wait_interest is not null");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestEqualTo(BigDecimal value) {
            addCriterion("bank_wait_interest =", value, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestNotEqualTo(BigDecimal value) {
            addCriterion("bank_wait_interest <>", value, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestGreaterThan(BigDecimal value) {
            addCriterion("bank_wait_interest >", value, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_interest >=", value, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestLessThan(BigDecimal value) {
            addCriterion("bank_wait_interest <", value, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_interest <=", value, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestIn(List<BigDecimal> values) {
            addCriterion("bank_wait_interest in", values, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestNotIn(List<BigDecimal> values) {
            addCriterion("bank_wait_interest not in", values, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_interest between", value1, value2, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_interest not between", value1, value2, "bankWaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgIsNull() {
            addCriterion("bank_wait_repay_org is null");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgIsNotNull() {
            addCriterion("bank_wait_repay_org is not null");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay_org =", value, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgNotEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay_org <>", value, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgGreaterThan(BigDecimal value) {
            addCriterion("bank_wait_repay_org >", value, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay_org >=", value, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgLessThan(BigDecimal value) {
            addCriterion("bank_wait_repay_org <", value, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_wait_repay_org <=", value, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgIn(List<BigDecimal> values) {
            addCriterion("bank_wait_repay_org in", values, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgNotIn(List<BigDecimal> values) {
            addCriterion("bank_wait_repay_org not in", values, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_repay_org between", value1, value2, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankWaitRepayOrgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_wait_repay_org not between", value1, value2, "bankWaitRepayOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalIsNull() {
            addCriterion("bank_await_capital is null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalIsNotNull() {
            addCriterion("bank_await_capital is not null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalEqualTo(BigDecimal value) {
            addCriterion("bank_await_capital =", value, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalNotEqualTo(BigDecimal value) {
            addCriterion("bank_await_capital <>", value, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalGreaterThan(BigDecimal value) {
            addCriterion("bank_await_capital >", value, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await_capital >=", value, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalLessThan(BigDecimal value) {
            addCriterion("bank_await_capital <", value, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await_capital <=", value, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalIn(List<BigDecimal> values) {
            addCriterion("bank_await_capital in", values, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalNotIn(List<BigDecimal> values) {
            addCriterion("bank_await_capital not in", values, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await_capital between", value1, value2, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await_capital not between", value1, value2, "bankAwaitCapital");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestIsNull() {
            addCriterion("bank_await_interest is null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestIsNotNull() {
            addCriterion("bank_await_interest is not null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestEqualTo(BigDecimal value) {
            addCriterion("bank_await_interest =", value, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestNotEqualTo(BigDecimal value) {
            addCriterion("bank_await_interest <>", value, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestGreaterThan(BigDecimal value) {
            addCriterion("bank_await_interest >", value, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await_interest >=", value, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestLessThan(BigDecimal value) {
            addCriterion("bank_await_interest <", value, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await_interest <=", value, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestIn(List<BigDecimal> values) {
            addCriterion("bank_await_interest in", values, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestNotIn(List<BigDecimal> values) {
            addCriterion("bank_await_interest not in", values, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await_interest between", value1, value2, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await_interest not between", value1, value2, "bankAwaitInterest");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgIsNull() {
            addCriterion("bank_await_org is null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgIsNotNull() {
            addCriterion("bank_await_org is not null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgEqualTo(BigDecimal value) {
            addCriterion("bank_await_org =", value, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgNotEqualTo(BigDecimal value) {
            addCriterion("bank_await_org <>", value, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgGreaterThan(BigDecimal value) {
            addCriterion("bank_await_org >", value, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await_org >=", value, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgLessThan(BigDecimal value) {
            addCriterion("bank_await_org <", value, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await_org <=", value, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgIn(List<BigDecimal> values) {
            addCriterion("bank_await_org in", values, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgNotIn(List<BigDecimal> values) {
            addCriterion("bank_await_org not in", values, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await_org between", value1, value2, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankAwaitOrgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await_org not between", value1, value2, "bankAwaitOrg");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumIsNull() {
            addCriterion("bank_interest_sum is null");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumIsNotNull() {
            addCriterion("bank_interest_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumEqualTo(BigDecimal value) {
            addCriterion("bank_interest_sum =", value, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumNotEqualTo(BigDecimal value) {
            addCriterion("bank_interest_sum <>", value, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumGreaterThan(BigDecimal value) {
            addCriterion("bank_interest_sum >", value, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_interest_sum >=", value, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumLessThan(BigDecimal value) {
            addCriterion("bank_interest_sum <", value, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_interest_sum <=", value, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumIn(List<BigDecimal> values) {
            addCriterion("bank_interest_sum in", values, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumNotIn(List<BigDecimal> values) {
            addCriterion("bank_interest_sum not in", values, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_interest_sum between", value1, value2, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInterestSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_interest_sum not between", value1, value2, "bankInterestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumIsNull() {
            addCriterion("bank_invest_sum is null");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumIsNotNull() {
            addCriterion("bank_invest_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumEqualTo(BigDecimal value) {
            addCriterion("bank_invest_sum =", value, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumNotEqualTo(BigDecimal value) {
            addCriterion("bank_invest_sum <>", value, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumGreaterThan(BigDecimal value) {
            addCriterion("bank_invest_sum >", value, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_invest_sum >=", value, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumLessThan(BigDecimal value) {
            addCriterion("bank_invest_sum <", value, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_invest_sum <=", value, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumIn(List<BigDecimal> values) {
            addCriterion("bank_invest_sum in", values, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumNotIn(List<BigDecimal> values) {
            addCriterion("bank_invest_sum not in", values, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_invest_sum between", value1, value2, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankInvestSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_invest_sum not between", value1, value2, "bankInvestSum");
            return (Criteria) this;
        }

        public Criteria andBankAwaitIsNull() {
            addCriterion("bank_await is null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitIsNotNull() {
            addCriterion("bank_await is not null");
            return (Criteria) this;
        }

        public Criteria andBankAwaitEqualTo(BigDecimal value) {
            addCriterion("bank_await =", value, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitNotEqualTo(BigDecimal value) {
            addCriterion("bank_await <>", value, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitGreaterThan(BigDecimal value) {
            addCriterion("bank_await >", value, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await >=", value, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitLessThan(BigDecimal value) {
            addCriterion("bank_await <", value, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_await <=", value, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitIn(List<BigDecimal> values) {
            addCriterion("bank_await in", values, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitNotIn(List<BigDecimal> values) {
            addCriterion("bank_await not in", values, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await between", value1, value2, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBankAwaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_await not between", value1, value2, "bankAwait");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceCashIsNull() {
            addCriterion("balance_cash is null");
            return (Criteria) this;
        }

        public Criteria andBalanceCashIsNotNull() {
            addCriterion("balance_cash is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceCashEqualTo(BigDecimal value) {
            addCriterion("balance_cash =", value, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashNotEqualTo(BigDecimal value) {
            addCriterion("balance_cash <>", value, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashGreaterThan(BigDecimal value) {
            addCriterion("balance_cash >", value, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_cash >=", value, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashLessThan(BigDecimal value) {
            addCriterion("balance_cash <", value, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_cash <=", value, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashIn(List<BigDecimal> values) {
            addCriterion("balance_cash in", values, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashNotIn(List<BigDecimal> values) {
            addCriterion("balance_cash not in", values, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_cash between", value1, value2, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_cash not between", value1, value2, "balanceCash");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostIsNull() {
            addCriterion("balance_frost is null");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostIsNotNull() {
            addCriterion("balance_frost is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostEqualTo(BigDecimal value) {
            addCriterion("balance_frost =", value, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostNotEqualTo(BigDecimal value) {
            addCriterion("balance_frost <>", value, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostGreaterThan(BigDecimal value) {
            addCriterion("balance_frost >", value, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_frost >=", value, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostLessThan(BigDecimal value) {
            addCriterion("balance_frost <", value, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_frost <=", value, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostIn(List<BigDecimal> values) {
            addCriterion("balance_frost in", values, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostNotIn(List<BigDecimal> values) {
            addCriterion("balance_frost not in", values, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_frost between", value1, value2, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andBalanceFrostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_frost not between", value1, value2, "balanceFrost");
            return (Criteria) this;
        }

        public Criteria andFrostIsNull() {
            addCriterion("frost is null");
            return (Criteria) this;
        }

        public Criteria andFrostIsNotNull() {
            addCriterion("frost is not null");
            return (Criteria) this;
        }

        public Criteria andFrostEqualTo(BigDecimal value) {
            addCriterion("frost =", value, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostNotEqualTo(BigDecimal value) {
            addCriterion("frost <>", value, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostGreaterThan(BigDecimal value) {
            addCriterion("frost >", value, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frost >=", value, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostLessThan(BigDecimal value) {
            addCriterion("frost <", value, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frost <=", value, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostIn(List<BigDecimal> values) {
            addCriterion("frost in", values, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostNotIn(List<BigDecimal> values) {
            addCriterion("frost not in", values, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frost between", value1, value2, "frost");
            return (Criteria) this;
        }

        public Criteria andFrostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frost not between", value1, value2, "frost");
            return (Criteria) this;
        }

        public Criteria andAwaitIsNull() {
            addCriterion("await is null");
            return (Criteria) this;
        }

        public Criteria andAwaitIsNotNull() {
            addCriterion("await is not null");
            return (Criteria) this;
        }

        public Criteria andAwaitEqualTo(BigDecimal value) {
            addCriterion("await =", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotEqualTo(BigDecimal value) {
            addCriterion("await <>", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitGreaterThan(BigDecimal value) {
            addCriterion("await >", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("await >=", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitLessThan(BigDecimal value) {
            addCriterion("await <", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("await <=", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitIn(List<BigDecimal> values) {
            addCriterion("await in", values, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotIn(List<BigDecimal> values) {
            addCriterion("await not in", values, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("await between", value1, value2, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("await not between", value1, value2, "await");
            return (Criteria) this;
        }

        public Criteria andRepayIsNull() {
            addCriterion("repay is null");
            return (Criteria) this;
        }

        public Criteria andRepayIsNotNull() {
            addCriterion("repay is not null");
            return (Criteria) this;
        }

        public Criteria andRepayEqualTo(BigDecimal value) {
            addCriterion("repay =", value, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayNotEqualTo(BigDecimal value) {
            addCriterion("repay <>", value, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayGreaterThan(BigDecimal value) {
            addCriterion("repay >", value, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay >=", value, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayLessThan(BigDecimal value) {
            addCriterion("repay <", value, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay <=", value, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayIn(List<BigDecimal> values) {
            addCriterion("repay in", values, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayNotIn(List<BigDecimal> values) {
            addCriterion("repay not in", values, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay between", value1, value2, "repay");
            return (Criteria) this;
        }

        public Criteria andRepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay not between", value1, value2, "repay");
            return (Criteria) this;
        }

        public Criteria andFrostCashIsNull() {
            addCriterion("frost_cash is null");
            return (Criteria) this;
        }

        public Criteria andFrostCashIsNotNull() {
            addCriterion("frost_cash is not null");
            return (Criteria) this;
        }

        public Criteria andFrostCashEqualTo(BigDecimal value) {
            addCriterion("frost_cash =", value, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashNotEqualTo(BigDecimal value) {
            addCriterion("frost_cash <>", value, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashGreaterThan(BigDecimal value) {
            addCriterion("frost_cash >", value, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frost_cash >=", value, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashLessThan(BigDecimal value) {
            addCriterion("frost_cash <", value, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frost_cash <=", value, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashIn(List<BigDecimal> values) {
            addCriterion("frost_cash in", values, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashNotIn(List<BigDecimal> values) {
            addCriterion("frost_cash not in", values, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frost_cash between", value1, value2, "frostCash");
            return (Criteria) this;
        }

        public Criteria andFrostCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frost_cash not between", value1, value2, "frostCash");
            return (Criteria) this;
        }

        public Criteria andIsUpdateIsNull() {
            addCriterion("is_update is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateIsNotNull() {
            addCriterion("is_update is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateEqualTo(Integer value) {
            addCriterion("is_update =", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateNotEqualTo(Integer value) {
            addCriterion("is_update <>", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateGreaterThan(Integer value) {
            addCriterion("is_update >", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_update >=", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateLessThan(Integer value) {
            addCriterion("is_update <", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("is_update <=", value, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateIn(List<Integer> values) {
            addCriterion("is_update in", values, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateNotIn(List<Integer> values) {
            addCriterion("is_update not in", values, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateBetween(Integer value1, Integer value2) {
            addCriterion("is_update between", value1, value2, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_update not between", value1, value2, "isUpdate");
            return (Criteria) this;
        }

        public Criteria andIsokIsNull() {
            addCriterion("isok is null");
            return (Criteria) this;
        }

        public Criteria andIsokIsNotNull() {
            addCriterion("isok is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEqualTo(Integer value) {
            addCriterion("isok =", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotEqualTo(Integer value) {
            addCriterion("isok <>", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThan(Integer value) {
            addCriterion("isok >", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThanOrEqualTo(Integer value) {
            addCriterion("isok >=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThan(Integer value) {
            addCriterion("isok <", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThanOrEqualTo(Integer value) {
            addCriterion("isok <=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokIn(List<Integer> values) {
            addCriterion("isok in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotIn(List<Integer> values) {
            addCriterion("isok not in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokBetween(Integer value1, Integer value2) {
            addCriterion("isok between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotBetween(Integer value1, Integer value2) {
            addCriterion("isok not between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIsNull() {
            addCriterion("rec_money is null");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIsNotNull() {
            addCriterion("rec_money is not null");
            return (Criteria) this;
        }

        public Criteria andRecMoneyEqualTo(BigDecimal value) {
            addCriterion("rec_money =", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotEqualTo(BigDecimal value) {
            addCriterion("rec_money <>", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyGreaterThan(BigDecimal value) {
            addCriterion("rec_money >", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_money >=", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyLessThan(BigDecimal value) {
            addCriterion("rec_money <", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rec_money <=", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIn(List<BigDecimal> values) {
            addCriterion("rec_money in", values, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotIn(List<BigDecimal> values) {
            addCriterion("rec_money not in", values, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_money between", value1, value2, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rec_money not between", value1, value2, "recMoney");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andInMoneyIsNull() {
            addCriterion("in_money is null");
            return (Criteria) this;
        }

        public Criteria andInMoneyIsNotNull() {
            addCriterion("in_money is not null");
            return (Criteria) this;
        }

        public Criteria andInMoneyEqualTo(BigDecimal value) {
            addCriterion("in_money =", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotEqualTo(BigDecimal value) {
            addCriterion("in_money <>", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyGreaterThan(BigDecimal value) {
            addCriterion("in_money >", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("in_money >=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLessThan(BigDecimal value) {
            addCriterion("in_money <", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("in_money <=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyIn(List<BigDecimal> values) {
            addCriterion("in_money in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotIn(List<BigDecimal> values) {
            addCriterion("in_money not in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_money between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_money not between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagIsNull() {
            addCriterion("in_money_flag is null");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagIsNotNull() {
            addCriterion("in_money_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagEqualTo(Integer value) {
            addCriterion("in_money_flag =", value, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagNotEqualTo(Integer value) {
            addCriterion("in_money_flag <>", value, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagGreaterThan(Integer value) {
            addCriterion("in_money_flag >", value, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_money_flag >=", value, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagLessThan(Integer value) {
            addCriterion("in_money_flag <", value, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("in_money_flag <=", value, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagIn(List<Integer> values) {
            addCriterion("in_money_flag in", values, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagNotIn(List<Integer> values) {
            addCriterion("in_money_flag not in", values, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagBetween(Integer value1, Integer value2) {
            addCriterion("in_money_flag between", value1, value2, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andInMoneyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("in_money_flag not between", value1, value2, "inMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceIsNull() {
            addCriterion("plan_balance is null");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceIsNotNull() {
            addCriterion("plan_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceEqualTo(BigDecimal value) {
            addCriterion("plan_balance =", value, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceNotEqualTo(BigDecimal value) {
            addCriterion("plan_balance <>", value, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceGreaterThan(BigDecimal value) {
            addCriterion("plan_balance >", value, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_balance >=", value, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceLessThan(BigDecimal value) {
            addCriterion("plan_balance <", value, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_balance <=", value, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceIn(List<BigDecimal> values) {
            addCriterion("plan_balance in", values, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceNotIn(List<BigDecimal> values) {
            addCriterion("plan_balance not in", values, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_balance between", value1, value2, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_balance not between", value1, value2, "planBalance");
            return (Criteria) this;
        }

        public Criteria andPlanFrostIsNull() {
            addCriterion("plan_frost is null");
            return (Criteria) this;
        }

        public Criteria andPlanFrostIsNotNull() {
            addCriterion("plan_frost is not null");
            return (Criteria) this;
        }

        public Criteria andPlanFrostEqualTo(BigDecimal value) {
            addCriterion("plan_frost =", value, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostNotEqualTo(BigDecimal value) {
            addCriterion("plan_frost <>", value, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostGreaterThan(BigDecimal value) {
            addCriterion("plan_frost >", value, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_frost >=", value, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostLessThan(BigDecimal value) {
            addCriterion("plan_frost <", value, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_frost <=", value, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostIn(List<BigDecimal> values) {
            addCriterion("plan_frost in", values, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostNotIn(List<BigDecimal> values) {
            addCriterion("plan_frost not in", values, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_frost between", value1, value2, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanFrostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_frost not between", value1, value2, "planFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalIsNull() {
            addCriterion("plan_accede_total is null");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalIsNotNull() {
            addCriterion("plan_accede_total is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalEqualTo(BigDecimal value) {
            addCriterion("plan_accede_total =", value, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalNotEqualTo(BigDecimal value) {
            addCriterion("plan_accede_total <>", value, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalGreaterThan(BigDecimal value) {
            addCriterion("plan_accede_total >", value, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_accede_total >=", value, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalLessThan(BigDecimal value) {
            addCriterion("plan_accede_total <", value, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_accede_total <=", value, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalIn(List<BigDecimal> values) {
            addCriterion("plan_accede_total in", values, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalNotIn(List<BigDecimal> values) {
            addCriterion("plan_accede_total not in", values, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_accede_total between", value1, value2, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_accede_total not between", value1, value2, "planAccedeTotal");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceIsNull() {
            addCriterion("plan_accede_balance is null");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceIsNotNull() {
            addCriterion("plan_accede_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceEqualTo(BigDecimal value) {
            addCriterion("plan_accede_balance =", value, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceNotEqualTo(BigDecimal value) {
            addCriterion("plan_accede_balance <>", value, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceGreaterThan(BigDecimal value) {
            addCriterion("plan_accede_balance >", value, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_accede_balance >=", value, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceLessThan(BigDecimal value) {
            addCriterion("plan_accede_balance <", value, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_accede_balance <=", value, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceIn(List<BigDecimal> values) {
            addCriterion("plan_accede_balance in", values, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceNotIn(List<BigDecimal> values) {
            addCriterion("plan_accede_balance not in", values, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_accede_balance between", value1, value2, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_accede_balance not between", value1, value2, "planAccedeBalance");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostIsNull() {
            addCriterion("plan_accede_frost is null");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostIsNotNull() {
            addCriterion("plan_accede_frost is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostEqualTo(BigDecimal value) {
            addCriterion("plan_accede_frost =", value, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostNotEqualTo(BigDecimal value) {
            addCriterion("plan_accede_frost <>", value, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostGreaterThan(BigDecimal value) {
            addCriterion("plan_accede_frost >", value, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_accede_frost >=", value, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostLessThan(BigDecimal value) {
            addCriterion("plan_accede_frost <", value, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_accede_frost <=", value, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostIn(List<BigDecimal> values) {
            addCriterion("plan_accede_frost in", values, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostNotIn(List<BigDecimal> values) {
            addCriterion("plan_accede_frost not in", values, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_accede_frost between", value1, value2, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccedeFrostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_accede_frost not between", value1, value2, "planAccedeFrost");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitIsNull() {
            addCriterion("plan_account_wait is null");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitIsNotNull() {
            addCriterion("plan_account_wait is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitEqualTo(BigDecimal value) {
            addCriterion("plan_account_wait =", value, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitNotEqualTo(BigDecimal value) {
            addCriterion("plan_account_wait <>", value, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitGreaterThan(BigDecimal value) {
            addCriterion("plan_account_wait >", value, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_account_wait >=", value, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitLessThan(BigDecimal value) {
            addCriterion("plan_account_wait <", value, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_account_wait <=", value, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitIn(List<BigDecimal> values) {
            addCriterion("plan_account_wait in", values, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitNotIn(List<BigDecimal> values) {
            addCriterion("plan_account_wait not in", values, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_account_wait between", value1, value2, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanAccountWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_account_wait not between", value1, value2, "planAccountWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitIsNull() {
            addCriterion("plan_capital_wait is null");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitIsNotNull() {
            addCriterion("plan_capital_wait is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitEqualTo(BigDecimal value) {
            addCriterion("plan_capital_wait =", value, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitNotEqualTo(BigDecimal value) {
            addCriterion("plan_capital_wait <>", value, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitGreaterThan(BigDecimal value) {
            addCriterion("plan_capital_wait >", value, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_capital_wait >=", value, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitLessThan(BigDecimal value) {
            addCriterion("plan_capital_wait <", value, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_capital_wait <=", value, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitIn(List<BigDecimal> values) {
            addCriterion("plan_capital_wait in", values, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitNotIn(List<BigDecimal> values) {
            addCriterion("plan_capital_wait not in", values, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_capital_wait between", value1, value2, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanCapitalWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_capital_wait not between", value1, value2, "planCapitalWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitIsNull() {
            addCriterion("plan_interest_wait is null");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitIsNotNull() {
            addCriterion("plan_interest_wait is not null");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitEqualTo(BigDecimal value) {
            addCriterion("plan_interest_wait =", value, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitNotEqualTo(BigDecimal value) {
            addCriterion("plan_interest_wait <>", value, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitGreaterThan(BigDecimal value) {
            addCriterion("plan_interest_wait >", value, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_interest_wait >=", value, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitLessThan(BigDecimal value) {
            addCriterion("plan_interest_wait <", value, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_interest_wait <=", value, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitIn(List<BigDecimal> values) {
            addCriterion("plan_interest_wait in", values, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitNotIn(List<BigDecimal> values) {
            addCriterion("plan_interest_wait not in", values, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_interest_wait between", value1, value2, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanInterestWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_interest_wait not between", value1, value2, "planInterestWait");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestIsNull() {
            addCriterion("plan_repay_interest is null");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestIsNotNull() {
            addCriterion("plan_repay_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestEqualTo(BigDecimal value) {
            addCriterion("plan_repay_interest =", value, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestNotEqualTo(BigDecimal value) {
            addCriterion("plan_repay_interest <>", value, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestGreaterThan(BigDecimal value) {
            addCriterion("plan_repay_interest >", value, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_repay_interest >=", value, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestLessThan(BigDecimal value) {
            addCriterion("plan_repay_interest <", value, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plan_repay_interest <=", value, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestIn(List<BigDecimal> values) {
            addCriterion("plan_repay_interest in", values, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestNotIn(List<BigDecimal> values) {
            addCriterion("plan_repay_interest not in", values, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_repay_interest between", value1, value2, "planRepayInterest");
            return (Criteria) this;
        }

        public Criteria andPlanRepayInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plan_repay_interest not between", value1, value2, "planRepayInterest");
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