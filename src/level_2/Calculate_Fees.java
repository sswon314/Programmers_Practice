package level_2;

/* 
 * k 진수에서 소수 개수 구하기
 * 주차 요금 계산
 * https://programmers.co.kr/learn/courses/30/lessons/92341
 * 핵심 내용 : 자료구조
 *  */

import java.util.*;

public class Calculate_Fees {
	public int[] solution(int[] fees, String[] records) {
        HashMap<String,String>map=new HashMap<>();
        HashMap<String,Integer>result=new HashMap<>();
        
        for(int i=0;i<records.length;i++){
            String[]recordInfo=records[i].split(" ");
            if(recordInfo[2].equals("IN"))
                map.put(recordInfo[1],recordInfo[0]);
            
            else{
                String[][]timeStr={map.get(recordInfo[1]).split(":"),recordInfo[0].split(":")};
                int[][]time=new int[2][2];
                for(int j=0;j<2;j++){
                    time[0][j]=Integer.parseInt(timeStr[0][j]);
                    time[1][j]=Integer.parseInt(timeStr[1][j]);
                }
                
                int minute=time[1][0]*60+time[1][1]-time[0][0]*60-time[0][1];
                if(result.containsKey(recordInfo[1])){
                    result.put(recordInfo[1],result.get(recordInfo[1]).intValue()+minute);
                }
                else{
                    result.put(recordInfo[1],minute);
                }
                
                map.remove(recordInfo[1]);
            }
        }
        if(!map.isEmpty()){
            for(String s : map.keySet()){
                String[]timeStr=map.get(s).split(":");
                int[]time=new int[2];
                
                for(int i=0;i<2;i++){
                    time[i]=Integer.parseInt(timeStr[i]);
                }
                
                int minute=23*60+59-time[0]*60-time[1];
                if(result.containsKey(s))
                    result.put(s,result.get(s).intValue()+minute);
                else
                    result.put(s,minute);
            }
        }
        
        int[]answer=new int[result.size()];
        String[]nums=new String[result.size()];
        int index=0;
        for(String s:result.keySet()){
            nums[index++]=s;
            int resultMin=result.get(s).intValue();
            int fee=(resultMin<=fees[0])?fees[1]:fees[1]+(int)Math.ceil((double)(resultMin-fees[0])/fees[2])*fees[3];
            result.put(s,fee);
        }
        Arrays.sort(nums);
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(nums[i]);
        }
        
        return answer;
    }
}
