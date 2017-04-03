package com.example.mapper;

import com.example.domain.Author;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huanglei on 17/4/2.
 */
@Repository
@Mapper
public interface AuthorMapper {

    @Insert("insert into t_author(real_name, nick_name) values(#{real_name},#{nick_name})")
    int add(@Param("real_name") String realName, @Param("nick_name") String nickName);

    @Update("update t_author set real_name = #{real_name},nick_name = #{nick_name} where id = #{id}")
    int update(@Param("real_name") String realName, @Param("nick_name") String nickName,@Param("id") Long id);

    @Delete("delete from t_author where id = #{id}")
    int delete(Long id);

    @Select("select id,real_name as realName, nick_name as nickName from t_author where id = #{id}")
    Author findAuthor(@Param("id") Long id);

    @Select("select id,real_name as realName,nick_name as nickName from t_author")
    List<Author> findAuthorList();

}
