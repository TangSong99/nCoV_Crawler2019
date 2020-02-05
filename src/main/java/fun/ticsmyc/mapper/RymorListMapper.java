package fun.ticsmyc.mapper;

import fun.ticsmyc.pojo.RymorList;

import java.util.List;

/**
 * @author CTX
 * @since 2020/2/5 10:25
 */
public interface RymorListMapper {
    /**
    * 查询所有
    * */
    List<RymorList> selAll();

    /**
     * 增加谣言，依据id
     */
    int addRymorList(RymorList rymorList);
}
