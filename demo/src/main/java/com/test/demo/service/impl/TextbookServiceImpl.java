package com.test.demo.service.impl;

import com.test.demo.entity.Textbook;
import com.test.demo.dao.TextbookDao;
import com.test.demo.service.TextbookService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Textbook)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:44:13
 */
@Service("textbookService")
public class TextbookServiceImpl implements TextbookService {
    @Resource
    private TextbookDao textbookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param textbookId 主键
     * @return 实例对象
     */
    @Override
    public Textbook queryById(Long textbookId) {
        return this.textbookDao.queryById(textbookId);
    }



    /**
     * 新增数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    @Override
    public Textbook insert(Textbook textbook) {
        this.textbookDao.insert(textbook);
        return textbook;
    }

    /**
     * 修改数据
     *
     * @param textbook 实例对象
     * @return 实例对象
     */
    @Override
    public Textbook update(Textbook textbook) {
        this.textbookDao.update(textbook);
        return this.queryById(textbook.getTextbookId());
    }

    /**
     * 通过主键删除数据
     *
     * @param textbookId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long textbookId) {
        return this.textbookDao.deleteById(textbookId) > 0;
    }
}
