package top.duanhong.steward.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileTypeExample() {
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

        public Criteria andFileTypeIdIsNull() {
            addCriterion("FILE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdIsNotNull() {
            addCriterion("FILE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdEqualTo(String value) {
            addCriterion("FILE_TYPE_ID =", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotEqualTo(String value) {
            addCriterion("FILE_TYPE_ID <>", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdGreaterThan(String value) {
            addCriterion("FILE_TYPE_ID >", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE_ID >=", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdLessThan(String value) {
            addCriterion("FILE_TYPE_ID <", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE_ID <=", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdLike(String value) {
            addCriterion("FILE_TYPE_ID like", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotLike(String value) {
            addCriterion("FILE_TYPE_ID not like", value, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdIn(List<String> values) {
            addCriterion("FILE_TYPE_ID in", values, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotIn(List<String> values) {
            addCriterion("FILE_TYPE_ID not in", values, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdBetween(String value1, String value2) {
            addCriterion("FILE_TYPE_ID between", value1, value2, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andFileTypeIdNotBetween(String value1, String value2) {
            addCriterion("FILE_TYPE_ID not between", value1, value2, "fileTypeId");
            return (Criteria) this;
        }

        public Criteria andTypeLabelIsNull() {
            addCriterion("TYPE_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andTypeLabelIsNotNull() {
            addCriterion("TYPE_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLabelEqualTo(String value) {
            addCriterion("TYPE_LABEL =", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelNotEqualTo(String value) {
            addCriterion("TYPE_LABEL <>", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelGreaterThan(String value) {
            addCriterion("TYPE_LABEL >", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_LABEL >=", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelLessThan(String value) {
            addCriterion("TYPE_LABEL <", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelLessThanOrEqualTo(String value) {
            addCriterion("TYPE_LABEL <=", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelLike(String value) {
            addCriterion("TYPE_LABEL like", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelNotLike(String value) {
            addCriterion("TYPE_LABEL not like", value, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelIn(List<String> values) {
            addCriterion("TYPE_LABEL in", values, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelNotIn(List<String> values) {
            addCriterion("TYPE_LABEL not in", values, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelBetween(String value1, String value2) {
            addCriterion("TYPE_LABEL between", value1, value2, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andTypeLabelNotBetween(String value1, String value2) {
            addCriterion("TYPE_LABEL not between", value1, value2, "typeLabel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("TYPE_CODE =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("TYPE_CODE <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("TYPE_CODE >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("TYPE_CODE <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("TYPE_CODE like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("TYPE_CODE not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("TYPE_CODE in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("TYPE_CODE not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("TYPE_CODE between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("TYPE_CODE not between", value1, value2, "typeCode");
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