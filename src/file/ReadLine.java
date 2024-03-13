package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadLine {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\entropy\\eunjeong\\file_test\\text_file.txt");
        StringBuilder sb = new StringBuilder();

        try {
            List<String> allLines = Files.readAllLines(path);
            List<Map<String, Object>> jsonBuildList = new ArrayList<>(); // 요청 데이터
            for(int i=0; i<allLines.size()-1; i++) { // 마지막줄 전까지
                Map<String, Object> jsonBuild = new LinkedHashMap<>();
                String requsetLine = allLines.get(i);
                if(requsetLine.isEmpty()) continue;
                // 번호
                String idx = requsetLine.substring(0,Math.min(8, requsetLine.length())).trim(); // substring(포함, 불포함)
                // 고객번호
                String user_num_key = requsetLine.substring(8,Math.min(28, requsetLine.length())).trim();
                // 청구년월
                String year_month = requsetLine.substring(28,Math.min(34, requsetLine.length())).trim();
                // 청구금액
                String all_amount = requsetLine.substring(34,Math.min(46, requsetLine.length())).trim();
                // 출금일자
                String withdraw_date = requsetLine.substring(46,Math.min(54, requsetLine.length())).trim();
                // 기관활용
                String extra_val = requsetLine.substring(54,Math.min(74, requsetLine.length())).trim();
                // 기관활용
                String extra_last = requsetLine.substring(74,Math.min(94, requsetLine.length())).trim();
                // 정기결제번호
                String recurrentId = requsetLine.substring(94,Math.min(144, requsetLine.length())).trim();
                jsonBuild.put("index", idx);
                jsonBuild.put("user_num_key", user_num_key);
                jsonBuild.put("year_month", year_month);
                jsonBuild.put("all_amount", all_amount);
                jsonBuild.put("withdraw_date", withdraw_date);
                jsonBuild.put("extra_val", extra_val);
                jsonBuild.put("extra_last", extra_last);
                jsonBuild.put("recurrentId", recurrentId);
                jsonBuildList.add(jsonBuild);
            }

            // 데이터 체크용 _ 고지건수, 고지합계금액, 기관활용
            Map<String, String> chk = new LinkedHashMap<>();
            String lastLine = allLines.getLast();
            String totalCount = lastLine.substring(0,8).trim();
            String totalAmount = lastLine.substring(8,19).trim();
            String merchantExtra = lastLine.substring(19,38).trim();
            chk.put("totalCount", totalCount);
            chk.put("totalAmount", totalAmount);
            chk.put("merchantExtra", merchantExtra);

            System.out.println("chk" + chk);

            // 총건수 체크
            String allCount = "" + (jsonBuildList.size());

            // 총금액 체크
            int sum=0;
            for(Map<String,Object> notice_json : jsonBuildList) {
                sum += Integer.parseInt((String) notice_json.get("all_amount"));
            }

            // 네페 - 자동납부수행 api 요청 (총건수, 총금액 동일)
            if(allCount.equals(totalCount) && totalAmount.equals(String.valueOf(sum))) {
                System.out.println("총건수, 총금액 동일");
                // for 문
                // 1. 결제예약 요청 응답 = 네이버페이 요청 보내기
                // if 문 결제예약 요청 응답 - paymentId 가 있는지
                // 있으면 -> 결제승인요청
                //
                // 응답내역 DB 저장
            };
            sb.append(jsonBuildList);
            System.out.println("sb = "+sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 파일 생성 경로 (다운로드)
        File file = new File("C:\\Users\\entropy\\eunjeong\\file_test\\down_file.txt");
        if(!file.exists()) {
            // 파일 생성
            try {
                boolean create = file.createNewFile(); // 성공 -> true
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("안녕\n");
            writer.write("하세요\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
