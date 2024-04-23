# [Silver V] 크로아티아 알파벳 - 2941 

[문제 링크](https://www.acmicpc.net/problem/2941) 

### 성능 요약

메모리: 14464 KB, 시간: 132 ms

### 분류

구현, 문자열

### 제출 일자

2024년 4월 23일 15:55:44

### 문제 설명

<p>Not so long ago, before operating systems were as powerful as they are today, computers (which often had turbo buttons on the exterior) couldn't handle certain letters of the Croatian alphabet. Programmers agreed to use two or three-letter substitutions as in this table:</p>

<table class="table table-bordered table-center-20 td-center th-center">
	<thead>
		<tr>
			<th>Letter</th>
			<th> Characters </th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>č</td>
			<td>c=</td>
		</tr>
		<tr>
			<td>ć</td>
			<td>c-</td>
		</tr>
		<tr>
			<td>dž</td>
			<td>dz=</td>
		</tr>
		<tr>
			<td>đ</td>
			<td>d-</td>
		</tr>
		<tr>
			<td>lj</td>
			<td>lj</td>
		</tr>
		<tr>
			<td>nj</td>
			<td>nj</td>
		</tr>
		<tr>
			<td>š</td>
			<td>s=</td>
		</tr>
		<tr>
			<td>ž</td>
			<td>z=</td>
		</tr>
	</tbody>
</table>
<p>For example, the word ljes=njak consists of six letters in the Croatian alphabet: lj, e, š, nj, a, k. </p>

<p>Write a program that calculates the number of letters in the given word. </p>

### 입력 

 <p>The first line contains a string of at most 100 characters. Only lowercase letters of the English alphabet and characters '–' and '=' will appear. </p>

<p>The string will represent a word encoded as described above. </p>

### 출력 

 <p>Output the number of letters in the input word. </p>

<p> </p>

