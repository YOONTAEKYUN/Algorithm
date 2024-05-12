# [Silver I] 골드바흐의 추측 - 6588 

[문제 링크](https://www.acmicpc.net/problem/6588) 

### 성능 요약

메모리: 43096 KB, 시간: 688 ms

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 제출 일자

2024년 5월 13일 02:29:10

### 문제 설명

<p>In 1742, Christian Goldbach, a German amateur mathematician, sent a letter to Leonhard Euler in which he made the following conjecture:</p>

<blockquote>
<p>Every even number greater than 4 can be written as the sum of two odd prime numbers.</p>
</blockquote>

<p>For example:</p>

<ul>
	<li>8 = 3 + 5. Both 3 and 5 are odd prime numbers.</li>
	<li>20 = 3 + 17 = 7 + 13.</li>
	<li>42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23.</li>
</ul>

<p>Today it is still unproven whether the conjecture is right. (Oh wait, I have the proof of course, but it is too long to write it on the margin of this page.)</p>

<p>Anyway, your task is now to verify Goldbach's conjecture for all even numbers less than a million.</p>

### 입력 

 <p>The input file will contain one or more test cases. </p>

<p>Each test case consists of one even integer n with 6 <= n < 1000000. </p>

<p>Input will be terminated by a value of 0 for n</p>

### 출력 

 <p>For each test case, print one line of the form n = a + b, where a and b are odd primes. Numbers and operators should be separated by exactly one blank like in the sample output below. If there is more than one pair of odd primes adding up to n, choose the pair where the difference b - a is maximized. If there is no such pair, print a line saying "Goldbach's conjecture is wrong.</p>

<p> </p>

