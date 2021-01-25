package top.duanhong.steward.enumeration;



import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SequenceEnum implements Serializable {

    /**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

    /**
     * 网络标签序列
     */
    public static final String NET_TAG_SEQ="NET_TAG_SEQ";
    public static final String DICT_SEQ="DICT_SEQ";
    public static final String MESSAGE_SEQ="MESSAGE_SEQ";
    public static final String STEW_FILE_SEQ="STEW_FILE_SEQ";
    public static final String STEW_FILE_TYPE_SEQ="STEW_FILE_TYPE_SEQ";
    public static final String STEW_MENU_SEQ="STEW_MENU_SEQ";
    public static final String QI_NIU_FILE_SEQ="QI_NIU_FILE_SEQ";
    public static final String STEW_WORK_PLAN_SEQ="STEW_WORK_PLAN_SEQ";
    public static final String STEW_CHAT_ROOM_SEQ="STEW_CHAT_ROOM_SEQ";

    /**
     * 序列前缀集合
     */
    public static final Map<String, String> SEQ_MAP = new HashMap<String, String>() {
        /**
		 * 序列化ID
		 */
		private static final long serialVersionUID = 1L;

		{
			//商品前缀
			put(NET_TAG_SEQ, "n");
            put(DICT_SEQ,"d");
            put(MESSAGE_SEQ,"m");
            put(STEW_FILE_SEQ,"sf");
            put(STEW_FILE_TYPE_SEQ,"sft");
            put(STEW_MENU_SEQ,"menu_");
            put(QI_NIU_FILE_SEQ,"qiniu_file_");
            put(STEW_WORK_PLAN_SEQ,"plan_");
            put(STEW_CHAT_ROOM_SEQ,"chat_room_");
        }
    };

    /**
     * 序列初始
     */
    public static final Map<String,String> SEQ_MAP_VALUE = new HashMap<String, String>() {
        /**
		 * 序列化ID
		 */
		private static final long serialVersionUID = 1L;

		{
			//商品序列初始值
			put(NET_TAG_SEQ, "100000");
            put(DICT_SEQ, "100000");
            put(MESSAGE_SEQ, "100000");
            put(STEW_FILE_SEQ,"100000000");
            put(STEW_FILE_TYPE_SEQ,"100000000");
            put(STEW_MENU_SEQ,"10");
            put(QI_NIU_FILE_SEQ,"1000000");
            put(STEW_WORK_PLAN_SEQ,"1000000");
            put(STEW_CHAT_ROOM_SEQ,"1000000");
        }
    };

}
