package com.test.demo.service;

import com.test.demo.entity.Textbook;
import com.github.pagehelper.Page;

/**
 * (Textbook)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 19:44:13
 */
public interface TextbookService {

    /**
     * 通过ID查询单条数据
     *
     * @param textbookId 主键
     * @return 实例对象
     */
    Textbook queryById(Long textbookId);



    /**
     * 新增数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    Textbook insert(Textbook textbook);

    /**
     * 修改数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    Textbook update(Textbook textbook);

    /**
     * 通过主键删除数据
     *
     * @param textbookId 主键
     * @return 是否成功
     */
    boolean deleteById(Long textbookId);

}
