package top.duanhong.steward.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("NOTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("NOTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(String value) {
            addCriterion("NOTE_ID =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(String value) {
            addCriterion("NOTE_ID <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(String value) {
            addCriterion("NOTE_ID >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_ID >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(String value) {
            addCriterion("NOTE_ID <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(String value) {
            addCriterion("NOTE_ID <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLike(String value) {
            addCriterion("NOTE_ID like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotLike(String value) {
            addCriterion("NOTE_ID not like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<String> values) {
            addCriterion("NOTE_ID in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<String> values) {
            addCriterion("NOTE_ID not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(String value1, String value2) {
            addCriterion("NOTE_ID between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(String value1, String value2) {
            addCriterion("NOTE_ID not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNull() {
            addCriterion("NOTE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNotNull() {
            addCriterion("NOTE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleEqualTo(String value) {
            addCriterion("NOTE_TITLE =", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotEqualTo(String value) {
            addCriterion("NOTE_TITLE <>", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThan(String value) {
            addCriterion("NOTE_TITLE >", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_TITLE >=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThan(String value) {
            addCriterion("NOTE_TITLE <", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("NOTE_TITLE <=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLike(String value) {
            addCriterion("NOTE_TITLE like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotLike(String value) {
            addCriterion("NOTE_TITLE not like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIn(List<String> values) {
            addCriterion("NOTE_TITLE in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotIn(List<String> values) {
            addCriterion("NOTE_TITLE not in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleBetween(String value1, String value2) {
            addCriterion("NOTE_TITLE between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotBetween(String value1, String value2) {
            addCriterion("NOTE_TITLE not between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andDescContentIsNull() {
            addCriterion("DESC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDescContentIsNotNull() {
            addCriterion("DESC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDescContentEqualTo(String value) {
            addCriterion("DESC_CONTENT =", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotEqualTo(String value) {
            addCriterion("DESC_CONTENT <>", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentGreaterThan(String value) {
            addCriterion("DESC_CONTENT >", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentGreaterThanOrEqualTo(String value) {
            addCriterion("DESC_CONTENT >=", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentLessThan(String value) {
            addCriterion("DESC_CONTENT <", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentLessThanOrEqualTo(String value) {
            addCriterion("DESC_CONTENT <=", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentLike(String value) {
            addCriterion("DESC_CONTENT like", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotLike(String value) {
            addCriterion("DESC_CONTENT not like", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentIn(List<String> values) {
            addCriterion("DESC_CONTENT in", values, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotIn(List<String> values) {
            addCriterion("DESC_CONTENT not in", values, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentBetween(String value1, String value2) {
            addCriterion("DESC_CONTENT between", value1, value2, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotBetween(String value1, String value2) {
            addCriterion("DESC_CONTENT not between", value1, value2, "descContent");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("FILE_PATH =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("FILE_PATH <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("FILE_PATH >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_PATH >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("FILE_PATH <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("FILE_PATH <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("FILE_PATH like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("FILE_PATH not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("FILE_PATH in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("FILE_PATH not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("FILE_PATH between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("FILE_PATH not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNull() {
            addCriterion("NOTE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNotNull() {
            addCriterion("NOTE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeEqualTo(String value) {
            addCriterion("NOTE_TYPE =", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotEqualTo(String value) {
            addCriterion("NOTE_TYPE <>", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThan(String value) {
            addCriterion("NOTE_TYPE >", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_TYPE >=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThan(String value) {
            addCriterion("NOTE_TYPE <", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThanOrEqualTo(String value) {
            addCriterion("NOTE_TYPE <=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLike(String value) {
            addCriterion("NOTE_TYPE like", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotLike(String value) {
            addCriterion("NOTE_TYPE not like", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIn(List<String> values) {
            addCriterion("NOTE_TYPE in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotIn(List<String> values) {
            addCriterion("NOTE_TYPE not in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeBetween(String value1, String value2) {
            addCriterion("NOTE_TYPE between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotBetween(String value1, String value2) {
            addCriterion("NOTE_TYPE not between", value1, value2, "noteType");
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