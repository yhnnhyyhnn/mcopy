package cn.com.mcopy.db.model.mcopy;

import java.util.ArrayList;
import java.util.List;

public class TabsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TabsExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andTAB_IDIsNull() {
            addCriterion("TAB_ID is null");
            return (Criteria) this;
        }

        public Criteria andTAB_IDIsNotNull() {
            addCriterion("TAB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTAB_IDEqualTo(Integer value) {
            addCriterion("TAB_ID =", value, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDNotEqualTo(Integer value) {
            addCriterion("TAB_ID <>", value, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDGreaterThan(Integer value) {
            addCriterion("TAB_ID >", value, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAB_ID >=", value, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDLessThan(Integer value) {
            addCriterion("TAB_ID <", value, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDLessThanOrEqualTo(Integer value) {
            addCriterion("TAB_ID <=", value, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDIn(List<Integer> values) {
            addCriterion("TAB_ID in", values, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDNotIn(List<Integer> values) {
            addCriterion("TAB_ID not in", values, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDBetween(Integer value1, Integer value2) {
            addCriterion("TAB_ID between", value1, value2, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTAB_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("TAB_ID not between", value1, value2, "TAB_ID");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTITLEEqualTo(String value) {
            addCriterion("TITLE =", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotEqualTo(String value) {
            addCriterion("TITLE <>", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThan(String value) {
            addCriterion("TITLE >", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThan(String value) {
            addCriterion("TITLE <", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELike(String value) {
            addCriterion("TITLE like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotLike(String value) {
            addCriterion("TITLE not like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEIn(List<String> values) {
            addCriterion("TITLE in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotIn(List<String> values) {
            addCriterion("TITLE not in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andMENU_IDIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMENU_IDIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMENU_IDEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andMENU_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "MENU_ID");
            return (Criteria) this;
        }

        public Criteria andSORTIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSORTIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSORTEqualTo(String value) {
            addCriterion("SORT =", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTNotEqualTo(String value) {
            addCriterion("SORT <>", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTGreaterThan(String value) {
            addCriterion("SORT >", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTGreaterThanOrEqualTo(String value) {
            addCriterion("SORT >=", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTLessThan(String value) {
            addCriterion("SORT <", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTLessThanOrEqualTo(String value) {
            addCriterion("SORT <=", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTLike(String value) {
            addCriterion("SORT like", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTNotLike(String value) {
            addCriterion("SORT not like", value, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTIn(List<String> values) {
            addCriterion("SORT in", values, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTNotIn(List<String> values) {
            addCriterion("SORT not in", values, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTBetween(String value1, String value2) {
            addCriterion("SORT between", value1, value2, "SORT");
            return (Criteria) this;
        }

        public Criteria andSORTNotBetween(String value1, String value2) {
            addCriterion("SORT not between", value1, value2, "SORT");
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