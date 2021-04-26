package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerCeshiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerCeshiExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("banner_id is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("banner_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Integer value) {
            addCriterion("banner_id =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Integer value) {
            addCriterion("banner_id <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Integer value) {
            addCriterion("banner_id >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_id >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Integer value) {
            addCriterion("banner_id <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Integer value) {
            addCriterion("banner_id <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Integer> values) {
            addCriterion("banner_id in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Integer> values) {
            addCriterion("banner_id not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Integer value1, Integer value2) {
            addCriterion("banner_id between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_id not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerTitleIsNull() {
            addCriterion("banner_title is null");
            return (Criteria) this;
        }

        public Criteria andBannerTitleIsNotNull() {
            addCriterion("banner_title is not null");
            return (Criteria) this;
        }

        public Criteria andBannerTitleEqualTo(String value) {
            addCriterion("banner_title =", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleNotEqualTo(String value) {
            addCriterion("banner_title <>", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleGreaterThan(String value) {
            addCriterion("banner_title >", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("banner_title >=", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleLessThan(String value) {
            addCriterion("banner_title <", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleLessThanOrEqualTo(String value) {
            addCriterion("banner_title <=", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleLike(String value) {
            addCriterion("banner_title like", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleNotLike(String value) {
            addCriterion("banner_title not like", value, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleIn(List<String> values) {
            addCriterion("banner_title in", values, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleNotIn(List<String> values) {
            addCriterion("banner_title not in", values, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleBetween(String value1, String value2) {
            addCriterion("banner_title between", value1, value2, "bannerTitle");
            return (Criteria) this;
        }

        public Criteria andBannerTitleNotBetween(String value1, String value2) {
            addCriterion("banner_title not between", value1, value2, "bannerTitle");
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

        public Criteria andBannerTypeIsNull() {
            addCriterion("banner_type is null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNotNull() {
            addCriterion("banner_type is not null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeEqualTo(Integer value) {
            addCriterion("banner_type =", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotEqualTo(Integer value) {
            addCriterion("banner_type <>", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThan(Integer value) {
            addCriterion("banner_type >", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_type >=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThan(Integer value) {
            addCriterion("banner_type <", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("banner_type <=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIn(List<Integer> values) {
            addCriterion("banner_type in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotIn(List<Integer> values) {
            addCriterion("banner_type not in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeBetween(Integer value1, Integer value2) {
            addCriterion("banner_type between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_type not between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerStatusIsNull() {
            addCriterion("banner_status is null");
            return (Criteria) this;
        }

        public Criteria andBannerStatusIsNotNull() {
            addCriterion("banner_status is not null");
            return (Criteria) this;
        }

        public Criteria andBannerStatusEqualTo(Boolean value) {
            addCriterion("banner_status =", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusNotEqualTo(Boolean value) {
            addCriterion("banner_status <>", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusGreaterThan(Boolean value) {
            addCriterion("banner_status >", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banner_status >=", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusLessThan(Boolean value) {
            addCriterion("banner_status <", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("banner_status <=", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusIn(List<Boolean> values) {
            addCriterion("banner_status in", values, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusNotIn(List<Boolean> values) {
            addCriterion("banner_status not in", values, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("banner_status between", value1, value2, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banner_status not between", value1, value2, "bannerStatus");
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

        public Criteria andEventstartTimeIsNull() {
            addCriterion("eventstart_time is null");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeIsNotNull() {
            addCriterion("eventstart_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeEqualTo(Date value) {
            addCriterion("eventstart_time =", value, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeNotEqualTo(Date value) {
            addCriterion("eventstart_time <>", value, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeGreaterThan(Date value) {
            addCriterion("eventstart_time >", value, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eventstart_time >=", value, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeLessThan(Date value) {
            addCriterion("eventstart_time <", value, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeLessThanOrEqualTo(Date value) {
            addCriterion("eventstart_time <=", value, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeIn(List<Date> values) {
            addCriterion("eventstart_time in", values, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeNotIn(List<Date> values) {
            addCriterion("eventstart_time not in", values, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeBetween(Date value1, Date value2) {
            addCriterion("eventstart_time between", value1, value2, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventstartTimeNotBetween(Date value1, Date value2) {
            addCriterion("eventstart_time not between", value1, value2, "eventstartTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeIsNull() {
            addCriterion("eventend_time is null");
            return (Criteria) this;
        }

        public Criteria andEventendTimeIsNotNull() {
            addCriterion("eventend_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventendTimeEqualTo(Date value) {
            addCriterion("eventend_time =", value, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeNotEqualTo(Date value) {
            addCriterion("eventend_time <>", value, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeGreaterThan(Date value) {
            addCriterion("eventend_time >", value, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eventend_time >=", value, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeLessThan(Date value) {
            addCriterion("eventend_time <", value, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeLessThanOrEqualTo(Date value) {
            addCriterion("eventend_time <=", value, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeIn(List<Date> values) {
            addCriterion("eventend_time in", values, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeNotIn(List<Date> values) {
            addCriterion("eventend_time not in", values, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeBetween(Date value1, Date value2) {
            addCriterion("eventend_time between", value1, value2, "eventendTime");
            return (Criteria) this;
        }

        public Criteria andEventendTimeNotBetween(Date value1, Date value2) {
            addCriterion("eventend_time not between", value1, value2, "eventendTime");
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

        public Criteria andClicksPvIsNull() {
            addCriterion("clicks_pv is null");
            return (Criteria) this;
        }

        public Criteria andClicksPvIsNotNull() {
            addCriterion("clicks_pv is not null");
            return (Criteria) this;
        }

        public Criteria andClicksPvEqualTo(Integer value) {
            addCriterion("clicks_pv =", value, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvNotEqualTo(Integer value) {
            addCriterion("clicks_pv <>", value, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvGreaterThan(Integer value) {
            addCriterion("clicks_pv >", value, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicks_pv >=", value, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvLessThan(Integer value) {
            addCriterion("clicks_pv <", value, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvLessThanOrEqualTo(Integer value) {
            addCriterion("clicks_pv <=", value, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvIn(List<Integer> values) {
            addCriterion("clicks_pv in", values, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvNotIn(List<Integer> values) {
            addCriterion("clicks_pv not in", values, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvBetween(Integer value1, Integer value2) {
            addCriterion("clicks_pv between", value1, value2, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksPvNotBetween(Integer value1, Integer value2) {
            addCriterion("clicks_pv not between", value1, value2, "clicksPv");
            return (Criteria) this;
        }

        public Criteria andClicksUvIsNull() {
            addCriterion("clicks_uv is null");
            return (Criteria) this;
        }

        public Criteria andClicksUvIsNotNull() {
            addCriterion("clicks_uv is not null");
            return (Criteria) this;
        }

        public Criteria andClicksUvEqualTo(Integer value) {
            addCriterion("clicks_uv =", value, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvNotEqualTo(Integer value) {
            addCriterion("clicks_uv <>", value, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvGreaterThan(Integer value) {
            addCriterion("clicks_uv >", value, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicks_uv >=", value, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvLessThan(Integer value) {
            addCriterion("clicks_uv <", value, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvLessThanOrEqualTo(Integer value) {
            addCriterion("clicks_uv <=", value, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvIn(List<Integer> values) {
            addCriterion("clicks_uv in", values, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvNotIn(List<Integer> values) {
            addCriterion("clicks_uv not in", values, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvBetween(Integer value1, Integer value2) {
            addCriterion("clicks_uv between", value1, value2, "clicksUv");
            return (Criteria) this;
        }

        public Criteria andClicksUvNotBetween(Integer value1, Integer value2) {
            addCriterion("clicks_uv not between", value1, value2, "clicksUv");
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