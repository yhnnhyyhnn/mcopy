package cn.com.mcopy.db.model.mcopy;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMENUNAMEIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMENUNAMEIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMENUNAMEEqualTo(String value) {
            addCriterion("MENUNAME =", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMENotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMEGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMELessThan(String value) {
            addCriterion("MENUNAME <", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMELessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMELike(String value) {
            addCriterion("MENUNAME like", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMENotLike(String value) {
            addCriterion("MENUNAME not like", value, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMEIn(List<String> values) {
            addCriterion("MENUNAME in", values, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMENotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMEBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAMENotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "MENUNAME");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENIsNull() {
            addCriterion("MENUNAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENIsNotNull() {
            addCriterion("MENUNAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENEqualTo(String value) {
            addCriterion("MENUNAME_EN =", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENNotEqualTo(String value) {
            addCriterion("MENUNAME_EN <>", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENGreaterThan(String value) {
            addCriterion("MENUNAME_EN >", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME_EN >=", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENLessThan(String value) {
            addCriterion("MENUNAME_EN <", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME_EN <=", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENLike(String value) {
            addCriterion("MENUNAME_EN like", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENNotLike(String value) {
            addCriterion("MENUNAME_EN not like", value, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENIn(List<String> values) {
            addCriterion("MENUNAME_EN in", values, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENNotIn(List<String> values) {
            addCriterion("MENUNAME_EN not in", values, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENBetween(String value1, String value2) {
            addCriterion("MENUNAME_EN between", value1, value2, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENUNAME_ENNotBetween(String value1, String value2) {
            addCriterion("MENUNAME_EN not between", value1, value2, "MENUNAME_EN");
            return (Criteria) this;
        }

        public Criteria andMENULEVELIsNull() {
            addCriterion("MENULEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMENULEVELIsNotNull() {
            addCriterion("MENULEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMENULEVELEqualTo(String value) {
            addCriterion("MENULEVEL =", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELNotEqualTo(String value) {
            addCriterion("MENULEVEL <>", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELGreaterThan(String value) {
            addCriterion("MENULEVEL >", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELGreaterThanOrEqualTo(String value) {
            addCriterion("MENULEVEL >=", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELLessThan(String value) {
            addCriterion("MENULEVEL <", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELLessThanOrEqualTo(String value) {
            addCriterion("MENULEVEL <=", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELLike(String value) {
            addCriterion("MENULEVEL like", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELNotLike(String value) {
            addCriterion("MENULEVEL not like", value, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELIn(List<String> values) {
            addCriterion("MENULEVEL in", values, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELNotIn(List<String> values) {
            addCriterion("MENULEVEL not in", values, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELBetween(String value1, String value2) {
            addCriterion("MENULEVEL between", value1, value2, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andMENULEVELNotBetween(String value1, String value2) {
            addCriterion("MENULEVEL not between", value1, value2, "MENULEVEL");
            return (Criteria) this;
        }

        public Criteria andUSETEMPIsNull() {
            addCriterion("USETEMP is null");
            return (Criteria) this;
        }

        public Criteria andUSETEMPIsNotNull() {
            addCriterion("USETEMP is not null");
            return (Criteria) this;
        }

        public Criteria andUSETEMPEqualTo(String value) {
            addCriterion("USETEMP =", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPNotEqualTo(String value) {
            addCriterion("USETEMP <>", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPGreaterThan(String value) {
            addCriterion("USETEMP >", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPGreaterThanOrEqualTo(String value) {
            addCriterion("USETEMP >=", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPLessThan(String value) {
            addCriterion("USETEMP <", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPLessThanOrEqualTo(String value) {
            addCriterion("USETEMP <=", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPLike(String value) {
            addCriterion("USETEMP like", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPNotLike(String value) {
            addCriterion("USETEMP not like", value, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPIn(List<String> values) {
            addCriterion("USETEMP in", values, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPNotIn(List<String> values) {
            addCriterion("USETEMP not in", values, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPBetween(String value1, String value2) {
            addCriterion("USETEMP between", value1, value2, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andUSETEMPNotBetween(String value1, String value2) {
            addCriterion("USETEMP not between", value1, value2, "USETEMP");
            return (Criteria) this;
        }

        public Criteria andURLIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andURLIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andURLEqualTo(String value) {
            addCriterion("URL =", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotEqualTo(String value) {
            addCriterion("URL <>", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThan(String value) {
            addCriterion("URL >", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThan(String value) {
            addCriterion("URL <", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLike(String value) {
            addCriterion("URL like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotLike(String value) {
            addCriterion("URL not like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLIn(List<String> values) {
            addCriterion("URL in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotIn(List<String> values) {
            addCriterion("URL not in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andPARENTIsNull() {
            addCriterion("PARENT is null");
            return (Criteria) this;
        }

        public Criteria andPARENTIsNotNull() {
            addCriterion("PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andPARENTEqualTo(Integer value) {
            addCriterion("PARENT =", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotEqualTo(Integer value) {
            addCriterion("PARENT <>", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTGreaterThan(Integer value) {
            addCriterion("PARENT >", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT >=", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTLessThan(Integer value) {
            addCriterion("PARENT <", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT <=", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTIn(List<Integer> values) {
            addCriterion("PARENT in", values, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotIn(List<Integer> values) {
            addCriterion("PARENT not in", values, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTBetween(Integer value1, Integer value2) {
            addCriterion("PARENT between", value1, value2, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT not between", value1, value2, "PARENT");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("STATUS like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("STATUS not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
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