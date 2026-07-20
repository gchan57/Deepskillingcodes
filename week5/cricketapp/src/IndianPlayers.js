import React from "react";

export function OddPlayers([first, , third, , fifth]) {

    return (
        <ul>
            <li>First : {first}</li>
            <li>Third : {third}</li>
            <li>Fifth : {fifth}</li>
        </ul>
    );
}

export function EvenPlayers([, second, , fourth, , sixth]) {

    return (
        <ul>
            <li>Second : {second}</li>
            <li>Fourth : {fourth}</li>
            <li>Sixth : {sixth}</li>
        </ul>
    );
}
const T20Player=[
"First Player",
"Second Player",
"Third Player"
];

const RanjinTropyPlayers=[
    "Fourth Player",
    "fifth Player",
    "Sixth Player"
]

export const IndianPlayers=[
    ...T20Player,
    ...RanjinTropyPlayers
]

export function ListofIndianPlayers(props){
    return(
        <ul>
            {
                props.IndianPlayers.map((player,index)=>(
                    <li key={index}>
                        Mr.{player}
                    </li>
                ))
            }
        </ul>
    )
}