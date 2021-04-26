package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemindedInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemindedInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeIsNull() {
            addCriterion("reminded_type is null");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeIsNotNull() {
            addCriterion("reminded_type is not null");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeEqualTo(Integer value) {
            addCriterion("reminded_type =", value, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeNotEqualTo(Integer value) {
            addCriterion("reminded_type <>", value, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeGreaterThan(Integer value) {
            addCriterion("reminded_type >", value, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reminded_type >=", value, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeLessThan(Integer value) {
            addCriterion("reminded_type <", value, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("reminded_type <=", value, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeIn(List<Integer> values) {
            addCriterion("reminded_type in", values, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeNotIn(List<Integer> values) {
            addCriterion("reminded_type not in", values, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeBetween(Integer value1, Integer value2) {
            addCriterion("reminded_type between", value1, value2, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reminded_type not between", value1, value2, "remindedType");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusIsNull() {
            addCriterion("reminded_status is null");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusIsNotNull() {
            addCriterion("reminded_status is not null");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusEqualTo(Boolean value) {
            addCriterion("reminded_status =", value, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusNotEqualTo(Boolean value) {
            addCriterion("reminded_status <>", value, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusGreaterThan(Boolean value) {
            addCriterion("reminded_status >", value, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reminded_status >=", value, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusLessThan(Boolean value) {
            addCriterion("reminded_status <", value, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("reminded_status <=", value, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusIn(List<Boolean> values) {
            addCriterion("reminded_status in", values, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusNotIn(List<Boolean> values) {
            addCriterion("reminded_status not in", values, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("reminded_status between", value1, value2, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reminded_status not between", value1, value2, "remindedStatus");
            return (Criteria) this;
        }

        public Criteria andRemindedDateIsNull() {
            addCriterion("reminded_date is null");
            return (Criteria) this;
        }

        public Criteria andRemindedDateIsNotNull() {
            addCriterion("reminded_date is not null");
            return (Criteria) this;
        }

        public Criteria andRemindedDateEqualTo(Date value) {
            addCriterion("reminded_date =", value, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateNotEqualTo(Date value) {
            addCriterion("reminded_date <>", value, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateGreaterThan(Date value) {
            addCriterion("reminded_date >", value, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reminded_date >=", value, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateLessThan(Date value) {
            addCriterion("reminded_date <", value, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateLessThanOrEqualTo(Date value) {
            addCriterion("reminded_date <=", value, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateIn(List<Date> values) {
            addCriterion("reminded_date in", values, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateNotIn(List<Date> values) {
            addCriterion("reminded_date not in", values, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateBetween(Date value1, Date value2) {
            addCriterion("reminded_date between", value1, value2, "remindedDate");
            return (Criteria) this;
        }

        public Criteria andRemindedDateNotBetween(Date value1, Date value2) {
            addCriterion("reminded_date not between", value1, value2, "remindedDate");
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