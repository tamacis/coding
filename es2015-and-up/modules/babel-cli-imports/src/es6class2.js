import MyClass from './ec6Class';

export class MyClass2 extends MyClass {
    constructor(dep1, dep2) {
        super(dep1, dep2)
    }

    bar() {
        console.log('bar')
    }
}
