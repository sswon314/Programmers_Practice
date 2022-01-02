package level_1;

/* 
 * 코딩 테스트 연습
 * 신규 아이디 추천 문제
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 * 핵심 내용 : 문자열 정규식
 *  */

class Recommend_New_Id {
    public String solution(String new_id) {
        String answer = "";
        
        String old=new_id;
            
        // 1. 대문자를 소문자로
        new_id=new_id.toLowerCase();
        // System.out.println(new_id);
        
        // 2. 정규식을 이용해서 .-_ 빼고 나머지 특수문자를 지우기
        new_id=new_id.replaceAll("[^-_.a-z0-9]","");
        // System.out.println(new_id);
        
        // 3. 정규식을 이용해서 .이 여러번 생기는 것을 하나로 바꿈
        new_id=new_id.replaceAll("[.]+",".");
        // System.out.println(new_id);
        
        // 4. .으로 시작하거나 끝나면 .을 뺀다
        new_id=new_id.replaceAll("^[.]|[.]$", "");
        // System.out.println(new_id);  
        
        // 5. 문자열 길이가 0이면 "a"로 한다
        if(new_id.length()==0)
            new_id="a";
        // System.out.println(new_id);
        
        // 6. 문자열 길이가 16이상이면 15까지만 한다
        // 마지막에 .으로 끝나는 것을 지운다
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
            new_id=new_id.replaceAll("[.]$","");
        }
                
            
        // System.out.println(new_id);
        
        // 7. 문자열 길이가 2이하면 마지막문자를 반복해서 3까지 한다
        if(new_id.length()<=2){
            int len=new_id.length();
            String last=""+new_id.charAt(new_id.length()-1);
            new_id=new_id.substring(0,len-1)+last.repeat(3-len+1);
            // System.out.println(new_id);
        }
        
        answer=new_id;
        return answer;
    }
}
