package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CarOemTalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarOemTalkExample() {
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

        public Criteria andTalkUrlIsNull() {
            addCriterion("talk_url is null");
            return (Criteria) this;
        }

        public Criteria andTalkUrlIsNotNull() {
            addCriterion("talk_url is not null");
            return (Criteria) this;
        }

        public Criteria andTalkUrlEqualTo(String value) {
            addCriterion("talk_url =", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlNotEqualTo(String value) {
            addCriterion("talk_url <>", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlGreaterThan(String value) {
            addCriterion("talk_url >", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("talk_url >=", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlLessThan(String value) {
            addCriterion("talk_url <", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlLessThanOrEqualTo(String value) {
            addCriterion("talk_url <=", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlLike(String value) {
            addCriterion("talk_url like", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlNotLike(String value) {
            addCriterion("talk_url not like", value, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlIn(List<String> values) {
            addCriterion("talk_url in", values, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlNotIn(List<String> values) {
            addCriterion("talk_url not in", values, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlBetween(String value1, String value2) {
            addCriterion("talk_url between", value1, value2, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkUrlNotBetween(String value1, String value2) {
            addCriterion("talk_url not between", value1, value2, "talkUrl");
            return (Criteria) this;
        }

        public Criteria andTalkTitleIsNull() {
            addCriterion("talk_title is null");
            return (Criteria) this;
        }

        public Criteria andTalkTitleIsNotNull() {
            addCriterion("talk_title is not null");
            return (Criteria) this;
        }

        public Criteria andTalkTitleEqualTo(String value) {
            addCriterion("talk_title =", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleNotEqualTo(String value) {
            addCriterion("talk_title <>", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleGreaterThan(String value) {
            addCriterion("talk_title >", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("talk_title >=", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleLessThan(String value) {
            addCriterion("talk_title <", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleLessThanOrEqualTo(String value) {
            addCriterion("talk_title <=", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleLike(String value) {
            addCriterion("talk_title like", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleNotLike(String value) {
            addCriterion("talk_title not like", value, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleIn(List<String> values) {
            addCriterion("talk_title in", values, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleNotIn(List<String> values) {
            addCriterion("talk_title not in", values, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleBetween(String value1, String value2) {
            addCriterion("talk_title between", value1, value2, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkTitleNotBetween(String value1, String value2) {
            addCriterion("talk_title not between", value1, value2, "talkTitle");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlIsNull() {
            addCriterion("talk_image_url is null");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlIsNotNull() {
            addCriterion("talk_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlEqualTo(String value) {
            addCriterion("talk_image_url =", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlNotEqualTo(String value) {
            addCriterion("talk_image_url <>", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlGreaterThan(String value) {
            addCriterion("talk_image_url >", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("talk_image_url >=", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlLessThan(String value) {
            addCriterion("talk_image_url <", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlLessThanOrEqualTo(String value) {
            addCriterion("talk_image_url <=", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlLike(String value) {
            addCriterion("talk_image_url like", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlNotLike(String value) {
            addCriterion("talk_image_url not like", value, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlIn(List<String> values) {
            addCriterion("talk_image_url in", values, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlNotIn(List<String> values) {
            addCriterion("talk_image_url not in", values, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlBetween(String value1, String value2) {
            addCriterion("talk_image_url between", value1, value2, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andTalkImageUrlNotBetween(String value1, String value2) {
            addCriterion("talk_image_url not between", value1, value2, "talkImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdIsNull() {
            addCriterion("car_page_oem_id is null");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdIsNotNull() {
            addCriterion("car_page_oem_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdEqualTo(Long value) {
            addCriterion("car_page_oem_id =", value, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdNotEqualTo(Long value) {
            addCriterion("car_page_oem_id <>", value, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdGreaterThan(Long value) {
            addCriterion("car_page_oem_id >", value, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_page_oem_id >=", value, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdLessThan(Long value) {
            addCriterion("car_page_oem_id <", value, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdLessThanOrEqualTo(Long value) {
            addCriterion("car_page_oem_id <=", value, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdIn(List<Long> values) {
            addCriterion("car_page_oem_id in", values, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdNotIn(List<Long> values) {
            addCriterion("car_page_oem_id not in", values, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdBetween(Long value1, Long value2) {
            addCriterion("car_page_oem_id between", value1, value2, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andCarPageOemIdNotBetween(Long value1, Long value2) {
            addCriterion("car_page_oem_id not between", value1, value2, "carPageOemId");
            return (Criteria) this;
        }

        public Criteria andShowOrderIsNull() {
            addCriterion("show_order is null");
            return (Criteria) this;
        }

        public Criteria andShowOrderIsNotNull() {
            addCriterion("show_order is not null");
            return (Criteria) this;
        }

        public Criteria andShowOrderEqualTo(Integer value) {
            addCriterion("show_order =", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotEqualTo(Integer value) {
            addCriterion("show_order <>", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderGreaterThan(Integer value) {
            addCriterion("show_order >", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_order >=", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLessThan(Integer value) {
            addCriterion("show_order <", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderLessThanOrEqualTo(Integer value) {
            addCriterion("show_order <=", value, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderIn(List<Integer> values) {
            addCriterion("show_order in", values, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotIn(List<Integer> values) {
            addCriterion("show_order not in", values, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderBetween(Integer value1, Integer value2) {
            addCriterion("show_order between", value1, value2, "showOrder");
            return (Criteria) this;
        }

        public Criteria andShowOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("show_order not between", value1, value2, "showOrder");
            return (Criteria) this;
        }

        public Criteria andTalkIdIsNull() {
            addCriterion("talk_id is null");
            return (Criteria) this;
        }

        public Criteria andTalkIdIsNotNull() {
            addCriterion("talk_id is not null");
            return (Criteria) this;
        }

        public Criteria andTalkIdEqualTo(String value) {
            addCriterion("talk_id =", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotEqualTo(String value) {
            addCriterion("talk_id <>", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdGreaterThan(String value) {
            addCriterion("talk_id >", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdGreaterThanOrEqualTo(String value) {
            addCriterion("talk_id >=", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLessThan(String value) {
            addCriterion("talk_id <", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLessThanOrEqualTo(String value) {
            addCriterion("talk_id <=", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdLike(String value) {
            addCriterion("talk_id like", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotLike(String value) {
            addCriterion("talk_id not like", value, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdIn(List<String> values) {
            addCriterion("talk_id in", values, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotIn(List<String> values) {
            addCriterion("talk_id not in", values, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdBetween(String value1, String value2) {
            addCriterion("talk_id between", value1, value2, "talkId");
            return (Criteria) this;
        }

        public Criteria andTalkIdNotBetween(String value1, String value2) {
            addCriterion("talk_id not between", value1, value2, "talkId");
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