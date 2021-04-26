package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class InvitationUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvitationUserExample() {
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

        public Criteria andUserRewardIdIsNull() {
            addCriterion("user_reward_id is null");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdIsNotNull() {
            addCriterion("user_reward_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdEqualTo(Long value) {
            addCriterion("user_reward_id =", value, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdNotEqualTo(Long value) {
            addCriterion("user_reward_id <>", value, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdGreaterThan(Long value) {
            addCriterion("user_reward_id >", value, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_reward_id >=", value, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdLessThan(Long value) {
            addCriterion("user_reward_id <", value, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdLessThanOrEqualTo(Long value) {
            addCriterion("user_reward_id <=", value, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdIn(List<Long> values) {
            addCriterion("user_reward_id in", values, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdNotIn(List<Long> values) {
            addCriterion("user_reward_id not in", values, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdBetween(Long value1, Long value2) {
            addCriterion("user_reward_id between", value1, value2, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andUserRewardIdNotBetween(Long value1, Long value2) {
            addCriterion("user_reward_id not between", value1, value2, "userRewardId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdIsNull() {
            addCriterion("test_drive_id is null");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdIsNotNull() {
            addCriterion("test_drive_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdEqualTo(Long value) {
            addCriterion("test_drive_id =", value, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdNotEqualTo(Long value) {
            addCriterion("test_drive_id <>", value, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdGreaterThan(Long value) {
            addCriterion("test_drive_id >", value, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("test_drive_id >=", value, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdLessThan(Long value) {
            addCriterion("test_drive_id <", value, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdLessThanOrEqualTo(Long value) {
            addCriterion("test_drive_id <=", value, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdIn(List<Long> values) {
            addCriterion("test_drive_id in", values, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdNotIn(List<Long> values) {
            addCriterion("test_drive_id not in", values, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdBetween(Long value1, Long value2) {
            addCriterion("test_drive_id between", value1, value2, "testDriveId");
            return (Criteria) this;
        }

        public Criteria andTestDriveIdNotBetween(Long value1, Long value2) {
            addCriterion("test_drive_id not between", value1, value2, "testDriveId");
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