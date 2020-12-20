package top.duanhong.steward.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysBaseResponse {
	private String errorCode;
	private String errorMessage;
	private Object body;
}
