package com.alqsoft.dao.locprov;

import java.util.List;

import org.alqframework.orm.hibernate.BaseDao;
import org.springframework.data.jpa.repository.Query;

import com.alqsoft.entity.LocProv;

/**
 * 省份dao
 * 
 * @author 王海龙
 * @e-mail 627658539@qq.com
 * @version v1.0
 * @copyright 2010-2015
 * @create-time 2017-3-6 下午8:23:19
 * 
 */
public interface LocProvDao extends BaseDao<LocProv> {
	@Query("FROM LocProv o")
	List<LocProv> findAllProv();
}
