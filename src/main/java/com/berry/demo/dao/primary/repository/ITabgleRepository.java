package com.berry.demo.dao.primary.repository;

import com.berry.demo.dao.primary.entity.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Title
 * Description
 * Copyright (c) 2018
 * Company  上海思贤信息技术股份有限公司
 *
 * @author HiCooper
 * @version 1.0
 * @date 2018/7/13 17:41
 */
public interface ITabgleRepository extends JpaRepository<Table1,Long>,JpaSpecificationExecutor<Table1> {
}
