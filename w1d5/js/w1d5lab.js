// Helper function to test following functions result.
function test(expected, result) {
    if (expected === result) {
        return "TEST SUCCEEDED";
    } else {
        return "TEST FAILED.  Expected: " + expected + "    Result: " + result;
    }
}

// 1. Define a function max() that takes two numbers as arguments and returns the largest of them. Use the if-then-else construct available in Javascript.
"use strict"
function max(a, b) {
    if(a > b)
        return a;
    else
        return b;
}

console.log("Expected output of max(5,10) is 10\t\t" + test(10, max(10, 5)));

// 2. Define a function maxOfThree() that takes three numbers as arguments and returns the largest of them.

function maxOfThree(a,b,c) {
    return max(max(a,b),c);
}

console.log("Expected output of maxOfThree(10, 5, 20) is 20\t" + test(20, maxOfThree(10, 5, 20)));

// 3. Write a function isVowel() that takes a character (i.e. a string of length 1) and returns true if it is a vowel, false otherwise.

function isVowel(c) {
    if(c.length !== 1) 
        return false;
    if(c === 'a' || c === 'e' || c === 'i' || c === 'o' || c === 'u' || c === 'A' || c === 'E' || c === 'I' || c === 'O' || c === 'U')
        return true;
    else 
        return false;
}

console.log("Expected output of isVowel is True\t\t" + test(true, isVowel("u")));
console.log("Expected output of isVowel is False\t\t" + test(true, isVowel("z")));

// 4   Define a function sum() and a function multiply() that sums and multiplies (respectively) all the numbers in an input array of numbers. 
//      For example, sum([1,2,3,4]) should return 10, and multiply([1,2,3,4]) should return 24. 
//      Note/Hint: Do these using Imperative programming approach (i.e. for…loop or while…loop)

function sum(arr) {
    let s = 0;
    for (let i = 0; i < arr.length; ++i)
        s += arr[i];
    return s;
}

console.log("Imperative: Array[1, 2, 3, 4, 5] elements sum is 15\t\t" + test(15, sum([1, 2, 3, 4, 5])));

function multiply(arr) {
    let s = 1;
    for (let i = 0; i < arr.length; ++i) 
        s *= arr[i];
    return s;
}

console.log("Imperative: Array[1, 2, 3, 4, 5] elements product is 120\t" + test(120, multiply([1, 2, 3, 4, 5])));

// 11.	Using the Array.reduce(…) function, re-implement your functions, sum(…) and multiply(…) (defined in Problem 4 above) 
//  without using Imperative programming. i.e. Do NOT use any explicit looping construct; instead use functional programming style/approach. 


function sum1(arr){
    return arr.reduce((a,b) => a + b, 0);
}

console.log("Functional: Array[1, 2, 3, 4, 5] elements sum is 15\t\t" + test(15, sum1([1, 2, 3, 4, 5])));

function multiply1(arr){
    return arr.reduce((a,b) => a * b, 1);
}

console.log("Functional: Array[1, 2, 3, 4, 5] elements product is 120\t" + test(120, multiply1([1, 2, 3, 4, 5])));

// 5.	Define a function reverse() that computes the reversal of a string. For example, reverse("jag testar") should return the string "ratset gaj".

function reverse(str) {
    let result ="";
    for (let i = str.length - 1; i >= 0; --i)
        result += str.charAt(i);
    return result;
}

console.log("Expected output of reverse is oogii\t\t\t" + test("oogii", reverse("iigoo")));

// 6.	Write a function findLongestWord() that takes an array of words and returns the length of the longest one.

function findLongestWord(words) {
    let maxLen = words[0].length;
    for (let i = 1; i < words.length; ++i) {
        if (maxLen < words[i].length )
            maxLen = words[i].length;
    }
    return maxLen;
}

console.log("Expected output of findLongestWord is 10\t\t" + test(10, findLongestWord(["hello","My","name is","Otgonbayar"])));


// 7.	Write a function filterLongWords() that takes an array of words and an integer i and returns a new array containing only those words that were longer than i characters.

function filterLongWords(words, minLen) {
    let result = [];
    for (let i = 0; i < words.length; ++i) {
        if (minLen < words[i].length ) {
            result.push(words[i]);
        }
    }
    return result;
}

