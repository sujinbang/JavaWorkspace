package chapter_01;

public class _03_Variables {
//    main
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789; // 실수값은 기본적으로 double 자료형으로 인식
        float f = 3.14123456789F; // float 형태의 변수로 지정할 때는 변수 다음에 F를 넣어줌
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // int 보다 더 큰 범위의 변수를 넣을 수 있는 자료형 : long
        l = 1_000_000_000_000L;
        System.out.println(l);

//      자료형 : int, long, float, double, char, String, boolean

    }
}
