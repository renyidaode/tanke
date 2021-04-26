package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDriveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestDriveExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andBookingDateIsNull() {
            addCriterion("booking_date is null");
            return (Criteria) this;
        }

        public Criteria andBookingDateIsNotNull() {
            addCriterion("booking_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookingDateEqualTo(Date value) {
            addCriterion("booking_date =", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotEqualTo(Date value) {
            addCriterion("booking_date <>", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateGreaterThan(Date value) {
            addCriterion("booking_date >", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("booking_date >=", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLessThan(Date value) {
            addCriterion("booking_date <", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLessThanOrEqualTo(Date value) {
            addCriterion("booking_date <=", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateIn(List<Date> values) {
            addCriterion("booking_date in", values, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotIn(List<Date> values) {
            addCriterion("booking_date not in", values, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateBetween(Date value1, Date value2) {
            addCriterion("booking_date between", value1, value2, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotBetween(Date value1, Date value2) {
            addCriterion("booking_date not between", value1, value2, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Long value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Long value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Long value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Long value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Long value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Long> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Long> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Long value1, Long value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Long value1, Long value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCrmIdIsNull() {
            addCriterion("crm_id is null");
            return (Criteria) this;
        }

        public Criteria andCrmIdIsNotNull() {
            addCriterion("crm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrmIdEqualTo(String value) {
            addCriterion("crm_id =", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotEqualTo(String value) {
            addCriterion("crm_id <>", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdGreaterThan(String value) {
            addCriterion("crm_id >", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdGreaterThanOrEqualTo(String value) {
            addCriterion("crm_id >=", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdLessThan(String value) {
            addCriterion("crm_id <", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdLessThanOrEqualTo(String value) {
            addCriterion("crm_id <=", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdLike(String value) {
            addCriterion("crm_id like", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotLike(String value) {
            addCriterion("crm_id not like", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdIn(List<String> values) {
            addCriterion("crm_id in", values, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotIn(List<String> values) {
            addCriterion("crm_id not in", values, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdBetween(String value1, String value2) {
            addCriterion("crm_id between", value1, value2, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotBetween(String value1, String value2) {
            addCriterion("crm_id not between", value1, value2, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmStatusIsNull() {
            addCriterion("crm_status is null");
            return (Criteria) this;
        }

        public Criteria andCrmStatusIsNotNull() {
            addCriterion("crm_status is not null");
            return (Criteria) this;
        }

        public Criteria andCrmStatusEqualTo(Integer value) {
            addCriterion("crm_status =", value, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusNotEqualTo(Integer value) {
            addCriterion("crm_status <>", value, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusGreaterThan(Integer value) {
            addCriterion("crm_status >", value, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("crm_status >=", value, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusLessThan(Integer value) {
            addCriterion("crm_status <", value, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusLessThanOrEqualTo(Integer value) {
            addCriterion("crm_status <=", value, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusIn(List<Integer> values) {
            addCriterion("crm_status in", values, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusNotIn(List<Integer> values) {
            addCriterion("crm_status not in", values, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusBetween(Integer value1, Integer value2) {
            addCriterion("crm_status between", value1, value2, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("crm_status not between", value1, value2, "crmStatus");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateIsNull() {
            addCriterion("crm_drive_date is null");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateIsNotNull() {
            addCriterion("crm_drive_date is not null");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateEqualTo(Date value) {
            addCriterion("crm_drive_date =", value, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateNotEqualTo(Date value) {
            addCriterion("crm_drive_date <>", value, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateGreaterThan(Date value) {
            addCriterion("crm_drive_date >", value, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("crm_drive_date >=", value, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateLessThan(Date value) {
            addCriterion("crm_drive_date <", value, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateLessThanOrEqualTo(Date value) {
            addCriterion("crm_drive_date <=", value, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateIn(List<Date> values) {
            addCriterion("crm_drive_date in", values, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateNotIn(List<Date> values) {
            addCriterion("crm_drive_date not in", values, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateBetween(Date value1, Date value2) {
            addCriterion("crm_drive_date between", value1, value2, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andCrmDriveDateNotBetween(Date value1, Date value2) {
            addCriterion("crm_drive_date not between", value1, value2, "crmDriveDate");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdIsNull() {
            addCriterion("invite_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdIsNotNull() {
            addCriterion("invite_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdEqualTo(Long value) {
            addCriterion("invite_user_id =", value, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdNotEqualTo(Long value) {
            addCriterion("invite_user_id <>", value, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdGreaterThan(Long value) {
            addCriterion("invite_user_id >", value, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("invite_user_id >=", value, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdLessThan(Long value) {
            addCriterion("invite_user_id <", value, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdLessThanOrEqualTo(Long value) {
            addCriterion("invite_user_id <=", value, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdIn(List<Long> values) {
            addCriterion("invite_user_id in", values, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdNotIn(List<Long> values) {
            addCriterion("invite_user_id not in", values, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdBetween(Long value1, Long value2) {
            addCriterion("invite_user_id between", value1, value2, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteUserIdNotBetween(Long value1, Long value2) {
            addCriterion("invite_user_id not between", value1, value2, "inviteUserId");
            return (Criteria) this;
        }

        public Criteria andInviteStatusIsNull() {
            addCriterion("invite_status is null");
            return (Criteria) this;
        }

        public Criteria andInviteStatusIsNotNull() {
            addCriterion("invite_status is not null");
            return (Criteria) this;
        }

        public Criteria andInviteStatusEqualTo(Integer value) {
            addCriterion("invite_status =", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusNotEqualTo(Integer value) {
            addCriterion("invite_status <>", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusGreaterThan(Integer value) {
            addCriterion("invite_status >", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_status >=", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusLessThan(Integer value) {
            addCriterion("invite_status <", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("invite_status <=", value, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusIn(List<Integer> values) {
            addCriterion("invite_status in", values, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusNotIn(List<Integer> values) {
            addCriterion("invite_status not in", values, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusBetween(Integer value1, Integer value2) {
            addCriterion("invite_status between", value1, value2, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_status not between", value1, value2, "inviteStatus");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonIsNull() {
            addCriterion("invite_fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonIsNotNull() {
            addCriterion("invite_fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonEqualTo(String value) {
            addCriterion("invite_fail_reason =", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonNotEqualTo(String value) {
            addCriterion("invite_fail_reason <>", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonGreaterThan(String value) {
            addCriterion("invite_fail_reason >", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("invite_fail_reason >=", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonLessThan(String value) {
            addCriterion("invite_fail_reason <", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonLessThanOrEqualTo(String value) {
            addCriterion("invite_fail_reason <=", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonLike(String value) {
            addCriterion("invite_fail_reason like", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonNotLike(String value) {
            addCriterion("invite_fail_reason not like", value, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonIn(List<String> values) {
            addCriterion("invite_fail_reason in", values, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonNotIn(List<String> values) {
            addCriterion("invite_fail_reason not in", values, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonBetween(String value1, String value2) {
            addCriterion("invite_fail_reason between", value1, value2, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andInviteFailReasonNotBetween(String value1, String value2) {
            addCriterion("invite_fail_reason not between", value1, value2, "inviteFailReason");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusIsNull() {
            addCriterion("manuel_edit_drive_status is null");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusIsNotNull() {
            addCriterion("manuel_edit_drive_status is not null");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusEqualTo(Boolean value) {
            addCriterion("manuel_edit_drive_status =", value, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusNotEqualTo(Boolean value) {
            addCriterion("manuel_edit_drive_status <>", value, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusGreaterThan(Boolean value) {
            addCriterion("manuel_edit_drive_status >", value, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("manuel_edit_drive_status >=", value, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusLessThan(Boolean value) {
            addCriterion("manuel_edit_drive_status <", value, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("manuel_edit_drive_status <=", value, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusIn(List<Boolean> values) {
            addCriterion("manuel_edit_drive_status in", values, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusNotIn(List<Boolean> values) {
            addCriterion("manuel_edit_drive_status not in", values, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("manuel_edit_drive_status between", value1, value2, "manuelEditDriveStatus");
            return (Criteria) this;
        }

        public Criteria andManuelEditDriveStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("manuel_edit_drive_status not between", value1, value2, "manuelEditDriveStatus");
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

        public Criteria andRewardCollectStatusIsNull() {
            addCriterion("reward_collect_status is null");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusIsNotNull() {
            addCriterion("reward_collect_status is not null");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusEqualTo(Boolean value) {
            addCriterion("reward_collect_status =", value, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusNotEqualTo(Boolean value) {
            addCriterion("reward_collect_status <>", value, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusGreaterThan(Boolean value) {
            addCriterion("reward_collect_status >", value, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reward_collect_status >=", value, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusLessThan(Boolean value) {
            addCriterion("reward_collect_status <", value, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("reward_collect_status <=", value, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusIn(List<Boolean> values) {
            addCriterion("reward_collect_status in", values, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusNotIn(List<Boolean> values) {
            addCriterion("reward_collect_status not in", values, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("reward_collect_status between", value1, value2, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andRewardCollectStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reward_collect_status not between", value1, value2, "rewardCollectStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusIsNull() {
            addCriterion("count_invite_status is null");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusIsNotNull() {
            addCriterion("count_invite_status is not null");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusEqualTo(Boolean value) {
            addCriterion("count_invite_status =", value, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusNotEqualTo(Boolean value) {
            addCriterion("count_invite_status <>", value, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusGreaterThan(Boolean value) {
            addCriterion("count_invite_status >", value, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("count_invite_status >=", value, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusLessThan(Boolean value) {
            addCriterion("count_invite_status <", value, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("count_invite_status <=", value, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusIn(List<Boolean> values) {
            addCriterion("count_invite_status in", values, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusNotIn(List<Boolean> values) {
            addCriterion("count_invite_status not in", values, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("count_invite_status between", value1, value2, "countInviteStatus");
            return (Criteria) this;
        }

        public Criteria andCountInviteStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("count_invite_status not between", value1, value2, "countInviteStatus");
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