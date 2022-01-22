package level_2;

/* 
 * 코딩 테스트 연습
 * 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 * 핵심 내용 : 해쉬
 *  */

import java.util.*;

public class Phone_Book_List {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String>book=new HashSet<>();
        for(int i=0;i<phone_book.length;i++){
            book.add(phone_book[i]);
        }
        
        for(int i=0;i<phone_book.length;i++){
            book.remove(phone_book[i]);
            for(int j=1;j<phone_book[i].length();j++){
                if(book.contains(phone_book[i].substring(0,j))){
                    answer=false;
                    break;
                }
            }
            
            if(answer==false)
                break;
            else
                book.add(phone_book[i]);
        }
        
        return answer;
    }
}
