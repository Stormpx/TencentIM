package core.notice;

import com.alibaba.fastjson.JSONObject;
import response.result.CoverResult;

public class SyncHttpClient implements HttpClient {
    @Override
    public CoverResult request(String url, JSONObject param, Class responseClass) {
        return null;
    }
}
