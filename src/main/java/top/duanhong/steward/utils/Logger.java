package top.duanhong.steward.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Logger {
	public static String  info(String messString) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		return "===================日志类型：信息	信息内容："+messString+"	时间："+simpleDateFormat.format(new Date())+"===================";
	}

	public static String  debug(String debugString) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		return "===================日志类型：调试	调试内容："+debugString+"	时间："+simpleDateFormat.format(new Date())+"===================";
	}
}
