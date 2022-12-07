package edu.global.golf.dao;

import edu.global.common.Constant;

public class ClassDao {
    public void insert(String[] params) {
        String query = Constant.QUERY_INSERT_CLASS;
        CommonDao.execute(query, params);
    }
}
