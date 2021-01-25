package top.duanhong.steward.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StewChatMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StewChatMessageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(String value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(String value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(String value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(String value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(String value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLike(String value) {
            addCriterion("sender_id like", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotLike(String value) {
            addCriterion("sender_id not like", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<String> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<String> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(String value1, String value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(String value1, String value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterionForJDBCDate("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterionForJDBCDate("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterionForJDBCDate("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterionForJDBCDate("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendTimestampIsNull() {
            addCriterion("send_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andSendTimestampIsNotNull() {
            addCriterion("send_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimestampEqualTo(Date value) {
            addCriterion("send_timestamp =", value, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampNotEqualTo(Date value) {
            addCriterion("send_timestamp <>", value, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampGreaterThan(Date value) {
            addCriterion("send_timestamp >", value, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("send_timestamp >=", value, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampLessThan(Date value) {
            addCriterion("send_timestamp <", value, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampLessThanOrEqualTo(Date value) {
            addCriterion("send_timestamp <=", value, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampIn(List<Date> values) {
            addCriterion("send_timestamp in", values, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampNotIn(List<Date> values) {
            addCriterion("send_timestamp not in", values, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampBetween(Date value1, Date value2) {
            addCriterion("send_timestamp between", value1, value2, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andSendTimestampNotBetween(Date value1, Date value2) {
            addCriterion("send_timestamp not between", value1, value2, "sendTimestamp");
            return (Criteria) this;
        }

        public Criteria andMsgSystemIsNull() {
            addCriterion("msg_system is null");
            return (Criteria) this;
        }

        public Criteria andMsgSystemIsNotNull() {
            addCriterion("msg_system is not null");
            return (Criteria) this;
        }

        public Criteria andMsgSystemEqualTo(Boolean value) {
            addCriterion("msg_system =", value, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemNotEqualTo(Boolean value) {
            addCriterion("msg_system <>", value, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemGreaterThan(Boolean value) {
            addCriterion("msg_system >", value, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("msg_system >=", value, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemLessThan(Boolean value) {
            addCriterion("msg_system <", value, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemLessThanOrEqualTo(Boolean value) {
            addCriterion("msg_system <=", value, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemIn(List<Boolean> values) {
            addCriterion("msg_system in", values, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemNotIn(List<Boolean> values) {
            addCriterion("msg_system not in", values, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemBetween(Boolean value1, Boolean value2) {
            addCriterion("msg_system between", value1, value2, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andMsgSystemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("msg_system not between", value1, value2, "msgSystem");
            return (Criteria) this;
        }

        public Criteria andSavedIsNull() {
            addCriterion("saved is null");
            return (Criteria) this;
        }

        public Criteria andSavedIsNotNull() {
            addCriterion("saved is not null");
            return (Criteria) this;
        }

        public Criteria andSavedEqualTo(Boolean value) {
            addCriterion("saved =", value, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedNotEqualTo(Boolean value) {
            addCriterion("saved <>", value, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedGreaterThan(Boolean value) {
            addCriterion("saved >", value, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("saved >=", value, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedLessThan(Boolean value) {
            addCriterion("saved <", value, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedLessThanOrEqualTo(Boolean value) {
            addCriterion("saved <=", value, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedIn(List<Boolean> values) {
            addCriterion("saved in", values, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedNotIn(List<Boolean> values) {
            addCriterion("saved not in", values, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedBetween(Boolean value1, Boolean value2) {
            addCriterion("saved between", value1, value2, "saved");
            return (Criteria) this;
        }

        public Criteria andSavedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("saved not between", value1, value2, "saved");
            return (Criteria) this;
        }

        public Criteria andDistributedIsNull() {
            addCriterion("distributed is null");
            return (Criteria) this;
        }

        public Criteria andDistributedIsNotNull() {
            addCriterion("distributed is not null");
            return (Criteria) this;
        }

        public Criteria andDistributedEqualTo(Boolean value) {
            addCriterion("distributed =", value, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedNotEqualTo(Boolean value) {
            addCriterion("distributed <>", value, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedGreaterThan(Boolean value) {
            addCriterion("distributed >", value, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("distributed >=", value, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedLessThan(Boolean value) {
            addCriterion("distributed <", value, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedLessThanOrEqualTo(Boolean value) {
            addCriterion("distributed <=", value, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedIn(List<Boolean> values) {
            addCriterion("distributed in", values, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedNotIn(List<Boolean> values) {
            addCriterion("distributed not in", values, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedBetween(Boolean value1, Boolean value2) {
            addCriterion("distributed between", value1, value2, "distributed");
            return (Criteria) this;
        }

        public Criteria andDistributedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("distributed not between", value1, value2, "distributed");
            return (Criteria) this;
        }

        public Criteria andSeenIsNull() {
            addCriterion("seen is null");
            return (Criteria) this;
        }

        public Criteria andSeenIsNotNull() {
            addCriterion("seen is not null");
            return (Criteria) this;
        }

        public Criteria andSeenEqualTo(Boolean value) {
            addCriterion("seen =", value, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenNotEqualTo(Boolean value) {
            addCriterion("seen <>", value, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenGreaterThan(Boolean value) {
            addCriterion("seen >", value, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seen >=", value, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenLessThan(Boolean value) {
            addCriterion("seen <", value, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenLessThanOrEqualTo(Boolean value) {
            addCriterion("seen <=", value, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenIn(List<Boolean> values) {
            addCriterion("seen in", values, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenNotIn(List<Boolean> values) {
            addCriterion("seen not in", values, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenBetween(Boolean value1, Boolean value2) {
            addCriterion("seen between", value1, value2, "seen");
            return (Criteria) this;
        }

        public Criteria andSeenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seen not between", value1, value2, "seen");
            return (Criteria) this;
        }

        public Criteria andDisableActionsIsNull() {
            addCriterion("disable_actions is null");
            return (Criteria) this;
        }

        public Criteria andDisableActionsIsNotNull() {
            addCriterion("disable_actions is not null");
            return (Criteria) this;
        }

        public Criteria andDisableActionsEqualTo(Boolean value) {
            addCriterion("disable_actions =", value, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsNotEqualTo(Boolean value) {
            addCriterion("disable_actions <>", value, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsGreaterThan(Boolean value) {
            addCriterion("disable_actions >", value, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("disable_actions >=", value, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsLessThan(Boolean value) {
            addCriterion("disable_actions <", value, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsLessThanOrEqualTo(Boolean value) {
            addCriterion("disable_actions <=", value, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsIn(List<Boolean> values) {
            addCriterion("disable_actions in", values, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsNotIn(List<Boolean> values) {
            addCriterion("disable_actions not in", values, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsBetween(Boolean value1, Boolean value2) {
            addCriterion("disable_actions between", value1, value2, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableActionsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("disable_actions not between", value1, value2, "disableActions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsIsNull() {
            addCriterion("disable_reactions is null");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsIsNotNull() {
            addCriterion("disable_reactions is not null");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsEqualTo(Boolean value) {
            addCriterion("disable_reactions =", value, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsNotEqualTo(Boolean value) {
            addCriterion("disable_reactions <>", value, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsGreaterThan(Boolean value) {
            addCriterion("disable_reactions >", value, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("disable_reactions >=", value, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsLessThan(Boolean value) {
            addCriterion("disable_reactions <", value, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsLessThanOrEqualTo(Boolean value) {
            addCriterion("disable_reactions <=", value, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsIn(List<Boolean> values) {
            addCriterion("disable_reactions in", values, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsNotIn(List<Boolean> values) {
            addCriterion("disable_reactions not in", values, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsBetween(Boolean value1, Boolean value2) {
            addCriterion("disable_reactions between", value1, value2, "disableReactions");
            return (Criteria) this;
        }

        public Criteria andDisableReactionsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("disable_reactions not between", value1, value2, "disableReactions");
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