package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerBrowseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerBrowseDetailExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("banner_id is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("banner_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Long value) {
            addCriterion("banner_id =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Long value) {
            addCriterion("banner_id <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Long value) {
            addCriterion("banner_id >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("banner_id >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Long value) {
            addCriterion("banner_id <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Long value) {
            addCriterion("banner_id <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Long> values) {
            addCriterion("banner_id in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Long> values) {
            addCriterion("banner_id not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Long value1, Long value2) {
            addCriterion("banner_id between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Long value1, Long value2) {
            addCriterion("banner_id not between", value1, value2, "bannerId");
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

        public Criteria andBrowseDateIsNull() {
            addCriterion("browse_date is null");
            return (Criteria) this;
        }

        public Criteria andBrowseDateIsNotNull() {
            addCriterion("browse_date is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseDateEqualTo(Date value) {
            addCriterion("browse_date =", value, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateNotEqualTo(Date value) {
            addCriterion("browse_date <>", value, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateGreaterThan(Date value) {
            addCriterion("browse_date >", value, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("browse_date >=", value, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateLessThan(Date value) {
            addCriterion("browse_date <", value, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateLessThanOrEqualTo(Date value) {
            addCriterion("browse_date <=", value, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateIn(List<Date> values) {
            addCriterion("browse_date in", values, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateNotIn(List<Date> values) {
            addCriterion("browse_date not in", values, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateBetween(Date value1, Date value2) {
            addCriterion("browse_date between", value1, value2, "browseDate");
            return (Criteria) this;
        }

        public Criteria andBrowseDateNotBetween(Date value1, Date value2) {
            addCriterion("browse_date not between", value1, value2, "browseDate");
            return (Criteria) this;
        }

        public Criteria andFirstStatusIsNull() {
            addCriterion("first_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstStatusIsNotNull() {
            addCriterion("first_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstStatusEqualTo(Boolean value) {
            addCriterion("first_status =", value, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusNotEqualTo(Boolean value) {
            addCriterion("first_status <>", value, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusGreaterThan(Boolean value) {
            addCriterion("first_status >", value, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("first_status >=", value, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusLessThan(Boolean value) {
            addCriterion("first_status <", value, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("first_status <=", value, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusIn(List<Boolean> values) {
            addCriterion("first_status in", values, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusNotIn(List<Boolean> values) {
            addCriterion("first_status not in", values, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("first_status between", value1, value2, "firstStatus");
            return (Criteria) this;
        }

        public Criteria andFirstStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("first_status not between", value1, value2, "firstStatus");
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