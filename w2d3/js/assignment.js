/**
 * 
 * assignment9
 * @author Oogii M
 */


"use strict"


// 1.	Define a JavaScript object literal named, person, with the following specification:
// a.	Person object should have the properties:
//          i.	name (initialize this with empty string value)
//          ii.	dateOfBirth (initialize this with empty string value)
// b.	Person object should have the methods:
//          i.	getName (should return the value of the person’s name property)
//          ii.	setName (should take as input parameter, a String value which it sets as the person’s name) 

const person = {
    name: "",
    dateOfBirth: "",
    getName: function() {return this.name;},
    setName: function(newName) {return this.name = newName;}
};

// 

const john = Object.create(person);
// john.name = "John";
john.setName("John");
john.dateOfBirth =  new Date("1998-12-10");
console.log(`The person’s name is ${john.getName()}\n${john.getName()} was born on ${john.dateOfBirth.getFullYear()}-${john.dateOfBirth.getMonth() + 1}-${john.dateOfBirth.getDate()}`);


// 2.	Given that an Employee IS-A person, applying JavaScript inheritance and the Object.create(…) method, 
// create a generic object named, employee, with the following properties:

const employee = Object.create(person);
employee.salary = 0;
employee.hireDate = new Date("2020-04-02");
employee.doJob = function(jobTitle) {
    console.log(`${employee.getName()} is a ${jobTitle} who earns $${employee.salary}`);
};

employee.setName("Anna");
employee.salary=249995.50;
employee.doJob("Programmer");


// 3.	Re-write the person object specification described in Question 1 above, but this time, 
// using a Constructor Function named, Person. Then, add a method named, toString() to the person object, 
// which return the string representation of the person object data in the format:

function Person(name, dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
}

Person.prototype.getName = function() { return this.name;}
Person.prototype.setName = function(newName) { return this.name = newName;}
Person.prototype.toString = function() {
    return `Name: ${this.getName()}, DateOfBorth ${this.dateOfBirth.getFullYear()}-${this.dateOfBirth.getMonth() + 1}-${this.dateOfBirth.getDate()}`;
}

const peter = new Person("Peter",new Date("1985-11-10"));
console.log(peter.toString());