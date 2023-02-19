package chapter_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이기구 탑승 가능 여부 확인
        // 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용
        int height = 115;
        String result = (height > 120) ? "탑승 가능":"탑승 불가";
        System.out.println("키가 " + height + "cm 이므로 " + result);




    }
}
