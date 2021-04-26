package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class DealerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealerExample() {
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

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerAddressIsNull() {
            addCriterion("dealer_address is null");
            return (Criteria) this;
        }

        public Criteria andDealerAddressIsNotNull() {
            addCriterion("dealer_address is not null");
            return (Criteria) this;
        }

        public Criteria andDealerAddressEqualTo(String value) {
            addCriterion("dealer_address =", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressNotEqualTo(String value) {
            addCriterion("dealer_address <>", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressGreaterThan(String value) {
            addCriterion("dealer_address >", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_address >=", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressLessThan(String value) {
            addCriterion("dealer_address <", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressLessThanOrEqualTo(String value) {
            addCriterion("dealer_address <=", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressLike(String value) {
            addCriterion("dealer_address like", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressNotLike(String value) {
            addCriterion("dealer_address not like", value, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressIn(List<String> values) {
            addCriterion("dealer_address in", values, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressNotIn(List<String> values) {
            addCriterion("dealer_address not in", values, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressBetween(String value1, String value2) {
            addCriterion("dealer_address between", value1, value2, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerAddressNotBetween(String value1, String value2) {
            addCriterion("dealer_address not between", value1, value2, "dealerAddress");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIsNull() {
            addCriterion("dealer_code is null");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIsNotNull() {
            addCriterion("dealer_code is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCodeEqualTo(String value) {
            addCriterion("dealer_code =", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotEqualTo(String value) {
            addCriterion("dealer_code <>", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeGreaterThan(String value) {
            addCriterion("dealer_code >", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_code >=", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLessThan(String value) {
            addCriterion("dealer_code <", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLessThanOrEqualTo(String value) {
            addCriterion("dealer_code <=", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLike(String value) {
            addCriterion("dealer_code like", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotLike(String value) {
            addCriterion("dealer_code not like", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIn(List<String> values) {
            addCriterion("dealer_code in", values, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotIn(List<String> values) {
            addCriterion("dealer_code not in", values, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeBetween(String value1, String value2) {
            addCriterion("dealer_code between", value1, value2, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotBetween(String value1, String value2) {
            addCriterion("dealer_code not between", value1, value2, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesIsNull() {
            addCriterion("dealer_coordinates is null");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesIsNotNull() {
            addCriterion("dealer_coordinates is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesEqualTo(String value) {
            addCriterion("dealer_coordinates =", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesNotEqualTo(String value) {
            addCriterion("dealer_coordinates <>", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesGreaterThan(String value) {
            addCriterion("dealer_coordinates >", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_coordinates >=", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesLessThan(String value) {
            addCriterion("dealer_coordinates <", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesLessThanOrEqualTo(String value) {
            addCriterion("dealer_coordinates <=", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesLike(String value) {
            addCriterion("dealer_coordinates like", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesNotLike(String value) {
            addCriterion("dealer_coordinates not like", value, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesIn(List<String> values) {
            addCriterion("dealer_coordinates in", values, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesNotIn(List<String> values) {
            addCriterion("dealer_coordinates not in", values, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesBetween(String value1, String value2) {
            addCriterion("dealer_coordinates between", value1, value2, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andDealerCoordinatesNotBetween(String value1, String value2) {
            addCriterion("dealer_coordinates not between", value1, value2, "dealerCoordinates");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("contact_number =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("contact_number <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("contact_number like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("contact_number not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("contact_number in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andDealerStatusIsNull() {
            addCriterion("dealer_status is null");
            return (Criteria) this;
        }

        public Criteria andDealerStatusIsNotNull() {
            addCriterion("dealer_status is not null");
            return (Criteria) this;
        }

        public Criteria andDealerStatusEqualTo(Integer value) {
            addCriterion("dealer_status =", value, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusNotEqualTo(Integer value) {
            addCriterion("dealer_status <>", value, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusGreaterThan(Integer value) {
            addCriterion("dealer_status >", value, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dealer_status >=", value, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusLessThan(Integer value) {
            addCriterion("dealer_status <", value, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dealer_status <=", value, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusIn(List<Integer> values) {
            addCriterion("dealer_status in", values, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusNotIn(List<Integer> values) {
            addCriterion("dealer_status not in", values, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusBetween(Integer value1, Integer value2) {
            addCriterion("dealer_status between", value1, value2, "dealerStatus");
            return (Criteria) this;
        }

        public Criteria andDealerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dealer_status not between", value1, value2, "dealerStatus");
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