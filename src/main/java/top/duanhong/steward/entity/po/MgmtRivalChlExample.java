package top.duanhong.steward.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgmtRivalChlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgmtRivalChlExample() {
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

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeIsNull() {
            addCriterion("adm_reg_city_code is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeIsNotNull() {
            addCriterion("adm_reg_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeEqualTo(String value) {
            addCriterion("adm_reg_city_code =", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotEqualTo(String value) {
            addCriterion("adm_reg_city_code <>", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeGreaterThan(String value) {
            addCriterion("adm_reg_city_code >", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_city_code >=", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeLessThan(String value) {
            addCriterion("adm_reg_city_code <", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_city_code <=", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeLike(String value) {
            addCriterion("adm_reg_city_code like", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotLike(String value) {
            addCriterion("adm_reg_city_code not like", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeIn(List<String> values) {
            addCriterion("adm_reg_city_code in", values, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotIn(List<String> values) {
            addCriterion("adm_reg_city_code not in", values, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeBetween(String value1, String value2) {
            addCriterion("adm_reg_city_code between", value1, value2, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotBetween(String value1, String value2) {
            addCriterion("adm_reg_city_code not between", value1, value2, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeIsNull() {
            addCriterion("adm_reg_code is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeIsNotNull() {
            addCriterion("adm_reg_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeEqualTo(String value) {
            addCriterion("adm_reg_code =", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotEqualTo(String value) {
            addCriterion("adm_reg_code <>", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeGreaterThan(String value) {
            addCriterion("adm_reg_code >", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_code >=", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeLessThan(String value) {
            addCriterion("adm_reg_code <", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_code <=", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeLike(String value) {
            addCriterion("adm_reg_code like", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotLike(String value) {
            addCriterion("adm_reg_code not like", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeIn(List<String> values) {
            addCriterion("adm_reg_code in", values, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotIn(List<String> values) {
            addCriterion("adm_reg_code not in", values, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeBetween(String value1, String value2) {
            addCriterion("adm_reg_code between", value1, value2, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotBetween(String value1, String value2) {
            addCriterion("adm_reg_code not between", value1, value2, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeIsNull() {
            addCriterion("adm_reg_county_code is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeIsNotNull() {
            addCriterion("adm_reg_county_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeEqualTo(String value) {
            addCriterion("adm_reg_county_code =", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotEqualTo(String value) {
            addCriterion("adm_reg_county_code <>", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeGreaterThan(String value) {
            addCriterion("adm_reg_county_code >", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_county_code >=", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeLessThan(String value) {
            addCriterion("adm_reg_county_code <", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_county_code <=", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeLike(String value) {
            addCriterion("adm_reg_county_code like", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotLike(String value) {
            addCriterion("adm_reg_county_code not like", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeIn(List<String> values) {
            addCriterion("adm_reg_county_code in", values, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotIn(List<String> values) {
            addCriterion("adm_reg_county_code not in", values, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeBetween(String value1, String value2) {
            addCriterion("adm_reg_county_code between", value1, value2, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotBetween(String value1, String value2) {
            addCriterion("adm_reg_county_code not between", value1, value2, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameIsNull() {
            addCriterion("adm_reg_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameIsNotNull() {
            addCriterion("adm_reg_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameEqualTo(String value) {
            addCriterion("adm_reg_name =", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotEqualTo(String value) {
            addCriterion("adm_reg_name <>", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameGreaterThan(String value) {
            addCriterion("adm_reg_name >", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_name >=", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameLessThan(String value) {
            addCriterion("adm_reg_name <", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_name <=", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameLike(String value) {
            addCriterion("adm_reg_name like", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotLike(String value) {
            addCriterion("adm_reg_name not like", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameIn(List<String> values) {
            addCriterion("adm_reg_name in", values, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotIn(List<String> values) {
            addCriterion("adm_reg_name not in", values, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameBetween(String value1, String value2) {
            addCriterion("adm_reg_name between", value1, value2, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotBetween(String value1, String value2) {
            addCriterion("adm_reg_name not between", value1, value2, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeIsNull() {
            addCriterion("adm_reg_province_code is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeIsNotNull() {
            addCriterion("adm_reg_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeEqualTo(String value) {
            addCriterion("adm_reg_province_code =", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotEqualTo(String value) {
            addCriterion("adm_reg_province_code <>", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeGreaterThan(String value) {
            addCriterion("adm_reg_province_code >", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_province_code >=", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeLessThan(String value) {
            addCriterion("adm_reg_province_code <", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_province_code <=", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeLike(String value) {
            addCriterion("adm_reg_province_code like", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotLike(String value) {
            addCriterion("adm_reg_province_code not like", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeIn(List<String> values) {
            addCriterion("adm_reg_province_code in", values, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotIn(List<String> values) {
            addCriterion("adm_reg_province_code not in", values, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeBetween(String value1, String value2) {
            addCriterion("adm_reg_province_code between", value1, value2, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("adm_reg_province_code not between", value1, value2, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeIsNull() {
            addCriterion("adm_reg_town_code is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeIsNotNull() {
            addCriterion("adm_reg_town_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeEqualTo(String value) {
            addCriterion("adm_reg_town_code =", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotEqualTo(String value) {
            addCriterion("adm_reg_town_code <>", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeGreaterThan(String value) {
            addCriterion("adm_reg_town_code >", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_town_code >=", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeLessThan(String value) {
            addCriterion("adm_reg_town_code <", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_town_code <=", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeLike(String value) {
            addCriterion("adm_reg_town_code like", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotLike(String value) {
            addCriterion("adm_reg_town_code not like", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeIn(List<String> values) {
            addCriterion("adm_reg_town_code in", values, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotIn(List<String> values) {
            addCriterion("adm_reg_town_code not in", values, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeBetween(String value1, String value2) {
            addCriterion("adm_reg_town_code between", value1, value2, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotBetween(String value1, String value2) {
            addCriterion("adm_reg_town_code not between", value1, value2, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeIsNull() {
            addCriterion("adm_reg_village_code is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeIsNotNull() {
            addCriterion("adm_reg_village_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeEqualTo(String value) {
            addCriterion("adm_reg_village_code =", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotEqualTo(String value) {
            addCriterion("adm_reg_village_code <>", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeGreaterThan(String value) {
            addCriterion("adm_reg_village_code >", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adm_reg_village_code >=", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeLessThan(String value) {
            addCriterion("adm_reg_village_code <", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeLessThanOrEqualTo(String value) {
            addCriterion("adm_reg_village_code <=", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeLike(String value) {
            addCriterion("adm_reg_village_code like", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotLike(String value) {
            addCriterion("adm_reg_village_code not like", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeIn(List<String> values) {
            addCriterion("adm_reg_village_code in", values, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotIn(List<String> values) {
            addCriterion("adm_reg_village_code not in", values, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeBetween(String value1, String value2) {
            addCriterion("adm_reg_village_code between", value1, value2, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotBetween(String value1, String value2) {
            addCriterion("adm_reg_village_code not between", value1, value2, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdIsNull() {
            addCriterion("belong_zyst_chl_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdIsNotNull() {
            addCriterion("belong_zyst_chl_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdEqualTo(Long value) {
            addCriterion("belong_zyst_chl_id =", value, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdNotEqualTo(Long value) {
            addCriterion("belong_zyst_chl_id <>", value, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdGreaterThan(Long value) {
            addCriterion("belong_zyst_chl_id >", value, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("belong_zyst_chl_id >=", value, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdLessThan(Long value) {
            addCriterion("belong_zyst_chl_id <", value, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdLessThanOrEqualTo(Long value) {
            addCriterion("belong_zyst_chl_id <=", value, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdIn(List<Long> values) {
            addCriterion("belong_zyst_chl_id in", values, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdNotIn(List<Long> values) {
            addCriterion("belong_zyst_chl_id not in", values, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdBetween(Long value1, Long value2) {
            addCriterion("belong_zyst_chl_id between", value1, value2, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBelongZystChlIdNotBetween(Long value1, Long value2) {
            addCriterion("belong_zyst_chl_id not between", value1, value2, "belongZystChlId");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagIsNull() {
            addCriterion("bind_manager_flag is null");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagIsNotNull() {
            addCriterion("bind_manager_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagEqualTo(Integer value) {
            addCriterion("bind_manager_flag =", value, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagNotEqualTo(Integer value) {
            addCriterion("bind_manager_flag <>", value, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagGreaterThan(Integer value) {
            addCriterion("bind_manager_flag >", value, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_manager_flag >=", value, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagLessThan(Integer value) {
            addCriterion("bind_manager_flag <", value, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagLessThanOrEqualTo(Integer value) {
            addCriterion("bind_manager_flag <=", value, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagIn(List<Integer> values) {
            addCriterion("bind_manager_flag in", values, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagNotIn(List<Integer> values) {
            addCriterion("bind_manager_flag not in", values, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagBetween(Integer value1, Integer value2) {
            addCriterion("bind_manager_flag between", value1, value2, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBindManagerFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_manager_flag not between", value1, value2, "bindManagerFlag");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdIsNull() {
            addCriterion("busi_circle_id is null");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdIsNotNull() {
            addCriterion("busi_circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdEqualTo(String value) {
            addCriterion("busi_circle_id =", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdNotEqualTo(String value) {
            addCriterion("busi_circle_id <>", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdGreaterThan(String value) {
            addCriterion("busi_circle_id >", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdGreaterThanOrEqualTo(String value) {
            addCriterion("busi_circle_id >=", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdLessThan(String value) {
            addCriterion("busi_circle_id <", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdLessThanOrEqualTo(String value) {
            addCriterion("busi_circle_id <=", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdLike(String value) {
            addCriterion("busi_circle_id like", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdNotLike(String value) {
            addCriterion("busi_circle_id not like", value, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdIn(List<String> values) {
            addCriterion("busi_circle_id in", values, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdNotIn(List<String> values) {
            addCriterion("busi_circle_id not in", values, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdBetween(String value1, String value2) {
            addCriterion("busi_circle_id between", value1, value2, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleIdNotBetween(String value1, String value2) {
            addCriterion("busi_circle_id not between", value1, value2, "busiCircleId");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameIsNull() {
            addCriterion("busi_circle_name is null");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameIsNotNull() {
            addCriterion("busi_circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameEqualTo(String value) {
            addCriterion("busi_circle_name =", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameNotEqualTo(String value) {
            addCriterion("busi_circle_name <>", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameGreaterThan(String value) {
            addCriterion("busi_circle_name >", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("busi_circle_name >=", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameLessThan(String value) {
            addCriterion("busi_circle_name <", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameLessThanOrEqualTo(String value) {
            addCriterion("busi_circle_name <=", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameLike(String value) {
            addCriterion("busi_circle_name like", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameNotLike(String value) {
            addCriterion("busi_circle_name not like", value, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameIn(List<String> values) {
            addCriterion("busi_circle_name in", values, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameNotIn(List<String> values) {
            addCriterion("busi_circle_name not in", values, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameBetween(String value1, String value2) {
            addCriterion("busi_circle_name between", value1, value2, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiCircleNameNotBetween(String value1, String value2) {
            addCriterion("busi_circle_name not between", value1, value2, "busiCircleName");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeIsNull() {
            addCriterion("busi_reg_area_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeIsNotNull() {
            addCriterion("busi_reg_area_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeEqualTo(String value) {
            addCriterion("busi_reg_area_code =", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotEqualTo(String value) {
            addCriterion("busi_reg_area_code <>", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeGreaterThan(String value) {
            addCriterion("busi_reg_area_code >", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_area_code >=", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeLessThan(String value) {
            addCriterion("busi_reg_area_code <", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_area_code <=", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeLike(String value) {
            addCriterion("busi_reg_area_code like", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotLike(String value) {
            addCriterion("busi_reg_area_code not like", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeIn(List<String> values) {
            addCriterion("busi_reg_area_code in", values, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotIn(List<String> values) {
            addCriterion("busi_reg_area_code not in", values, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_area_code between", value1, value2, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_area_code not between", value1, value2, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeIsNull() {
            addCriterion("busi_reg_city_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeIsNotNull() {
            addCriterion("busi_reg_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeEqualTo(String value) {
            addCriterion("busi_reg_city_code =", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotEqualTo(String value) {
            addCriterion("busi_reg_city_code <>", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeGreaterThan(String value) {
            addCriterion("busi_reg_city_code >", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_city_code >=", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeLessThan(String value) {
            addCriterion("busi_reg_city_code <", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_city_code <=", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeLike(String value) {
            addCriterion("busi_reg_city_code like", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotLike(String value) {
            addCriterion("busi_reg_city_code not like", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeIn(List<String> values) {
            addCriterion("busi_reg_city_code in", values, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotIn(List<String> values) {
            addCriterion("busi_reg_city_code not in", values, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_city_code between", value1, value2, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_city_code not between", value1, value2, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeIsNull() {
            addCriterion("busi_reg_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeIsNotNull() {
            addCriterion("busi_reg_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeEqualTo(String value) {
            addCriterion("busi_reg_code =", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotEqualTo(String value) {
            addCriterion("busi_reg_code <>", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeGreaterThan(String value) {
            addCriterion("busi_reg_code >", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_code >=", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeLessThan(String value) {
            addCriterion("busi_reg_code <", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_code <=", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeLike(String value) {
            addCriterion("busi_reg_code like", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotLike(String value) {
            addCriterion("busi_reg_code not like", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeIn(List<String> values) {
            addCriterion("busi_reg_code in", values, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotIn(List<String> values) {
            addCriterion("busi_reg_code not in", values, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_code between", value1, value2, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_code not between", value1, value2, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeIsNull() {
            addCriterion("busi_reg_county_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeIsNotNull() {
            addCriterion("busi_reg_county_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeEqualTo(String value) {
            addCriterion("busi_reg_county_code =", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotEqualTo(String value) {
            addCriterion("busi_reg_county_code <>", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeGreaterThan(String value) {
            addCriterion("busi_reg_county_code >", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_county_code >=", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeLessThan(String value) {
            addCriterion("busi_reg_county_code <", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_county_code <=", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeLike(String value) {
            addCriterion("busi_reg_county_code like", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotLike(String value) {
            addCriterion("busi_reg_county_code not like", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeIn(List<String> values) {
            addCriterion("busi_reg_county_code in", values, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotIn(List<String> values) {
            addCriterion("busi_reg_county_code not in", values, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_county_code between", value1, value2, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_county_code not between", value1, value2, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeIsNull() {
            addCriterion("busi_reg_grid_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeIsNotNull() {
            addCriterion("busi_reg_grid_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeEqualTo(String value) {
            addCriterion("busi_reg_grid_code =", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotEqualTo(String value) {
            addCriterion("busi_reg_grid_code <>", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeGreaterThan(String value) {
            addCriterion("busi_reg_grid_code >", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_grid_code >=", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeLessThan(String value) {
            addCriterion("busi_reg_grid_code <", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_grid_code <=", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeLike(String value) {
            addCriterion("busi_reg_grid_code like", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotLike(String value) {
            addCriterion("busi_reg_grid_code not like", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeIn(List<String> values) {
            addCriterion("busi_reg_grid_code in", values, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotIn(List<String> values) {
            addCriterion("busi_reg_grid_code not in", values, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_grid_code between", value1, value2, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_grid_code not between", value1, value2, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeIsNull() {
            addCriterion("busi_reg_micro_area_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeIsNotNull() {
            addCriterion("busi_reg_micro_area_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeEqualTo(String value) {
            addCriterion("busi_reg_micro_area_code =", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotEqualTo(String value) {
            addCriterion("busi_reg_micro_area_code <>", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeGreaterThan(String value) {
            addCriterion("busi_reg_micro_area_code >", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_micro_area_code >=", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeLessThan(String value) {
            addCriterion("busi_reg_micro_area_code <", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_micro_area_code <=", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeLike(String value) {
            addCriterion("busi_reg_micro_area_code like", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotLike(String value) {
            addCriterion("busi_reg_micro_area_code not like", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeIn(List<String> values) {
            addCriterion("busi_reg_micro_area_code in", values, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotIn(List<String> values) {
            addCriterion("busi_reg_micro_area_code not in", values, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_micro_area_code between", value1, value2, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_micro_area_code not between", value1, value2, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameIsNull() {
            addCriterion("busi_reg_name is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameIsNotNull() {
            addCriterion("busi_reg_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameEqualTo(String value) {
            addCriterion("busi_reg_name =", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotEqualTo(String value) {
            addCriterion("busi_reg_name <>", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameGreaterThan(String value) {
            addCriterion("busi_reg_name >", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_name >=", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameLessThan(String value) {
            addCriterion("busi_reg_name <", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_name <=", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameLike(String value) {
            addCriterion("busi_reg_name like", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotLike(String value) {
            addCriterion("busi_reg_name not like", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameIn(List<String> values) {
            addCriterion("busi_reg_name in", values, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotIn(List<String> values) {
            addCriterion("busi_reg_name not in", values, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameBetween(String value1, String value2) {
            addCriterion("busi_reg_name between", value1, value2, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotBetween(String value1, String value2) {
            addCriterion("busi_reg_name not between", value1, value2, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeIsNull() {
            addCriterion("busi_reg_province_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeIsNotNull() {
            addCriterion("busi_reg_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeEqualTo(String value) {
            addCriterion("busi_reg_province_code =", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotEqualTo(String value) {
            addCriterion("busi_reg_province_code <>", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeGreaterThan(String value) {
            addCriterion("busi_reg_province_code >", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_reg_province_code >=", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeLessThan(String value) {
            addCriterion("busi_reg_province_code <", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_reg_province_code <=", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeLike(String value) {
            addCriterion("busi_reg_province_code like", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotLike(String value) {
            addCriterion("busi_reg_province_code not like", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeIn(List<String> values) {
            addCriterion("busi_reg_province_code in", values, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotIn(List<String> values) {
            addCriterion("busi_reg_province_code not in", values, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeBetween(String value1, String value2) {
            addCriterion("busi_reg_province_code between", value1, value2, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("busi_reg_province_code not between", value1, value2, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIsNull() {
            addCriterion("business_area is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIsNotNull() {
            addCriterion("business_area is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaEqualTo(BigDecimal value) {
            addCriterion("business_area =", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotEqualTo(BigDecimal value) {
            addCriterion("business_area <>", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaGreaterThan(BigDecimal value) {
            addCriterion("business_area >", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("business_area >=", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLessThan(BigDecimal value) {
            addCriterion("business_area <", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("business_area <=", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIn(List<BigDecimal> values) {
            addCriterion("business_area in", values, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotIn(List<BigDecimal> values) {
            addCriterion("business_area not in", values, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_area between", value1, value2, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_area not between", value1, value2, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeIsNull() {
            addCriterion("business_circle_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeIsNotNull() {
            addCriterion("business_circle_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeEqualTo(String value) {
            addCriterion("business_circle_type =", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeNotEqualTo(String value) {
            addCriterion("business_circle_type <>", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeGreaterThan(String value) {
            addCriterion("business_circle_type >", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_circle_type >=", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeLessThan(String value) {
            addCriterion("business_circle_type <", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeLessThanOrEqualTo(String value) {
            addCriterion("business_circle_type <=", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeLike(String value) {
            addCriterion("business_circle_type like", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeNotLike(String value) {
            addCriterion("business_circle_type not like", value, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeIn(List<String> values) {
            addCriterion("business_circle_type in", values, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeNotIn(List<String> values) {
            addCriterion("business_circle_type not in", values, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeBetween(String value1, String value2) {
            addCriterion("business_circle_type between", value1, value2, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleTypeNotBetween(String value1, String value2) {
            addCriterion("business_circle_type not between", value1, value2, "businessCircleType");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelIsNull() {
            addCriterion("business_level is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelIsNotNull() {
            addCriterion("business_level is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelEqualTo(String value) {
            addCriterion("business_level =", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotEqualTo(String value) {
            addCriterion("business_level <>", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelGreaterThan(String value) {
            addCriterion("business_level >", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelGreaterThanOrEqualTo(String value) {
            addCriterion("business_level >=", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelLessThan(String value) {
            addCriterion("business_level <", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelLessThanOrEqualTo(String value) {
            addCriterion("business_level <=", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelLike(String value) {
            addCriterion("business_level like", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotLike(String value) {
            addCriterion("business_level not like", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelIn(List<String> values) {
            addCriterion("business_level in", values, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotIn(List<String> values) {
            addCriterion("business_level not in", values, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelBetween(String value1, String value2) {
            addCriterion("business_level between", value1, value2, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotBetween(String value1, String value2) {
            addCriterion("business_level not between", value1, value2, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessModeIsNull() {
            addCriterion("business_mode is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModeIsNotNull() {
            addCriterion("business_mode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModeEqualTo(String value) {
            addCriterion("business_mode =", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeNotEqualTo(String value) {
            addCriterion("business_mode <>", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeGreaterThan(String value) {
            addCriterion("business_mode >", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeGreaterThanOrEqualTo(String value) {
            addCriterion("business_mode >=", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeLessThan(String value) {
            addCriterion("business_mode <", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeLessThanOrEqualTo(String value) {
            addCriterion("business_mode <=", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeLike(String value) {
            addCriterion("business_mode like", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeNotLike(String value) {
            addCriterion("business_mode not like", value, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeIn(List<String> values) {
            addCriterion("business_mode in", values, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeNotIn(List<String> values) {
            addCriterion("business_mode not in", values, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeBetween(String value1, String value2) {
            addCriterion("business_mode between", value1, value2, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModeNotBetween(String value1, String value2) {
            addCriterion("business_mode not between", value1, value2, "businessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIsNull() {
            addCriterion("business_nature is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIsNotNull() {
            addCriterion("business_nature is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureEqualTo(String value) {
            addCriterion("business_nature =", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotEqualTo(String value) {
            addCriterion("business_nature <>", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureGreaterThan(String value) {
            addCriterion("business_nature >", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureGreaterThanOrEqualTo(String value) {
            addCriterion("business_nature >=", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLessThan(String value) {
            addCriterion("business_nature <", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLessThanOrEqualTo(String value) {
            addCriterion("business_nature <=", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLike(String value) {
            addCriterion("business_nature like", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotLike(String value) {
            addCriterion("business_nature not like", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIn(List<String> values) {
            addCriterion("business_nature in", values, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotIn(List<String> values) {
            addCriterion("business_nature not in", values, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureBetween(String value1, String value2) {
            addCriterion("business_nature between", value1, value2, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotBetween(String value1, String value2) {
            addCriterion("business_nature not between", value1, value2, "businessNature");
            return (Criteria) this;
        }

        public Criteria andChannelAddressIsNull() {
            addCriterion("channel_address is null");
            return (Criteria) this;
        }

        public Criteria andChannelAddressIsNotNull() {
            addCriterion("channel_address is not null");
            return (Criteria) this;
        }

        public Criteria andChannelAddressEqualTo(String value) {
            addCriterion("channel_address =", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotEqualTo(String value) {
            addCriterion("channel_address <>", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressGreaterThan(String value) {
            addCriterion("channel_address >", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("channel_address >=", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressLessThan(String value) {
            addCriterion("channel_address <", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressLessThanOrEqualTo(String value) {
            addCriterion("channel_address <=", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressLike(String value) {
            addCriterion("channel_address like", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotLike(String value) {
            addCriterion("channel_address not like", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressIn(List<String> values) {
            addCriterion("channel_address in", values, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotIn(List<String> values) {
            addCriterion("channel_address not in", values, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressBetween(String value1, String value2) {
            addCriterion("channel_address between", value1, value2, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotBetween(String value1, String value2) {
            addCriterion("channel_address not between", value1, value2, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelLayerIsNull() {
            addCriterion("channel_layer is null");
            return (Criteria) this;
        }

        public Criteria andChannelLayerIsNotNull() {
            addCriterion("channel_layer is not null");
            return (Criteria) this;
        }

        public Criteria andChannelLayerEqualTo(String value) {
            addCriterion("channel_layer =", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerNotEqualTo(String value) {
            addCriterion("channel_layer <>", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerGreaterThan(String value) {
            addCriterion("channel_layer >", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerGreaterThanOrEqualTo(String value) {
            addCriterion("channel_layer >=", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerLessThan(String value) {
            addCriterion("channel_layer <", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerLessThanOrEqualTo(String value) {
            addCriterion("channel_layer <=", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerLike(String value) {
            addCriterion("channel_layer like", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerNotLike(String value) {
            addCriterion("channel_layer not like", value, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerIn(List<String> values) {
            addCriterion("channel_layer in", values, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerNotIn(List<String> values) {
            addCriterion("channel_layer not in", values, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerBetween(String value1, String value2) {
            addCriterion("channel_layer between", value1, value2, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelLayerNotBetween(String value1, String value2) {
            addCriterion("channel_layer not between", value1, value2, "channelLayer");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdIsNull() {
            addCriterion("channel_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdIsNotNull() {
            addCriterion("channel_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdEqualTo(String value) {
            addCriterion("channel_manager_id =", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotEqualTo(String value) {
            addCriterion("channel_manager_id <>", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdGreaterThan(String value) {
            addCriterion("channel_manager_id >", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_manager_id >=", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdLessThan(String value) {
            addCriterion("channel_manager_id <", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdLessThanOrEqualTo(String value) {
            addCriterion("channel_manager_id <=", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdLike(String value) {
            addCriterion("channel_manager_id like", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotLike(String value) {
            addCriterion("channel_manager_id not like", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdIn(List<String> values) {
            addCriterion("channel_manager_id in", values, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotIn(List<String> values) {
            addCriterion("channel_manager_id not in", values, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdBetween(String value1, String value2) {
            addCriterion("channel_manager_id between", value1, value2, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotBetween(String value1, String value2) {
            addCriterion("channel_manager_id not between", value1, value2, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameIsNull() {
            addCriterion("channel_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameIsNotNull() {
            addCriterion("channel_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameEqualTo(String value) {
            addCriterion("channel_manager_name =", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotEqualTo(String value) {
            addCriterion("channel_manager_name <>", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameGreaterThan(String value) {
            addCriterion("channel_manager_name >", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_manager_name >=", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameLessThan(String value) {
            addCriterion("channel_manager_name <", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameLessThanOrEqualTo(String value) {
            addCriterion("channel_manager_name <=", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameLike(String value) {
            addCriterion("channel_manager_name like", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotLike(String value) {
            addCriterion("channel_manager_name not like", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameIn(List<String> values) {
            addCriterion("channel_manager_name in", values, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotIn(List<String> values) {
            addCriterion("channel_manager_name not in", values, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameBetween(String value1, String value2) {
            addCriterion("channel_manager_name between", value1, value2, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotBetween(String value1, String value2) {
            addCriterion("channel_manager_name not between", value1, value2, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneIsNull() {
            addCriterion("channel_manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneIsNotNull() {
            addCriterion("channel_manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneEqualTo(String value) {
            addCriterion("channel_manager_phone =", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotEqualTo(String value) {
            addCriterion("channel_manager_phone <>", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneGreaterThan(String value) {
            addCriterion("channel_manager_phone >", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("channel_manager_phone >=", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneLessThan(String value) {
            addCriterion("channel_manager_phone <", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("channel_manager_phone <=", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneLike(String value) {
            addCriterion("channel_manager_phone like", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotLike(String value) {
            addCriterion("channel_manager_phone not like", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneIn(List<String> values) {
            addCriterion("channel_manager_phone in", values, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotIn(List<String> values) {
            addCriterion("channel_manager_phone not in", values, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneBetween(String value1, String value2) {
            addCriterion("channel_manager_phone between", value1, value2, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("channel_manager_phone not between", value1, value2, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelIsNull() {
            addCriterion("channel_star_level is null");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelIsNotNull() {
            addCriterion("channel_star_level is not null");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelEqualTo(String value) {
            addCriterion("channel_star_level =", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelNotEqualTo(String value) {
            addCriterion("channel_star_level <>", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelGreaterThan(String value) {
            addCriterion("channel_star_level >", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("channel_star_level >=", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelLessThan(String value) {
            addCriterion("channel_star_level <", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelLessThanOrEqualTo(String value) {
            addCriterion("channel_star_level <=", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelLike(String value) {
            addCriterion("channel_star_level like", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelNotLike(String value) {
            addCriterion("channel_star_level not like", value, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelIn(List<String> values) {
            addCriterion("channel_star_level in", values, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelNotIn(List<String> values) {
            addCriterion("channel_star_level not in", values, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelBetween(String value1, String value2) {
            addCriterion("channel_star_level between", value1, value2, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChannelStarLevelNotBetween(String value1, String value2) {
            addCriterion("channel_star_level not between", value1, value2, "channelStarLevel");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdIsNull() {
            addCriterion("chl_first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdIsNotNull() {
            addCriterion("chl_first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdEqualTo(String value) {
            addCriterion("chl_first_kind_id =", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotEqualTo(String value) {
            addCriterion("chl_first_kind_id <>", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdGreaterThan(String value) {
            addCriterion("chl_first_kind_id >", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("chl_first_kind_id >=", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdLessThan(String value) {
            addCriterion("chl_first_kind_id <", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("chl_first_kind_id <=", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdLike(String value) {
            addCriterion("chl_first_kind_id like", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotLike(String value) {
            addCriterion("chl_first_kind_id not like", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdIn(List<String> values) {
            addCriterion("chl_first_kind_id in", values, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotIn(List<String> values) {
            addCriterion("chl_first_kind_id not in", values, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdBetween(String value1, String value2) {
            addCriterion("chl_first_kind_id between", value1, value2, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("chl_first_kind_id not between", value1, value2, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdIsNull() {
            addCriterion("chl_forth_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdIsNotNull() {
            addCriterion("chl_forth_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdEqualTo(String value) {
            addCriterion("chl_forth_kind_id =", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotEqualTo(String value) {
            addCriterion("chl_forth_kind_id <>", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdGreaterThan(String value) {
            addCriterion("chl_forth_kind_id >", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("chl_forth_kind_id >=", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdLessThan(String value) {
            addCriterion("chl_forth_kind_id <", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdLessThanOrEqualTo(String value) {
            addCriterion("chl_forth_kind_id <=", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdLike(String value) {
            addCriterion("chl_forth_kind_id like", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotLike(String value) {
            addCriterion("chl_forth_kind_id not like", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdIn(List<String> values) {
            addCriterion("chl_forth_kind_id in", values, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotIn(List<String> values) {
            addCriterion("chl_forth_kind_id not in", values, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdBetween(String value1, String value2) {
            addCriterion("chl_forth_kind_id between", value1, value2, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotBetween(String value1, String value2) {
            addCriterion("chl_forth_kind_id not between", value1, value2, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdIsNull() {
            addCriterion("chl_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andChlKindIdIsNotNull() {
            addCriterion("chl_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andChlKindIdEqualTo(String value) {
            addCriterion("chl_kind_id =", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotEqualTo(String value) {
            addCriterion("chl_kind_id <>", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdGreaterThan(String value) {
            addCriterion("chl_kind_id >", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("chl_kind_id >=", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdLessThan(String value) {
            addCriterion("chl_kind_id <", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdLessThanOrEqualTo(String value) {
            addCriterion("chl_kind_id <=", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdLike(String value) {
            addCriterion("chl_kind_id like", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotLike(String value) {
            addCriterion("chl_kind_id not like", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdIn(List<String> values) {
            addCriterion("chl_kind_id in", values, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotIn(List<String> values) {
            addCriterion("chl_kind_id not in", values, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdBetween(String value1, String value2) {
            addCriterion("chl_kind_id between", value1, value2, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotBetween(String value1, String value2) {
            addCriterion("chl_kind_id not between", value1, value2, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindNameIsNull() {
            addCriterion("chl_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andChlKindNameIsNotNull() {
            addCriterion("chl_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andChlKindNameEqualTo(String value) {
            addCriterion("chl_kind_name =", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotEqualTo(String value) {
            addCriterion("chl_kind_name <>", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameGreaterThan(String value) {
            addCriterion("chl_kind_name >", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("chl_kind_name >=", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameLessThan(String value) {
            addCriterion("chl_kind_name <", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameLessThanOrEqualTo(String value) {
            addCriterion("chl_kind_name <=", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameLike(String value) {
            addCriterion("chl_kind_name like", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotLike(String value) {
            addCriterion("chl_kind_name not like", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameIn(List<String> values) {
            addCriterion("chl_kind_name in", values, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotIn(List<String> values) {
            addCriterion("chl_kind_name not in", values, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameBetween(String value1, String value2) {
            addCriterion("chl_kind_name between", value1, value2, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotBetween(String value1, String value2) {
            addCriterion("chl_kind_name not between", value1, value2, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdIsNull() {
            addCriterion("chl_second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdIsNotNull() {
            addCriterion("chl_second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdEqualTo(String value) {
            addCriterion("chl_second_kind_id =", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotEqualTo(String value) {
            addCriterion("chl_second_kind_id <>", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdGreaterThan(String value) {
            addCriterion("chl_second_kind_id >", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("chl_second_kind_id >=", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdLessThan(String value) {
            addCriterion("chl_second_kind_id <", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("chl_second_kind_id <=", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdLike(String value) {
            addCriterion("chl_second_kind_id like", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotLike(String value) {
            addCriterion("chl_second_kind_id not like", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdIn(List<String> values) {
            addCriterion("chl_second_kind_id in", values, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotIn(List<String> values) {
            addCriterion("chl_second_kind_id not in", values, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdBetween(String value1, String value2) {
            addCriterion("chl_second_kind_id between", value1, value2, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("chl_second_kind_id not between", value1, value2, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdIsNull() {
            addCriterion("chl_third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdIsNotNull() {
            addCriterion("chl_third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdEqualTo(String value) {
            addCriterion("chl_third_kind_id =", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotEqualTo(String value) {
            addCriterion("chl_third_kind_id <>", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdGreaterThan(String value) {
            addCriterion("chl_third_kind_id >", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("chl_third_kind_id >=", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdLessThan(String value) {
            addCriterion("chl_third_kind_id <", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("chl_third_kind_id <=", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdLike(String value) {
            addCriterion("chl_third_kind_id like", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotLike(String value) {
            addCriterion("chl_third_kind_id not like", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdIn(List<String> values) {
            addCriterion("chl_third_kind_id in", values, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotIn(List<String> values) {
            addCriterion("chl_third_kind_id not in", values, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdBetween(String value1, String value2) {
            addCriterion("chl_third_kind_id between", value1, value2, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("chl_third_kind_id not between", value1, value2, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andConstructModeIsNull() {
            addCriterion("construct_mode is null");
            return (Criteria) this;
        }

        public Criteria andConstructModeIsNotNull() {
            addCriterion("construct_mode is not null");
            return (Criteria) this;
        }

        public Criteria andConstructModeEqualTo(String value) {
            addCriterion("construct_mode =", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeNotEqualTo(String value) {
            addCriterion("construct_mode <>", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeGreaterThan(String value) {
            addCriterion("construct_mode >", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeGreaterThanOrEqualTo(String value) {
            addCriterion("construct_mode >=", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeLessThan(String value) {
            addCriterion("construct_mode <", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeLessThanOrEqualTo(String value) {
            addCriterion("construct_mode <=", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeLike(String value) {
            addCriterion("construct_mode like", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeNotLike(String value) {
            addCriterion("construct_mode not like", value, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeIn(List<String> values) {
            addCriterion("construct_mode in", values, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeNotIn(List<String> values) {
            addCriterion("construct_mode not in", values, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeBetween(String value1, String value2) {
            addCriterion("construct_mode between", value1, value2, "constructMode");
            return (Criteria) this;
        }

        public Criteria andConstructModeNotBetween(String value1, String value2) {
            addCriterion("construct_mode not between", value1, value2, "constructMode");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_address not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactFaxIsNull() {
            addCriterion("contact_fax is null");
            return (Criteria) this;
        }

        public Criteria andContactFaxIsNotNull() {
            addCriterion("contact_fax is not null");
            return (Criteria) this;
        }

        public Criteria andContactFaxEqualTo(String value) {
            addCriterion("contact_fax =", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotEqualTo(String value) {
            addCriterion("contact_fax <>", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxGreaterThan(String value) {
            addCriterion("contact_fax >", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxGreaterThanOrEqualTo(String value) {
            addCriterion("contact_fax >=", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLessThan(String value) {
            addCriterion("contact_fax <", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLessThanOrEqualTo(String value) {
            addCriterion("contact_fax <=", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLike(String value) {
            addCriterion("contact_fax like", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotLike(String value) {
            addCriterion("contact_fax not like", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxIn(List<String> values) {
            addCriterion("contact_fax in", values, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotIn(List<String> values) {
            addCriterion("contact_fax not in", values, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxBetween(String value1, String value2) {
            addCriterion("contact_fax between", value1, value2, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotBetween(String value1, String value2) {
            addCriterion("contact_fax not between", value1, value2, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNull() {
            addCriterion("contact_mail is null");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNotNull() {
            addCriterion("contact_mail is not null");
            return (Criteria) this;
        }

        public Criteria andContactMailEqualTo(String value) {
            addCriterion("contact_mail =", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotEqualTo(String value) {
            addCriterion("contact_mail <>", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThan(String value) {
            addCriterion("contact_mail >", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mail >=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThan(String value) {
            addCriterion("contact_mail <", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThanOrEqualTo(String value) {
            addCriterion("contact_mail <=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLike(String value) {
            addCriterion("contact_mail like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotLike(String value) {
            addCriterion("contact_mail not like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailIn(List<String> values) {
            addCriterion("contact_mail in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotIn(List<String> values) {
            addCriterion("contact_mail not in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailBetween(String value1, String value2) {
            addCriterion("contact_mail between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotBetween(String value1, String value2) {
            addCriterion("contact_mail not between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeIsNull() {
            addCriterion("contact_postcode is null");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeIsNotNull() {
            addCriterion("contact_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeEqualTo(String value) {
            addCriterion("contact_postcode =", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotEqualTo(String value) {
            addCriterion("contact_postcode <>", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeGreaterThan(String value) {
            addCriterion("contact_postcode >", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("contact_postcode >=", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeLessThan(String value) {
            addCriterion("contact_postcode <", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeLessThanOrEqualTo(String value) {
            addCriterion("contact_postcode <=", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeLike(String value) {
            addCriterion("contact_postcode like", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotLike(String value) {
            addCriterion("contact_postcode not like", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeIn(List<String> values) {
            addCriterion("contact_postcode in", values, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotIn(List<String> values) {
            addCriterion("contact_postcode not in", values, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeBetween(String value1, String value2) {
            addCriterion("contact_postcode between", value1, value2, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotBetween(String value1, String value2) {
            addCriterion("contact_postcode not between", value1, value2, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactSexIsNull() {
            addCriterion("contact_sex is null");
            return (Criteria) this;
        }

        public Criteria andContactSexIsNotNull() {
            addCriterion("contact_sex is not null");
            return (Criteria) this;
        }

        public Criteria andContactSexEqualTo(String value) {
            addCriterion("contact_sex =", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotEqualTo(String value) {
            addCriterion("contact_sex <>", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexGreaterThan(String value) {
            addCriterion("contact_sex >", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexGreaterThanOrEqualTo(String value) {
            addCriterion("contact_sex >=", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLessThan(String value) {
            addCriterion("contact_sex <", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLessThanOrEqualTo(String value) {
            addCriterion("contact_sex <=", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLike(String value) {
            addCriterion("contact_sex like", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotLike(String value) {
            addCriterion("contact_sex not like", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexIn(List<String> values) {
            addCriterion("contact_sex in", values, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotIn(List<String> values) {
            addCriterion("contact_sex not in", values, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexBetween(String value1, String value2) {
            addCriterion("contact_sex between", value1, value2, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotBetween(String value1, String value2) {
            addCriterion("contact_sex not between", value1, value2, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContractBondIsNull() {
            addCriterion("contract_bond is null");
            return (Criteria) this;
        }

        public Criteria andContractBondIsNotNull() {
            addCriterion("contract_bond is not null");
            return (Criteria) this;
        }

        public Criteria andContractBondEqualTo(Long value) {
            addCriterion("contract_bond =", value, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondNotEqualTo(Long value) {
            addCriterion("contract_bond <>", value, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondGreaterThan(Long value) {
            addCriterion("contract_bond >", value, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_bond >=", value, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondLessThan(Long value) {
            addCriterion("contract_bond <", value, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondLessThanOrEqualTo(Long value) {
            addCriterion("contract_bond <=", value, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondIn(List<Long> values) {
            addCriterion("contract_bond in", values, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondNotIn(List<Long> values) {
            addCriterion("contract_bond not in", values, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondBetween(Long value1, Long value2) {
            addCriterion("contract_bond between", value1, value2, "contractBond");
            return (Criteria) this;
        }

        public Criteria andContractBondNotBetween(Long value1, Long value2) {
            addCriterion("contract_bond not between", value1, value2, "contractBond");
            return (Criteria) this;
        }

        public Criteria andCoreFlagIsNull() {
            addCriterion("core_flag is null");
            return (Criteria) this;
        }

        public Criteria andCoreFlagIsNotNull() {
            addCriterion("core_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCoreFlagEqualTo(Integer value) {
            addCriterion("core_flag =", value, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagNotEqualTo(Integer value) {
            addCriterion("core_flag <>", value, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagGreaterThan(Integer value) {
            addCriterion("core_flag >", value, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("core_flag >=", value, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagLessThan(Integer value) {
            addCriterion("core_flag <", value, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagLessThanOrEqualTo(Integer value) {
            addCriterion("core_flag <=", value, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagIn(List<Integer> values) {
            addCriterion("core_flag in", values, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagNotIn(List<Integer> values) {
            addCriterion("core_flag not in", values, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagBetween(Integer value1, Integer value2) {
            addCriterion("core_flag between", value1, value2, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCoreFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("core_flag not between", value1, value2, "coreFlag");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdIsNull() {
            addCriterion("create_oper_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdIsNotNull() {
            addCriterion("create_oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdEqualTo(String value) {
            addCriterion("create_oper_id =", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotEqualTo(String value) {
            addCriterion("create_oper_id <>", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdGreaterThan(String value) {
            addCriterion("create_oper_id >", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_oper_id >=", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdLessThan(String value) {
            addCriterion("create_oper_id <", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdLessThanOrEqualTo(String value) {
            addCriterion("create_oper_id <=", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdLike(String value) {
            addCriterion("create_oper_id like", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotLike(String value) {
            addCriterion("create_oper_id not like", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdIn(List<String> values) {
            addCriterion("create_oper_id in", values, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotIn(List<String> values) {
            addCriterion("create_oper_id not in", values, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdBetween(String value1, String value2) {
            addCriterion("create_oper_id between", value1, value2, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotBetween(String value1, String value2) {
            addCriterion("create_oper_id not between", value1, value2, "createOperId");
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptId1IsNull() {
            addCriterion("dept_id1 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId1IsNotNull() {
            addCriterion("dept_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId1EqualTo(String value) {
            addCriterion("dept_id1 =", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotEqualTo(String value) {
            addCriterion("dept_id1 <>", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1GreaterThan(String value) {
            addCriterion("dept_id1 >", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1GreaterThanOrEqualTo(String value) {
            addCriterion("dept_id1 >=", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1LessThan(String value) {
            addCriterion("dept_id1 <", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1LessThanOrEqualTo(String value) {
            addCriterion("dept_id1 <=", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1Like(String value) {
            addCriterion("dept_id1 like", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotLike(String value) {
            addCriterion("dept_id1 not like", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1In(List<String> values) {
            addCriterion("dept_id1 in", values, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotIn(List<String> values) {
            addCriterion("dept_id1 not in", values, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1Between(String value1, String value2) {
            addCriterion("dept_id1 between", value1, value2, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotBetween(String value1, String value2) {
            addCriterion("dept_id1 not between", value1, value2, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId2IsNull() {
            addCriterion("dept_id2 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId2IsNotNull() {
            addCriterion("dept_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId2EqualTo(String value) {
            addCriterion("dept_id2 =", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotEqualTo(String value) {
            addCriterion("dept_id2 <>", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2GreaterThan(String value) {
            addCriterion("dept_id2 >", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2GreaterThanOrEqualTo(String value) {
            addCriterion("dept_id2 >=", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2LessThan(String value) {
            addCriterion("dept_id2 <", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2LessThanOrEqualTo(String value) {
            addCriterion("dept_id2 <=", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2Like(String value) {
            addCriterion("dept_id2 like", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotLike(String value) {
            addCriterion("dept_id2 not like", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2In(List<String> values) {
            addCriterion("dept_id2 in", values, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotIn(List<String> values) {
            addCriterion("dept_id2 not in", values, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2Between(String value1, String value2) {
            addCriterion("dept_id2 between", value1, value2, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotBetween(String value1, String value2) {
            addCriterion("dept_id2 not between", value1, value2, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId3IsNull() {
            addCriterion("dept_id3 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId3IsNotNull() {
            addCriterion("dept_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId3EqualTo(String value) {
            addCriterion("dept_id3 =", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotEqualTo(String value) {
            addCriterion("dept_id3 <>", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3GreaterThan(String value) {
            addCriterion("dept_id3 >", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3GreaterThanOrEqualTo(String value) {
            addCriterion("dept_id3 >=", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3LessThan(String value) {
            addCriterion("dept_id3 <", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3LessThanOrEqualTo(String value) {
            addCriterion("dept_id3 <=", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3Like(String value) {
            addCriterion("dept_id3 like", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotLike(String value) {
            addCriterion("dept_id3 not like", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3In(List<String> values) {
            addCriterion("dept_id3 in", values, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotIn(List<String> values) {
            addCriterion("dept_id3 not in", values, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3Between(String value1, String value2) {
            addCriterion("dept_id3 between", value1, value2, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotBetween(String value1, String value2) {
            addCriterion("dept_id3 not between", value1, value2, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId4IsNull() {
            addCriterion("dept_id4 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId4IsNotNull() {
            addCriterion("dept_id4 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId4EqualTo(String value) {
            addCriterion("dept_id4 =", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotEqualTo(String value) {
            addCriterion("dept_id4 <>", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4GreaterThan(String value) {
            addCriterion("dept_id4 >", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4GreaterThanOrEqualTo(String value) {
            addCriterion("dept_id4 >=", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4LessThan(String value) {
            addCriterion("dept_id4 <", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4LessThanOrEqualTo(String value) {
            addCriterion("dept_id4 <=", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4Like(String value) {
            addCriterion("dept_id4 like", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotLike(String value) {
            addCriterion("dept_id4 not like", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4In(List<String> values) {
            addCriterion("dept_id4 in", values, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotIn(List<String> values) {
            addCriterion("dept_id4 not in", values, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4Between(String value1, String value2) {
            addCriterion("dept_id4 between", value1, value2, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotBetween(String value1, String value2) {
            addCriterion("dept_id4 not between", value1, value2, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId5IsNull() {
            addCriterion("dept_id5 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId5IsNotNull() {
            addCriterion("dept_id5 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId5EqualTo(String value) {
            addCriterion("dept_id5 =", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotEqualTo(String value) {
            addCriterion("dept_id5 <>", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5GreaterThan(String value) {
            addCriterion("dept_id5 >", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5GreaterThanOrEqualTo(String value) {
            addCriterion("dept_id5 >=", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5LessThan(String value) {
            addCriterion("dept_id5 <", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5LessThanOrEqualTo(String value) {
            addCriterion("dept_id5 <=", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5Like(String value) {
            addCriterion("dept_id5 like", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotLike(String value) {
            addCriterion("dept_id5 not like", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5In(List<String> values) {
            addCriterion("dept_id5 in", values, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotIn(List<String> values) {
            addCriterion("dept_id5 not in", values, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5Between(String value1, String value2) {
            addCriterion("dept_id5 between", value1, value2, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotBetween(String value1, String value2) {
            addCriterion("dept_id5 not between", value1, value2, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId6IsNull() {
            addCriterion("dept_id6 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId6IsNotNull() {
            addCriterion("dept_id6 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId6EqualTo(String value) {
            addCriterion("dept_id6 =", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotEqualTo(String value) {
            addCriterion("dept_id6 <>", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6GreaterThan(String value) {
            addCriterion("dept_id6 >", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6GreaterThanOrEqualTo(String value) {
            addCriterion("dept_id6 >=", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6LessThan(String value) {
            addCriterion("dept_id6 <", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6LessThanOrEqualTo(String value) {
            addCriterion("dept_id6 <=", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6Like(String value) {
            addCriterion("dept_id6 like", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotLike(String value) {
            addCriterion("dept_id6 not like", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6In(List<String> values) {
            addCriterion("dept_id6 in", values, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotIn(List<String> values) {
            addCriterion("dept_id6 not in", values, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6Between(String value1, String value2) {
            addCriterion("dept_id6 between", value1, value2, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotBetween(String value1, String value2) {
            addCriterion("dept_id6 not between", value1, value2, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andExtJsonIsNull() {
            addCriterion("ext_json is null");
            return (Criteria) this;
        }

        public Criteria andExtJsonIsNotNull() {
            addCriterion("ext_json is not null");
            return (Criteria) this;
        }

        public Criteria andExtJsonEqualTo(String value) {
            addCriterion("ext_json =", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonNotEqualTo(String value) {
            addCriterion("ext_json <>", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonGreaterThan(String value) {
            addCriterion("ext_json >", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonGreaterThanOrEqualTo(String value) {
            addCriterion("ext_json >=", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonLessThan(String value) {
            addCriterion("ext_json <", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonLessThanOrEqualTo(String value) {
            addCriterion("ext_json <=", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonLike(String value) {
            addCriterion("ext_json like", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonNotLike(String value) {
            addCriterion("ext_json not like", value, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonIn(List<String> values) {
            addCriterion("ext_json in", values, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonNotIn(List<String> values) {
            addCriterion("ext_json not in", values, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonBetween(String value1, String value2) {
            addCriterion("ext_json between", value1, value2, "extJson");
            return (Criteria) this;
        }

        public Criteria andExtJsonNotBetween(String value1, String value2) {
            addCriterion("ext_json not between", value1, value2, "extJson");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andShopAreaIsNull() {
            addCriterion("shop_area is null");
            return (Criteria) this;
        }

        public Criteria andShopAreaIsNotNull() {
            addCriterion("shop_area is not null");
            return (Criteria) this;
        }

        public Criteria andShopAreaEqualTo(BigDecimal value) {
            addCriterion("shop_area =", value, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaNotEqualTo(BigDecimal value) {
            addCriterion("shop_area <>", value, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaGreaterThan(BigDecimal value) {
            addCriterion("shop_area >", value, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_area >=", value, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaLessThan(BigDecimal value) {
            addCriterion("shop_area <", value, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_area <=", value, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaIn(List<BigDecimal> values) {
            addCriterion("shop_area in", values, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaNotIn(List<BigDecimal> values) {
            addCriterion("shop_area not in", values, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_area between", value1, value2, "shopArea");
            return (Criteria) this;
        }

        public Criteria andShopAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_area not between", value1, value2, "shopArea");
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

        public Criteria andTelecomOperatorIdIsNull() {
            addCriterion("telecom_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdIsNotNull() {
            addCriterion("telecom_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdEqualTo(String value) {
            addCriterion("telecom_operator_id =", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdNotEqualTo(String value) {
            addCriterion("telecom_operator_id <>", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdGreaterThan(String value) {
            addCriterion("telecom_operator_id >", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("telecom_operator_id >=", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdLessThan(String value) {
            addCriterion("telecom_operator_id <", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("telecom_operator_id <=", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdLike(String value) {
            addCriterion("telecom_operator_id like", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdNotLike(String value) {
            addCriterion("telecom_operator_id not like", value, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdIn(List<String> values) {
            addCriterion("telecom_operator_id in", values, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdNotIn(List<String> values) {
            addCriterion("telecom_operator_id not in", values, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdBetween(String value1, String value2) {
            addCriterion("telecom_operator_id between", value1, value2, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIdNotBetween(String value1, String value2) {
            addCriterion("telecom_operator_id not between", value1, value2, "telecomOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIsNull() {
            addCriterion("update_oper_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIsNotNull() {
            addCriterion("update_oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdEqualTo(String value) {
            addCriterion("update_oper_id =", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotEqualTo(String value) {
            addCriterion("update_oper_id <>", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdGreaterThan(String value) {
            addCriterion("update_oper_id >", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_oper_id >=", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLessThan(String value) {
            addCriterion("update_oper_id <", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLessThanOrEqualTo(String value) {
            addCriterion("update_oper_id <=", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLike(String value) {
            addCriterion("update_oper_id like", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotLike(String value) {
            addCriterion("update_oper_id not like", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIn(List<String> values) {
            addCriterion("update_oper_id in", values, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotIn(List<String> values) {
            addCriterion("update_oper_id not in", values, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdBetween(String value1, String value2) {
            addCriterion("update_oper_id between", value1, value2, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotBetween(String value1, String value2) {
            addCriterion("update_oper_id not between", value1, value2, "updateOperId");
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