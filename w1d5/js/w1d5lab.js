// 1. Define a function max() that takes two numbers as arguments and returns the largest of them. Use the if-then-else construct available in Javascript.
"use strict"
function max(a, b) {
    if(a > b)
        return a;
    else
        return b;
}

// 2. Define a function maxOfThree() that takes three numbers as arguments and returns the largest of them.

function maxOfThree(a,b,c) {
    return max(max(a,b),c);
}

// 3. Write a function isVowel() that takes a character (i.e. a string of length 1) and returns true if it is a vowel, false otherwise.

function isVowel(c) {
    if(c.length !== 1) 
        return false;
    if(c === 'a' || c === 'e' || c === 'i' || c === 'o' || c === 'u' || c === 'A' || c === 'E' || c === 'I' || c === 'O' || c === 'U')
        return true;
    else 
        return false;
}

// 4   Define a function sum() and a function multiply() that sums and multiplies (respectively) all the numbers in an input array of numbers. 
//      For example, sum([1,2,3,4]) should return 10, and multiply([1,2,3,4]) should return 24. 
//      Note/Hint: Do these using Imperative programming approach (i.e. for…loop or while…loop)



// Calculate sum of arr elements using Imperative 

function sum(arr) {
    let s = 0;
    for (let i = 0; i < arr.length; ++i)
        s += arr[i];
    return s;
}

// Calculate multiply of arr elements using Imperative

function multiply(arr) {
    let s = 1;
    for (let i = 0; i < arr.length; ++i) 
        s *= arr[i];
    return s;
}

// 11.	Using the Array.reduce(…) function, re-implement your functions, sum(…) and multiply(…) (defined in Problem 4 above) 
//  without using Imperative programming. i.e. Do NOT use any explicit looping construct; instead use functional programming style/approach. 


function sum1(arr){
    return arr.reduce((a,b) => a + b, 0);
}

function multiply1(arr){
    return arr.reduce((a,b) => a * b, 1);
}


// 5.	Define a function reverse() that computes the reversal of a string. For example, reverse("jag testar") should return the string "ratset gaj".

function reverse(str) {
    let result ="";
    for (let i = str.length - 1; i >= 0; --i)
        result += str.charAt(i);
    return result;
}

// 6.	Write a function findLongestWord() that takes an array of words and returns the length of the longest one.

function findLongestWord(words) {
    let maxLen = words[0].length;
    for (let i = 1; i < words.length; ++i) {
        if (maxLen < words[i].length )
            maxLen = words[i].length;
    }
    return maxLen;
}

// 7.	Write a function filterLongWords() that takes an array of words and an integer i and returns a new array containing only those words that were longer than i characters.

function filterLongWords(words, minLen) {
    let result = [];
    for (let i = 0; i < words.length; ++i) {
        if (minLen < words[i].length ) {
            console.log(words[i]);
            result.push(words[i]);
        }
    }
    return result;
}

// using filter and arrow expression 
function filterLongWords1(words, minLen) {
    return words.filter(word => {
        return word.length > minLen;
    });
}


// 8.	Write a function named, computeSumOfSquares, that takes as input, an array of numbers and calculates 
//      and returns the sum of the squares of each number in the input array. E.g. computeSumOfSquares([1,2,3]) 
//      should be computed as 12 + 22 +32 = 14. Note: Write your Javascript code without using Imperative programming. 
//      i.e. Do NOT use any explicit looping construct; instead use functional programming style/approach.

function computeSumOfSquares(arr) {
    return arr.map(e => e * e)
    .reduce((a,b) => a + b, 0);
}


// 9.	Write a function named, printOddNumbersOnly, that takes as input, an array of integral numbers and it finds and prints only the numbers which are odd.

function printOddNumbersOnly(arr) {
    arr.filter(e => oddChecker(e))
    .forEach(e => console.log(e));
    return arr;
}

function oddChecker(n) {
    return n % 2 === 1;
}

// 10.	Write a function named, computeSumOfSquaresOfEvensOnly, that takes as input, an array of integral numbers and calculates and returns 
// the sum of the squares of only the even numbers in the input array. E.g. computeSumOfSquaresOfEvensOnly ([1,2,3,4,5]) should be computed as 22 +42 = 20.

function computeSumOfSquaresOfEvensOnly(arr) {
    return arr.filter(e => !oddChecker(e))
    .map(e => e * e)
    .reduce((a,b) => a + b, 0);
}

// 11 implemented above 

// 12.	Implement Javascript code for a function named, findSecondBiggest, which takes as input, 
// an array of numbers and finds and returns the second biggest of the numbers. For example, 
// findSecondBiggest([1,2,3,4,5]) should return 4. And findSecondBiggest([19,9,11,0,12]) should return 12. (Note: Do not use sorting!)

function findSecondBiggest(arr) {
    if (arr.length < 2)
        return 0;
    let first = arr[0] > arr[1] ? arr[0] : arr[1];
    let second = arr[0] < arr[1] ? arr[0] : arr[1];
    
    for (let i = 2; i < arr.length; ++i) {
        let next = arr[i];
        if(next > first) {
            second = first;
            first = next;
        } else if (next > second) {
            second = next;
        }
    }
    return second;
}


// 13.	Write a function named printFibo, that takes as input, a given length, n, and any two starting numbers a and b, 
// and it prints-out the Fibonacci sequence, e.g. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34,…) of the given length, beginning with a and b. 
// (e.g. printFibo(n=1, a=0, b=1), prints-out: "0", as output;
// printFibo(n=2, a=0, b=1), prints-out: "0, 1", as output; 
// printFibo(n=3, a=0, b=1), prints-out: "0, 1, 1", as output; 
// printFibo(n=6, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5", as output; 
// and printFibo(n=10, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5, 8, 13, 21, 34", as output). 

function printFibo(n, a, b) {
    let arr = [];
    arr[0] = a;
    arr[1] = b;
    let len = n;
    
    for(let i = 2; i < n; ++i) {
        arr[i] = arr[i - 1] + arr[i - 2];
    }
    for (let i = 0; i < len; ++i) 
        console.log(arr[i]);
    return arr;
}