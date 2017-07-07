package cn.bssys.po;

import java.util.ArrayList;
import java.util.List;

public class BsSystemddlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BsSystemddlExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andDdlcodeIsNull() {
            addCriterion("ddlCode is null");
            return (Criteria) this;
        }

        public Criteria andDdlcodeIsNotNull() {
            addCriterion("ddlCode is not null");
            return (Criteria) this;
        }

        public Criteria andDdlcodeEqualTo(Integer value) {
            addCriterion("ddlCode =", value, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeNotEqualTo(Integer value) {
            addCriterion("ddlCode <>", value, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeGreaterThan(Integer value) {
            addCriterion("ddlCode >", value, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ddlCode >=", value, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeLessThan(Integer value) {
            addCriterion("ddlCode <", value, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeLessThanOrEqualTo(Integer value) {
            addCriterion("ddlCode <=", value, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeIn(List<Integer> values) {
            addCriterion("ddlCode in", values, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeNotIn(List<Integer> values) {
            addCriterion("ddlCode not in", values, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeBetween(Integer value1, Integer value2) {
            addCriterion("ddlCode between", value1, value2, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ddlCode not between", value1, value2, "ddlcode");
            return (Criteria) this;
        }

        public Criteria andDdlnameIsNull() {
            addCriterion("ddlName is null");
            return (Criteria) this;
        }

        public Criteria andDdlnameIsNotNull() {
            addCriterion("ddlName is not null");
            return (Criteria) this;
        }

        public Criteria andDdlnameEqualTo(String value) {
            addCriterion("ddlName =", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotEqualTo(String value) {
            addCriterion("ddlName <>", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameGreaterThan(String value) {
            addCriterion("ddlName >", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameGreaterThanOrEqualTo(String value) {
            addCriterion("ddlName >=", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameLessThan(String value) {
            addCriterion("ddlName <", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameLessThanOrEqualTo(String value) {
            addCriterion("ddlName <=", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameLike(String value) {
            addCriterion("ddlName like", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotLike(String value) {
            addCriterion("ddlName not like", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameIn(List<String> values) {
            addCriterion("ddlName in", values, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotIn(List<String> values) {
            addCriterion("ddlName not in", values, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameBetween(String value1, String value2) {
            addCriterion("ddlName between", value1, value2, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotBetween(String value1, String value2) {
            addCriterion("ddlName not between", value1, value2, "ddlname");
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