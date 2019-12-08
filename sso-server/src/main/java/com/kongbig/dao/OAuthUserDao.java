package com.kongbig.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kongbig.model.OAuthUser;

/**
 * 
 * @author kongbig
 *
 */
@Repository
public interface OAuthUserDao {

	OAuthUser getUserModel(@Param("username") String username,@Param("password") String password);

	OAuthUser getOAuthUserByName(String username);

	OAuthUser getOAuthUserById(String id);

	boolean addOAuthUser(OAuthUser oAuthUser);

	boolean updateOAuthUser(OAuthUser oAuthUser);

	boolean deleteOAuthUser(String[] ids);
	
}
