import React, { useState } from "react";

function EventExamples() {

    const [count, setCount] = useState(0);

    function increment() {
        setCount(count + 1);
    }

    function decrement() {
        setCount(count - 1);
    }

    function sayHello() {
        alert("Hello! Member1");
    }

    function incrementAndHello() {
        increment();
        sayHello();
    }

    function sayWelcome(message) {
        alert(message);
    }

    function onPress() {
        alert("I was clicked");
    }

    return (

        <div>

            <h3>{count}</h3>

            <button onClick={incrementAndHello}>
                Increment
            </button>

            <br /><br />

            <button onClick={decrement}>
                Decrement
            </button>

            <br /><br />

            <button
                onClick={() => sayWelcome("Welcome")}
            >
                Say Welcome
            </button>

            <br /><br />

            <button onClick={onPress}>
                Click on me
            </button>

        </div>

    );

}

export default EventExamples;