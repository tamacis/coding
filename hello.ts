interface Person {
    firstName: string;
    lastName: string;
}

function greeter(person: Person) {
    return "Hello, " + person.firstName + " " + person.lastName;
}

var user = { firstName: "Jane", lastName: "User" };

console.log(greeter(user));

class Animal {

    constructor(public foot: number) {
        console.log(foot);
        console.log(this.foot)
    }
}