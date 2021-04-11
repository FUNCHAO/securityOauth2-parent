package fc.security.oauth2.uaa.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface OauthClientDetailsDao {
    @Select("SELECT * FROM oauth_client_details")
    List<Map<String,Object>> getClientDetails();
}
