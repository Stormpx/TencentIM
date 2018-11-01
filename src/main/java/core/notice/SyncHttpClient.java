package core.notice;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import response.result.CoverResult;
import response.result.SyncCoverResult;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
public class SyncHttpClient implements HttpClient {
    private final static Logger logger = LoggerFactory.getLogger(SyncHttpClient.class);

    @Override
    public CoverResult request(String url, JSONObject param, Class responseClass) {
        try {
            logger.info(url + " ready");
            HttpURLConnection urlConnection = buildConnection(new URL(url), "POST");
            urlConnection.connect();
            sendRequest(urlConnection.getOutputStream(), param.toJSONString().getBytes());
            String rsp;
            if (urlConnection.getResponseCode() < 300) {
                rsp = getResponse(urlConnection.getInputStream());
            } else {
                rsp = getResponse(urlConnection.getErrorStream());
            }
            return new SyncCoverResult(JSONObject.parseObject(rsp), responseClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private HttpURLConnection buildConnection(URL url, String method) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(method);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(4000);
        httpURLConnection.setReadTimeout(4000);
        return httpURLConnection;
    }

    private void sendRequest(OutputStream outputStream, byte[] bytes) {
        try (BufferedOutputStream output = new BufferedOutputStream(outputStream)) {
            output.write(bytes);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getResponse(InputStream inputStream) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(inputStream);
             ByteArrayOutputStream buf = new ByteArrayOutputStream()) {
            int result = bis.read();
            while (result != -1) {
                buf.write((byte) result);
                result = bis.read();
            }
            return buf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
