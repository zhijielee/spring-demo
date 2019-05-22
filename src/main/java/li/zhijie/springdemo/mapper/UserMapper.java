//package li.zhijie.springdemo.mapper;
//
//import org.apache.ibatis.annotations.*;
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//
//@CacheConfig(cacheNames = "users")
//public interface UserMapper {
//
//    @Cacheable(key ="#p0")
//    @Select("SELECT * FROM users")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
//    List<UserEntity> getAll();
//
//    @Cacheable(key ="#p0")
//    @Select("SELECT * FROM users WHERE id = #{id}")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
//    UserEntity getOne(Long id);
//
//    @Cacheable(key ="#p0")
//    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
//    void insert(UserEntity user);
//
//    @CachePut(key ="#p0")
//    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
//    int update(UserEntity user);
//
//    //如果指定为 true，则方法调用后将立即清空所有缓存
//    @CacheEvict(key ="#p0",allEntries=true)
//    @Delete("DELETE FROM users WHERE id ='${id}' ")
//    int delete(int id);
//
//}
