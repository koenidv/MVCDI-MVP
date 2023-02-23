class Base {
    constructor(name) {
        this.name = name
    }

    sayHello() {
        console.log(`Hello ${this.name}!`)
        return this
    }
}

Base.prototype.questionName = function () {
    console.log(`You're ${this.name}, right?`)
    return this
}

class Derived extends Base {
    constructor(derivedName) {
        super(`definitely not ${derivedName}`)
        this.derivedName = derivedName
    }

    sayBye() {
        console.log(`Bye-bye ${this.name}!`)
        return this
    }

    sayHello() {
        console.log(`What's up ${this.derivedName}!`)
        return this
    }
}

console.debug("JS console below\n")
new Derived("Mars")
    .questionName()
    .sayHello()
    .sayBye()