console.log(filterLongWords(["hello","My","name is","Otgonbayar"],3));

console.log("Return words more than 3 letter. Input: Hello My name is Otgonbayar");
// using filter and arrow expression 
function filterLongWords1(words, minLen) {
    return words.filter(word => word.length > minLen);
}

console.log(filterLongWords1(["hello","My","name is","Otgonbayar"],3));


// 8.	Write a function named, computeSumOfSquares, that takes as input, an array of numbers and calculates 
//      and returns the sum of the squares of each number in the input array. E.g. computeSumOfSquares([1,2,3]) 
//      should be computed as 12 + 22 +32 = 14. Note: Write your Javascript code without using Imperative programming. 
//      i.e. Do NOT use any explicit looping construct; instead use functional programming style/approach.

function computeSumOfSquares(arr) {
    return arr.map(e => e * e)
    .reduce((a,b) => a + b, 0);
}

console.log("Functional: Array[1, 2, 3, 4, 5] elements squares sum 55\t" + test(55, computeSumOfSquares([1, 2, 3, 4, 5])));


// 9.	Write a function named, printOddNumbersOnly, that takes as input, an array of integral numbers and it finds and prints only the numbers which are odd.
console.log("Print odd numbers: Input array[1, 2, 3, 4, 5]\t");

function printOddNumbersOnly(arr) {
    arr.filter(e => oddChecker(e))
    .forEach(e => console.log(e));
    return arr;
}

printOddNumbersOnly([1, 2, 3, 4, 5]);

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

console.log("Functional: Array[1, 2, 3, 4, 5] elements squares sum 35\t" + test(20, computeSumOfSquaresOfEvensOnly([1, 2, 3, 4, 5])));

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

console.log("2nd biggest element of [19,9,11,0,12] is 12\t\t\t" + test(12, findSecondBiggest([19, 9, 11 ,0 ,12])));

// 13.	Write a function named printFibo, that takes as input, a given length, n, and any two starting numbers a and b, 
// and it prints-out the Fibonacci sequence, e.g. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34,…) of the given length, beginning with a and b. 
// (e.g. printFibo(n=1, a=0, b=1), prints-out: "0", as output;
// printFibo(n=2, a=0, b=1), prints-out: "0, 1", as output; 
// printFibo(n=3, a=0, b=1), prints-out: "0, 1, 1", as output; 
// printFibo(n=6, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5", as output; 
// and printFibo(n=10, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5, 8, 13, 21, 34", as output). 

function printFibo(n, a, b) {
    if(n < 2)
        console.log(a);
    else {
        console.log(a);
        console.log(b);
    }
        
    
    let next = 1;
    for(let i = 2; i < n; ++i) {
        next = a + b;
        console.log(next);
        a = b;
        b = next;
    }

    return next;
}
console.log("Tests for printes out Fibonacci");
console.log("printFibo(n=2, a=0, b=1)\t\t\t" + printFibo(2, 0, 1));
console.log("printFibo(n=3, a=0, b=1)\t\t\t" + printFibo(3, 0, 1));
console.log("printFibo(n=6, a=0, b=1)\t\t\t" + printFibo(6, 0, 1));
console.log("printFibo(n=10, a=0, b=1)\t\t\t" + printFibo(10, 0, 1));

function printFibo1(n, a, b) {
    if(n === 0) return;
    if(n === 1) return console.log(a);
    if(n === 2) return console.log(a, b);
        
    let result = [a,b];
    let nextA = a, nextB = b;
    for(let i = 2; i < n; ++i) {
        let next = nextA + nextB;
        nextA = nextB;
        nextB = next;
        result.push(next);
    }

    return console.log(result);
}


console.log("Tests for printes out Fibonacci");
console.log("printFibo1(n=2, a=0, b=1)\t\t\t" + printFibo1(2, 0, 1));
console.log("printFibo1(n=3, a=0, b=1)\t\t\t" + printFibo1(3, 0, 1));
console.log("printFibo1(n=6, a=0, b=1)\t\t\t" + printFibo1(6, 0, 1));
console.log("printFibo1(n=10, a=0, b=1)\t\t\t" + printFibo1(10, 0, 1));
