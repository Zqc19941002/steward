package top.duanhong.steward.enumeration;

import lombok.Getter;

@Getter
public enum StatusCodeEnum {

	SUCCESS_CODE("0000","成功"),
	ERROR_SECR("0001","密码错误"),
	NO_USER("0002","用户未注册"),
	REQ_PARAM_ERROR("0003","数据校验失败"),
	HAS_USER("0004","用户名已被使用"),
	REG_FAIL("0005","注册失败"),
	REG_SUCCESS("0006","注册成功"),
	NO_AUTH("0007","登录超时"),
	FLOW_DELETE_FAIL("0008","流水删除失败");

	private final String code;
	private final String message;


	StatusCodeEnum(String code, String message) {
		this.code=code;
		this.message=message;
	}

}
