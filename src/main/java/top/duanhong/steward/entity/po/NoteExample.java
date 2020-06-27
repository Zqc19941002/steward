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
            addCriterion("note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(String value) {
            addCriterion("note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(String value) {
            addCriterion("note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(String value) {
            addCriterion("note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(String value) {
            addCriterion("note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(String value) {
            addCriterion("note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLike(String value) {
            addCriterion("note_id like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotLike(String value) {
            addCriterion("note_id not like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<String> values) {
            addCriterion("note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<String> values) {
            addCriterion("note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(String value1, String value2) {
            addCriterion("note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(String value1, String value2) {
            addCriterion("note_id not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDescContentIsNull() {
            addCriterion("desc_content is null");
            return (Criteria) this;
        }

        public Criteria andDescContentIsNotNull() {
            addCriterion("desc_content is not null");
            return (Criteria) this;
        }

        public Criteria andDescContentEqualTo(String value) {
            addCriterion("desc_content =", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotEqualTo(String value) {
            addCriterion("desc_content <>", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentGreaterThan(String value) {
            addCriterion("desc_content >", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentGreaterThanOrEqualTo(String value) {
            addCriterion("desc_content >=", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentLessThan(String value) {
            addCriterion("desc_content <", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentLessThanOrEqualTo(String value) {
            addCriterion("desc_content <=", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentLike(String value) {
            addCriterion("desc_content like", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotLike(String value) {
            addCriterion("desc_content not like", value, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentIn(List<String> values) {
            addCriterion("desc_content in", values, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotIn(List<String> values) {
            addCriterion("desc_content not in", values, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentBetween(String value1, String value2) {
            addCriterion("desc_content between", value1, value2, "descContent");
            return (Criteria) this;
        }

        public Criteria andDescContentNotBetween(String value1, String value2) {
            addCriterion("desc_content not between", value1, value2, "descContent");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNull() {
            addCriterion("note_title is null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNotNull() {
            addCriterion("note_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleEqualTo(String value) {
            addCriterion("note_title =", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotEqualTo(String value) {
            addCriterion("note_title <>", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThan(String value) {
            addCriterion("note_title >", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("note_title >=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThan(String value) {
            addCriterion("note_title <", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("note_title <=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLike(String value) {
            addCriterion("note_title like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotLike(String value) {
            addCriterion("note_title not like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIn(List<String> values) {
            addCriterion("note_title in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotIn(List<String> values) {
            addCriterion("note_title not in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleBetween(String value1, String value2) {
            addCriterion("note_title between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotBetween(String value1, String value2) {
            addCriterion("note_title not between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNull() {
            addCriterion("note_type is null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNotNull() {
            addCriterion("note_type is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeEqualTo(String value) {
            addCriterion("note_type =", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotEqualTo(String value) {
            addCriterion("note_type <>", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThan(String value) {
            addCriterion("note_type >", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("note_type >=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThan(String value) {
            addCriterion("note_type <", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThanOrEqualTo(String value) {
            addCriterion("note_type <=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLike(String value) {
            addCriterion("note_type like", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotLike(String value) {
            addCriterion("note_type not like", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIn(List<String> values) {
            addCriterion("note_type in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotIn(List<String> values) {
            addCriterion("note_type not in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeBetween(String value1, String value2) {
            addCriterion("note_type between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotBetween(String value1, String value2) {
            addCriterion("note_type not between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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