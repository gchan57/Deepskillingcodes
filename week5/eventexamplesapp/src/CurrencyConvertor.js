import React, { useState } from "react";

function CurrencyConvertor() {

    const [amount, setAmount] = useState("");
    const [currency, setCurrency] = useState("");

    function handleSubmit(event) {

        event.preventDefault();

        const euro = amount / 80;

        alert(
            "Converting to Euro Amount is " +
            euro.toFixed(2)
        );
    }

    return (

        <div>

            <h1 style={{ color: "green" }}>
                Currency Convertor!!!
            </h1>

            <form onSubmit={handleSubmit}>

                Amount :

                <input
                    type="number"
                    value={amount}
                    onChange={(e) =>
                        setAmount(e.target.value)
                    }
                />

                <br /><br />

                Currency :

                <input
                    type="text"
                    value={currency}
                    onChange={(e) =>
                        setCurrency(e.target.value)
                    }
                />

                <br /><br />

                <button type="submit">
                    Submit
                </button>

            </form>

        </div>

    );

}

export default CurrencyConvertor;