package top.duanhong.steward.entity.po;

import java.util.ArrayList;
import java.util.List;

public class StewGridExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StewGridExample() {
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

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andGridCodeIsNull() {
            addCriterion("grid_code is null");
            return (Criteria) this;
        }

        public Criteria andGridCodeIsNotNull() {
            addCriterion("grid_code is not null");
            return (Criteria) this;
        }

        public Criteria andGridCodeEqualTo(String value) {
            addCriterion("grid_code =", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeNotEqualTo(String value) {
            addCriterion("grid_code <>", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeGreaterThan(String value) {
            addCriterion("grid_code >", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeGreaterThanOrEqualTo(String value) {
            addCriterion("grid_code >=", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeLessThan(String value) {
            addCriterion("grid_code <", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeLessThanOrEqualTo(String value) {
            addCriterion("grid_code <=", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeLike(String value) {
            addCriterion("grid_code like", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeNotLike(String value) {
            addCriterion("grid_code not like", value, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeIn(List<String> values) {
            addCriterion("grid_code in", values, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeNotIn(List<String> values) {
            addCriterion("grid_code not in", values, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeBetween(String value1, String value2) {
            addCriterion("grid_code between", value1, value2, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridCodeNotBetween(String value1, String value2) {
            addCriterion("grid_code not between", value1, value2, "gridCode");
            return (Criteria) this;
        }

        public Criteria andGridNameIsNull() {
            addCriterion("grid_name is null");
            return (Criteria) this;
        }

        public Criteria andGridNameIsNotNull() {
            addCriterion("grid_name is not null");
            return (Criteria) this;
        }

        public Criteria andGridNameEqualTo(String value) {
            addCriterion("grid_name =", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotEqualTo(String value) {
            addCriterion("grid_name <>", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameGreaterThan(String value) {
            addCriterion("grid_name >", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameGreaterThanOrEqualTo(String value) {
            addCriterion("grid_name >=", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLessThan(String value) {
            addCriterion("grid_name <", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLessThanOrEqualTo(String value) {
            addCriterion("grid_name <=", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLike(String value) {
            addCriterion("grid_name like", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotLike(String value) {
            addCriterion("grid_name not like", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameIn(List<String> values) {
            addCriterion("grid_name in", values, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotIn(List<String> values) {
            addCriterion("grid_name not in", values, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameBetween(String value1, String value2) {
            addCriterion("grid_name between", value1, value2, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotBetween(String value1, String value2) {
            addCriterion("grid_name not between", value1, value2, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridSumsIsNull() {
            addCriterion("grid_sums is null");
            return (Criteria) this;
        }

        public Criteria andGridSumsIsNotNull() {
            addCriterion("grid_sums is not null");
            return (Criteria) this;
        }

        public Criteria andGridSumsEqualTo(String value) {
            addCriterion("grid_sums =", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsNotEqualTo(String value) {
            addCriterion("grid_sums <>", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsGreaterThan(String value) {
            addCriterion("grid_sums >", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsGreaterThanOrEqualTo(String value) {
            addCriterion("grid_sums >=", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsLessThan(String value) {
            addCriterion("grid_sums <", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsLessThanOrEqualTo(String value) {
            addCriterion("grid_sums <=", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsLike(String value) {
            addCriterion("grid_sums like", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsNotLike(String value) {
            addCriterion("grid_sums not like", value, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsIn(List<String> values) {
            addCriterion("grid_sums in", values, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsNotIn(List<String> values) {
            addCriterion("grid_sums not in", values, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsBetween(String value1, String value2) {
            addCriterion("grid_sums between", value1, value2, "gridSums");
            return (Criteria) this;
        }

        public Criteria andGridSumsNotBetween(String value1, String value2) {
            addCriterion("grid_sums not between", value1, value2, "gridSums");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterIsNull() {
            addCriterion("latitude_center is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterIsNotNull() {
            addCriterion("latitude_center is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterEqualTo(String value) {
            addCriterion("latitude_center =", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterNotEqualTo(String value) {
            addCriterion("latitude_center <>", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterGreaterThan(String value) {
            addCriterion("latitude_center >", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterGreaterThanOrEqualTo(String value) {
            addCriterion("latitude_center >=", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterLessThan(String value) {
            addCriterion("latitude_center <", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterLessThanOrEqualTo(String value) {
            addCriterion("latitude_center <=", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterLike(String value) {
            addCriterion("latitude_center like", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterNotLike(String value) {
            addCriterion("latitude_center not like", value, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterIn(List<String> values) {
            addCriterion("latitude_center in", values, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterNotIn(List<String> values) {
            addCriterion("latitude_center not in", values, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterBetween(String value1, String value2) {
            addCriterion("latitude_center between", value1, value2, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLatitudeCenterNotBetween(String value1, String value2) {
            addCriterion("latitude_center not between", value1, value2, "latitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatIsNull() {
            addCriterion("left_down_lat is null");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatIsNotNull() {
            addCriterion("left_down_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatEqualTo(String value) {
            addCriterion("left_down_lat =", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatNotEqualTo(String value) {
            addCriterion("left_down_lat <>", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatGreaterThan(String value) {
            addCriterion("left_down_lat >", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatGreaterThanOrEqualTo(String value) {
            addCriterion("left_down_lat >=", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatLessThan(String value) {
            addCriterion("left_down_lat <", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatLessThanOrEqualTo(String value) {
            addCriterion("left_down_lat <=", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatLike(String value) {
            addCriterion("left_down_lat like", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatNotLike(String value) {
            addCriterion("left_down_lat not like", value, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatIn(List<String> values) {
            addCriterion("left_down_lat in", values, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatNotIn(List<String> values) {
            addCriterion("left_down_lat not in", values, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatBetween(String value1, String value2) {
            addCriterion("left_down_lat between", value1, value2, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLatNotBetween(String value1, String value2) {
            addCriterion("left_down_lat not between", value1, value2, "leftDownLat");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonIsNull() {
            addCriterion("left_down_lon is null");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonIsNotNull() {
            addCriterion("left_down_lon is not null");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonEqualTo(String value) {
            addCriterion("left_down_lon =", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonNotEqualTo(String value) {
            addCriterion("left_down_lon <>", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonGreaterThan(String value) {
            addCriterion("left_down_lon >", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonGreaterThanOrEqualTo(String value) {
            addCriterion("left_down_lon >=", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonLessThan(String value) {
            addCriterion("left_down_lon <", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonLessThanOrEqualTo(String value) {
            addCriterion("left_down_lon <=", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonLike(String value) {
            addCriterion("left_down_lon like", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonNotLike(String value) {
            addCriterion("left_down_lon not like", value, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonIn(List<String> values) {
            addCriterion("left_down_lon in", values, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonNotIn(List<String> values) {
            addCriterion("left_down_lon not in", values, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonBetween(String value1, String value2) {
            addCriterion("left_down_lon between", value1, value2, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftDownLonNotBetween(String value1, String value2) {
            addCriterion("left_down_lon not between", value1, value2, "leftDownLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatIsNull() {
            addCriterion("left_up_lat is null");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatIsNotNull() {
            addCriterion("left_up_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatEqualTo(String value) {
            addCriterion("left_up_lat =", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatNotEqualTo(String value) {
            addCriterion("left_up_lat <>", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatGreaterThan(String value) {
            addCriterion("left_up_lat >", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatGreaterThanOrEqualTo(String value) {
            addCriterion("left_up_lat >=", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatLessThan(String value) {
            addCriterion("left_up_lat <", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatLessThanOrEqualTo(String value) {
            addCriterion("left_up_lat <=", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatLike(String value) {
            addCriterion("left_up_lat like", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatNotLike(String value) {
            addCriterion("left_up_lat not like", value, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatIn(List<String> values) {
            addCriterion("left_up_lat in", values, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatNotIn(List<String> values) {
            addCriterion("left_up_lat not in", values, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatBetween(String value1, String value2) {
            addCriterion("left_up_lat between", value1, value2, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLatNotBetween(String value1, String value2) {
            addCriterion("left_up_lat not between", value1, value2, "leftUpLat");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonIsNull() {
            addCriterion("left_up_lon is null");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonIsNotNull() {
            addCriterion("left_up_lon is not null");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonEqualTo(String value) {
            addCriterion("left_up_lon =", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonNotEqualTo(String value) {
            addCriterion("left_up_lon <>", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonGreaterThan(String value) {
            addCriterion("left_up_lon >", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonGreaterThanOrEqualTo(String value) {
            addCriterion("left_up_lon >=", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonLessThan(String value) {
            addCriterion("left_up_lon <", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonLessThanOrEqualTo(String value) {
            addCriterion("left_up_lon <=", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonLike(String value) {
            addCriterion("left_up_lon like", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonNotLike(String value) {
            addCriterion("left_up_lon not like", value, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonIn(List<String> values) {
            addCriterion("left_up_lon in", values, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonNotIn(List<String> values) {
            addCriterion("left_up_lon not in", values, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonBetween(String value1, String value2) {
            addCriterion("left_up_lon between", value1, value2, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLeftUpLonNotBetween(String value1, String value2) {
            addCriterion("left_up_lon not between", value1, value2, "leftUpLon");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterIsNull() {
            addCriterion("longitude_center is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterIsNotNull() {
            addCriterion("longitude_center is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterEqualTo(String value) {
            addCriterion("longitude_center =", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterNotEqualTo(String value) {
            addCriterion("longitude_center <>", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterGreaterThan(String value) {
            addCriterion("longitude_center >", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterGreaterThanOrEqualTo(String value) {
            addCriterion("longitude_center >=", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterLessThan(String value) {
            addCriterion("longitude_center <", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterLessThanOrEqualTo(String value) {
            addCriterion("longitude_center <=", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterLike(String value) {
            addCriterion("longitude_center like", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterNotLike(String value) {
            addCriterion("longitude_center not like", value, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterIn(List<String> values) {
            addCriterion("longitude_center in", values, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterNotIn(List<String> values) {
            addCriterion("longitude_center not in", values, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterBetween(String value1, String value2) {
            addCriterion("longitude_center between", value1, value2, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andLongitudeCenterNotBetween(String value1, String value2) {
            addCriterion("longitude_center not between", value1, value2, "longitudeCenter");
            return (Criteria) this;
        }

        public Criteria andRightDownLatIsNull() {
            addCriterion("right_down_lat is null");
            return (Criteria) this;
        }

        public Criteria andRightDownLatIsNotNull() {
            addCriterion("right_down_lat is not null");
            return (Criteria) this;
        }

        public Criteria andRightDownLatEqualTo(String value) {
            addCriterion("right_down_lat =", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatNotEqualTo(String value) {
            addCriterion("right_down_lat <>", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatGreaterThan(String value) {
            addCriterion("right_down_lat >", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatGreaterThanOrEqualTo(String value) {
            addCriterion("right_down_lat >=", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatLessThan(String value) {
            addCriterion("right_down_lat <", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatLessThanOrEqualTo(String value) {
            addCriterion("right_down_lat <=", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatLike(String value) {
            addCriterion("right_down_lat like", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatNotLike(String value) {
            addCriterion("right_down_lat not like", value, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatIn(List<String> values) {
            addCriterion("right_down_lat in", values, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatNotIn(List<String> values) {
            addCriterion("right_down_lat not in", values, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatBetween(String value1, String value2) {
            addCriterion("right_down_lat between", value1, value2, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLatNotBetween(String value1, String value2) {
            addCriterion("right_down_lat not between", value1, value2, "rightDownLat");
            return (Criteria) this;
        }

        public Criteria andRightDownLonIsNull() {
            addCriterion("right_down_lon is null");
            return (Criteria) this;
        }

        public Criteria andRightDownLonIsNotNull() {
            addCriterion("right_down_lon is not null");
            return (Criteria) this;
        }

        public Criteria andRightDownLonEqualTo(String value) {
            addCriterion("right_down_lon =", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonNotEqualTo(String value) {
            addCriterion("right_down_lon <>", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonGreaterThan(String value) {
            addCriterion("right_down_lon >", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonGreaterThanOrEqualTo(String value) {
            addCriterion("right_down_lon >=", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonLessThan(String value) {
            addCriterion("right_down_lon <", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonLessThanOrEqualTo(String value) {
            addCriterion("right_down_lon <=", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonLike(String value) {
            addCriterion("right_down_lon like", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonNotLike(String value) {
            addCriterion("right_down_lon not like", value, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonIn(List<String> values) {
            addCriterion("right_down_lon in", values, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonNotIn(List<String> values) {
            addCriterion("right_down_lon not in", values, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonBetween(String value1, String value2) {
            addCriterion("right_down_lon between", value1, value2, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightDownLonNotBetween(String value1, String value2) {
            addCriterion("right_down_lon not between", value1, value2, "rightDownLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLatIsNull() {
            addCriterion("right_up_lat is null");
            return (Criteria) this;
        }

        public Criteria andRightUpLatIsNotNull() {
            addCriterion("right_up_lat is not null");
            return (Criteria) this;
        }

        public Criteria andRightUpLatEqualTo(String value) {
            addCriterion("right_up_lat =", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatNotEqualTo(String value) {
            addCriterion("right_up_lat <>", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatGreaterThan(String value) {
            addCriterion("right_up_lat >", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatGreaterThanOrEqualTo(String value) {
            addCriterion("right_up_lat >=", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatLessThan(String value) {
            addCriterion("right_up_lat <", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatLessThanOrEqualTo(String value) {
            addCriterion("right_up_lat <=", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatLike(String value) {
            addCriterion("right_up_lat like", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatNotLike(String value) {
            addCriterion("right_up_lat not like", value, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatIn(List<String> values) {
            addCriterion("right_up_lat in", values, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatNotIn(List<String> values) {
            addCriterion("right_up_lat not in", values, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatBetween(String value1, String value2) {
            addCriterion("right_up_lat between", value1, value2, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLatNotBetween(String value1, String value2) {
            addCriterion("right_up_lat not between", value1, value2, "rightUpLat");
            return (Criteria) this;
        }

        public Criteria andRightUpLonIsNull() {
            addCriterion("right_up_lon is null");
            return (Criteria) this;
        }

        public Criteria andRightUpLonIsNotNull() {
            addCriterion("right_up_lon is not null");
            return (Criteria) this;
        }

        public Criteria andRightUpLonEqualTo(String value) {
            addCriterion("right_up_lon =", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonNotEqualTo(String value) {
            addCriterion("right_up_lon <>", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonGreaterThan(String value) {
            addCriterion("right_up_lon >", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonGreaterThanOrEqualTo(String value) {
            addCriterion("right_up_lon >=", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonLessThan(String value) {
            addCriterion("right_up_lon <", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonLessThanOrEqualTo(String value) {
            addCriterion("right_up_lon <=", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonLike(String value) {
            addCriterion("right_up_lon like", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonNotLike(String value) {
            addCriterion("right_up_lon not like", value, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonIn(List<String> values) {
            addCriterion("right_up_lon in", values, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonNotIn(List<String> values) {
            addCriterion("right_up_lon not in", values, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonBetween(String value1, String value2) {
            addCriterion("right_up_lon between", value1, value2, "rightUpLon");
            return (Criteria) this;
        }

        public Criteria andRightUpLonNotBetween(String value1, String value2) {
            addCriterion("right_up_lon not between", value1, value2, "rightUpLon");
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