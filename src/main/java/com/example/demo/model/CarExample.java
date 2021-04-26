package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCarNameIsNull() {
            addCriterion("car_name is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("car_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("car_name =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("car_name <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("car_name >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_name >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("car_name <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("car_name <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("car_name like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("car_name not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("car_name in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("car_name not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("car_name between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("car_name not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarCodeIsNull() {
            addCriterion("car_code is null");
            return (Criteria) this;
        }

        public Criteria andCarCodeIsNotNull() {
            addCriterion("car_code is not null");
            return (Criteria) this;
        }

        public Criteria andCarCodeEqualTo(String value) {
            addCriterion("car_code =", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotEqualTo(String value) {
            addCriterion("car_code <>", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThan(String value) {
            addCriterion("car_code >", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("car_code >=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThan(String value) {
            addCriterion("car_code <", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThanOrEqualTo(String value) {
            addCriterion("car_code <=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLike(String value) {
            addCriterion("car_code like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotLike(String value) {
            addCriterion("car_code not like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeIn(List<String> values) {
            addCriterion("car_code in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotIn(List<String> values) {
            addCriterion("car_code not in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeBetween(String value1, String value2) {
            addCriterion("car_code between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotBetween(String value1, String value2) {
            addCriterion("car_code not between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarBackNameIsNull() {
            addCriterion("car_back_name is null");
            return (Criteria) this;
        }

        public Criteria andCarBackNameIsNotNull() {
            addCriterion("car_back_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarBackNameEqualTo(String value) {
            addCriterion("car_back_name =", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameNotEqualTo(String value) {
            addCriterion("car_back_name <>", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameGreaterThan(String value) {
            addCriterion("car_back_name >", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_back_name >=", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameLessThan(String value) {
            addCriterion("car_back_name <", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameLessThanOrEqualTo(String value) {
            addCriterion("car_back_name <=", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameLike(String value) {
            addCriterion("car_back_name like", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameNotLike(String value) {
            addCriterion("car_back_name not like", value, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameIn(List<String> values) {
            addCriterion("car_back_name in", values, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameNotIn(List<String> values) {
            addCriterion("car_back_name not in", values, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameBetween(String value1, String value2) {
            addCriterion("car_back_name between", value1, value2, "carBackName");
            return (Criteria) this;
        }

        public Criteria andCarBackNameNotBetween(String value1, String value2) {
            addCriterion("car_back_name not between", value1, value2, "carBackName");
            return (Criteria) this;
        }

        public Criteria andShowStatusIsNull() {
            addCriterion("show_status is null");
            return (Criteria) this;
        }

        public Criteria andShowStatusIsNotNull() {
            addCriterion("show_status is not null");
            return (Criteria) this;
        }

        public Criteria andShowStatusEqualTo(Boolean value) {
            addCriterion("show_status =", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotEqualTo(Boolean value) {
            addCriterion("show_status <>", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusGreaterThan(Boolean value) {
            addCriterion("show_status >", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_status >=", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusLessThan(Boolean value) {
            addCriterion("show_status <", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("show_status <=", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusIn(List<Boolean> values) {
            addCriterion("show_status in", values, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotIn(List<Boolean> values) {
            addCriterion("show_status not in", values, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("show_status between", value1, value2, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_status not between", value1, value2, "showStatus");
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

        public Criteria andMainImageTypeIsNull() {
            addCriterion("main_image_type is null");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeIsNotNull() {
            addCriterion("main_image_type is not null");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeEqualTo(Integer value) {
            addCriterion("main_image_type =", value, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeNotEqualTo(Integer value) {
            addCriterion("main_image_type <>", value, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeGreaterThan(Integer value) {
            addCriterion("main_image_type >", value, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_image_type >=", value, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeLessThan(Integer value) {
            addCriterion("main_image_type <", value, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("main_image_type <=", value, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeIn(List<Integer> values) {
            addCriterion("main_image_type in", values, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeNotIn(List<Integer> values) {
            addCriterion("main_image_type not in", values, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeBetween(Integer value1, Integer value2) {
            addCriterion("main_image_type between", value1, value2, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andMainImageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("main_image_type not between", value1, value2, "mainImageType");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlIsNull() {
            addCriterion("view_car_image_url is null");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlIsNotNull() {
            addCriterion("view_car_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlEqualTo(String value) {
            addCriterion("view_car_image_url =", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlNotEqualTo(String value) {
            addCriterion("view_car_image_url <>", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlGreaterThan(String value) {
            addCriterion("view_car_image_url >", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("view_car_image_url >=", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlLessThan(String value) {
            addCriterion("view_car_image_url <", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlLessThanOrEqualTo(String value) {
            addCriterion("view_car_image_url <=", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlLike(String value) {
            addCriterion("view_car_image_url like", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlNotLike(String value) {
            addCriterion("view_car_image_url not like", value, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlIn(List<String> values) {
            addCriterion("view_car_image_url in", values, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlNotIn(List<String> values) {
            addCriterion("view_car_image_url not in", values, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlBetween(String value1, String value2) {
            addCriterion("view_car_image_url between", value1, value2, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarImageUrlNotBetween(String value1, String value2) {
            addCriterion("view_car_image_url not between", value1, value2, "viewCarImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlIsNull() {
            addCriterion("view_car_redirect_url is null");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlIsNotNull() {
            addCriterion("view_car_redirect_url is not null");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlEqualTo(String value) {
            addCriterion("view_car_redirect_url =", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlNotEqualTo(String value) {
            addCriterion("view_car_redirect_url <>", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlGreaterThan(String value) {
            addCriterion("view_car_redirect_url >", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("view_car_redirect_url >=", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlLessThan(String value) {
            addCriterion("view_car_redirect_url <", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlLessThanOrEqualTo(String value) {
            addCriterion("view_car_redirect_url <=", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlLike(String value) {
            addCriterion("view_car_redirect_url like", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlNotLike(String value) {
            addCriterion("view_car_redirect_url not like", value, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlIn(List<String> values) {
            addCriterion("view_car_redirect_url in", values, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlNotIn(List<String> values) {
            addCriterion("view_car_redirect_url not in", values, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlBetween(String value1, String value2) {
            addCriterion("view_car_redirect_url between", value1, value2, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarRedirectUrlNotBetween(String value1, String value2) {
            addCriterion("view_car_redirect_url not between", value1, value2, "viewCarRedirectUrl");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusIsNull() {
            addCriterion("view_car_status is null");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusIsNotNull() {
            addCriterion("view_car_status is not null");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusEqualTo(Boolean value) {
            addCriterion("view_car_status =", value, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusNotEqualTo(Boolean value) {
            addCriterion("view_car_status <>", value, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusGreaterThan(Boolean value) {
            addCriterion("view_car_status >", value, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("view_car_status >=", value, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusLessThan(Boolean value) {
            addCriterion("view_car_status <", value, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("view_car_status <=", value, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusIn(List<Boolean> values) {
            addCriterion("view_car_status in", values, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusNotIn(List<Boolean> values) {
            addCriterion("view_car_status not in", values, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("view_car_status between", value1, value2, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andViewCarStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("view_car_status not between", value1, value2, "viewCarStatus");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlIsNull() {
            addCriterion("car_detail_image_url is null");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlIsNotNull() {
            addCriterion("car_detail_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlEqualTo(String value) {
            addCriterion("car_detail_image_url =", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlNotEqualTo(String value) {
            addCriterion("car_detail_image_url <>", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlGreaterThan(String value) {
            addCriterion("car_detail_image_url >", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("car_detail_image_url >=", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlLessThan(String value) {
            addCriterion("car_detail_image_url <", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlLessThanOrEqualTo(String value) {
            addCriterion("car_detail_image_url <=", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlLike(String value) {
            addCriterion("car_detail_image_url like", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlNotLike(String value) {
            addCriterion("car_detail_image_url not like", value, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlIn(List<String> values) {
            addCriterion("car_detail_image_url in", values, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlNotIn(List<String> values) {
            addCriterion("car_detail_image_url not in", values, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlBetween(String value1, String value2) {
            addCriterion("car_detail_image_url between", value1, value2, "carDetailImageUrl");
            return (Criteria) this;
        }

        public Criteria andCarDetailImageUrlNotBetween(String value1, String value2) {
            addCriterion("car_detail_image_url not between", value1, value2, "carDetailImageUrl");
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