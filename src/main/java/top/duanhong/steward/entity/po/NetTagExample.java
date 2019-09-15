package top.duanhong.steward.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetTagExample() {
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

        public Criteria andTagIdIsNull() {
            addCriterion("TAG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("TAG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(String value) {
            addCriterion("TAG_ID =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(String value) {
            addCriterion("TAG_ID <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(String value) {
            addCriterion("TAG_ID >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_ID >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(String value) {
            addCriterion("TAG_ID <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(String value) {
            addCriterion("TAG_ID <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLike(String value) {
            addCriterion("TAG_ID like", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotLike(String value) {
            addCriterion("TAG_ID not like", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<String> values) {
            addCriterion("TAG_ID in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<String> values) {
            addCriterion("TAG_ID not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(String value1, String value2) {
            addCriterion("TAG_ID between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(String value1, String value2) {
            addCriterion("TAG_ID not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleIsNull() {
            addCriterion("NET_TAG_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleIsNotNull() {
            addCriterion("NET_TAG_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleEqualTo(String value) {
            addCriterion("NET_TAG_TITLE =", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleNotEqualTo(String value) {
            addCriterion("NET_TAG_TITLE <>", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleGreaterThan(String value) {
            addCriterion("NET_TAG_TITLE >", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NET_TAG_TITLE >=", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleLessThan(String value) {
            addCriterion("NET_TAG_TITLE <", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleLessThanOrEqualTo(String value) {
            addCriterion("NET_TAG_TITLE <=", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleLike(String value) {
            addCriterion("NET_TAG_TITLE like", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleNotLike(String value) {
            addCriterion("NET_TAG_TITLE not like", value, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleIn(List<String> values) {
            addCriterion("NET_TAG_TITLE in", values, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleNotIn(List<String> values) {
            addCriterion("NET_TAG_TITLE not in", values, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleBetween(String value1, String value2) {
            addCriterion("NET_TAG_TITLE between", value1, value2, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andNetTagTitleNotBetween(String value1, String value2) {
            addCriterion("NET_TAG_TITLE not between", value1, value2, "netTagTitle");
            return (Criteria) this;
        }

        public Criteria andTagPathIsNull() {
            addCriterion("TAG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andTagPathIsNotNull() {
            addCriterion("TAG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andTagPathEqualTo(String value) {
            addCriterion("TAG_PATH =", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathNotEqualTo(String value) {
            addCriterion("TAG_PATH <>", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathGreaterThan(String value) {
            addCriterion("TAG_PATH >", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_PATH >=", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathLessThan(String value) {
            addCriterion("TAG_PATH <", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathLessThanOrEqualTo(String value) {
            addCriterion("TAG_PATH <=", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathLike(String value) {
            addCriterion("TAG_PATH like", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathNotLike(String value) {
            addCriterion("TAG_PATH not like", value, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathIn(List<String> values) {
            addCriterion("TAG_PATH in", values, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathNotIn(List<String> values) {
            addCriterion("TAG_PATH not in", values, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathBetween(String value1, String value2) {
            addCriterion("TAG_PATH between", value1, value2, "tagPath");
            return (Criteria) this;
        }

        public Criteria andTagPathNotBetween(String value1, String value2) {
            addCriterion("TAG_PATH not between", value1, value2, "tagPath");
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

        public Criteria andTagRemarkIsNull() {
            addCriterion("TAG_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTagRemarkIsNotNull() {
            addCriterion("TAG_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTagRemarkEqualTo(String value) {
            addCriterion("TAG_REMARK =", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkNotEqualTo(String value) {
            addCriterion("TAG_REMARK <>", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkGreaterThan(String value) {
            addCriterion("TAG_REMARK >", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_REMARK >=", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkLessThan(String value) {
            addCriterion("TAG_REMARK <", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkLessThanOrEqualTo(String value) {
            addCriterion("TAG_REMARK <=", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkLike(String value) {
            addCriterion("TAG_REMARK like", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkNotLike(String value) {
            addCriterion("TAG_REMARK not like", value, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkIn(List<String> values) {
            addCriterion("TAG_REMARK in", values, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkNotIn(List<String> values) {
            addCriterion("TAG_REMARK not in", values, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkBetween(String value1, String value2) {
            addCriterion("TAG_REMARK between", value1, value2, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTagRemarkNotBetween(String value1, String value2) {
            addCriterion("TAG_REMARK not between", value1, value2, "tagRemark");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("THEME is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("THEME is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("THEME =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("THEME <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("THEME >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("THEME >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("THEME <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("THEME <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("THEME like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("THEME not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("THEME in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("THEME not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("THEME between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("THEME not between", value1, value2, "theme");
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