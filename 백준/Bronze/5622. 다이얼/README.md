# [Bronze II] 다이얼 - 5622 

[문제 링크](https://www.acmicpc.net/problem/5622) 

### 성능 요약

메모리: 14336 KB, 시간: 120 ms

### 분류

구현

### 제출 일자

2024년 4월 23일 11:14:31

### 문제 설명

<p>Mirko's grandma still uses an ancient pulse dial telephone with a rotary dial as shown in the following picture:</p>

<p style="text-align: center;"><img alt="" src="https://u.acmicpc.net/9c88dd24-3a4c-4a09-bc50-e6496958214d/Screen%20Shot%202021-06-16%20at%2012.48.39%20AM.png" style="width: 267px; height: 265px;"></p>

<p>For each digit that we want to dial, we need to turn the rotary dial clockwise until the chosen digit reaches the finger stop (metal fin). Then we let go of the dial and wait for it to return to its original position before we can dial another digit. In our modern, instant gratification world, the dial return often lasts much longer than our patience. More precisely, dialling the digit 1 takes a total of two seconds, while dialling any larger digit takes an additional second for each additional finger circle counting from 1 to the dialled digit (as shown in the picture).</p>

<p>Mirko's grandma remembers phone numbers by memorizing a corresponding word which, when dialled, results in the correct number being dialled. When dialling a word, for each letter, we dial the digit which has that letter written next to it on the dial (for example, the digit 7 for the letter S). For example, the word UNUCIC corresponds to the number 868242. Your task is determining, for a given word, the total time required to dial that word.</p>

### 입력 

 <p>The first and only line of input contains a single word consisting of between 2 and 15 (inclusive) uppercase English letters.</p>

### 출력 

 <p>The first and only line of output must contain the required dialling time.</p>

<p> </p>

