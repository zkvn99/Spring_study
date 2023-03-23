package iducsw.springboot;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
public class MyRestController {
    @GetMapping("/rest-api") // Get(HTTP 프로토콜의 메소드 중 하나) 요청을 실행 메소드와 연결
    public String getRestApi() {
        return "<h1> hi-rest-api </h1>";
    }

    @GetMapping("/bus-route-list") // ?strSrch=<값> 형식의 매개변수를 이용하여 값을 가져옴
    public String getBusRouteList(@RequestParam("strSrch") String bno) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://ws.bus.go.kr/api/rest/busRouteInfo/getBusRouteList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=prDhRkobWpiwZTKDPasdmHgop8iUjoENgF1Clauqx7gAbeQhNeZBDWwM73iMOgEPqFt7Y0kdFwtiYiRFNNws5w%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("strSrch","UTF-8") + "=" + URLEncoder.encode(bno, "UTF-8")); /*검색할 노선번호*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        JSONObject jsonObject = XML.toJSONObject(sb.toString());
        // JSON Parsing
        String jsonString = jsonObject.toString();

        return sb.toString(); // Rest 방식, 표현(representational)을 통해 자원에게 요청하고, 처리된 데이터의 상태(state, 포맷)를 직접 클라이언트에게 전달(transfer)
    }
}
