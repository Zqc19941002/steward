package top.duanhong.steward.utils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MethodExcuResult {
	private boolean isSuccess;
	private Object result;
	private Object extra;
	private String mess;
	private String code;
}
