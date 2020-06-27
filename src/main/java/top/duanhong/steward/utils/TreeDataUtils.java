package top.duanhong.steward.utils;

import cn.hutool.core.bean.BeanUtil;
import top.duanhong.steward.entity.po.StewFile;
import top.duanhong.steward.entity.vo.FileTreeVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanhong
 * @description 文件工具类
 * @date 2019/9/4
 */
public class TreeDataUtils {
    private static List<FileTreeVo> all = null;
    /**
     * 获取文件树
     * @param fileList
     * @return
     */
    public static List<FileTreeVo> getFileTree(List<StewFile> fileList){

        List<FileTreeVo> fileTreeVoList=new ArrayList<>();

        for (StewFile stew:fileList
             ) {
            FileTreeVo fileTreeVo=new FileTreeVo();
            BeanUtil.copyProperties(stew,fileTreeVo);
            fileTreeVoList.add(fileTreeVo);
        }
        // 最初, 所有的 "菜单" 都是待用的
        all = new ArrayList<>(fileTreeVoList);

        // 拿到所有的顶级 "菜单"
        List<FileTreeVo> roots = new ArrayList<>();

        for (FileTreeVo fileTreeVoTemp : fileTreeVoList) {
            if ("0".equals(fileTreeVoTemp.getParentId())||fileTreeVoTemp.getParentId()==null||"".equals(fileTreeVoTemp.getParentId())) {
                roots.add(fileTreeVoTemp);
            }
        }
        // 将所有顶级菜单从 "待用菜单列表" 中删除
        all.removeAll(roots);

        for (FileTreeVo node : roots) {
            node.setChildrenFileList(getCurrentNodeChildren(node));
        }
        return roots;
    }

    /**
     * 递归函数
     * 递归目的: 拿到子节点
     * 递归终止条件: 没有子节点
     *
     * @param parent 父节点
     * @return 子节点
     */
    private static List<FileTreeVo> getCurrentNodeChildren(FileTreeVo parent) {
        // 判断当前节点有没有子节点, 没有则创建一个空长度的 List, 有就使用之前已有的所有子节点.
        List<FileTreeVo> childList = parent.getChildrenFileList() == null ? new ArrayList<>() : parent.getChildrenFileList();

        // 从 "待用菜单列表" 中找到当前节点的所有子节点
        for (FileTreeVo child : all) {
            if (parent.getFileId().equals(child.getParentId())) {
                childList.add(child);
            }
        }
        // 将当前节点的所有子节点从 "待用菜单列表" 中删除
        all.removeAll(childList);

        // 所有的子节点再寻找它们自己的子节点
        for (FileTreeVo node : childList) {
            node.setChildrenFileList(getCurrentNodeChildren(node));
        }
        return childList;
    }
}
