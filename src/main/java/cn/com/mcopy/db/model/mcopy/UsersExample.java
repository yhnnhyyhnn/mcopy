package cn.com.mcopy.db.model.mcopy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUSER_IDIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThan(Integer value) {
            addCriterion("USER_ID <", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEEqualTo(String value) {
            addCriterion("USERNAME =", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEGreaterThan(String value) {
            addCriterion("USERNAME >", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMELessThan(String value) {
            addCriterion("USERNAME <", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMELessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMELike(String value) {
            addCriterion("USERNAME like", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotLike(String value) {
            addCriterion("USERNAME not like", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEIn(List<String> values) {
            addCriterion("USERNAME in", values, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEIsNull() {
            addCriterion("LOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEIsNotNull() {
            addCriterion("LOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEEqualTo(String value) {
            addCriterion("LOGINNAME =", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMENotEqualTo(String value) {
            addCriterion("LOGINNAME <>", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEGreaterThan(String value) {
            addCriterion("LOGINNAME >", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINNAME >=", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMELessThan(String value) {
            addCriterion("LOGINNAME <", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMELessThanOrEqualTo(String value) {
            addCriterion("LOGINNAME <=", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMELike(String value) {
            addCriterion("LOGINNAME like", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMENotLike(String value) {
            addCriterion("LOGINNAME not like", value, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEIn(List<String> values) {
            addCriterion("LOGINNAME in", values, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMENotIn(List<String> values) {
            addCriterion("LOGINNAME not in", values, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMEBetween(String value1, String value2) {
            addCriterion("LOGINNAME between", value1, value2, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andLOGINNAMENotBetween(String value1, String value2) {
            addCriterion("LOGINNAME not between", value1, value2, "LOGINNAME");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELessThan(Date value) {
            addCriterion("CREATETIME <", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELIsNull() {
            addCriterion("USERLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELIsNotNull() {
            addCriterion("USERLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELEqualTo(String value) {
            addCriterion("USERLEVEL =", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELNotEqualTo(String value) {
            addCriterion("USERLEVEL <>", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELGreaterThan(String value) {
            addCriterion("USERLEVEL >", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELGreaterThanOrEqualTo(String value) {
            addCriterion("USERLEVEL >=", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELLessThan(String value) {
            addCriterion("USERLEVEL <", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELLessThanOrEqualTo(String value) {
            addCriterion("USERLEVEL <=", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELLike(String value) {
            addCriterion("USERLEVEL like", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELNotLike(String value) {
            addCriterion("USERLEVEL not like", value, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELIn(List<String> values) {
            addCriterion("USERLEVEL in", values, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELNotIn(List<String> values) {
            addCriterion("USERLEVEL not in", values, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELBetween(String value1, String value2) {
            addCriterion("USERLEVEL between", value1, value2, "USERLEVEL");
            return (Criteria) this;
        }

        public Criteria andUSERLEVELNotBetween(String value1, String value2) {
            addCriterion("USERLEVEL not between", value1, value2, "USERLEVEL");
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