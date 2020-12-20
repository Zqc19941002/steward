package top.duanhong.steward.utils;


import top.duanhong.steward.controller.sys.params.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duanhong
 * 参考网址：“https://www.jianshu.com/p/1d1d469faf7f”
 * @description 树结构工具
 * @date 2019/4/21
 */
public class TreeMenuUtil {
    /**
     * 所有待用"菜单"
     */
    private static List<MenuNode> all = null;

    /**
     * 转换为树形
     *
     * @param list 所有节点
     * @return 转换后的树结构菜单
     */
    public static List<MenuNode> toTree(List<MenuNode> list) {
        // 最初, 所有的 "菜单" 都是待用的
        all = new ArrayList<>(list);

        // 拿到所有的顶级 "菜单"
        List<MenuNode> roots = new ArrayList<>();

        for (MenuNode MenuNode : list) {
            if ("0".equals(MenuNode.getParentId())) {
                roots.add(MenuNode);
            }
        }

        // 将所有顶级菜单从 "待用菜单列表" 中删除
        all.removeAll(roots);

        for (MenuNode MenuNode : roots) {
            MenuNode.setChildren(getCurrentMenuNodeChildren(MenuNode));
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
    private static List<MenuNode> getCurrentMenuNodeChildren(MenuNode parent) {
        // 判断当前节点有没有子节点, 没有则创建一个空长度的 List, 有就使用之前已有的所有子节点.
        List<MenuNode> childList = parent.getChildren() == null ? new ArrayList<>() : parent.getChildren();

        // 从 "待用菜单列表" 中找到当前节点的所有子节点
        for (MenuNode child : all) {
           /* if (parent.getId()==child.getParentId()) {
                childList.add(child);
            }*/

            if (parent.getId().equals(child.getParentId())){
                childList.add(child);
            }
        }

        // 将当前节点的所有子节点从 "待用菜单列表" 中删除
        all.removeAll(childList);

        // 所有的子节点再寻找它们自己的子节点
        for (MenuNode MenuNode : childList) {
            MenuNode.setChildren(getCurrentMenuNodeChildren(MenuNode));
        }
        return childList;
    }
}
