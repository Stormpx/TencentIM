package core.notice;

import com.alibaba.fastjson.JSONObject;
import response.CoverResult;

public interface HttpClient {
   CoverResult request(String url, JSONObject param);
}
