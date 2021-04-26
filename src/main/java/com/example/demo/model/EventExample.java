package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlIsNull() {
            addCriterion("main_image_url is null");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlIsNotNull() {
            addCriterion("main_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlEqualTo(String value) {
            addCriterion("main_image_url =", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotEqualTo(String value) {
            addCriterion("main_image_url <>", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlGreaterThan(String value) {
            addCriterion("main_image_url >", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("main_image_url >=", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlLessThan(String value) {
            addCriterion("main_image_url <", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlLessThanOrEqualTo(String value) {
            addCriterion("main_image_url <=", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlLike(String value) {
            addCriterion("main_image_url like", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotLike(String value) {
            addCriterion("main_image_url not like", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlIn(List<String> values) {
            addCriterion("main_image_url in", values, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotIn(List<String> values) {
            addCriterion("main_image_url not in", values, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlBetween(String value1, String value2) {
            addCriterion("main_image_url between", value1, value2, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotBetween(String value1, String value2) {
            addCriterion("main_image_url not between", value1, value2, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountIsNull() {
            addCriterion("user_reward_count is null");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountIsNotNull() {
            addCriterion("user_reward_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountEqualTo(Integer value) {
            addCriterion("user_reward_count =", value, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountNotEqualTo(Integer value) {
            addCriterion("user_reward_count <>", value, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountGreaterThan(Integer value) {
            addCriterion("user_reward_count >", value, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_reward_count >=", value, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountLessThan(Integer value) {
            addCriterion("user_reward_count <", value, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_reward_count <=", value, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountIn(List<Integer> values) {
            addCriterion("user_reward_count in", values, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountNotIn(List<Integer> values) {
            addCriterion("user_reward_count not in", values, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountBetween(Integer value1, Integer value2) {
            addCriterion("user_reward_count between", value1, value2, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andUserRewardCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_reward_count not between", value1, value2, "userRewardCount");
            return (Criteria) this;
        }

        public Criteria andEventStatusIsNull() {
            addCriterion("event_status is null");
            return (Criteria) this;
        }

        public Criteria andEventStatusIsNotNull() {
            addCriterion("event_status is not null");
            return (Criteria) this;
        }

        public Criteria andEventStatusEqualTo(Integer value) {
            addCriterion("event_status =", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotEqualTo(Integer value) {
            addCriterion("event_status <>", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusGreaterThan(Integer value) {
            addCriterion("event_status >", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_status >=", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusLessThan(Integer value) {
            addCriterion("event_status <", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusLessThanOrEqualTo(Integer value) {
            addCriterion("event_status <=", value, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusIn(List<Integer> values) {
            addCriterion("event_status in", values, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotIn(List<Integer> values) {
            addCriterion("event_status not in", values, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusBetween(Integer value1, Integer value2) {
            addCriterion("event_status between", value1, value2, "eventStatus");
            return (Criteria) this;
        }

        public Criteria andEventStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("event_status not between", value1, value2, "eventStatus");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(Integer value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(Integer value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(Integer value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(Integer value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(Integer value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<Integer> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<Integer> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(Integer value1, Integer value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeIsNull() {
            addCriterion("start_datetime is null");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeIsNotNull() {
            addCriterion("start_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeEqualTo(Date value) {
            addCriterion("start_datetime =", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeNotEqualTo(Date value) {
            addCriterion("start_datetime <>", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeGreaterThan(Date value) {
            addCriterion("start_datetime >", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_datetime >=", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeLessThan(Date value) {
            addCriterion("start_datetime <", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("start_datetime <=", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeIn(List<Date> values) {
            addCriterion("start_datetime in", values, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeNotIn(List<Date> values) {
            addCriterion("start_datetime not in", values, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeBetween(Date value1, Date value2) {
            addCriterion("start_datetime between", value1, value2, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("start_datetime not between", value1, value2, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIsNull() {
            addCriterion("end_datetime is null");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIsNotNull() {
            addCriterion("end_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeEqualTo(Date value) {
            addCriterion("end_datetime =", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotEqualTo(Date value) {
            addCriterion("end_datetime <>", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeGreaterThan(Date value) {
            addCriterion("end_datetime >", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_datetime >=", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeLessThan(Date value) {
            addCriterion("end_datetime <", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("end_datetime <=", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIn(List<Date> values) {
            addCriterion("end_datetime in", values, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotIn(List<Date> values) {
            addCriterion("end_datetime not in", values, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeBetween(Date value1, Date value2) {
            addCriterion("end_datetime between", value1, value2, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("end_datetime not between", value1, value2, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusIsNull() {
            addCriterion("deleted_status is null");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusIsNotNull() {
            addCriterion("deleted_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusEqualTo(Boolean value) {
            addCriterion("deleted_status =", value, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusNotEqualTo(Boolean value) {
            addCriterion("deleted_status <>", value, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusGreaterThan(Boolean value) {
            addCriterion("deleted_status >", value, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted_status >=", value, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusLessThan(Boolean value) {
            addCriterion("deleted_status <", value, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted_status <=", value, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusIn(List<Boolean> values) {
            addCriterion("deleted_status in", values, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusNotIn(List<Boolean> values) {
            addCriterion("deleted_status not in", values, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted_status between", value1, value2, "deletedStatus");
            return (Criteria) this;
        }

        public Criteria andDeletedStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted_status not between", value1, value2, "deletedStatus");
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