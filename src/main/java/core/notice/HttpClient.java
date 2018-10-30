package core.notice;

import com.alibaba.fastjson.JSONObject;
import response.result.CoverResult;

public interface HttpClient {
   CoverResult request(String url, JSONObject param,Class responseClass);
}
