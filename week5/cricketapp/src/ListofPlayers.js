import React from "react";

export function ListofPlayers(props){
    return(
        <ul>
            {
                props.players.map((item)=>(
                    <li key={item.name}>
                        Mr.{item.name}<span>{item.score}</span>
                    </li>
                ))
            }
        </ul>
    );
}
export function Scorebelow70(props){
    const player70=props.players.filter(
        player=>player.score<=70
    );
    return(
        <ul>
            {
                player70.map((item)=>(
                    <li key={item.name}>
                        Mr.{item.name}<span>{item.score}</span>
                    </li>
                ))
            }
        </ul>
    )
}