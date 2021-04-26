package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlIsNull() {
            addCriterion("http_url is null");
            return (Criteria) this;
        }

        public Criteria andHttpUrlIsNotNull() {
            addCriterion("http_url is not null");
            return (Criteria) this;
        }

        public Criteria andHttpUrlEqualTo(String value) {
            addCriterion("http_url =", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlNotEqualTo(String value) {
            addCriterion("http_url <>", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlGreaterThan(String value) {
            addCriterion("http_url >", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("http_url >=", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlLessThan(String value) {
            addCriterion("http_url <", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlLessThanOrEqualTo(String value) {
            addCriterion("http_url <=", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlLike(String value) {
            addCriterion("http_url like", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlNotLike(String value) {
            addCriterion("http_url not like", value, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlIn(List<String> values) {
            addCriterion("http_url in", values, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlNotIn(List<String> values) {
            addCriterion("http_url not in", values, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlBetween(String value1, String value2) {
            addCriterion("http_url between", value1, value2, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andHttpUrlNotBetween(String value1, String value2) {
            addCriterion("http_url not between", value1, value2, "httpUrl");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andActiveStatusIsNull() {
            addCriterion("active_status is null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIsNotNull() {
            addCriterion("active_status is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusEqualTo(Boolean value) {
            addCriterion("active_status =", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotEqualTo(Boolean value) {
            addCriterion("active_status <>", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThan(Boolean value) {
            addCriterion("active_status >", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active_status >=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThan(Boolean value) {
            addCriterion("active_status <", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("active_status <=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIn(List<Boolean> values) {
            addCriterion("active_status in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotIn(List<Boolean> values) {
            addCriterion("active_status not in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("active_status between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active_status not between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Date value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Date value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Date value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Date value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Date> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Date> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Date value1, Date value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeIsNull() {
            addCriterion("deactive_time is null");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeIsNotNull() {
            addCriterion("deactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeEqualTo(Date value) {
            addCriterion("deactive_time =", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeNotEqualTo(Date value) {
            addCriterion("deactive_time <>", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeGreaterThan(Date value) {
            addCriterion("deactive_time >", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deactive_time >=", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeLessThan(Date value) {
            addCriterion("deactive_time <", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("deactive_time <=", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeIn(List<Date> values) {
            addCriterion("deactive_time in", values, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeNotIn(List<Date> values) {
            addCriterion("deactive_time not in", values, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeBetween(Date value1, Date value2) {
            addCriterion("deactive_time between", value1, value2, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("deactive_time not between", value1, value2, "deactiveTime");
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

        public Criteria andTimedActiveTimeIsNull() {
            addCriterion("timed_active_time is null");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeIsNotNull() {
            addCriterion("timed_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeEqualTo(Date value) {
            addCriterion("timed_active_time =", value, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeNotEqualTo(Date value) {
            addCriterion("timed_active_time <>", value, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeGreaterThan(Date value) {
            addCriterion("timed_active_time >", value, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("timed_active_time >=", value, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeLessThan(Date value) {
            addCriterion("timed_active_time <", value, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("timed_active_time <=", value, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeIn(List<Date> values) {
            addCriterion("timed_active_time in", values, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeNotIn(List<Date> values) {
            addCriterion("timed_active_time not in", values, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeBetween(Date value1, Date value2) {
            addCriterion("timed_active_time between", value1, value2, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("timed_active_time not between", value1, value2, "timedActiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeIsNull() {
            addCriterion("timed_deactive_time is null");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeIsNotNull() {
            addCriterion("timed_deactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeEqualTo(Date value) {
            addCriterion("timed_deactive_time =", value, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeNotEqualTo(Date value) {
            addCriterion("timed_deactive_time <>", value, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeGreaterThan(Date value) {
            addCriterion("timed_deactive_time >", value, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("timed_deactive_time >=", value, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeLessThan(Date value) {
            addCriterion("timed_deactive_time <", value, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("timed_deactive_time <=", value, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeIn(List<Date> values) {
            addCriterion("timed_deactive_time in", values, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeNotIn(List<Date> values) {
            addCriterion("timed_deactive_time not in", values, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeBetween(Date value1, Date value2) {
            addCriterion("timed_deactive_time between", value1, value2, "timedDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andTimedDeactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("timed_deactive_time not between", value1, value2, "timedDeactiveTime");
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