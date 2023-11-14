# [Silver II] 신나는 함수 실행 - 9184 

[문제 링크](https://www.acmicpc.net/problem/9184) 

### 성능 요약

메모리: 27728 KB, 시간: 296 ms

### 분류

다이나믹 프로그래밍, 재귀

### 제출 일자

2023년 11월 14일 13:04:49

### 문제 설명

<p>We all love recursion! Don't we?</p>

<p>Consider a three-parameter recursive function w(a, b, c):</p>

<pre>if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
    1

if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)

if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)

otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
</pre>

<p>This is an easy function to implement. The problem is, if implemented directly, for moderate values of a, b and c (for example, a = 15, b = 15, c = 15), the program takes hours to run because of the massive recursion.</p>

### 입력 

 <p>The input for your program will be a series of integer triples, one per line, until the end-of-file flag of -1 -1 -1. Using the above technique, you are to calculate w(a, b, c) efficiently and print the result. </p>

### 출력 

 <p>Print the value for w(a,b,c) for each triple.</p>

