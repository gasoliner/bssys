package cn.bssys.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BsTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BsTopicExample() {
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

        public Criteria andToidIsNull() {
            addCriterion("toid is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("toid is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(Integer value) {
            addCriterion("toid =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(Integer value) {
            addCriterion("toid <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(Integer value) {
            addCriterion("toid >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(Integer value) {
            addCriterion("toid >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(Integer value) {
            addCriterion("toid <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(Integer value) {
            addCriterion("toid <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<Integer> values) {
            addCriterion("toid in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<Integer> values) {
            addCriterion("toid not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(Integer value1, Integer value2) {
            addCriterion("toid between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(Integer value1, Integer value2) {
            addCriterion("toid not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(Integer value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(Integer value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(Integer value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(Integer value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(Integer value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(Integer value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<Integer> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<Integer> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(Integer value1, Integer value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(Integer value1, Integer value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(Integer value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(Integer value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(Integer value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(Integer value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(Integer value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<Integer> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<Integer> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(Integer value1, Integer value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
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

        public Criteria andExplainingIsNull() {
            addCriterion("explaining is null");
            return (Criteria) this;
        }

        public Criteria andExplainingIsNotNull() {
            addCriterion("explaining is not null");
            return (Criteria) this;
        }

        public Criteria andExplainingEqualTo(String value) {
            addCriterion("explaining =", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingNotEqualTo(String value) {
            addCriterion("explaining <>", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingGreaterThan(String value) {
            addCriterion("explaining >", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingGreaterThanOrEqualTo(String value) {
            addCriterion("explaining >=", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingLessThan(String value) {
            addCriterion("explaining <", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingLessThanOrEqualTo(String value) {
            addCriterion("explaining <=", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingLike(String value) {
            addCriterion("explaining like", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingNotLike(String value) {
            addCriterion("explaining not like", value, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingIn(List<String> values) {
            addCriterion("explaining in", values, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingNotIn(List<String> values) {
            addCriterion("explaining not in", values, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingBetween(String value1, String value2) {
            addCriterion("explaining between", value1, value2, "explaining");
            return (Criteria) this;
        }

        public Criteria andExplainingNotBetween(String value1, String value2) {
            addCriterion("explaining not between", value1, value2, "explaining");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return (Criteria) this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src is not null");
            return (Criteria) this;
        }

        public Criteria andSrcEqualTo(Integer value) {
            addCriterion("src =", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotEqualTo(Integer value) {
            addCriterion("src <>", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThan(Integer value) {
            addCriterion("src >", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("src >=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThan(Integer value) {
            addCriterion("src <", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThanOrEqualTo(Integer value) {
            addCriterion("src <=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcIn(List<Integer> values) {
            addCriterion("src in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotIn(List<Integer> values) {
            addCriterion("src not in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcBetween(Integer value1, Integer value2) {
            addCriterion("src between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotBetween(Integer value1, Integer value2) {
            addCriterion("src not between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrnameIsNull() {
            addCriterion("srname is null");
            return (Criteria) this;
        }

        public Criteria andSrnameIsNotNull() {
            addCriterion("srname is not null");
            return (Criteria) this;
        }

        public Criteria andSrnameEqualTo(String value) {
            addCriterion("srname =", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameNotEqualTo(String value) {
            addCriterion("srname <>", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameGreaterThan(String value) {
            addCriterion("srname >", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameGreaterThanOrEqualTo(String value) {
            addCriterion("srname >=", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameLessThan(String value) {
            addCriterion("srname <", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameLessThanOrEqualTo(String value) {
            addCriterion("srname <=", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameLike(String value) {
            addCriterion("srname like", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameNotLike(String value) {
            addCriterion("srname not like", value, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameIn(List<String> values) {
            addCriterion("srname in", values, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameNotIn(List<String> values) {
            addCriterion("srname not in", values, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameBetween(String value1, String value2) {
            addCriterion("srname between", value1, value2, "srname");
            return (Criteria) this;
        }

        public Criteria andSrnameNotBetween(String value1, String value2) {
            addCriterion("srname not between", value1, value2, "srname");
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

        public Criteria andComabilityIsNull() {
            addCriterion("comability is null");
            return (Criteria) this;
        }

        public Criteria andComabilityIsNotNull() {
            addCriterion("comability is not null");
            return (Criteria) this;
        }

        public Criteria andComabilityEqualTo(Integer value) {
            addCriterion("comability =", value, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityNotEqualTo(Integer value) {
            addCriterion("comability <>", value, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityGreaterThan(Integer value) {
            addCriterion("comability >", value, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("comability >=", value, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityLessThan(Integer value) {
            addCriterion("comability <", value, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityLessThanOrEqualTo(Integer value) {
            addCriterion("comability <=", value, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityIn(List<Integer> values) {
            addCriterion("comability in", values, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityNotIn(List<Integer> values) {
            addCriterion("comability not in", values, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityBetween(Integer value1, Integer value2) {
            addCriterion("comability between", value1, value2, "comability");
            return (Criteria) this;
        }

        public Criteria andComabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("comability not between", value1, value2, "comability");
            return (Criteria) this;
        }

        public Criteria andHandabilityIsNull() {
            addCriterion("handability is null");
            return (Criteria) this;
        }

        public Criteria andHandabilityIsNotNull() {
            addCriterion("handability is not null");
            return (Criteria) this;
        }

        public Criteria andHandabilityEqualTo(Integer value) {
            addCriterion("handability =", value, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityNotEqualTo(Integer value) {
            addCriterion("handability <>", value, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityGreaterThan(Integer value) {
            addCriterion("handability >", value, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("handability >=", value, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityLessThan(Integer value) {
            addCriterion("handability <", value, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityLessThanOrEqualTo(Integer value) {
            addCriterion("handability <=", value, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityIn(List<Integer> values) {
            addCriterion("handability in", values, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityNotIn(List<Integer> values) {
            addCriterion("handability not in", values, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityBetween(Integer value1, Integer value2) {
            addCriterion("handability between", value1, value2, "handability");
            return (Criteria) this;
        }

        public Criteria andHandabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("handability not between", value1, value2, "handability");
            return (Criteria) this;
        }

        public Criteria andGradlinkIsNull() {
            addCriterion("gradlink is null");
            return (Criteria) this;
        }

        public Criteria andGradlinkIsNotNull() {
            addCriterion("gradlink is not null");
            return (Criteria) this;
        }

        public Criteria andGradlinkEqualTo(Integer value) {
            addCriterion("gradlink =", value, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkNotEqualTo(Integer value) {
            addCriterion("gradlink <>", value, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkGreaterThan(Integer value) {
            addCriterion("gradlink >", value, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradlink >=", value, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkLessThan(Integer value) {
            addCriterion("gradlink <", value, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkLessThanOrEqualTo(Integer value) {
            addCriterion("gradlink <=", value, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkIn(List<Integer> values) {
            addCriterion("gradlink in", values, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkNotIn(List<Integer> values) {
            addCriterion("gradlink not in", values, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkBetween(Integer value1, Integer value2) {
            addCriterion("gradlink between", value1, value2, "gradlink");
            return (Criteria) this;
        }

        public Criteria andGradlinkNotBetween(Integer value1, Integer value2) {
            addCriterion("gradlink not between", value1, value2, "gradlink");
            return (Criteria) this;
        }

        public Criteria andTestpercentIsNull() {
            addCriterion("testpercent is null");
            return (Criteria) this;
        }

        public Criteria andTestpercentIsNotNull() {
            addCriterion("testpercent is not null");
            return (Criteria) this;
        }

        public Criteria andTestpercentEqualTo(Double value) {
            addCriterion("testpercent =", value, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentNotEqualTo(Double value) {
            addCriterion("testpercent <>", value, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentGreaterThan(Double value) {
            addCriterion("testpercent >", value, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentGreaterThanOrEqualTo(Double value) {
            addCriterion("testpercent >=", value, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentLessThan(Double value) {
            addCriterion("testpercent <", value, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentLessThanOrEqualTo(Double value) {
            addCriterion("testpercent <=", value, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentIn(List<Double> values) {
            addCriterion("testpercent in", values, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentNotIn(List<Double> values) {
            addCriterion("testpercent not in", values, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentBetween(Double value1, Double value2) {
            addCriterion("testpercent between", value1, value2, "testpercent");
            return (Criteria) this;
        }

        public Criteria andTestpercentNotBetween(Double value1, Double value2) {
            addCriterion("testpercent not between", value1, value2, "testpercent");
            return (Criteria) this;
        }

        public Criteria andResearchIsNull() {
            addCriterion("research is null");
            return (Criteria) this;
        }

        public Criteria andResearchIsNotNull() {
            addCriterion("research is not null");
            return (Criteria) this;
        }

        public Criteria andResearchEqualTo(Integer value) {
            addCriterion("research =", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotEqualTo(Integer value) {
            addCriterion("research <>", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchGreaterThan(Integer value) {
            addCriterion("research >", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchGreaterThanOrEqualTo(Integer value) {
            addCriterion("research >=", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLessThan(Integer value) {
            addCriterion("research <", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLessThanOrEqualTo(Integer value) {
            addCriterion("research <=", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchIn(List<Integer> values) {
            addCriterion("research in", values, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotIn(List<Integer> values) {
            addCriterion("research not in", values, "research");
            return (Criteria) this;
        }

        public Criteria andResearchBetween(Integer value1, Integer value2) {
            addCriterion("research between", value1, value2, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotBetween(Integer value1, Integer value2) {
            addCriterion("research not between", value1, value2, "research");
            return (Criteria) this;
        }

        public Criteria andChIsNull() {
            addCriterion("ch is null");
            return (Criteria) this;
        }

        public Criteria andChIsNotNull() {
            addCriterion("ch is not null");
            return (Criteria) this;
        }

        public Criteria andChEqualTo(Integer value) {
            addCriterion("ch =", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotEqualTo(Integer value) {
            addCriterion("ch <>", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThan(Integer value) {
            addCriterion("ch >", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThanOrEqualTo(Integer value) {
            addCriterion("ch >=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThan(Integer value) {
            addCriterion("ch <", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThanOrEqualTo(Integer value) {
            addCriterion("ch <=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChIn(List<Integer> values) {
            addCriterion("ch in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotIn(List<Integer> values) {
            addCriterion("ch not in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChBetween(Integer value1, Integer value2) {
            addCriterion("ch between", value1, value2, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotBetween(Integer value1, Integer value2) {
            addCriterion("ch not between", value1, value2, "ch");
            return (Criteria) this;
        }

        public Criteria andEnIsNull() {
            addCriterion("en is null");
            return (Criteria) this;
        }

        public Criteria andEnIsNotNull() {
            addCriterion("en is not null");
            return (Criteria) this;
        }

        public Criteria andEnEqualTo(Integer value) {
            addCriterion("en =", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotEqualTo(Integer value) {
            addCriterion("en <>", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnGreaterThan(Integer value) {
            addCriterion("en >", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnGreaterThanOrEqualTo(Integer value) {
            addCriterion("en >=", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLessThan(Integer value) {
            addCriterion("en <", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLessThanOrEqualTo(Integer value) {
            addCriterion("en <=", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnIn(List<Integer> values) {
            addCriterion("en in", values, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotIn(List<Integer> values) {
            addCriterion("en not in", values, "en");
            return (Criteria) this;
        }

        public Criteria andEnBetween(Integer value1, Integer value2) {
            addCriterion("en between", value1, value2, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotBetween(Integer value1, Integer value2) {
            addCriterion("en not between", value1, value2, "en");
            return (Criteria) this;
        }

        public Criteria andInnovationIsNull() {
            addCriterion("innovation is null");
            return (Criteria) this;
        }

        public Criteria andInnovationIsNotNull() {
            addCriterion("innovation is not null");
            return (Criteria) this;
        }

        public Criteria andInnovationEqualTo(Integer value) {
            addCriterion("innovation =", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationNotEqualTo(Integer value) {
            addCriterion("innovation <>", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationGreaterThan(Integer value) {
            addCriterion("innovation >", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationGreaterThanOrEqualTo(Integer value) {
            addCriterion("innovation >=", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationLessThan(Integer value) {
            addCriterion("innovation <", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationLessThanOrEqualTo(Integer value) {
            addCriterion("innovation <=", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationIn(List<Integer> values) {
            addCriterion("innovation in", values, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationNotIn(List<Integer> values) {
            addCriterion("innovation not in", values, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationBetween(Integer value1, Integer value2) {
            addCriterion("innovation between", value1, value2, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationNotBetween(Integer value1, Integer value2) {
            addCriterion("innovation not between", value1, value2, "innovation");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(Integer value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(Integer value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(Integer value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(Integer value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<Integer> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<Integer> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andIschooseIsNull() {
            addCriterion("ischoose is null");
            return (Criteria) this;
        }

        public Criteria andIschooseIsNotNull() {
            addCriterion("ischoose is not null");
            return (Criteria) this;
        }

        public Criteria andIschooseEqualTo(Integer value) {
            addCriterion("ischoose =", value, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseNotEqualTo(Integer value) {
            addCriterion("ischoose <>", value, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseGreaterThan(Integer value) {
            addCriterion("ischoose >", value, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseGreaterThanOrEqualTo(Integer value) {
            addCriterion("ischoose >=", value, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseLessThan(Integer value) {
            addCriterion("ischoose <", value, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseLessThanOrEqualTo(Integer value) {
            addCriterion("ischoose <=", value, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseIn(List<Integer> values) {
            addCriterion("ischoose in", values, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseNotIn(List<Integer> values) {
            addCriterion("ischoose not in", values, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseBetween(Integer value1, Integer value2) {
            addCriterion("ischoose between", value1, value2, "ischoose");
            return (Criteria) this;
        }

        public Criteria andIschooseNotBetween(Integer value1, Integer value2) {
            addCriterion("ischoose not between", value1, value2, "ischoose");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andChoosetimeIsNull() {
            addCriterion("choosetime is null");
            return (Criteria) this;
        }

        public Criteria andChoosetimeIsNotNull() {
            addCriterion("choosetime is not null");
            return (Criteria) this;
        }

        public Criteria andChoosetimeEqualTo(Date value) {
            addCriterion("choosetime =", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotEqualTo(Date value) {
            addCriterion("choosetime <>", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeGreaterThan(Date value) {
            addCriterion("choosetime >", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("choosetime >=", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeLessThan(Date value) {
            addCriterion("choosetime <", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeLessThanOrEqualTo(Date value) {
            addCriterion("choosetime <=", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeIn(List<Date> values) {
            addCriterion("choosetime in", values, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotIn(List<Date> values) {
            addCriterion("choosetime not in", values, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeBetween(Date value1, Date value2) {
            addCriterion("choosetime between", value1, value2, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotBetween(Date value1, Date value2) {
            addCriterion("choosetime not between", value1, value2, "choosetime");
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