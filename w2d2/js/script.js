"use strict"

// ###### Question6: ######
// Consider the following definition of an add() function to increment a counter variable:
        // var add = (function () {
        //     var counter = 0;
        //     return function () {
        //         return counter += 1;
        //     }
        // })();
// Modify the above module to define a count object with two methods: add() and reset(). 
// The count.add() method adds one to the counter (as above). The count.reset() method sets the counter to 0. 

// ###### Answer6: ######
    var count = (function () {
        var counter = 0;
        return {
            add: function() {return counter += 1;},
            reset: function() { return counter = 0;}
        };
    })();


// ###### Extra for Question 6 ######
// Object with  3 methods
    const countObject = {
        'counter': 0,
        'add': function() {return this.counter += 1;},
        'value': function() {return this.counter},
        'reset': function() {return this.counter = 0;},
    };

    console.log("Object method add: " + countObject.add());
    console.log("Object method add: " + countObject.add());
    console.log("Object method reset: " + countObject.reset());


// Revealing Module pattern 
    const countModule = (function() {
        let counter = 0;
        function increment(val) { counter += val;} // private inner function
        function reset() {counter = 0;} // private inner function
        return {
            add: function() {increment(1);},
            reset: function() {reset();},
            value: function() {return counter}
        }
    })();


    countModule.add();
    countModule.add();
    console.log("RMP 'add' called 2 times: " + countModule.value());
    countModule.reset();
    console.log("RMP 'reset' called: " + countModule.value());


// Module Factory 
    const countMF= function() {
        let counter = 0;
        function increment(n) { counter += n;} // private inner function
        function reset() {counter = 0;} // private inner function
        return {
            add: function() {increment(1);},
            reset: function() {reset();},
            value: function() {return counter}
        }
    };

    const counterMF = countMF();
    counterMF.add();
    counterMF.add();
    console.log("MF 'add' called 2 times: " + counterMF.value());
    counterMF.reset();
    console.log("MF 'reset' called: " + counterMF.value());



    
// ###### Question7: ######
// In the definition of add() shown in question 6, identify the "free" variable. In the context of a function closure, what is a "free" variable? 
    var add = (function(){
        let counter = 0;
        return function() {
            return counter =+ 1;
        }
        
    })();

// ###### Answer7: ######

    // The free variable in question 6 is the counter variable. 
    // In the context of a function closure, free variables are variables which aren't declared in function parameters nor locally; 




// ###### Question8: ######
//  Write a definition of a function make_adder(inc), whose return value is an add function with increment value inc. 

// ###### Answer8: ######
    var make_adder = function(inc) {
        var counter = 0;
        return function() {
            return counter += inc;
        };
    };

    const add5 = make_adder(5);
    console.log(add5());
    console.log(add5());
    console.log(add5());

    const add7 = make_adder(7);

    console.log(add7());
    console.log(add7());
    console.log(add7());




// ###### Question9: ######
// Suppose you are given a file of Javascript code containing a list of many function and variable declarations. 
// All of these function and variable names will be added to the Global Javascript namespace. 
// What simple modification to the Javascript file can remove all the names from the Global namespace? 

// ###### Answer9: ######: 
// Module pattern IIFF (Immediately invoked function expression). 
// Put the code inside an anonymous Immediately-invoked Function to remove all that variables from the Global namespace



    
// ###### Question10: ######

    const employeeModule = (function() {
        let name;
        let age;
        let salary;
        
        const setAge = function(newAge) {return age = newAge};
        const setSalary = function(newSalary) {return salary = newSalary};
        const setName = function(newName) {return name = newName};
        const getAge = function() { return age; };
        const getSalary = function() { return salary; };
        const getName = function() { return name; };
        const getEmpInfo = function() {
            return `Name: ${getName()}\nAge: ${getAge()}\nSalary + ${getSalary()}`;
        };

        const increaseSalary = function(percentage) { return setSalary(getSalary() * (1 + percentage)); };
        const incrementAge = function() { return setAge(getAge() + 1); }
        return {
            setAge: setAge,
            setSalary: setSalary,
            setName: setName,
            increaseSalary: increaseSalary,
            incrementAge: incrementAge,
            getEmpInfo: getEmpInfo
        };
    })();

    employeeModule.setName('Oogii');
    employeeModule.setAge(32);
    employeeModule.setSalary(150000.0);
    employeeModule.incrementAge();
    employeeModule.increaseSalary(0.10);
    console.log(employeeModule.getEmpInfo());



// ###### Question11: ###### 
// Write a few Javascript instructions to extend the Module of Question10 
// to have a public address field and public methods setAddress(newAddress) and getAddress(). 

employeeModule.address = undefined;
employeeModule.setAddress = function(newAddress) { return this.address = newAddress; };
employeeModule.getAddress= function() { return this.address; };